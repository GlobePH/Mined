package com.pocketmarket.mined.di.modules;

import android.app.Activity;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AssistantFragmentModule_ProvideActivityFactory implements Factory<Activity> {
  private final AssistantFragmentModule module;

  public AssistantFragmentModule_ProvideActivityFactory(AssistantFragmentModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public Activity get() {
    return Preconditions.checkNotNull(
        module.provideActivity(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Activity> create(AssistantFragmentModule module) {
    return new AssistantFragmentModule_ProvideActivityFactory(module);
  }

  /** Proxies {@link AssistantFragmentModule#provideActivity()}. */
  public static Activity proxyProvideActivity(AssistantFragmentModule instance) {
    return instance.provideActivity();
  }
}
