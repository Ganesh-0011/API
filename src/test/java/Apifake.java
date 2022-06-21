import io.restassured.RestAssured;
public class Apifake
{

	public static void main(String[] args)
	{
		/* TODO Auto-generated method stub
   RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net")
   .when().log().all().get("/api/v1/Activities").then().log().all().assertThat().statusCode(200);
   
  RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net")
   .when().log().all().get("/api/v1/Activities/23").then().log().all().assertThat().statusCode(200);*/
   
   RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net")
   .headers("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=","Accept","application/json")
   .when().log().all().delete("api/v1/Activities/23").then().log().all().assertThat().statusCode(201);
	}

}
