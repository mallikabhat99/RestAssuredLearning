package restassured.day2;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.HashMap;

public class DifferentWaysToCreatePostRequestBody {

    @Test(enabled = false)
    public void testPostUsingHashMap() {
        HashMap<String, String> data = new HashMap<>();
        data.put("username", "mallika");
        data.put("email", "mallika@gmail.com");
        data.put("password", "mallika");
        String[] courseArr = {"rest api", "c++"};
        data.put("course", Arrays.toString(courseArr));

        given().
                contentType("application/json").body(data)
                .when().post("https://reqres.in/api/users/")
                .then().statusCode(200).
                body("username", equalTo("mallika"))
                .body("email", equalTo("mallika@gmail.com"))
                .body("password", equalTo("mallika"))
                .body("course[0]", equalTo("rest api"))
                .body("course[1]", equalTo("c++"))
                .log().all();

    }

    @Test(enabled = false)
    public void testPostUsingOrgJsonLibrary() {
        JSONObject data = new JSONObject();
        data.put("username", "mallika");
        data.put("email", "mallika@gmail.com");
        data.put("password", "mallika");
        String[] courseArr = {"rest api", "c++"};
        data.put("course", Arrays.toString(courseArr));

        given().
                contentType("application/json").body(data.toString())
                .when().post("https://reqres.in/api/users/")
                .then().statusCode(200).
                body("username", equalTo("mallika"))
                .body("email", equalTo("mallika@gmail.com"))
                .body("password", equalTo("mallika"))
                .body("course[0]", equalTo("rest api"))
                .body("course[1]", equalTo("c++"))
                .log().all();

    }

    @Test(enabled = false)
    public void testPostUsingPojoClass() {
        Pojo_PostRequest data = new Pojo_PostRequest();
        data.setUsername("mallika");
        data.setPassword("mallika");
        data.setEmail("mallika@gmail.com");
        String[] courseArr = {"rest api", "c++"};
        data.setCourse(courseArr);

        given().
                contentType("application/json").body(data.toString())
                .when().post("https://reqres.in/api/users/")
                .then().statusCode(200).
                body("username", equalTo("mallika"))
                .body("email", equalTo("mallika@gmail.com"))
                .body("password", equalTo("mallika"))
                .body("course[0]", equalTo("rest api"))
                .body("course[1]", equalTo("c++"))
                .log().all();
    }

    @Test(enabled = true)
    public void testPostUsingExternalJsonFile() throws FileNotFoundException {
        File file = new File(".\\body.json");
        FileReader fr = new FileReader(file);
        JSONTokener jt = new JSONTokener(fr);
        JSONObject data = new JSONObject(jt);

        Integer id = given().header("x-api-key", "reqres-free-v1")
                .contentType("application/json").body(data.toString())
                .when().post("https://reqres.in/api/users").jsonPath().getInt("id");

        given().header("x-api-key", "reqres-free-v1")
                .contentType("application/json").body(data.toString())
                .when().put("https://reqres.in/api/users/" + id)
                .then().statusCode(200)
                .body("password", equalTo("mallika1"))
                .body("email", equalTo("mallika1@gmail.com"))
                .log().all();

    }
}
