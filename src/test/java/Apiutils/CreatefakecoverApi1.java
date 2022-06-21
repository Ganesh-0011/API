package Apiutils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import io.restassured.RestAssured;

public class CreatefakecoverApi1 {
	
	public void fakecoverpostmethod()   throws FileNotFoundException {
		
		RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net")
		.body(getFileContent("C:\\Users\\darganes\\eclipse-workspace\\API\\src\\test\\java\\coverpost.txt"))
		.header("Accept","application/json").header("content-type","application/json")
		.when().log().all().post("/api/v1/CoverPhotos").then().log().all(); 
		
	}
	public void fakecoverputmethod()   throws FileNotFoundException {
		
		RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net")
		.body(getFileContent("C:\\Users\\darganes\\eclipse-workspace\\API\\src\\test\\java\\coverput.txt"))
		.header("Accept","application/json").header("content-type","application/json")
		.when().log().all().put("/api/v1/CoverPhotos/23").then().log().all(); 
		
	}

	public static String getFileContent(String filePath) throws FileNotFoundException 
	{
	    File file = new File(filePath);
	    Scanner sc = new Scanner(file);
	    sc.useDelimiter("\\Z");
	    return sc.next();

	}

}
