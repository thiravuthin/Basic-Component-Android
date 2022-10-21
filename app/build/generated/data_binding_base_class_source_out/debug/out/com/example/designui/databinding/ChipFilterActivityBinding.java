// Generated by view binder compiler. Do not edit!
package com.example.designui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.designui.R;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ChipFilterActivityBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ChipGroup chipGroupFilterMultipleSelectID;

  @NonNull
  public final ChipGroup chipGroupFilterSingleSelectID;

  @NonNull
  public final Chip filter1ID;

  @NonNull
  public final Chip filter2ID;

  @NonNull
  public final Chip filter3ID;

  @NonNull
  public final Chip filter4ID;

  @NonNull
  public final Chip filter5ID;

  @NonNull
  public final Chip filter6ID;

  @NonNull
  public final Chip filter7ID;

  @NonNull
  public final Chip filter8ID;

  @NonNull
  public final TextView textView21;

  @NonNull
  public final TextView txtTitleSingleSelectID;

  private ChipFilterActivityBinding(@NonNull ConstraintLayout rootView,
      @NonNull ChipGroup chipGroupFilterMultipleSelectID,
      @NonNull ChipGroup chipGroupFilterSingleSelectID, @NonNull Chip filter1ID,
      @NonNull Chip filter2ID, @NonNull Chip filter3ID, @NonNull Chip filter4ID,
      @NonNull Chip filter5ID, @NonNull Chip filter6ID, @NonNull Chip filter7ID,
      @NonNull Chip filter8ID, @NonNull TextView textView21,
      @NonNull TextView txtTitleSingleSelectID) {
    this.rootView = rootView;
    this.chipGroupFilterMultipleSelectID = chipGroupFilterMultipleSelectID;
    this.chipGroupFilterSingleSelectID = chipGroupFilterSingleSelectID;
    this.filter1ID = filter1ID;
    this.filter2ID = filter2ID;
    this.filter3ID = filter3ID;
    this.filter4ID = filter4ID;
    this.filter5ID = filter5ID;
    this.filter6ID = filter6ID;
    this.filter7ID = filter7ID;
    this.filter8ID = filter8ID;
    this.textView21 = textView21;
    this.txtTitleSingleSelectID = txtTitleSingleSelectID;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ChipFilterActivityBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ChipFilterActivityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.chip_filter_activity, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ChipFilterActivityBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.chipGroupFilterMultipleSelectID;
      ChipGroup chipGroupFilterMultipleSelectID = ViewBindings.findChildViewById(rootView, id);
      if (chipGroupFilterMultipleSelectID == null) {
        break missingId;
      }

      id = R.id.chipGroupFilterSingleSelectID;
      ChipGroup chipGroupFilterSingleSelectID = ViewBindings.findChildViewById(rootView, id);
      if (chipGroupFilterSingleSelectID == null) {
        break missingId;
      }

      id = R.id.filter1ID;
      Chip filter1ID = ViewBindings.findChildViewById(rootView, id);
      if (filter1ID == null) {
        break missingId;
      }

      id = R.id.filter2ID;
      Chip filter2ID = ViewBindings.findChildViewById(rootView, id);
      if (filter2ID == null) {
        break missingId;
      }

      id = R.id.filter3ID;
      Chip filter3ID = ViewBindings.findChildViewById(rootView, id);
      if (filter3ID == null) {
        break missingId;
      }

      id = R.id.filter4ID;
      Chip filter4ID = ViewBindings.findChildViewById(rootView, id);
      if (filter4ID == null) {
        break missingId;
      }

      id = R.id.filter5ID;
      Chip filter5ID = ViewBindings.findChildViewById(rootView, id);
      if (filter5ID == null) {
        break missingId;
      }

      id = R.id.filter6ID;
      Chip filter6ID = ViewBindings.findChildViewById(rootView, id);
      if (filter6ID == null) {
        break missingId;
      }

      id = R.id.filter7ID;
      Chip filter7ID = ViewBindings.findChildViewById(rootView, id);
      if (filter7ID == null) {
        break missingId;
      }

      id = R.id.filter8ID;
      Chip filter8ID = ViewBindings.findChildViewById(rootView, id);
      if (filter8ID == null) {
        break missingId;
      }

      id = R.id.textView21;
      TextView textView21 = ViewBindings.findChildViewById(rootView, id);
      if (textView21 == null) {
        break missingId;
      }

      id = R.id.txtTitleSingleSelectID;
      TextView txtTitleSingleSelectID = ViewBindings.findChildViewById(rootView, id);
      if (txtTitleSingleSelectID == null) {
        break missingId;
      }

      return new ChipFilterActivityBinding((ConstraintLayout) rootView,
          chipGroupFilterMultipleSelectID, chipGroupFilterSingleSelectID, filter1ID, filter2ID,
          filter3ID, filter4ID, filter5ID, filter6ID, filter7ID, filter8ID, textView21,
          txtTitleSingleSelectID);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}