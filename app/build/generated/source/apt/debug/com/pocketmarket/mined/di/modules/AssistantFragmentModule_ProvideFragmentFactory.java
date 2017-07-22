package com.pocketmarket.mined.di.modules;

import android.support.v4.app.Fragment;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AssistantFragmentModule_ProvideFragmentFactory implements Factory<Fragment> {
  private final AssistantFragmentModule module;

  public AssistantFragmentModule_ProvideFragmentFactory(AssistantFragmentModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public Fragment get() {
    return Preconditions.checkNotNull(
        module.provideFragment(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Fragment> create(AssistantFragmentModule module) {
    return new AssistantFragmentModule_ProvideFragmentFactory(module);
  }

  /** Proxies {@link AssistantFragmentModule#provideFragment()}. */
  public static Fragment proxyProvideFragment(AssistantFragmentModule instance) {
    return instance.provideFragment();
  }
}
