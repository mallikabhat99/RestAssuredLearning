package restassured.udemy;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.Assert;

import static io.restassured.RestAssured.given;

public class GraphQLScript {
    public static void main(String[] args) {
        //https://rahulshettyacademy.com/gq/graphql
        String mutationResponse = given().header("Content-Type", "application/json")
                .body("{\"query\":\"mutation ($locationName: String!, $characterName: String!, $episodeName: String!) {\\n  createLocation(location: {name: $locationName, type: \\\"SouthZone\\\", dimension: \\\"224\\\"}) {\\n    id\\n  }\\n  createCharacter(character: {name: $characterName, status: \\\"dead\\\", type: \\\"macho\\\", species: \\\"fantasy\\\", gender: \\\"male\\\", originId: 25070, locationId: 25070, image: \\\"png\\\"}) {\\n    id\\n  }\\n  createEpisode(episode: {name: $episodeName, air_date: \\\"13/10/2025\\\", episode: \\\"Netflix\\\"}) {\\n    id\\n  }\\n  deleteLocations(locationIds: [25073]) {\\n    locationsDeleted\\n  }\\n}\\n\",\"variables\":{\"locationName\":\"Australia\",\"characterName\":\"Robin\",\"episodeName\":\"Mallika's episode\"}}")
                .log().all().post("https://rahulshettyacademy.com/gq/graphql").then().log().all()
                .assertThat().statusCode(200).contentType("application/json").extract().response().asString();
        System.out.println(mutationResponse);
        JsonPath js = new JsonPath(mutationResponse);
        String createLocationID = js.getString("data.createLocation.id");
        String createEpisodeID = js.getString("data.createEpisode.id");
        String createCharacterID = js.getString("data.createCharacter.id");
        Assert.assertNotNull(createLocationID);


        String queryResponse = given().header("Content-Type", "application/json")
                .body("{\"query\":\"query($characterId:Int!, $episodeId:Int!){\\n  character(characterId: $characterId) {\\n    name\\n    gender\\n    status\\n  }\\n  \\n  location(locationId: "+createLocationID+"){\\n    name\\n    dimension\\n  }\\n  episode(episodeId: $episodeId){\\n    name\\n    air_date\\n  }\\n  characters(filters: {name :\\\"Rahul\\\"})\\n  {\\n  info{\\n  \\n    count\\n  }\\n  result{\\n    name\\n    type\\n  }\\n  }\\n    episodes(filters:{episode: \\\"hulu\\\"} ){\\n      \\n      result {\\n        name\\n        air_date\\n        episode \\n      }\\n    }\\n  }\\n\",\"variables\":{\"characterId\":"+createCharacterID+",\"episodeId\":"+createEpisodeID+"}}")
                .log().all().post("https://rahulshettyacademy.com/gq/graphql").then().log().all()
                .assertThat().statusCode(200).contentType("application/json").extract().response().asString();
        System.out.println(queryResponse);
        JsonPath js2 = new JsonPath(queryResponse);
        String episodeName = js.getString("data.character.name");
        System.out.println(episodeName);
    }
    }
