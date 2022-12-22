package org.testvg.Utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class TestUtils {

	    public static JSONObject getJsonObject(String fileName) {
	        String json;
	        JSONObject jsonObject = null;
	        try {
	            json = new String(Files.readAllBytes(Paths.get(fileName)));
	            jsonObject = new JSONObject(json);
	        } catch (IOException | JSONException e) {
	            e.printStackTrace();
	        }
	        return jsonObject;

	    }

	    public static JSONArray getJsonArray(String fileName) {
	        String json;
	        JSONArray jsonArray = null;
	        try {
	            json = new String(Files.readAllBytes(Paths.get(fileName)));
	            jsonArray = new JSONArray(json);
	        } catch (IOException | JSONException e) {
	            e.printStackTrace();
	        }
	        return jsonArray;

	    }
}
