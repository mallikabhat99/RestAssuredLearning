package restassured.udemy;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import restassured.payload.payload;

import static io.restassured.RestAssured.given;

public class DynamicJson {

    @Test(enabled = true, priority = 1 , dataProvider = "booksData")
    public void dynamicJsonSample(String aisle , String isbn) {
        RestAssured.baseURI = "http://216.10.245.166/";
        String response = given().header("Content-Type", "application/json")
                .body(payload.addBook(aisle, isbn)).when().post("Library/Addbook.php").then().assertThat().statusCode(200).log().all().extract().response().asString();
        JsonPath jsonPath = new JsonPath(response);
        String book_id = jsonPath.getString("ID");
        System.out.println(book_id);
        deleteBook(book_id);

    }

    public void deleteBook(String bookID) {
        RestAssured.baseURI = "http://216.10.245.166/";
        String response = given().header("Content-Type", "application/json")
                .body(payload.deleteBook(bookID)).when().post("Library/DeleteBook.php").then().assertThat().statusCode(404).log().all().extract().response().asString();
        JsonPath jsonPath = new JsonPath(response);
        String msg = jsonPath.getString("msg");
        System.out.println(msg + "for : " + bookID);

    }
    @DataProvider(name="booksData")
    public Object[][] getData() {
        //arrays - collection of elements
        //multidimensional arrays - collection of arrays
        return new Object[][]{{"kwa1", "1231"}, {"mal1", "3451"}, {"oiu1", "6781"}};
    }
}
