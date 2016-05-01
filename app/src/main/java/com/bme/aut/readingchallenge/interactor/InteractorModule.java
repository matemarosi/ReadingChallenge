package com.bme.aut.readingchallenge.interactor;

import dagger.Module;
import dagger.Provides;

@Module
public class InteractorModule {
    @Provides
    public BookInteractor getBookInteractor() {
        return new BookInteractor();
    }
}
