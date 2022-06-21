import java.io.FileNotFoundException;

import io.restassured.RestAssured;
public class fake1 {


	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net")
		.when().log().all().get("/api/v1/Activities").then().log().all().assertThat().statusCode(200);
	}

}
