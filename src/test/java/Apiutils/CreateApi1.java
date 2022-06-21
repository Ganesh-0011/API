package Apiutils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import io.restassured.RestAssured;


public class CreateApi1 {
	public void postmethod()  throws FileNotFoundException
	{
		RestAssured.given().baseUri("https://restful-booker.herokuapp.com")
	     .body(getFileContent("C:\\Users\\darganes\\eclipse-workspace\\API\\src\\test\\java\\ganesh.txt"))
	    .header("Accept","application/json").header("Content-Type","application/json")
	    .when().log().all().post("/booking").then().log().all();
	}
	public void putmethod()  throws FileNotFoundException
	{
		RestAssured.given().baseUri("https://restful-booker.herokuapp.com")
	     .body(getFileContent("C:\\Users\\darganes\\eclipse-workspace\\API\\src\\test\\java\\ganesh.txt"))
	    .header("Accept","application/json").header("Content-Type","application/json")
	    .when().log().all().put("/booking").then().log().all();
	}
	public void patchmethod()  throws FileNotFoundException
	{
		RestAssured.given().baseUri("https://restful-booker.herokuapp.com")
	     .body(getFileContent("C:\\Users\\darganes\\eclipse-workspace\\API\\src\\test\\java\\ganesh.txt"))
	    .header("Accept","application/json").header("Content-Type","application/json")
	    .when().log().all().patch("/booking").then().log().all();
	}
	public static String getFileContent(String filePath) throws FileNotFoundException 
	{
	    File file = new File(filePath);
	    Scanner sc = new Scanner(file);
	    sc.useDelimiter("\\Z");
	    return sc.next();

}
}