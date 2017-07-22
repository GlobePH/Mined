// Generated code from Butter Knife. Do not modify!
package com.pocketmarket.mined.fragments;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ProgressBar;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.facebook.login.widget.LoginButton;
import com.pocketmarket.mined.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SigninFragment_ViewBinding implements Unbinder {
  private SigninFragment target;

  @UiThread
  public SigninFragment_ViewBinding(SigninFragment target, View source) {
    this.target = target;

    target.mFacebookButton = Utils.findRequiredViewAsType(source, R.id.authButton, "field 'mFacebookButton'", LoginButton.class);
    target.mProgressBar = Utils.findRequiredViewAsType(source, R.id.progress_bar, "field 'mProgressBar'", ProgressBar.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    SigninFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mFacebookButton = null;
    target.mProgressBar = null;
  }
}
