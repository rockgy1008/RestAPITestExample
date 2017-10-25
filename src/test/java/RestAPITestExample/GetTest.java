package RestAPITestExample;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.get;
import static org.hamcrest.CoreMatchers.equalTo;


public class GetTest {
	@Test
	  public void RestAPI_Get() {
		  get("get")
	      .then()
	      .body("url", equalTo( "https://httpbin.org/get"))
		  .body("origin", equalTo("83.110.1.421"));
	  }
	  @BeforeTest
	  public void beforeTest() {
		  RestAssured.baseURI = "https://httpbin.org/";
	      //RestAssured.port = 8081;
		 
	  }

}
