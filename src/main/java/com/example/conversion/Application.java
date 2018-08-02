package com.example.conversion;

import com.example.conversion.model.Json;
import org.apache.commons.lang3.StringUtils;
import org.json.JSONObject;

import java.util.LinkedHashMap;
import java.util.Set;
import java.util.stream.Collectors;

public class Application {

    public static void main(String[] args) {
        LinkedHashMap<String, JSONObject> list = new LinkedHashMap<>();

        JSONObject image = new JSONObject(Json.JSON_ONE).getJSONArray("getPropertyContent").getJSONObject(0).getJSONObject("images").getJSONObject("external");
        for (String key : image.keySet()) list.put(key, (JSONObject) image.get(key));
        Set<String> urls = list.entrySet().stream().filter(value -> !StringUtils.isEmpty(String.valueOf(value.getValue().get("url")))).map(value -> String.valueOf(value.getValue().get("url"))).collect(Collectors.toSet());

        System.out.println("urls = " + urls);
    }
}
