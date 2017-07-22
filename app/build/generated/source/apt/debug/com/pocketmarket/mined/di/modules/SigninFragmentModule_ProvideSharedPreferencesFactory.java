package com.pocketmarket.mined.di.modules;

import android.content.SharedPreferences;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SigninFragmentModule_ProvideSharedPreferencesFactory
    implements Factory<SharedPreferences> {
  private final SigninFragmentModule module;

  public SigninFragmentModule_ProvideSharedPreferencesFactory(SigninFragmentModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public SharedPreferences get() {
    return Preconditions.checkNotNull(
        module.provideSharedPreferences(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<SharedPreferences> create(SigninFragmentModule module) {
    return new SigninFragmentModule_ProvideSharedPreferencesFactory(module);
  }

  /** Proxies {@link SigninFragmentModule#provideSharedPreferences()}. */
  public static SharedPreferences proxyProvideSharedPreferences(SigninFragmentModule instance) {
    return instance.provideSharedPreferences();
  }
}
