package restassured.googleapi;

import io.restassured.path.json.JsonPath;
import org.testng.annotations.Test;
import restassured.payload.payload;

public class ComplexJsonParse {
/* 1.Print No of courses returned by API
2.Print Purchase Amount
3. Print Title of the first course
4. Print All course titles and their respective Prices
5. Print no of copies sold by RPA Course
6. Verify if Sum of all Course prices matches with Purchase Amount*/

    @Test(enabled = true, priority = 1)
    public void complexJsonTest() {
        JsonPath js = new JsonPath(payload.coursePrice());
        int courseCount = js.getInt("courses.size()");
        System.out.println(courseCount);

        int purchaseAmount = js.getInt("dashboard.purchaseAmount");
        System.out.println(purchaseAmount);

        String firstCourseTitle = js.getString("courses[0].title");
        System.out.println(firstCourseTitle);

        //4. Print All course titles and their respective Prices
        for (int i = 0; i < courseCount; i++) {
           String courseTitle =  js.getString("courses[" + courseCount + "].title");
           int price = js.get("courses[" + courseCount + "].price");
           System.out.println(courseTitle + " Course title");
           System.out.println(price + " price");
        }

        System.out.println("No of courses sold by RPA");
        for (int i = 0; i < courseCount; i++) {
            String courseTitle =  js.getString("courses[" + courseCount + "].title");
            if (courseTitle.equalsIgnoreCase("RPA")){
                int copiesRPA = js.get("courses[" + courseCount + "].copies");
                System.out.println(copiesRPA + "RPA course copies");
                break;
            }
        }



    }
}
