package math;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;


public class Test_API {
    private static String token ="ya29.a0AfH6SMChAnkFvjOEfLGT4TS_ZxmxQCgYw-oJPKZrE4K0PZPUQ_OBJvf83yPsu5T9AYHUvoP44JkBl2c6sxulc9r3cGmiR6WR7is3wtZcVBHvJEa8yObnjHvU58kdmjMMQ0WgrKzMgTouJ3QvRWk5wM2p2ZBw";
    private static String body = "{\n" +
            "  \"dataStreamName\": \"MyDataSource1\",\n" +
            "  \"type\": \"derived\",\n" +
            "  \"application\": {\n" +
            "    \"detailsUrl\": \"http://example.com\",\n" +
            "    \"name\": \"Foo Example App\",\n" +
            "    \"version\": \"1\"\n" +
            "  },\n" +
            "  \"dataType\": {\n" +
            "    \"field\": [\n" +
            "      {\n" +
            "        \"name\": \"steps\",\n" +
            "        \"format\": \"integer\"\n" +
            "      }\n" +
            "    ],\n" +
            "    \"name\": \"com.google.step_count.delta\"\n" +
            "  },\n" +
            "  \"device\": {\n" +
            "    \"manufacturer\": \"Example Manufacturer\",\n" +
            "    \"model\": \"ExampleTablet\",\n" +
            "    \"type\": \"tablet\",\n" +
            "    \"uid\": \"1000001\",\n" +
            "    \"version\": \"1.0\"\n" +
            "  }\n" +
            "}";
    @Test

    public void verifyApiDetectLanguage()
    {
        Response response = given()
                .baseUri("https://www.googleapis.com/fitness/v1/users/me/dataSources")
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .body(body)
                .post();

        response.prettyPrint();


    }

}

