package restassured.udemy;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

import java.io.File;

//JIRA API TOKEN
// ATATT3xFfGF0lQC3-VaylEhjeTquuP9R-GP-YYDcWn1T2FWG-v4RhvXY82c_af4Y1S4Gmgbvps-Ws4mt0stO0yofdKKI7on4XsL_nkU3U4WuWDUJ4hQ-2W0ouWJE4eQAu_WdAKiy7V9aYqDks-qAmqtw9CSoSX0MM7yCQl5KJjkjntwUDXvbRBg=5BC178BD
public class JIRABugTest {
    public static void main(String[] args) {
        //QVRBVFQzeEZmR0YwbFFDMy1WYXlsRWhqZVRxdXVQOVItR1AtWVlEY1duMVQyRldHLXY0Umh2WFk4MmNfYWY0WTFTNEdtZ2J2cHMtV3M0bXQwc3RPMHlvZmRLS0k3b240WHNMX25rVTNVNFd1V0RVSjRoUS0yVzBvdVdKRTRlUUF1X1dkQUtpeTdWOWFZcURrcy1xQW1xdHc5Q1NvU1gwTU03eUNRbDVLSmpram50d1VEWHZiUkJnPTVCQzE3OEJE
        RestAssured.baseURI = "https://mallikabhat99.atlassian.net/";
        String createIssueResponse = given().header("Content-Type", "application/json")
                .header("Authorization", "Basic QVRBVFQzeEZmR0YwbFFDMy1WYXlsRWhqZVRxdXVQOVItR1AtWVlEY1duMVQyRldHLXY0Umh2WFk4MmNfYWY0WTFTNEdtZ2J2cHMtV3M0bXQwc3RPMHlvZmRLS0k3b240WHNMX25rVTNVNFd1V0RVSjRoUS0yVzBvdVdKRTRlUUF1X1dkQUtpeTdWOWFZcURrcy1xQW1xdHc5Q1NvU1gwTU03eUNRbDVLSmpram50d1VEWHZiUkJnPTVCQzE3OEJE").
                 body("{\n" + "    \"fields\": {\n" + "       \"project\":\n" + "       {\n" + "          \"key\": \"SCRUM\"\n" + "       },\n" + "       \"summary\": \"Website items are not working- automation Rest Assured\",\n" + "       \"issuetype\": {\n" + "          \"name\": \"task\"\n" + "       }\n" + "   }\n" + "}")
                .log().all().post("rest/api/3/issue").then().log().all()
                .assertThat().statusCode(201).contentType("application/json").extract().response().asString();
        JsonPath js = new JsonPath(createIssueResponse);
        String issueId = js.getString("id");
        System.out.println(issueId);


        given().pathParam("key", issueId).
                header("X-Atlassian-Token", "no-check").
                header("Authorization", "Basic QVRBVFQzeEZmR0YwbFFDMy1WYXlsRWhqZVRxdXVQOVItR1AtWVlEY1duMVQyRldHLXY0Umh2WFk4MmNfYWY0WTFTNEdtZ2J2cHMtV3M0bXQwc3RPMHlvZmRLS0k3b240WHNMX25rVTNVNFd1V0RVSjRoUS0yVzBvdVdKRTRlUUF1X1dkQUtpeTdWOWFZcURrcy1xQW1xdHc5Q1NvU1gwTU03eUNRbDVLSmpram50d1VEWHZiUkJnPTVCQzE3OEJE")
                .multiPart("file", new File("C:\\Users\\LAPTOPS24\\Pictures\\Screenshots\\image.jpg"))
                .log().all().post("rest/api/3/issue/{key}/attachments").then().log().all().
                assertThat().statusCode(200);
        //Add attachment
    }
}