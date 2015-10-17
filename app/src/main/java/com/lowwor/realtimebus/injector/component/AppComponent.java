package com.lowwor.realtimebus.injector.component;

import com.lowwor.realtimebus.BusApplication;
import com.lowwor.realtimebus.api.BusApiRepository;
import com.lowwor.realtimebus.injector.AppModule;
import com.lowwor.realtimebus.injector.module.RepositoryModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by lowworker on 2015/9/19.
 */

@Singleton
@Component(modules = {AppModule.class, RepositoryModule.class})
public interface AppComponent {

    BusApplication app();
    BusApiRepository busApiRepository();


}