import io.restassured.RestAssured;
public class NewApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.given().baseUri("https://reqres.in/api").when().log().all().
		get("/users?page=2").then().log().all().assertThat().statusCode(200);
	}

}