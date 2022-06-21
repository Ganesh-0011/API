import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import io.restassured.RestAssured;

public class Authors {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

	/*	RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net")
		.when().log().all().get("/api/v1/Authors").then().log().all(); 
		
		RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net")
		.body(getFileContent("C:\\Users\\darganes\\eclipse-workspace\\API\\src\\test\\java\\Test\\authorspost.txt"))
		.header("Accept","application/json").header("content-type","application/json")
		.when().log().all().post("/api/v1/Authors").then().log().all();  
		
	
	RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net")
	.body(getFileContent("C:\\Users\\darganes\\eclipse-workspace\\API\\src\\test\\java\\Test\\authorsput.txt"))
	.header("Accept","application/json").header("content-type","application/json")
	.when().log().all().put("/api/v1/Authors/3").then().log().all();  
	 
	RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net")
	.when().log().all().get("/api/v1/Authors/authors/books/200").then().log().all(); */

	RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net")
	.header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=").header("Accept","application/json")
       .when().log().all().delete("/api/v1/Authors/31").then().log().all(); 

	}
	public static String getFileContent(String filePath) throws FileNotFoundException 
	{
	    File file = new File(filePath);
	    Scanner sc = new Scanner(file);
	    sc.useDelimiter("\\Z");
	    return sc.next();
	}


}
