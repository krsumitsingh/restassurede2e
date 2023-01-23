package restfulbooker;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class GetBooking {

	public static void main(String[] args) {

		/*//build request
		 RequestSpecification requestspecification = RestAssured.given().log().all();
		
		 requestspecification.baseUri("https://restful-booker.herokuapp.com");
		 
		 requestspecification.basePath("booking/{id}");
		 
		 requestspecification.pathParam("id", 8200);
		 
		 //hit the request and get the response
		 Response response=requestspecification.get();
		 
		 //validate response
		 ValidatableResponse validatableResponse =response.then().log().all();
		 validatableResponse.statusCode(200);*/
		 
		//build request
		
		
		RestAssured
		 .given()
		 .log()
		 .all()
		 .baseUri("https://restful-booker.herokuapp.com")
		 .basePath("booking/{id}")
		 .pathParam("id", 2452)
		 
		 //hit the request and get the response
		 .get()
		 .then()
		 .log()
		 .all()
		 .statusCode(200);
		 
		/* //validate response
		 ValidatableResponse validatableResponse =response.then().log().all();
		 validatableResponse.statusCode(200);*/
		
		
		
		
		
		

	}

}
