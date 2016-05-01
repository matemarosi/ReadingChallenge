package com.bme.aut.readingchallenge.interactor;

import com.bme.aut.readingchallenge.ReadingChallengeApplication;
import com.bme.aut.readingchallenge.model.BookModel;

import javax.inject.Inject;


public class BookInteractor {

    @Inject
    BookModel model;

    public BookInteractor() {
        ReadingChallengeApplication.injector.inject(this);
    }

    public String getBook() {
        return model.getNextBook();
    }
}
