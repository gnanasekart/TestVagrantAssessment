package org.testvg.Utils;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

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
