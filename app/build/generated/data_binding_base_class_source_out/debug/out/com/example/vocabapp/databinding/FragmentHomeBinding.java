// Generated by view binder compiler. Do not edit!
package com.example.vocabapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.example.vocabapp.R;
import com.hanks.htextview.fade.FadeTextView;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentHomeBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final FadeTextView fadeTextView;

  @NonNull
  public final Button learnButton;

  @NonNull
  public final Button recordButton;

  @NonNull
  public final Button searchButton;

  @NonNull
  public final CircleImageView userImageButton;

  private FragmentHomeBinding(@NonNull FrameLayout rootView, @NonNull FadeTextView fadeTextView,
      @NonNull Button learnButton, @NonNull Button recordButton, @NonNull Button searchButton,
      @NonNull CircleImageView userImageButton) {
    this.rootView = rootView;
    this.fadeTextView = fadeTextView;
    this.learnButton = learnButton;
    this.recordButton = recordButton;
    this.searchButton = searchButton;
    this.userImageButton = userImageButton;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_home, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentHomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.fade_text_view;
      FadeTextView fadeTextView = rootView.findViewById(id);
      if (fadeTextView == null) {
        break missingId;
      }

      id = R.id.learn_button;
      Button learnButton = rootView.findViewById(id);
      if (learnButton == null) {
        break missingId;
      }

      id = R.id.record_button;
      Button recordButton = rootView.findViewById(id);
      if (recordButton == null) {
        break missingId;
      }

      id = R.id.search_button;
      Button searchButton = rootView.findViewById(id);
      if (searchButton == null) {
        break missingId;
      }

      id = R.id.user_image_button;
      CircleImageView userImageButton = rootView.findViewById(id);
      if (userImageButton == null) {
        break missingId;
      }

      return new FragmentHomeBinding((FrameLayout) rootView, fadeTextView, learnButton,
          recordButton, searchButton, userImageButton);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
