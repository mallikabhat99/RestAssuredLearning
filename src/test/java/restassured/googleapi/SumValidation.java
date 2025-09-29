package restassured.googleapi;

import io.restassured.path.json.JsonPath;
import org.testng.Assert;
import org.testng.annotations.Test;
import restassured.payload.payload;

public class SumValidation {

    @Test(enabled = true, priority = 1)
    public void sumValidation() {
        JsonPath js = new JsonPath(payload.coursePrice());

        int purchaseAmount = js.getInt("dashboard.purchaseAmount");
        System.out.println(purchaseAmount);

        int courseCount = js.getInt("courses.size()");
        System.out.println("Verify if Sum of all Course prices matches with Purchase Amount");
        int sum = 0;
        for (int i = 0; i < courseCount; i++) {
            int perCopyPrice = js.getInt("courses[" + courseCount + "].price");
            int copiesCount = js.getInt("courses[" + courseCount + "].copies");
            int amount = perCopyPrice * copiesCount;
            sum = sum + amount;
            System.out.println(sum);
        }
        Assert.assertEquals(sum, purchaseAmount);

    }


}
