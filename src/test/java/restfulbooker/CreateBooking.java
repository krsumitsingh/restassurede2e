package restfulbooker;

import org.apache.http.client.protocol.RequestAddCookies;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class CreateBooking {

	public static void main(String[] args) {

		/*Build Request
		 * Hit the request and get the response
		 * validate response
		 */
		
		/*Reassured is the class
		 * RequestSpecification, Response,ValidatableResponse are Interface
		 */
		
		//=================================================
		
		
		//Build the request
		/*RequestSpecification requestSpecification = RestAssured.given().log().all();
		requestSpecification.baseUri("https://restful-booker.herokuapp.com/");
		requestSpecification.basePath("booking");*/
		
		RestAssured
		.given()
		.log()
		.all()
		.baseUri("https://restful-booker.herokuapp.com/")
		.basePath("booking")
		.body("{\r\n" + 
				"    \"firstname\" : \"JEAN CLAUDE\",\r\n" + 
				"    \"lastname\" : \"VAN DAMME\",\r\n" + 
				"    \"totalprice\" : 100,\r\n" + 
				"    \"depositpaid\" : true,\r\n" + 
				"    \"bookingdates\" : {\r\n" + 
				"        \"checkin\" : \"2023-01-01\",\r\n" + 
				"        \"checkout\" : \"2023-01-20\"\r\n" + 
				"    },\r\n" + 
				"    \"additionalneeds\" : \"BRUNCH\"\r\n" + 
				"}")
		.contentType(ContentType.JSON)
		.post()
		.then()
		.log()
		.all()
		.statusCode(200);
		
		 //Hit the request and get the response
		 // Response response = requestSpecification.post();
		
		//validate response
		//  ValidatableResponse validatableResponse = response.then().log().all();
		//  validatableResponse.statusCode(200);
		
		 
		
		
		
	}

	 
	
	
	
	
	
}
