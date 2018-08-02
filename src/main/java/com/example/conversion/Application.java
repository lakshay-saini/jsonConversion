package com.example.conversion;

import com.example.conversion.model.Json;
import org.apache.commons.lang3.StringUtils;
import org.json.JSONObject;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Application {

    public static void main(String[] args) {
        LinkedHashMap<String, JSONObject> list = new LinkedHashMap<>();
        JSONObject image = new JSONObject(Json.JSON_ONE).getJSONArray("getPropertyContent").getJSONObject(0).getJSONObject("images").getJSONObject("external");
        for (String key : image.keySet()) list.put(key, (JSONObject) image.get(key));
        Set<String> urls = new HashSet<>();
        for (Map.Entry<String, JSONObject> entry : list.entrySet()) {
            String url = String.valueOf(entry.getValue().get("url"));
            if(!StringUtils.isEmpty(String.valueOf(url))){
                urls.add(url);
            }
        }
        System.out.println("list = " + urls);
    }
}
