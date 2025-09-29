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

import java.io.File;
import java.util.List;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;

public class FileUploadDownload {

    @Test(enabled = true, priority = 1)
    public void singleFileUpload() {
        File myFile = new File("local path to file");
        //Approach1
        given().multiPart("file", myFile)
                .contentType("multipart/formdata")
                .when().post("url/here/")
                .then().statusCode(200)
                .body("fileName", equalTo("test1.txt")).log().all();
    }

    @Test(enabled = true, priority = 2)
    public void multipleFileUpload() {
        File myFile1 = new File("local path to file");
        File myFile2 = new File("local path to file");

        //Approach1
        given().multiPart("files", myFile1)
                .multiPart("files", myFile2)
                .contentType("multipart/formdata")
                .when().post("url/here/")
                .then().statusCode(200)
                .body("fileName", equalTo("test1.txt")).log().all();
    }

    @Test(enabled = true, priority = 3)
    public void fileDownload() {
        //Approach1
        given().
                when().get("url/here/")
                .then().statusCode(200)
                .log().body();
    }
}
