package batch10.APIAutomation;

import static io.restassured.RestAssured.given;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class APITest extends BaseApiTest {

	@Test
	public void signIn() {
		RestAssured.baseURI = "https://api-staging-builder.engineer.ai";
		
		String payload = "{\n"
				+ "  \"email\": \"testlabs@gmail.com\",\n"
				+ "  \"password\": \"builder123\"\n"
				+ "}";
		
//		Response responseLogin = RestAssured.given().contentType("application/json")
//				.body(payload).when().post("/users/sign_in");
//		token = responseLogin.jsonPath().get("user.authtoken");
//		System.out.println(token);
		
		Response responseUser = given().spec(commonJsonSpec).when().get("/users/sign_in");
		AssertJUnit.assertEquals(responseUser.statusCode(), 200);
		
	}
	
}
