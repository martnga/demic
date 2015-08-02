package com.nganga.wasiliana;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by nganga on 8/2/15.
 */
public class Wasiliana extends Application{

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(this, "zxHHksqVd0dimMPxi4CIXoSJqJVBBQafUAqdjMjh", "ykERw4avQUCAHyD8d08Kaabyd75hGUOYiepDMSp0");
    }
}
