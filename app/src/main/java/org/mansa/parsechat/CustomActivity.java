package org.mansa.parsechat;

import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBar;
import android.view.View;

/**
 * Created by mansa on 10/12/15.
 */
public class CustomActivity extends FragmentActivity implements View.OnClickListener{

    public static final TouchEffect TOUCH = new TouchEffect();

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        setupActionBar();
    }

    protected void setupActionBar(){

        final android.app.ActionBar actionBar = getActionBar();

        if (actionBar == null)
            return;
        actionBar.setDisplayShowTitleEnabled(true);
        actionBar.setNavigationMode(android.app.ActionBar.NAVIGATION_MODE_STANDARD);
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setLogo(R.drawable.ic_my_location_black_24dp);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeButtonEnabled(true);

    }
    @Override
    public void onClick(View v) {

    }

    public View setTouchNClick(int id)
    {
        View v = setClick(id);
        if (v != null)
            v.setOnTouchListener(TOUCH);
        return v;
    }

    public View setClick (int id){

        View v = findViewById(id);
        if(v != null)
            v.setOnClickListener(this);
        return  v;
    }
}
