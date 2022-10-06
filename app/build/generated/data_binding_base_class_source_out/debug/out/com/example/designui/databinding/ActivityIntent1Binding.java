// Generated by view binder compiler. Do not edit!
package com.example.designui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.designui.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityIntent1Binding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnDialID;

  @NonNull
  public final Button btnOpenID;

  private ActivityIntent1Binding(@NonNull ConstraintLayout rootView, @NonNull Button btnDialID,
      @NonNull Button btnOpenID) {
    this.rootView = rootView;
    this.btnDialID = btnDialID;
    this.btnOpenID = btnOpenID;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityIntent1Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityIntent1Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_intent1, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityIntent1Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnDialID;
      Button btnDialID = ViewBindings.findChildViewById(rootView, id);
      if (btnDialID == null) {
        break missingId;
      }

      id = R.id.btnOpenID;
      Button btnOpenID = ViewBindings.findChildViewById(rootView, id);
      if (btnOpenID == null) {
        break missingId;
      }

      return new ActivityIntent1Binding((ConstraintLayout) rootView, btnDialID, btnOpenID);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}