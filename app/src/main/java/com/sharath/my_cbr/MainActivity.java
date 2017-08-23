package com.sharath.my_cbr;

import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //hideAppIcon();    //Disabled for now
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
}
