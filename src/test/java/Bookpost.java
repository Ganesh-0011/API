import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import io.restassured.RestAssured;
public class Bookpost {

	public static void main(String[] args) throws FileNotFoundException {
	
		//TODO Auto-generated method stub
		RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net")
		.body(getFileContent("C:\\Users\\darganes\\eclipse-workspace\\API\\src\\test\\java\\bookpost.txt"))
		.header("Accept","application/json").header("content-type","application/json")
		.when().log().all().post("/api/v1/Books").then().log().all();

	}

	public static String getFileContent(String filePath) throws FileNotFoundException 
	{
	    File file = new File(filePath);
	    Scanner sc = new Scanner(file);
	    sc.useDelimiter("\\Z");
	    return sc.next();
	}

}
