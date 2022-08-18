package batch10.APIAutomation;

import static org.testng.Assert.assertEquals;

import org.json.JSONObject;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class APITest {
	
	String baseUrl = "https://api-staging-builder.engineer.ai";
	String token;
	
	Faker faker = new Faker();
	
	@Test
	public void signInWithFaker() {
		
		RestAssured.baseURI = baseUrl;
		
		JSONObject request = new JSONObject();
		
		request.put("first_name", faker.name().firstName());
		request.put("last_name", faker.name().lastName());
		request.put("email", faker.bothify("?????###@yopmail.com"));
		request.put("password", "builder123");
		request.put("phone_number", "+62-" + faker.numerify("###########"));
		request.put("user_type", "User");
		request.put("currency_id", "2");
		
		System.out.println(request.toString());
		String payload = request.toString();
		
		Response responseSignUp = RestAssured.given()
				.contentType("application/json")
				.body(payload)
				.when().post("/users");
		
		//pasring json body to string
		ResponseBody getBodySignUp = responseSignUp.getBody();
		String resultStringGetBodySignUp = getBodySignUp.asString();
		
		//get token
		token = responseSignUp.jsonPath().get("user.authtoken");
		
		//get dummy data
		String dummyName = responseSignUp.jsonPath().get("user.first_name");
		String dummyEmail = responseSignUp.jsonPath().get("user.email");
		String dummyPhoneNumber = responseSignUp.jsonPath().get("user.phone_number");
		
		System.out.println(token);
		System.out.println("****** RESPONSE NEW SIGN UP ****** " + resultStringGetBodySignUp);
	
		System.out.println(dummyName);
		System.out.println(dummyEmail);
		System.out.println(dummyPhoneNumber);
		
		//assert
		assertEquals(responseSignUp.statusCode(), 200);
		
	}

	
}
