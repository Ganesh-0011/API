package Apiutils;
 
import io.restassured.RestAssured;

public class CreateApi {
	
	public void getmethod()
	{ 
		 RestAssured.given().baseUri("https://restful-booker.herokuapp.com").when().log().all().
		 get("/booking/887").then().log().all().assertThat().statusCode(200);
	}
    public void deletemethod()
    {
    	 RestAssured.given().baseUri("https://restful-booker.herokuapp.com").when().log().all().
		 delete("/booking/887").then().log().all().assertThat().statusCode(200);
  
	}
	public void putmethod() {
		// TODO Auto-generated method stub
		
	}
}

