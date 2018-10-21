package com.example.mufty.introslider.SharedPreferences;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Mufty on 03/07/2017.
 */

public class PrefManager {
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    Context _context;

    // shared preferences mode
    int PRIVATE_MODE = 0;

    //shared preferences file name
    private static final String PREF_NAME = "INTRO SLIDER";

    private static final String IS_FIRST_TIME_LAUNCH = "IsFirstTimeLaunch";

    public PrefManager(Context context){
        this._context = context;
        sharedPreferences = _context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = sharedPreferences.edit();
    }

    public void setIsFirstTimeLaunch(boolean isFirstTimeLaunch){
        editor.putBoolean(IS_FIRST_TIME_LAUNCH,isFirstTimeLaunch);
        editor.commit();
    }

    public boolean isFirstTimeLaunch(){
        return sharedPreferences.getBoolean(IS_FIRST_TIME_LAUNCH, true);
    }
}
