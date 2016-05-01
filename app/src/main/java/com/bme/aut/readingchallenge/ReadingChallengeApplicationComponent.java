package com.bme.aut.readingchallenge;

import com.bme.aut.readingchallenge.interactor.InteractorModule;
import com.bme.aut.readingchallenge.interactor.BookInteractor;
import com.bme.aut.readingchallenge.model.ModelModule;
import com.bme.aut.readingchallenge.presenter.MainPresenter;
import com.bme.aut.readingchallenge.view.MainActivity;
import com.bme.aut.readingchallenge.view.ViewModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ViewModule.class, InteractorModule.class, ModelModule.class})
public interface ReadingChallengeApplicationComponent {
    void inject(MainActivity mainActivity);

    void inject(MainPresenter mainPresenter);

    void inject(BookInteractor bookInteractor);
}
