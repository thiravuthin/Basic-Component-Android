// Generated by view binder compiler. Do not edit!
package com.example.designui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.designui.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityAnimationBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnPlayAnimation;

  @NonNull
  public final TextView txtAnimation;

  private ActivityAnimationBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button btnPlayAnimation, @NonNull TextView txtAnimation) {
    this.rootView = rootView;
    this.btnPlayAnimation = btnPlayAnimation;
    this.txtAnimation = txtAnimation;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAnimationBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAnimationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_animation, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAnimationBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnPlayAnimation;
      Button btnPlayAnimation = ViewBindings.findChildViewById(rootView, id);
      if (btnPlayAnimation == null) {
        break missingId;
      }

      id = R.id.txtAnimation;
      TextView txtAnimation = ViewBindings.findChildViewById(rootView, id);
      if (txtAnimation == null) {
        break missingId;
      }

      return new ActivityAnimationBinding((ConstraintLayout) rootView, btnPlayAnimation,
          txtAnimation);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}