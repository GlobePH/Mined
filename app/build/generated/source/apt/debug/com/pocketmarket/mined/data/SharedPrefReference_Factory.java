package com.pocketmarket.mined.data;

import android.content.SharedPreferences;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SharedPrefReference_Factory implements Factory<SharedPrefReference> {
  private final Provider<SharedPreferences> sharedPreferencesProvider;

  public SharedPrefReference_Factory(Provider<SharedPreferences> sharedPreferencesProvider) {
    assert sharedPreferencesProvider != null;
    this.sharedPreferencesProvider = sharedPreferencesProvider;
  }

  @Override
  public SharedPrefReference get() {
    return new SharedPrefReference(sharedPreferencesProvider.get());
  }

  public static Factory<SharedPrefReference> create(
      Provider<SharedPreferences> sharedPreferencesProvider) {
    return new SharedPrefReference_Factory(sharedPreferencesProvider);
  }
}
