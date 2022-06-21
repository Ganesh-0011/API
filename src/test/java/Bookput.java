import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import io.restassured.RestAssured;
public class Bookput {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net")
		.body(getFileContent("C:\\Users\\darganes\\eclipse-workspace\\API\\src\\test\\java\\bookput.txt"))
		.header("accept","application/json").header("content-type","application/json")
		.when().log().all().put("/api/v1/Books/0").then().log().all();

	}


	public static String getFileContent(String filePath) throws FileNotFoundException 
	{
	    File file = new File(filePath);
	    Scanner sc = new Scanner(file);
	    sc.useDelimiter("\\Z");
	    return sc.next();
	}

}
