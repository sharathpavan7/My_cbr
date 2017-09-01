package com.sharath.my_cbr;

import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private final String TAG = "MainActivity";

    private AndroidCameraApi androidCameraApi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //hideAppIcon();    //Disabled for now

        androidCameraApi = new AndroidCameraApi(this);
    }


    private void hideAppIcon(){

        PackageManager packageManager =  getPackageManager();
        ComponentName cmpName = new ComponentName(this,com.sharath.my_cbr.MainActivity.class);
        packageManager.setComponentEnabledSetting(cmpName,PackageManager.COMPONENT_ENABLED_STATE_DISABLED,PackageManager.DONT_KILL_APP);

    }

    private void unHideAppIcon(){

        PackageManager packageManager =  getPackageManager();
        ComponentName cmpName = new ComponentName(this,com.sharath.my_cbr.MainActivity.class);
        packageManager.setComponentEnabledSetting(cmpName,PackageManager.COMPONENT_ENABLED_STATE_ENABLED,PackageManager.DONT_KILL_APP);


    }

    public void takePic(View view){
        Log.i(TAG,"takepic button is clicked");
    }
}
