import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import io.restassured.RestAssured;
public class fakeput {
	public static void main(String[] args)  throws FileNotFoundException { 
		// TODO Auto-generated method stub
		RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net")
		.body(getFileContent("C:\\Users\\darganes\\eclipse-workspace\\API\\src\\test\\java\\fakeput.txt"))
		.header("Accept","application/json").header("content-type","application/json")
		.when().log().all().put("/api/v1/Activities/0").then().log().all();
		

	}
	public static String getFileContent(String filePath) throws FileNotFoundException 
	{
	    File file = new File(filePath);
	    Scanner sc = new Scanner(file);
	    sc.useDelimiter("\\Z");
	    return sc.next();

	}

}
