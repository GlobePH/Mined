package com.pocketmarket.mined.di.components;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.support.v4.app.Fragment;
import com.pocketmarket.mined.data.AssistantFragmentManager;
import com.pocketmarket.mined.data.AssistantFragmentManager_Factory;
import com.pocketmarket.mined.data.SharedPrefReference;
import com.pocketmarket.mined.data.SharedPrefReference_Factory;
import com.pocketmarket.mined.di.modules.AssistantFragmentModule;
import com.pocketmarket.mined.di.modules.AssistantFragmentModule_ProvideActivityFactory;
import com.pocketmarket.mined.di.modules.AssistantFragmentModule_ProvideContextFactory;
import com.pocketmarket.mined.di.modules.AssistantFragmentModule_ProvideFragmentFactory;
import com.pocketmarket.mined.di.modules.AssistantFragmentModule_ProvideSharedPrefReferenceFactory;
import com.pocketmarket.mined.di.modules.AssistantFragmentModule_ProvideSharedPreferencesFactory;
import com.pocketmarket.mined.fragments.AssistantFragment;
import com.pocketmarket.mined.fragments.AssistantFragment_MembersInjector;
import dagger.MembersInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerAssistantFragmentComponent implements AssistantFragmentComponent {
  private Provider<Context> provideContextProvider;

  private Provider<Activity> provideActivityProvider;

  private Provider<SharedPrefReference> provideSharedPrefReferenceProvider;

  private Provider<Fragment> provideFragmentProvider;

  private Provider<AssistantFragmentManager> assistantFragmentManagerProvider;

  private MembersInjector<AssistantFragment> assistantFragmentMembersInjector;

  private Provider<SharedPreferences> provideSharedPreferencesProvider;

  private Provider<SharedPrefReference> sharedPrefReferenceProvider;

  private DaggerAssistantFragmentComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.provideContextProvider =
        AssistantFragmentModule_ProvideContextFactory.create(builder.assistantFragmentModule);

    this.provideActivityProvider =
        AssistantFragmentModule_ProvideActivityFactory.create(builder.assistantFragmentModule);

    this.provideSharedPrefReferenceProvider =
        AssistantFragmentModule_ProvideSharedPrefReferenceFactory.create(
            builder.assistantFragmentModule);

    this.provideFragmentProvider =
        AssistantFragmentModule_ProvideFragmentFactory.create(builder.assistantFragmentModule);

    this.assistantFragmentManagerProvider =
        DoubleCheck.provider(
            AssistantFragmentManager_Factory.create(
                provideContextProvider,
                provideActivityProvider,
                provideSharedPrefReferenceProvider,
                provideFragmentProvider));

    this.assistantFragmentMembersInjector =
        AssistantFragment_MembersInjector.create(assistantFragmentManagerProvider);

    this.provideSharedPreferencesProvider =
        AssistantFragmentModule_ProvideSharedPreferencesFactory.create(
            builder.assistantFragmentModule);

    this.sharedPrefReferenceProvider =
        DoubleCheck.provider(SharedPrefReference_Factory.create(provideSharedPreferencesProvider));
  }

  @Override
  public void inject(AssistantFragment assistantFragment) {
    assistantFragmentMembersInjector.injectMembers(assistantFragment);
  }

  @Override
  public AssistantFragmentManager getAssistantFragmentManager() {
    return assistantFragmentManagerProvider.get();
  }

  @Override
  public SharedPrefReference getSharedPrefReference() {
    return sharedPrefReferenceProvider.get();
  }

  public static final class Builder {
    private AssistantFragmentModule assistantFragmentModule;

    private Builder() {}

    public AssistantFragmentComponent build() {
      if (assistantFragmentModule == null) {
        throw new IllegalStateException(
            AssistantFragmentModule.class.getCanonicalName() + " must be set");
      }
      return new DaggerAssistantFragmentComponent(this);
    }

    public Builder assistantFragmentModule(AssistantFragmentModule assistantFragmentModule) {
      this.assistantFragmentModule = Preconditions.checkNotNull(assistantFragmentModule);
      return this;
    }
  }
}
