package soot.construct.di;

import javax.inject.Singleton;

import dagger.Component;
import soot.construct.ConstructApplication;
import soot.construct.di.ContextScope.ApplicationModule;

/**
 * Created by Soot on 01/04/2017.
 */
@Singleton
@Component(modules = {
        ApplicationModule.class,
        //  NetworkModule.class,
        // RepositoryModule.class,
        //  ZleceniaCacheModule.class,
        //  SyncModule.class
})
public interface ApplicationComponent {

    void inject(ConstructApplication santanderApplication);

    //ContextComponent newContextComponent(ConnectivityModule connectivityModule);
}
