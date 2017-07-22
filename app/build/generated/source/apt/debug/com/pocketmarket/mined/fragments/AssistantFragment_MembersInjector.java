package com.pocketmarket.mined.fragments;

import com.pocketmarket.mined.data.AssistantFragmentManager;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AssistantFragment_MembersInjector implements MembersInjector<AssistantFragment> {
  private final Provider<AssistantFragmentManager> mAssistantFragmentManagerProvider;

  public AssistantFragment_MembersInjector(
      Provider<AssistantFragmentManager> mAssistantFragmentManagerProvider) {
    assert mAssistantFragmentManagerProvider != null;
    this.mAssistantFragmentManagerProvider = mAssistantFragmentManagerProvider;
  }

  public static MembersInjector<AssistantFragment> create(
      Provider<AssistantFragmentManager> mAssistantFragmentManagerProvider) {
    return new AssistantFragment_MembersInjector(mAssistantFragmentManagerProvider);
  }

  @Override
  public void injectMembers(AssistantFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mAssistantFragmentManager = mAssistantFragmentManagerProvider.get();
  }

  public static void injectMAssistantFragmentManager(
      AssistantFragment instance,
      Provider<AssistantFragmentManager> mAssistantFragmentManagerProvider) {
    instance.mAssistantFragmentManager = mAssistantFragmentManagerProvider.get();
  }
}
