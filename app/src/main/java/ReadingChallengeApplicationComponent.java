import com.bme.aut.readingchallenge.interactor.InteractorModule;
import com.bme.aut.readingchallenge.interactor.StringInteractor;
import com.bme.aut.readingchallenge.presenter.MainPresenter;
import com.bme.aut.readingchallenge.view.MainActivity;
import com.bme.aut.readingchallenge.view.ViewModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by mobsoft on 2016. 04. 18..
 */

@Singleton
@Component(modules = {ViewModule.class, InteractorModule.class, ModelModule.class})
public interface ReadingChallengeApplicationComponent {
    void inject(MainActivity mainActivity);

    void inject(MainPresenter mainPresenter);

    void inject(StringInteractor stringInteractor);
}
