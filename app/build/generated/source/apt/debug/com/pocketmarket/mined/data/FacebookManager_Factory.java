package com.pocketmarket.mined.data;

import android.app.Activity;
import android.content.Context;
import com.pocketmarket.mined.controllers.ErrorMessage;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class FacebookManager_Factory implements Factory<FacebookManager> {
  private final Provider<Context> contextProvider;

  private final Provider<Activity> activityProvider;

  private final Provider<ErrorMessage> errorMessageProvider;

  private final Provider<SharedPrefReference> sharedPrefReferenceProvider;

  public FacebookManager_Factory(
      Provider<Context> contextProvider,
      Provider<Activity> activityProvider,
      Provider<ErrorMessage> errorMessageProvider,
      Provider<SharedPrefReference> sharedPrefReferenceProvider) {
    assert contextProvider != null;
    this.contextProvider = contextProvider;
    assert activityProvider != null;
    this.activityProvider = activityProvider;
    assert errorMessageProvider != null;
    this.errorMessageProvider = errorMessageProvider;
    assert sharedPrefReferenceProvider != null;
    this.sharedPrefReferenceProvider = sharedPrefReferenceProvider;
  }

  @Override
  public FacebookManager get() {
    return new FacebookManager(
        contextProvider.get(),
        activityProvider.get(),
        errorMessageProvider.get(),
        sharedPrefReferenceProvider.get());
  }

  public static Factory<FacebookManager> create(
      Provider<Context> contextProvider,
      Provider<Activity> activityProvider,
      Provider<ErrorMessage> errorMessageProvider,
      Provider<SharedPrefReference> sharedPrefReferenceProvider) {
    return new FacebookManager_Factory(
        contextProvider, activityProvider, errorMessageProvider, sharedPrefReferenceProvider);
  }
}
