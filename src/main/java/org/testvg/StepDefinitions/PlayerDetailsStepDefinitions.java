package org.testvg.StepDefinitions;

import io.cucumber.java.en.Given;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.testvg.Utils.TestUtils;

import java.io.FileReader;
import java.io.IOException;

public class PlayerDetailsStepDefinitions {

    @Given("the verified json should have {int} foreign player for the given {string} file")
    public void verifySchemaValiationForGivenInputFile(int playerCount, String playerFile){

        int foreignPlayerCount = 0;
        try {
            Object parser = new JSONParser().parse(new FileReader("src/main/resources/Payload_file/" + playerFile + ".json"));
            JSONObject object = TestUtils.getJsonObject(parser.toString());
            JSONArray jarray = object.getJSONArray("player");

            for (int i = 0; i < jarray.length(); i++) {
                String countryName = jarray.getJSONObject(i).getString("country");
                if (!countryName.equalsIgnoreCase("India"))
                    foreignPlayerCount++;
            }
            Assert.assertEquals(foreignPlayerCount, playerCount);
        } catch (IOException io) {
            io.printStackTrace();
        } catch (ParseException pe) {
            pe.printStackTrace();
        }
    }


    @Given("the verified json should have {int} wicket keeper in the team")
    public void verifyTeamHaveOneWicketKeeper(int keeperCount) {

        int wicketkeeperCount = 0;
        try {
            Object parser = new JSONParser().parse(new FileReader("src/main/resources/Payload_file/players_name.json"));
            JSONObject object = TestUtils.getJsonObject(parser.toString());
            JSONArray jarray = object.getJSONArray("player");

            for (int i = 0; i < jarray.length(); i++) {
                String playerRole = jarray.getJSONObject(i).getString("role");
                if (playerRole.equalsIgnoreCase("Wicket-keeper"))
                    wicketkeeperCount++;
            }
            Assert.assertEquals(wicketkeeperCount, keeperCount);
        } catch (IOException io) {
            io.printStackTrace();
        } catch (ParseException pe) {
            pe.printStackTrace();
        }
    }
}
