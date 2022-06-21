package Apiutils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import io.restassured.RestAssured;

public class CreatefakeauthorsApi1 {
	
	public void fakeauthorspostmethod()   throws FileNotFoundException {
		
		RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net")
		.body(getFileContent("C:\\Users\\darganes\\eclipse-workspace\\API\\src\\test\\java\\Test\\authorspost.txt"))
		.header("Accept","application/json").header("content-type","application/json")
		.when().log().all().post("/api/v1/Authors").then().log().all();  
		
	}
	public void fakeauthorsputmethod()   throws FileNotFoundException {
		
		RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net")
		.body(getFileContent("C:\\Users\\darganes\\eclipse-workspace\\API\\src\\test\\java\\Test\\authorsput.txt"))
		.header("Accept","application/json").header("content-type","application/json")
		.when().log().all().put("/api/v1/Authors/3").then().log().all();  	}

	public static String getFileContent(String filePath) throws FileNotFoundException 
	{
	    File file = new File(filePath);
	    Scanner sc = new Scanner(file);
	    sc.useDelimiter("\\Z");
	    return sc.next();

	}



}
