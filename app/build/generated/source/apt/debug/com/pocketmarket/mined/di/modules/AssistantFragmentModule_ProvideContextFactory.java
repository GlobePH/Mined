package com.pocketmarket.mined.di.modules;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AssistantFragmentModule_ProvideContextFactory implements Factory<Context> {
  private final AssistantFragmentModule module;

  public AssistantFragmentModule_ProvideContextFactory(AssistantFragmentModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public Context get() {
    return Preconditions.checkNotNull(
        module.provideContext(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Context> create(AssistantFragmentModule module) {
    return new AssistantFragmentModule_ProvideContextFactory(module);
  }

  /** Proxies {@link AssistantFragmentModule#provideContext()}. */
  public static Context proxyProvideContext(AssistantFragmentModule instance) {
    return instance.provideContext();
  }
}
