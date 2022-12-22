package org.testvg.StepDefinitions;

import io.cucumber.java.en.Given;
import org.json.JSONObject;
import org.testvg.Utils.TestUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Player_Details_Step_Definitions {

    @Given("verify the schema validation for given {string} file")
    public void verifySchemaValiationForGivenInputFile(String playerFile) throws IOException {

            JSONObject jsonObject = TestUtils.getJsonObject("/src/main/resources/Payload_file/players_name.json");

    }
}
