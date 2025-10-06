package restassured.payload;

public class payload {

    public static String addPlacePayload() {
        return "{\n" +
                "  \"location\": {\n" +
                "    \"lat\": -38.383494,\n" +
                "    \"lng\": 33.427362\n" +
                "  },\n" +
                "  \"accuracy\": 50,\n" +
                "  \"name\": \"Frontline house MB\",\n" +
                "  \"phone_number\": \"(+91) 9902622864\",\n" +
                "  \"address\": \"29, side layout, cohen 09\",\n" +
                "  \"types\": [\n" +
                "    \"shoe park\",\n" +
                "    \"shop\"\n" +
                "  ],\n" +
                "  \"website\": \"http://google.com\",\n" +
                "  \"language\": \"Hindi-IN\"\n" +
                "}\n";
    }

    public static String updatePlacePayload(String placeId, String address) {
        return "{\n" +
                "\"place_id\":\"" + placeId + "\",\n" +
                "\"address\":\"" + address + "\",\n" +
                "\"key\":\"qaclick123\"\n" +
                "}\n";
    }

/* 1.Print No of courses returned by API
2.Print Purchase Amount
3. Print Title of the first course
4. Print All course titles and their respective Prices
5. Print no of copies sold by RPA Course
6. Verify if Sum of all Course prices matches with Purchase Amount*/

    public static String coursePrice() {
        return "{\n" +
                "  \"dashboard\": {\n" +
                "    \"purchaseAmount\": 910,\n" +
                "    \"website\": \"rahulshettyacademy.com\"\n" +
                "  },\n" +
                "  \"courses\": [\n" +
                "    {\n" +
                "      \"title\": \"Selenium Python\",\n" +
                "      \"price\": 50,\n" +
                "      \"copies\": 6\n" +
                "    },\n" +
                "    {\n" +
                "      \"title\": \"Cypress\",\n" +
                "      \"price\": 40,\n" +
                "      \"copies\": 4\n" +
                "    },\n" +
                "    {\n" +
                "      \"title\": \"RPA\",\n" +
                "      \"price\": 45,\n" +
                "      \"copies\": 10\n" +
                "    }\n" +
                "  ]\n" +
                "}";
    }

    public static String addBook(String aisle , String isbn){
        String payload = "{\n" +
                "\n" +
                "\"name\":\"Learn Appium Automation with Java with Me\",\n" +
                "\"isbn\":\""+isbn+"\",\n" +
                "\"aisle\":\""+aisle+"\",\n" +
                "\"author\":\"MallikaB\"\n" +
                "}\n";
        return payload;
    }

    public static String deleteBook( String bookID){
        String payload = "{\n" +
                " \n" +
                "\"ID\" : \""+bookID+"\"\n" +
                " \n" +
                "}";
        return payload;
    }
}
