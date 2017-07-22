package com.pocketmarket.mined.di.modules;

import android.content.SharedPreferences;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ApplicationModule_ProvideSharedPreferencesFactory
    implements Factory<SharedPreferences> {
  private final ApplicationModule module;

  public ApplicationModule_ProvideSharedPreferencesFactory(ApplicationModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public SharedPreferences get() {
    return Preconditions.checkNotNull(
        module.provideSharedPreferences(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<SharedPreferences> create(ApplicationModule module) {
    return new ApplicationModule_ProvideSharedPreferencesFactory(module);
  }

  /** Proxies {@link ApplicationModule#provideSharedPreferences()}. */
  public static SharedPreferences proxyProvideSharedPreferences(ApplicationModule instance) {
    return instance.provideSharedPreferences();
  }
}
