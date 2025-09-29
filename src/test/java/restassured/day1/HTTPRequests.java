package restassured.day1;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import io.restassured.response.Response;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;


/*
given() : pre-req , content type , add auth , set cookie ,add param , add header info
when() : get , put , post , delete
then() : validations - status code , extract response, extract header cookies & response body
https://reqres.in/api-docs/
 */
public class HTTPRequests {
    Integer id;

    @Test(priority = 3)
    void getUsers() {
        given().header("x-api-key", "reqres-free-v1")
                .when().get("https://reqres.in/api/users?page=2&per_page=2")
                .then().statusCode(200).body("page", equalTo(2))
                .body("data[1].email", equalTo("eve.holt@reqres.in")).log().all();

        Response res = given().header("x-api-key", "reqres-free-v1")
                .when().get("https://reqres.in/api/users?page=2&per_page=2");
        String email = res.jsonPath().get("data[1].email").toString();
        Assert.assertEquals(email, "eve.holt@reqres.in");

        //JSON OBJECT CLASS
        JSONObject jo = new JSONObject(res.toString());//converting response to json object type
        for (int i = 0; i < jo.getJSONArray("data").length(); i++) {
            System.out.println(jo.getJSONArray("data").getJSONObject(i).get("email").toString());
        }
    }

    @Test(priority = 1)
    void createUser() {
        HashMap<String, String> data = new HashMap<>();
        data.put("username", "mallika");
        data.put("email", "mallika@gmail.com");
        data.put("password", "mallika");

        id = given().header("x-api-key", "reqres-free-v1")
                .contentType("application/json").body(data)
                .when().post("https://reqres.in/api/users").jsonPath().getInt("id");
        // then().statusCode(400).log().all();
        System.out.println(id);

    }

    @Test(priority = 2, dependsOnMethods = {"createUser"})
    void updateUser() {
        HashMap<String, String> data = new HashMap<>();
        data.put("username", "mallika1");
        data.put("email", "mallika1@gmail.com");
        data.put("password", "mallika1");

        given().header("x-api-key", "reqres-free-v1")
                .contentType("application/json").body(data)
                .when().put("https://reqres.in/api/users/" + id)
                .then().statusCode(200).log().all();

    }

    @Test(priority = 3, dependsOnMethods = {"createUser"})
    void deleteUser() {
        given().header("x-api-key", "reqres-free-v1")
                .contentType("application/json")
                .when().delete("https://reqres.in/api/users/" + id)
                .then().statusCode(204).log().all();

    }
}

