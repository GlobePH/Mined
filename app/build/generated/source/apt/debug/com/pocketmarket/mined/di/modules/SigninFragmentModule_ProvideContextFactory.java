package com.pocketmarket.mined.di.modules;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SigninFragmentModule_ProvideContextFactory implements Factory<Context> {
  private final SigninFragmentModule module;

  public SigninFragmentModule_ProvideContextFactory(SigninFragmentModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public Context get() {
    return Preconditions.checkNotNull(
        module.provideContext(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Context> create(SigninFragmentModule module) {
    return new SigninFragmentModule_ProvideContextFactory(module);
  }

  /** Proxies {@link SigninFragmentModule#provideContext()}. */
  public static Context proxyProvideContext(SigninFragmentModule instance) {
    return instance.provideContext();
  }
}
