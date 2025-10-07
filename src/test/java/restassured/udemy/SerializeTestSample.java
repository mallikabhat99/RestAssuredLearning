package restassured.udemy;

import io.restassured.RestAssured;
import org.testng.annotations.Test;
import restassured.pojo.AddPlace;
import restassured.pojo.Location;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class SerializeTestSample {

    @Test(enabled = true, priority = 1)
    public void addPlace() throws IOException {

        RestAssured.baseURI = "https://rahulshettyacademy.com";
        AddPlace p = getAddPlace();
        String response = given().log().all()
                .queryParam("key", "qaclick123")
                .header("Content-Type", "application/json")
                .body(p)
                .when().post("maps/api/place/add/json")
                .then().log().all()
                .assertThat().statusCode(200).body("scope", equalTo("APP")).header("Server", "Apache/2.4.52 (Ubuntu)")
                .extract().response().asString();
    }

    private static AddPlace getAddPlace() {
        AddPlace p = new AddPlace();
        p.setAccuracy(50);
        p.setAddress("29, side layout, cohen 09");
        p.setLanguage("French-IN");
        p.setPhone_number("(+91) 983 893 3937");
        p.setWebsite("https://rahulshettyacademy.com");
        p.setName("Frontline house");

        List<String> myList = new ArrayList<>();
        myList.add("shoe park");
        myList.add("shop");
        p.setTypes(myList);

        Location l = new Location();
        l.setLat(-38.383494);
        l.setLng(33.427362);
        p.setLocation(l);
        return p;
    }
}
