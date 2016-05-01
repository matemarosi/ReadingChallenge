package com.bme.aut.readingchallenge.presenter;

import com.bme.aut.readingchallenge.ReadingChallengeApplication;
import com.bme.aut.readingchallenge.interactor.BookInteractor;
import com.bme.aut.readingchallenge.view.MainView;

import javax.inject.Inject;


/**
 * Created by mobsoft on 2016. 04. 18..
 */
public class MainPresenter extends Presenter<MainView>{


    @Inject
    public BookInteractor interactor;

    public MainPresenter() {
        ReadingChallengeApplication.injector.inject(this);
    }

    public void doStuff() {
        view.showString(interactor.getBook());
    }

    public void login() {

    }
}
