package org.testvg.Utils;

import java.io.File;
import java.util.List;
import java.util.stream.Collectors;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.testng.Assert;
import org.testvg.POJO_Data.TeamDetails;

public class TestUtils {

    public static JSONObject getJsonObject(String fileName) {
        JSONObject jsonObject = null;
        try {
            jsonObject = new JSONObject(fileName);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jsonObject;
    }

    public static JSONArray getJsonArray(String fileName) {
        JSONArray jsonArray = null;
        try {
            jsonArray = new JSONArray(fileName);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jsonArray;
    }
}
