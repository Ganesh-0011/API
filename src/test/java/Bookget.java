import java.io.FileNotFoundException;

import io.restassured.RestAssured;
public class Bookget {

	public static void main(String[] args) throws  FileNotFoundException  {
		// TODO Auto-generated method stub
		RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net")
		.when().log().all().get("/api/v1/Books").then().log().all();

	}

}
