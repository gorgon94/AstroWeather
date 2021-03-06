package com.example.wojciechpelka.astroweather.data;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.Serializable;

/**
 * Created by Wojciech on 2016-06-26.
 */

public class Condition implements JSONPopulator, Serializable
{
    private int code;
    private int temperature;
    private String date;
    private String description;

    public int getCode() {
        return code;
    }

    public int getTemperature() {
        return temperature;
    }

    public String getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public void populate(JSONObject data)
    {
        code = data.optInt("code");
        temperature = data.optInt("temp");
        date = data.optString("date");
        description = data.optString("text");
    }
}
