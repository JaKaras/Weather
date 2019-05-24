package com.example.android.weather;

import android.app.Activity;
import android.content.SharedPreferences;

public class CityPreference {

    SharedPreferences prefs;

    public CityPreference(Activity activity){
        prefs = activity.getPreferences(Activity.MODE_PRIVATE);
    }

    // If the user has not chosen a city yet, return
    // Krakow as the default city
    String getCity(){
        return prefs.getString("city", "Krakow, PL");
    }

    void setCity(String city){
        prefs.edit().putString("city", city).commit();
    }
}
