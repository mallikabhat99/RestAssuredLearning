package restassured.day5;

import io.restassured.http.ContentType;
import io.restassured.path.xml.XmlPath;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import javax.xml.crypto.dsig.XMLObject;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class ParsingXMLResponse {

    @Test(enabled = true, priority = 1)
    public void testXMLResponse() {
        //Approach1
        given().contentType(ContentType.XML)
                .when().get("http://restapi.adequateshop.com/api/Traveler?page=1")
                .then().statusCode(200)
                .body("TravelerInformationResponse.page", equalTo("1"))
                .body("TravelerInformationResponse.traveler.TravelerInformation[1].name", equalTo("Vijay Bharath Reddy"))
                .log().all();

        Response res = given().contentType(ContentType.XML).when().get("https://www.google.com/");
        Assert.assertEquals(res.getStatusCode(), 200);
        Assert.assertEquals(res.header("Content-Type"), "application/xml");
        String page = res.xmlPath().get("TravelerInformationResponse.page").toString();
        Assert.assertEquals(page, "1");

        String travelerName = res.xmlPath().get("TravelerInformationResponse.traveler.TravelerInformation[1].name").toString();
        Assert.assertEquals(travelerName, "Vijay Bharath Reddy");
        ////////////////////////////////////////////////////////////////////////////

        //Approach 2
        Response resXML = given().contentType(ContentType.XML).when().get("https://www.google.com/");
        XmlPath xmlObj = new XmlPath(resXML.asString());
        List<String> travelers = xmlObj.getList("TravelerInformationResponse.traveler.TravelerInformation");
        Assert.assertEquals(travelers.size(), 10);

        List<String> name = xmlObj.getList("TravelerInformationResponse.traveler.TravelerInformation.name");
        boolean found = false;
        for (String travelersName : name) {

            if (travelersName.equals("Vijay Bharath Reddy")) {
                found = true;
                break;
            }
        }
        Assert.assertTrue(found, "not found");
    }
}
