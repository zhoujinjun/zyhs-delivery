package com.example.a17589.zyhs_delivery;

import org.json.JSONException;
import org.json.JSONObject;

public class JsonUtil {
    public static boolean isJson(String str){
        if(str == null){
            return false;
        }
        try {
            new JSONObject(str);
        } catch (JSONException e) {
            return false;
        }
        return true;
    }

}
