import io.restassured.RestAssured;
public class DemoAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  RestAssured.given().baseUri("https://restful-booker.herokuapp.com").when().log().all().
 get("/booking/887").then().log().all().assertThat().statusCode(200);
  
	}

}
