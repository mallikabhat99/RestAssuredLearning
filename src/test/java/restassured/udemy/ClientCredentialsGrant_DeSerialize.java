package restassured.udemy;
import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import io.restassured.path.json.JsonPath;
import org.testng.Assert;
import restassured.pojo.Api;
import restassured.pojo.GetCourse;
import restassured.pojo.WebAutomation;

public class ClientCredentialsGrant_DeSerialize {
    public static void main(String[] args) throws InterruptedException {
        String[] courseTitles = {"Selenium Webdriver Java","Cypress","Protractor"};
        String response =
                given()
                        .formParams("client_id", "692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com")
                        .formParams("client_secret", "erZOWM9g3UtwNRj340YYaK_W")
                        .formParams("grant_type", "client_credentials")
                        .formParams("scope", "trust")
                        .when().log().all()
                        .post("https://rahulshettyacademy.com/oauthapi/oauth2/resourceOwner/token").asString();
        System.out.println(response);
        JsonPath jsonPath = new JsonPath(response);
        String accessToken = jsonPath.getString("access_token");
        System.out.println(accessToken);

        GetCourse gc = given()
                .queryParams("access_token", accessToken)
                .when()
                .get("https://rahulshettyacademy.com/oauthapi/getCourseDetails")
                .as(GetCourse.class);
        System.out.println(gc.getInstructor());

        List<Api> apiCourses = gc.getCourses().getApi();
        for (int i = 0; i < apiCourses.size(); i++) {
            if (apiCourses.get(i).getCourseTitle().equalsIgnoreCase("SoapUI Webservices testing")) {
                String price = apiCourses.get(i).getPrice();
                System.out.println(price);
            }
        }

        ArrayList <String> a = new ArrayList<>();
        List<WebAutomation> webAutomations = gc.getCourses().getWebAutomation();
        for (int i = 0; i < webAutomations.size(); i++) {
            System.out.println(webAutomations.get(i).getCourseTitle());
            a.add(webAutomations.get(i).getCourseTitle());
        }
        Assert.assertEquals(Arrays.asList(courseTitles), a);
    }
}