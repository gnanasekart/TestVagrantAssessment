package org.testvg.StepDefinitions;


import org.json.JSONArray;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testvg.Utils.TestUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;

public class Direct_Validation_Approach {
    //Here I try to do a direct validation approach using

    public static void main(String[] args) throws IOException, ParseException {

//        Object parser = new JSONParser().parse(new FileReader("src/main/resources/Payload_file/players_name.json"));
//        JSONObject object = TestUtils.getJsonObject(parser.toString());
//        JSONArray jarray = object.getJSONArray("player");
//        int count=0, wcount=0;
//       for(int i=0; i<jarray.length(); i++){
//           String countryName = jarray.getJSONObject(i).getString("country");
//           String playerRole = jarray.getJSONObject(i).getString("role");
//
//           if(!countryName.equalsIgnoreCase("India")) count++;
//
//
//           if(playerRole.equalsIgnoreCase("Wicket-keeper")){
//               wcount++;
//           }
//       }
//        System.out.println(count);
//        System.out.println(wcount);
//       if(count==4){
//           System.out.println("four players");
//       }


    }
}
