package com.pocketmarket.mined;

import android.content.Context;

import com.facebook.stetho.Stetho;

/**
 * Created by mkpazon on 17/2/16.
 */
public final class Configuration {

    private Configuration() {

    }

    static void init(Context context) {
        Stetho.initialize(
                Stetho.newInitializerBuilder(context)
                        .enableDumpapp(Stetho.defaultDumperPluginsProvider(context))
                        .enableWebKitInspector(Stetho.defaultInspectorModulesProvider(context))
                        .build());
    }
}

