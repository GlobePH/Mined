package com.pocketmarket.mined.di.modules;

import com.pocketmarket.mined.data.SharedPrefReference;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AssistantFragmentModule_ProvideSharedPrefReferenceFactory
    implements Factory<SharedPrefReference> {
  private final AssistantFragmentModule module;

  public AssistantFragmentModule_ProvideSharedPrefReferenceFactory(AssistantFragmentModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public SharedPrefReference get() {
    return Preconditions.checkNotNull(
        module.provideSharedPrefReference(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<SharedPrefReference> create(AssistantFragmentModule module) {
    return new AssistantFragmentModule_ProvideSharedPrefReferenceFactory(module);
  }

  /** Proxies {@link AssistantFragmentModule#provideSharedPrefReference()}. */
  public static SharedPrefReference proxyProvideSharedPrefReference(
      AssistantFragmentModule instance) {
    return instance.provideSharedPrefReference();
  }
}
