package restassured.day4;

import io.restassured.http.ContentType;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class ParsingJsonResponseData {

    @Test(enabled = true, priority = 1)
    public void testJsonResponse() {

        //Approach1
      /*  given().contentType(ContentType.JSON)
                .when().get("https://www.google.com/")
                .then().statusCode(200)
                .header("Content-Encoding", "gzip")
                .body("book[3].title", equalTo("Lord of rings")).log().all();*/
/*
        Response res = given().contentType(ContentType.JSON)
                .when().get("https://www.google.com/");
        Assert.assertEquals(res.getStatusCode(), 200);
        Assert.assertEquals(res.header("Content-Encoding"), "gzip");
        String email = res.jsonPath().get("data[1].email").toString();
        Assert.assertEquals(email, "eve.holt@reqres.in");*/

        given().header("x-api-key", "reqres-free-v1")
                .when().get("https://reqres.in/api/users?page=2&per_page=2")
                .then().statusCode(200).body("page", equalTo(2))
                .body("data[1].email", equalTo("eve.holt@reqres.in")).log().all();

        Response res = given().header("x-api-key", "reqres-free-v1")
                .contentType(ContentType.JSON)
                .when().get("https://reqres.in/api/users?page=2&per_page=2");
        String email = res.jsonPath().get("data[1].email").toString();
        Assert.assertEquals(email, "eve.holt@reqres.in");

        //JSON OBJECT CLASS
        JSONObject jo = new JSONObject(res.asString());//converting response to json object type
        boolean ifFound = false;
        int sum = 0;
        for (int i = 0; i < jo.getJSONArray("data").length(); i++) {
            String fn = jo.getJSONArray("data").getJSONObject(i).get("first_name").toString();
            String id = jo.getJSONArray("data").getJSONObject(i).get("id").toString();
            sum = sum + Integer.parseInt(id);

            if (fn.equalsIgnoreCase("Eve")) {
                ifFound = true;
                break;
            }

        }
        System.out.println(sum);
        Assert.assertTrue(ifFound, "Not found");
    }
}
