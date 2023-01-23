package restfulbooker;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class RestAssuredAPIBDDFormat {

	public static void main(String[] args) {
		
		//Build request
		
		RestAssured
			.given()
				.log()
				.all()
				.baseUri("https://restful-booker.herokuapp.com/")
				.basePath("booking")
				.body("{\r\n" + 
					"    \"firstname\" : \"Sumit\",\r\n" + 
					"    \"lastname\" : \"Singh\",\r\n" + 
					"    \"totalprice\" : 100,\r\n" + 
					"    \"depositpaid\" : true,\r\n" + 
					"    \"bookingdates\" : {\r\n" + 
					"        \"checkin\" : \"2023-01-01\",\r\n" + 
					"        \"checkout\" : \"2023-01-16\"\r\n" + 
					"    },\r\n" + 
					"    \"additionalneeds\" : \"Dinner\"\r\n" + 
					"}")
				.contentType(ContentType.JSON)	
			.when()
				.post()
			.then().log().all()
				.statusCode(200);
		
		
		
		
		
		

	}

}
