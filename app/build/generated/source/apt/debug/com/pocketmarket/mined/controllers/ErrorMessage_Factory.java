package com.pocketmarket.mined.controllers;

import android.app.Activity;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ErrorMessage_Factory implements Factory<ErrorMessage> {
  private final Provider<Activity> activityProvider;

  public ErrorMessage_Factory(Provider<Activity> activityProvider) {
    assert activityProvider != null;
    this.activityProvider = activityProvider;
  }

  @Override
  public ErrorMessage get() {
    return new ErrorMessage(activityProvider.get());
  }

  public static Factory<ErrorMessage> create(Provider<Activity> activityProvider) {
    return new ErrorMessage_Factory(activityProvider);
  }
}
