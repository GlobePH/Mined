// Generated code from Butter Knife. Do not modify!
package com.pocketmarket.mined.fragments;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.pocketmarket.mined.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AssistantFragment_ViewBinding implements Unbinder {
  private AssistantFragment target;

  @UiThread
  public AssistantFragment_ViewBinding(AssistantFragment target, View source) {
    this.target = target;

    target.mChatLayout = Utils.findRequiredViewAsType(source, R.id.chat_layout, "field 'mChatLayout'", LinearLayout.class);
    target.mProgressBarChat = Utils.findRequiredViewAsType(source, R.id.progress_bar_chat, "field 'mProgressBarChat'", ProgressBar.class);
    target.mEnterMessage = Utils.findRequiredViewAsType(source, R.id.enter_message, "field 'mEnterMessage'", EditText.class);
    target.mCustomMessage = Utils.findRequiredViewAsType(source, R.id.custom_message, "field 'mCustomMessage'", ImageView.class);
    target.mCamera = Utils.findRequiredViewAsType(source, R.id.camera, "field 'mCamera'", ImageView.class);
    target.mImageUpload = Utils.findRequiredViewAsType(source, R.id.image_upload, "field 'mImageUpload'", ImageView.class);
    target.mImageMic = Utils.findRequiredViewAsType(source, R.id.image_mic, "field 'mImageMic'", ImageView.class);
    target.mListView = Utils.findRequiredViewAsType(source, android.R.id.list, "field 'mListView'", ListView.class);
    target.mSendMessage = Utils.findRequiredViewAsType(source, R.id.send_message, "field 'mSendMessage'", ImageView.class);
    target.mMore = Utils.findRequiredViewAsType(source, R.id.more, "field 'mMore'", ImageView.class);
    target.mMessageLayout = Utils.findRequiredViewAsType(source, R.id.message_layout, "field 'mMessageLayout'", LinearLayout.class);
    target.mImageGallery = Utils.findRequiredViewAsType(source, R.id.image_gallery, "field 'mImageGallery'", RecyclerView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    AssistantFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mChatLayout = null;
    target.mProgressBarChat = null;
    target.mEnterMessage = null;
    target.mCustomMessage = null;
    target.mCamera = null;
    target.mImageUpload = null;
    target.mImageMic = null;
    target.mListView = null;
    target.mSendMessage = null;
    target.mMore = null;
    target.mMessageLayout = null;
    target.mImageGallery = null;
  }
}
