package restassured.day3;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.Map;

import static io.restassured.RestAssured.given;

public class HeadersDemo {

    @Test(enabled = true, priority = 1)
    public void testHeaders() {
        given().get("https://www.google.com/")
                .then()
                .header("server", "gws")
                .header("Content-Encoding", "gzip")
                .statusCode(200).log().all();


    }

    @Test(enabled = true, priority = 2)
    public void getHeaderInfo() {
        Response res = given().get("https://www.google.com/");

        //get single header info
        System.out.println(res.getHeader("Content-Encoding"));

        //get all headers
        Headers myHeaders = res.getHeaders();
        //System.out.println(header_values.keySet());
        for (Header hd : myHeaders) {

            System.out.println(hd.getName() + "value is-------" + hd.getValue());
        }

    }
}
