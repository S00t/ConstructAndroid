package soot.construct.di.ContextScope;

import android.app.Application;

import dagger.Module;

/**
 * Created by Soot on 11/04/2017.
 */
@Module
public class ApplicationModule {
    private Application application;

    public ApplicationModule(Application application) {
        this.application = application;
    }
}