package com.bme.aut.readingchallenge.model;

import dagger.Module;
import dagger.Provides;

@Module
public class ModelModule {
    @Provides
    public BookModel getBookModel() {
        return new BookModel();
    }
}
