package com.pocketmarket.mined.data;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.Fragment;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AssistantFragmentManager_Factory implements Factory<AssistantFragmentManager> {
  private final Provider<Context> contextProvider;

  private final Provider<Activity> activityProvider;

  private final Provider<SharedPrefReference> sharedPrefReferenceProvider;

  private final Provider<Fragment> fragmentProvider;

  public AssistantFragmentManager_Factory(
      Provider<Context> contextProvider,
      Provider<Activity> activityProvider,
      Provider<SharedPrefReference> sharedPrefReferenceProvider,
      Provider<Fragment> fragmentProvider) {
    assert contextProvider != null;
    this.contextProvider = contextProvider;
    assert activityProvider != null;
    this.activityProvider = activityProvider;
    assert sharedPrefReferenceProvider != null;
    this.sharedPrefReferenceProvider = sharedPrefReferenceProvider;
    assert fragmentProvider != null;
    this.fragmentProvider = fragmentProvider;
  }

  @Override
  public AssistantFragmentManager get() {
    return new AssistantFragmentManager(
        contextProvider.get(),
        activityProvider.get(),
        sharedPrefReferenceProvider.get(),
        fragmentProvider.get());
  }

  public static Factory<AssistantFragmentManager> create(
      Provider<Context> contextProvider,
      Provider<Activity> activityProvider,
      Provider<SharedPrefReference> sharedPrefReferenceProvider,
      Provider<Fragment> fragmentProvider) {
    return new AssistantFragmentManager_Factory(
        contextProvider, activityProvider, sharedPrefReferenceProvider, fragmentProvider);
  }
}
