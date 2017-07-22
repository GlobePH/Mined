package com.pocketmarket.mined.di.components;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import com.pocketmarket.mined.MainApplication;
import com.pocketmarket.mined.data.SharedPrefReference;
import com.pocketmarket.mined.data.SharedPrefReference_Factory;
import com.pocketmarket.mined.di.modules.ApplicationModule;
import com.pocketmarket.mined.di.modules.ApplicationModule_ProvideApplicationFactory;
import com.pocketmarket.mined.di.modules.ApplicationModule_ProvideContextFactory;
import com.pocketmarket.mined.di.modules.ApplicationModule_ProvideSharedPreferencesFactory;
import dagger.internal.DoubleCheck;
import dagger.internal.MembersInjectors;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerApplicationComponent implements ApplicationComponent {
  private Provider<Context> provideContextProvider;

  private Provider<Application> provideApplicationProvider;

  private Provider<SharedPreferences> provideSharedPreferencesProvider;

  private Provider<SharedPrefReference> sharedPrefReferenceProvider;

  private DaggerApplicationComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.provideContextProvider =
        ApplicationModule_ProvideContextFactory.create(builder.applicationModule);

    this.provideApplicationProvider =
        ApplicationModule_ProvideApplicationFactory.create(builder.applicationModule);

    this.provideSharedPreferencesProvider =
        ApplicationModule_ProvideSharedPreferencesFactory.create(builder.applicationModule);

    this.sharedPrefReferenceProvider =
        DoubleCheck.provider(SharedPrefReference_Factory.create(provideSharedPreferencesProvider));
  }

  @Override
  public void inject(MainApplication mainApplication) {
    MembersInjectors.<MainApplication>noOp().injectMembers(mainApplication);
  }

  @Override
  public Context getContext() {
    return provideContextProvider.get();
  }

  @Override
  public Application getApplication() {
    return provideApplicationProvider.get();
  }

  @Override
  public SharedPrefReference getSharedPreference() {
    return sharedPrefReferenceProvider.get();
  }

  public static final class Builder {
    private ApplicationModule applicationModule;

    private Builder() {}

    public ApplicationComponent build() {
      if (applicationModule == null) {
        throw new IllegalStateException(
            ApplicationModule.class.getCanonicalName() + " must be set");
      }
      return new DaggerApplicationComponent(this);
    }

    public Builder applicationModule(ApplicationModule applicationModule) {
      this.applicationModule = Preconditions.checkNotNull(applicationModule);
      return this;
    }
  }
}
