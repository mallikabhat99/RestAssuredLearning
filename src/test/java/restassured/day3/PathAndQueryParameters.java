package restassured.day3;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;
import restassured.day2.Pojo_PostRequest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PathAndQueryParameters {

    @Test(enabled = true)
    public void testQueryAndPathParams() throws FileNotFoundException {
        given().header("x-api-key", "reqres-free-v1")
                .pathParam("mypath", "users")
                .queryParam("page", 2)
                .queryParam("id", 5)
                .get("https://reqres.in/api/{mypath}")
                .then().statusCode(200).log().all();



    }
}
