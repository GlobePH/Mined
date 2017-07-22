package com.pocketmarket.mined.di.modules;

import android.app.Activity;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SigninFragmentModule_ProvideActivityFactory implements Factory<Activity> {
  private final SigninFragmentModule module;

  public SigninFragmentModule_ProvideActivityFactory(SigninFragmentModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public Activity get() {
    return Preconditions.checkNotNull(
        module.provideActivity(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Activity> create(SigninFragmentModule module) {
    return new SigninFragmentModule_ProvideActivityFactory(module);
  }

  /** Proxies {@link SigninFragmentModule#provideActivity()}. */
  public static Activity proxyProvideActivity(SigninFragmentModule instance) {
    return instance.provideActivity();
  }
}
