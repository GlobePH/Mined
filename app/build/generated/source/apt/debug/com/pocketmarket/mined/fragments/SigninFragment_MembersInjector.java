package com.pocketmarket.mined.fragments;

import com.pocketmarket.mined.data.FacebookManager;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SigninFragment_MembersInjector implements MembersInjector<SigninFragment> {
  private final Provider<FacebookManager> mFacebookManagerProvider;

  public SigninFragment_MembersInjector(Provider<FacebookManager> mFacebookManagerProvider) {
    assert mFacebookManagerProvider != null;
    this.mFacebookManagerProvider = mFacebookManagerProvider;
  }

  public static MembersInjector<SigninFragment> create(
      Provider<FacebookManager> mFacebookManagerProvider) {
    return new SigninFragment_MembersInjector(mFacebookManagerProvider);
  }

  @Override
  public void injectMembers(SigninFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mFacebookManager = mFacebookManagerProvider.get();
  }

  public static void injectMFacebookManager(
      SigninFragment instance, Provider<FacebookManager> mFacebookManagerProvider) {
    instance.mFacebookManager = mFacebookManagerProvider.get();
  }
}
