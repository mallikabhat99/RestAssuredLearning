package restassured.udemy;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import org.testng.annotations.Test;
import restassured.payload.ReusableMethods;
import restassured.payload.payload;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Basics {

    @Test(enabled = true, priority = 1)
    public void addPlace() throws IOException {
        RestAssured.baseURI = "https://rahulshettyacademy.com";
        String response = given().log().all()
                .queryParam("key", "qaclick123")
                .header("Content-Type", "application/json")
                .body(generatePayloadFromJson("C:\\Users\\LAPTOPS24\\Documents\\TestData\\addplace.json"))
                .when().post("maps/api/place/add/json")
                .then().log().all()
                .assertThat().statusCode(200).body("scope", equalTo("APP")).header("Server", "Apache/2.4.52 (Ubuntu)")
                .extract().response().asString();

        JsonPath js = ReusableMethods.rawToJson(response); //String input converts to json
        String place_id = js.get("place_id");
        System.out.println(place_id);

        String address = "Vijay nagar, Ujire";
        given().log().all()
                .queryParam("key", "qaclick123")
                .queryParam("place_id", place_id)
                .header("Content-Type", "application/json")
                .body(payload.updatePlacePayload(place_id, address))
                .when().put("maps/api/place/update/json")
                .then().log().all()
                .assertThat().statusCode(200).body("msg", equalTo("Address successfully updated"));
        //update new place
        //get place - check if updated

        String getResponse = given().log().all()
                .queryParam("key", "qaclick123")
                .queryParam("place_id", place_id)
                .when().get("maps/api/place/get/json")
                .then().log().all().assertThat().statusCode(200).extract().response().asString();

        JsonPath get = ReusableMethods.rawToJson(getResponse);
        String updatedAdd = get.getString("address");
        System.out.println(updatedAdd);

    }

    public String generatePayloadFromJson(String path) throws IOException {
        return new String(Files.readAllBytes(Paths.get(path)));
    }
}
