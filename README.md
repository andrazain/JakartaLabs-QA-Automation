# JakartaLabs-QA-Automation

This Repository consist of 3 Project Automatioin :
1. JakartaLabsJavaProgram for Java Basic Program
2. APIAutomation for Api automation project
3. WebAutomation for web automation project

## JakartaLabsJavaProgram

in JakartaLabsJavaProgram contains 2 Main programs :
```
MainTask1.java 
```
contain sample of Treeset implementation
```
MainTask2.java
```
contain sample of Treemap implementation

how to running the program :
- choose the MainTask1.java or MainTask2.java
- click icon play/run

## APIAutomation

in APIAutomation explain about automate API SignUp [Builder.ai](https://staging.engineer.ai/home) with Java-Rest Assured
which 3 field data of body request using Faker Library

```java
request.put("first_name", faker.name().firstName());
request.put("email", faker.bothify("?????###@yopmail.com"));
request.put("phone_number", "+62-" + faker.numerify("###########"));
```
how to running the program :
- choose the APITest.java
- right click on the file
- run as
- TestNG Test

## WebAutomation

in WebAutomation contains 2 Main programs :
```
WebTestTask3.java
```
contain sample print out text from iFrame
```
WebTestTask4.java
```
contain simple running automation scenario from [Swag Labs](https://www.saucedemo.com/) with Selenium-Java using POM Framework.
first we need declare the Webdriver and some basic action like,
- click
- set text
- get text
in BasePage.Java

after that we have new Class per Page contains the element/locator object and create some function related to behaviour using the web

then, we have a main class [WebTestTask4.java] and initiate the class that already created before. in Main class,
we need write the script automation scenario that what we need.
