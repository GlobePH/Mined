package com.pocketmarket.mined.di.modules;

import android.content.SharedPreferences;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AssistantFragmentModule_ProvideSharedPreferencesFactory
    implements Factory<SharedPreferences> {
  private final AssistantFragmentModule module;

  public AssistantFragmentModule_ProvideSharedPreferencesFactory(AssistantFragmentModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public SharedPreferences get() {
    return Preconditions.checkNotNull(
        module.provideSharedPreferences(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<SharedPreferences> create(AssistantFragmentModule module) {
    return new AssistantFragmentModule_ProvideSharedPreferencesFactory(module);
  }

  /** Proxies {@link AssistantFragmentModule#provideSharedPreferences()}. */
  public static SharedPreferences proxyProvideSharedPreferences(AssistantFragmentModule instance) {
    return instance.provideSharedPreferences();
  }
}
