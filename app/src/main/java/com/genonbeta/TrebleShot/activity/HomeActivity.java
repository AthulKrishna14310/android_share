package com.genonbeta.TrebleShot.activity;

import android.os.Bundle;
import com.genonbeta.TrebleShot.R;
import com.genonbeta.TrebleShot.app.Activity;
import com.genonbeta.TrebleShot.fragment.HomeFragment;

public class HomeActivity
        extends Activity {
    public static final int REQUEST_PERMISSION_ALL = 1;

     HomeFragment mHomeFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        mHomeFragment = (HomeFragment) getSupportFragmentManager().findFragmentById(R.id.activitiy_home_fragment);



    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        exitApp();
    }
}