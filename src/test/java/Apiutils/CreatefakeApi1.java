package Apiutils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import io.restassured.RestAssured;

public class CreatefakeApi1 {
	
	public void fakepostmethod()   throws FileNotFoundException {
		
		RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net")
		.body(getFileContent("C:\\Users\\darganes\\eclipse-workspace\\API\\src\\test\\java\\userpost.txt"))
		.header("Accept","application/json").header("content-type","application/json")
		.when().log().all().post("/api/v1/Users").then().log().all();
	}
	
	public void fakeputmethod()  throws FileNotFoundException {
	RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net")
	.body(getFileContent("C:\\Users\\darganes\\eclipse-workspace\\HelloWorld\\userput.txt"))
	.header("Accept","application/json").header("content-type","application/json")
	.when().log().all().put("/api/v1/Users/0").then().log().all();
	
	}

	public static String getFileContent(String filePath) throws FileNotFoundException 
	{
	    File file = new File(filePath);
	    Scanner sc = new Scanner(file);
	    sc.useDelimiter("\\Z");
	    return sc.next();

	}
}
