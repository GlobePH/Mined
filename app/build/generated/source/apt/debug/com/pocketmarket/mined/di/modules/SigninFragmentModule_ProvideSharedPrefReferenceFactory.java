package com.pocketmarket.mined.di.modules;

import com.pocketmarket.mined.data.SharedPrefReference;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SigninFragmentModule_ProvideSharedPrefReferenceFactory
    implements Factory<SharedPrefReference> {
  private final SigninFragmentModule module;

  public SigninFragmentModule_ProvideSharedPrefReferenceFactory(SigninFragmentModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public SharedPrefReference get() {
    return Preconditions.checkNotNull(
        module.provideSharedPrefReference(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<SharedPrefReference> create(SigninFragmentModule module) {
    return new SigninFragmentModule_ProvideSharedPrefReferenceFactory(module);
  }

  /** Proxies {@link SigninFragmentModule#provideSharedPrefReference()}. */
  public static SharedPrefReference proxyProvideSharedPrefReference(SigninFragmentModule instance) {
    return instance.provideSharedPrefReference();
  }
}
