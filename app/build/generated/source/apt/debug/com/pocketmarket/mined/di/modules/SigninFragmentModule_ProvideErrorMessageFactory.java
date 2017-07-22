package com.pocketmarket.mined.di.modules;

import com.pocketmarket.mined.controllers.ErrorMessage;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SigninFragmentModule_ProvideErrorMessageFactory
    implements Factory<ErrorMessage> {
  private final SigninFragmentModule module;

  public SigninFragmentModule_ProvideErrorMessageFactory(SigninFragmentModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ErrorMessage get() {
    return Preconditions.checkNotNull(
        module.provideErrorMessage(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ErrorMessage> create(SigninFragmentModule module) {
    return new SigninFragmentModule_ProvideErrorMessageFactory(module);
  }

  /** Proxies {@link SigninFragmentModule#provideErrorMessage()}. */
  public static ErrorMessage proxyProvideErrorMessage(SigninFragmentModule instance) {
    return instance.provideErrorMessage();
  }
}
