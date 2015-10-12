package org.mansa.parsechat;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by mansa on 10/12/15.
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);

        Parse.initialize(this, "tQKlYj8R0hiG17oUYU6fmRL7hhIe6iLCa0Qgior8", "9m2Fig0eG5eqkuQutFBbajkhJxglz3JSK9KTdBVt");
    }
}
