package Apiutils;

import io.restassured.RestAssured;

public class CreatefakeApi {
	
	public void fakegetmethod()   {
		
		RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net")
		.when().log().all().get("/api/v1/Users").then().log().all();
		
	}
	 public void fakedeletemethod()  {
	 RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net")
		.header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=").header("Accept","application/json")
	       .when().log().all().delete("/api/v1/Users/2").then().log().all();

}
}
