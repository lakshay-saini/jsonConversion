package com.example.conversion;

import com.example.conversion.model.Json;
import org.json.JSONObject;

import java.util.HashMap;

public class Application {

    public static void main(String[] args) {
        HashMap<String, String> list = new HashMap<>();
        JSONObject image = new JSONObject(Json.JSON_ONE).getJSONArray("getPropertyContent").getJSONObject(0).getJSONObject("images").getJSONObject("external");
        for (String key : image.keySet()) list.put(key, image.get(key).toString());
        System.out.println("list = " + list);
    }
}
