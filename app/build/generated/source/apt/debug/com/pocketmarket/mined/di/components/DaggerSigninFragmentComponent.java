package com.pocketmarket.mined.di.components;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import com.pocketmarket.mined.controllers.ErrorMessage;
import com.pocketmarket.mined.controllers.ErrorMessage_Factory;
import com.pocketmarket.mined.data.FacebookManager;
import com.pocketmarket.mined.data.FacebookManager_Factory;
import com.pocketmarket.mined.data.SharedPrefReference;
import com.pocketmarket.mined.data.SharedPrefReference_Factory;
import com.pocketmarket.mined.di.modules.SigninFragmentModule;
import com.pocketmarket.mined.di.modules.SigninFragmentModule_ProvideActivityFactory;
import com.pocketmarket.mined.di.modules.SigninFragmentModule_ProvideContextFactory;
import com.pocketmarket.mined.di.modules.SigninFragmentModule_ProvideErrorMessageFactory;
import com.pocketmarket.mined.di.modules.SigninFragmentModule_ProvideSharedPrefReferenceFactory;
import com.pocketmarket.mined.di.modules.SigninFragmentModule_ProvideSharedPreferencesFactory;
import com.pocketmarket.mined.fragments.SigninFragment;
import com.pocketmarket.mined.fragments.SigninFragment_MembersInjector;
import dagger.MembersInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerSigninFragmentComponent implements SigninFragmentComponent {
  private Provider<Context> provideContextProvider;

  private Provider<Activity> provideActivityProvider;

  private Provider<ErrorMessage> provideErrorMessageProvider;

  private Provider<SharedPrefReference> provideSharedPrefReferenceProvider;

  private Provider<FacebookManager> facebookManagerProvider;

  private MembersInjector<SigninFragment> signinFragmentMembersInjector;

  private Provider<ErrorMessage> errorMessageProvider;

  private Provider<SharedPreferences> provideSharedPreferencesProvider;

  private Provider<SharedPrefReference> sharedPrefReferenceProvider;

  private DaggerSigninFragmentComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.provideContextProvider =
        SigninFragmentModule_ProvideContextFactory.create(builder.signinFragmentModule);

    this.provideActivityProvider =
        SigninFragmentModule_ProvideActivityFactory.create(builder.signinFragmentModule);

    this.provideErrorMessageProvider =
        SigninFragmentModule_ProvideErrorMessageFactory.create(builder.signinFragmentModule);

    this.provideSharedPrefReferenceProvider =
        SigninFragmentModule_ProvideSharedPrefReferenceFactory.create(builder.signinFragmentModule);

    this.facebookManagerProvider =
        DoubleCheck.provider(
            FacebookManager_Factory.create(
                provideContextProvider,
                provideActivityProvider,
                provideErrorMessageProvider,
                provideSharedPrefReferenceProvider));

    this.signinFragmentMembersInjector =
        SigninFragment_MembersInjector.create(facebookManagerProvider);

    this.errorMessageProvider =
        DoubleCheck.provider(ErrorMessage_Factory.create(provideActivityProvider));

    this.provideSharedPreferencesProvider =
        SigninFragmentModule_ProvideSharedPreferencesFactory.create(builder.signinFragmentModule);

    this.sharedPrefReferenceProvider =
        DoubleCheck.provider(SharedPrefReference_Factory.create(provideSharedPreferencesProvider));
  }

  @Override
  public void inject(SigninFragment signinFragment) {
    signinFragmentMembersInjector.injectMembers(signinFragment);
  }

  @Override
  public FacebookManager getFacebookManager() {
    return facebookManagerProvider.get();
  }

  @Override
  public ErrorMessage getErrorMessage() {
    return errorMessageProvider.get();
  }

  @Override
  public SharedPrefReference getSharedPrefReference() {
    return sharedPrefReferenceProvider.get();
  }

  public static final class Builder {
    private SigninFragmentModule signinFragmentModule;

    private Builder() {}

    public SigninFragmentComponent build() {
      if (signinFragmentModule == null) {
        throw new IllegalStateException(
            SigninFragmentModule.class.getCanonicalName() + " must be set");
      }
      return new DaggerSigninFragmentComponent(this);
    }

    public Builder signinFragmentModule(SigninFragmentModule signinFragmentModule) {
      this.signinFragmentModule = Preconditions.checkNotNull(signinFragmentModule);
      return this;
    }
  }
}
