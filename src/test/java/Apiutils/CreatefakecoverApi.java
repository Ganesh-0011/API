package Apiutils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import io.restassured.RestAssured;


public class CreatefakecoverApi {
    public void fakecovergetmethod()   {
		
		RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net")
		.when().log().all().get("/api/v1/CoverPhotos").then().log().all();
		
	}
	 public void fakecoverdeletemethod()  {
	 RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net")
		.header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=").header("Accept","application/json")
	       .when().log().all().delete("/api/v1/CoverPhotos/11").then().log().all();
	    
		
	}
}
