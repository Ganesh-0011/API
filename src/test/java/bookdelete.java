import java.io.FileNotFoundException;

import io.restassured.RestAssured;
public class bookdelete {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net")
		.header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=").header("Accept","application/json")
       .when().log().all().delete("/api/v1/Activities/28").then().log().all();
	}

}

