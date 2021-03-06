// Generated by view binder compiler. Do not edit!
package com.example.harmony.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.harmony.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentServicesBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button editPackageAndPrice1;

  @NonNull
  public final Button editPackageNr2;

  @NonNull
  public final Button editPackageNr3;

  @NonNull
  public final Button editPackageNr4;

  @NonNull
  public final ImageView imageView3;

  @NonNull
  public final ImageView imageView4;

  @NonNull
  public final ImageView imageView5;

  @NonNull
  public final ImageView imageView6;

  @NonNull
  public final LinearLayout linearLayout4;

  @NonNull
  public final TextView textViewTitle;

  private FragmentServicesBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button editPackageAndPrice1, @NonNull Button editPackageNr2,
      @NonNull Button editPackageNr3, @NonNull Button editPackageNr4, @NonNull ImageView imageView3,
      @NonNull ImageView imageView4, @NonNull ImageView imageView5, @NonNull ImageView imageView6,
      @NonNull LinearLayout linearLayout4, @NonNull TextView textViewTitle) {
    this.rootView = rootView;
    this.editPackageAndPrice1 = editPackageAndPrice1;
    this.editPackageNr2 = editPackageNr2;
    this.editPackageNr3 = editPackageNr3;
    this.editPackageNr4 = editPackageNr4;
    this.imageView3 = imageView3;
    this.imageView4 = imageView4;
    this.imageView5 = imageView5;
    this.imageView6 = imageView6;
    this.linearLayout4 = linearLayout4;
    this.textViewTitle = textViewTitle;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentServicesBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentServicesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_services, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentServicesBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.editPackageAndPrice1;
      Button editPackageAndPrice1 = ViewBindings.findChildViewById(rootView, id);
      if (editPackageAndPrice1 == null) {
        break missingId;
      }

      id = R.id.editPackageNr2;
      Button editPackageNr2 = ViewBindings.findChildViewById(rootView, id);
      if (editPackageNr2 == null) {
        break missingId;
      }

      id = R.id.editPackageNr3;
      Button editPackageNr3 = ViewBindings.findChildViewById(rootView, id);
      if (editPackageNr3 == null) {
        break missingId;
      }

      id = R.id.editPackageNr4;
      Button editPackageNr4 = ViewBindings.findChildViewById(rootView, id);
      if (editPackageNr4 == null) {
        break missingId;
      }

      id = R.id.imageView3;
      ImageView imageView3 = ViewBindings.findChildViewById(rootView, id);
      if (imageView3 == null) {
        break missingId;
      }

      id = R.id.imageView4;
      ImageView imageView4 = ViewBindings.findChildViewById(rootView, id);
      if (imageView4 == null) {
        break missingId;
      }

      id = R.id.imageView5;
      ImageView imageView5 = ViewBindings.findChildViewById(rootView, id);
      if (imageView5 == null) {
        break missingId;
      }

      id = R.id.imageView6;
      ImageView imageView6 = ViewBindings.findChildViewById(rootView, id);
      if (imageView6 == null) {
        break missingId;
      }

      id = R.id.linearLayout4;
      LinearLayout linearLayout4 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout4 == null) {
        break missingId;
      }

      id = R.id.textViewTitle;
      TextView textViewTitle = ViewBindings.findChildViewById(rootView, id);
      if (textViewTitle == null) {
        break missingId;
      }

      return new FragmentServicesBinding((ConstraintLayout) rootView, editPackageAndPrice1,
          editPackageNr2, editPackageNr3, editPackageNr4, imageView3, imageView4, imageView5,
          imageView6, linearLayout4, textViewTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
