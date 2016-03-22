package com.coolweather.app.activity;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.coolweather.app.R;
import com.coolweather.app.service.AutoUpdateService;
import com.coolweather.app.util.HttpCallbackListener;
import com.coolweather.app.util.HttpUtil;
import com.coolweather.app.util.Utility;

import net.youmi.android.banner.AdSize;
import net.youmi.android.banner.AdView;

public class WeatherActivityAd extends WeatherActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AdView adView = new AdView(this, AdSize.FIT_SCREEN);
        LinearLayout adLayout = (LinearLayout)findViewById(R.id.adLayout);
        adLayout.addView(adView);

    }


}
