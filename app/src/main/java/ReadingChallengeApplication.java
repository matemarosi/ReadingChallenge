import android.app.Application;

import com.bme.aut.readingchallenge.view.ViewModule;

/**
 * Created by mobsoft on 2016. 04. 18..
 */
public class ReadingChallengeApplication extends Application{

    public static ReadingChallengeApplicationComponent injector;

    @Override
    public void onCreate() {
        super.onCreate();
        injector = DaggerReadingChallengeApplicationComponent.builder().viewModule(new ViewModule(this)).build();
    }
}
