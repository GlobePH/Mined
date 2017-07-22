// Generated code from Butter Knife. Do not modify!
package com.pocketmarket.mined;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SingleMainFragmentActivity_ViewBinding implements Unbinder {
  private SingleMainFragmentActivity target;

  @UiThread
  public SingleMainFragmentActivity_ViewBinding(SingleMainFragmentActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public SingleMainFragmentActivity_ViewBinding(SingleMainFragmentActivity target, View source) {
    this.target = target;

    target.mDrawerLayout = Utils.findRequiredViewAsType(source, R.id.drawerLayout, "field 'mDrawerLayout'", DrawerLayout.class);
    target.mNavigationView = Utils.findRequiredViewAsType(source, R.id.navigation, "field 'mNavigationView'", NavigationView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    SingleMainFragmentActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mDrawerLayout = null;
    target.mNavigationView = null;
  }
}
