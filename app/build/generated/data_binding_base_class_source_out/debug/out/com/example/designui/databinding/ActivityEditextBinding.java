// Generated by view binder compiler. Do not edit!
package com.example.designui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
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

public final class ActivityEditextBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btn1;

  @NonNull
  public final EditText et1;

  @NonNull
  public final TextView txttext;

  private ActivityEditextBinding(@NonNull ConstraintLayout rootView, @NonNull Button btn1,
      @NonNull EditText et1, @NonNull TextView txttext) {
    this.rootView = rootView;
    this.btn1 = btn1;
    this.et1 = et1;
    this.txttext = txttext;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityEditextBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityEditextBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_editext, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityEditextBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn1;
      Button btn1 = ViewBindings.findChildViewById(rootView, id);
      if (btn1 == null) {
        break missingId;
      }

      id = R.id.et1;
      EditText et1 = ViewBindings.findChildViewById(rootView, id);
      if (et1 == null) {
        break missingId;
      }

      id = R.id.txttext;
      TextView txttext = ViewBindings.findChildViewById(rootView, id);
      if (txttext == null) {
        break missingId;
      }

      return new ActivityEditextBinding((ConstraintLayout) rootView, btn1, et1, txttext);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}