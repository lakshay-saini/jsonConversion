package com.example.conversion;

import com.example.conversion.model.Json;
import org.json.JSONObject;

import java.util.LinkedHashMap;

public class Application {

    public static void main(String[] args) {
        LinkedHashMap<String, String> list = new LinkedHashMap<>();
        JSONObject image = new JSONObject(Json.JSON_ONE).getJSONArray("getPropertyContent").getJSONObject(0).getJSONObject("images").getJSONObject("external");
        for (String key : image.keySet()) list.put(key, image.get(key).toString());
        System.out.println("list = " + list);
    }
}
