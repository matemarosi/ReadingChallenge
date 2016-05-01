package com.bme.aut.readingchallenge;

import android.app.Application;
import com.bme.aut.readingchallenge.view.ViewModule;

public class ReadingChallengeApplication extends Application{

    public static ReadingChallengeApplicationComponent injector;

    @Override
    public void onCreate() {
        super.onCreate();
        injector = DaggerReadingChallengeApplicationComponent.builder().viewModule(new ViewModule(this)).build();
    }
}
