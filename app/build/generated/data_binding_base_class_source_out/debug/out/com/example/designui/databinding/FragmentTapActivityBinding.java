// Generated by view binder compiler. Do not edit!
package com.example.designui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.example.designui.R;
import com.google.android.material.tabs.TabLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentTapActivityBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TabLayout tabLayoutID;

  @NonNull
  public final ViewPager2 viewPapger2ID;

  private FragmentTapActivityBinding(@NonNull ConstraintLayout rootView,
      @NonNull TabLayout tabLayoutID, @NonNull ViewPager2 viewPapger2ID) {
    this.rootView = rootView;
    this.tabLayoutID = tabLayoutID;
    this.viewPapger2ID = viewPapger2ID;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentTapActivityBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentTapActivityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_tap_activity, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentTapActivityBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.tabLayoutID;
      TabLayout tabLayoutID = ViewBindings.findChildViewById(rootView, id);
      if (tabLayoutID == null) {
        break missingId;
      }

      id = R.id.viewPapger2ID;
      ViewPager2 viewPapger2ID = ViewBindings.findChildViewById(rootView, id);
      if (viewPapger2ID == null) {
        break missingId;
      }

      return new FragmentTapActivityBinding((ConstraintLayout) rootView, tabLayoutID,
          viewPapger2ID);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}