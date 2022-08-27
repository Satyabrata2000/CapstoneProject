package apiPackage;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetRequests {

	@Test
	
	public void test1() {

		RestAssured.baseURI = "http://localhost:8090/medicare/json/data/all/products?_=1661466137977";
		RequestSpecification request = RestAssured.given();
		Response response = request.get();
		String responseBody = response.getBody().asString();
		System.out.println(responseBody);

		// responseBody = StringUtils.remove(responseBody, '[');
		// responseBody = StringUtils.remove(responseBody, ']');

		// JSONObject obj = new JSONObject(responseBody);
		// System.out.println(obj.toString(4));

		int ResponseCode = response.getStatusCode();
		Assert.assertEquals(ResponseCode, 200);
	}
	
	@Test
	public void test2() {

		RestAssured.baseURI = "http://localhost:8090/medicare/json/data/category/1/products?_=1661478104222";
		RequestSpecification request = RestAssured.given();
		Response response = request.get();
		String responseBody = response.getBody().asString();
		System.out.println(responseBody);

		int ResponseCode = response.getStatusCode();
		Assert.assertEquals(ResponseCode, 200);
	}
	
	@Test
	public void test3() {

		RestAssured.baseURI = "http://localhost:8090/medicare/json/data/category/2/products?_=1661477665323";
		RequestSpecification request = RestAssured.given();
		Response response = request.get();
		String responseBody = response.getBody().asString();
		System.out.println(responseBody);

		int ResponseCode = response.getStatusCode();
		Assert.assertEquals(ResponseCode, 200);
	}
	
	@Test
	public void test4() {

		RestAssured.baseURI = "http://localhost:8090/medicare/json/data/category/3/products?_=1661477878921";
		RequestSpecification request = RestAssured.given();
		Response response = request.get();
		String responseBody = response.getBody().asString();
		System.out.println(responseBody);

		int ResponseCode = response.getStatusCode();
		Assert.assertEquals(ResponseCode, 200);
	}
	
}
