package com.bme.aut.readingchallenge;

import android.app.Application;
import com.bme.aut.readingchallenge.view.ViewModule;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Tracker;

public class ReadingChallengeApplication extends Application{

    public static ReadingChallengeApplicationComponent injector;


    private Tracker mTracker;

    /**
     * Gets the default {@link Tracker} for this {@link Application}.
     * @return tracker
     */
    synchronized public Tracker getDefaultTracker() {
        if (mTracker == null) {
            GoogleAnalytics analytics = GoogleAnalytics.getInstance(this);
            // To enable debug logging use: adb shell setprop log.tag.GAv4 DEBUG
            mTracker = analytics.newTracker(R.xml.global_tracker);
        }
        return mTracker;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        injector = DaggerReadingChallengeApplicationComponent.builder().viewModule(new ViewModule(this)).build();
    }
}
