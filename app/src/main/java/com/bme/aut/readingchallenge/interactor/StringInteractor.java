package com.bme.aut.readingchallenge.interactor;

import com.bme.aut.readingchallenge.model.StringModel;

import javax.inject.Inject;

/**
 * Created by mobsoft on 2016. 04. 18..
 */
public class StringInteractor {

    @Inject
    StringModel model;

    public StringInteractor() {
        ReadingChallengeApplication.injector.inject(this);
    }

    public String getString() {
        return model.getNextString();
    }
}
