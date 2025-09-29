package restassured.day3;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class CookiesDemo {

    @Test(enabled = true, priority = 1)
    public void testCookies() {
        given().get("https://www.google.com/")
                .then()
                .cookie("AEC", "AVh_V2iZAH7vtecYoiezJKMW0erNDSHo11Ddskf38fZU9kij1Bpu5Ns").statusCode(200).log().all();


    }

    @Test(enabled = true, priority = 2)
    public void getCookiesInfo() {
        Response res = given().get("https://www.google.com/");
        String AEC_COOKIE_VALUE = res.getCookie("AEC");
        System.out.println(AEC_COOKIE_VALUE + "ACE cookie value");

        //get all cookies
        Map<String, String> cookie_values = res.getCookies();
        //System.out.println(cookie_values.keySet());
        for (String k : cookie_values.keySet()) {
            String cookie_value = res.getCookie(k);
            System.out.println(k + "value is-------" + cookie_value);
        }

    }
}
