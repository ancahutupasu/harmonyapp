// Generated by view binder compiler. Do not edit!
package com.example.harmony.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
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

public final class FragmentMyCartBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button buttonAddMyCart;

  @NonNull
  public final Button buttonCheckout;

  @NonNull
  public final Button buttonDeleteMyItemCard;

  @NonNull
  public final ImageView imageView8;

  @NonNull
  public final LinearLayout linearLayout14;

  @NonNull
  public final LinearLayout linearLayout16;

  @NonNull
  public final LinearLayout linearLayout17;

  @NonNull
  public final LinearLayout linearLayout18;

  @NonNull
  public final ConstraintLayout myCart;

  @NonNull
  public final RadioButton radioButtonGiftCard;

  @NonNull
  public final TextView textView14;

  @NonNull
  public final TextView textViewPrice;

  @NonNull
  public final TextView titleCard;

  private FragmentMyCartBinding(@NonNull ConstraintLayout rootView, @NonNull Button buttonAddMyCart,
      @NonNull Button buttonCheckout, @NonNull Button buttonDeleteMyItemCard,
      @NonNull ImageView imageView8, @NonNull LinearLayout linearLayout14,
      @NonNull LinearLayout linearLayout16, @NonNull LinearLayout linearLayout17,
      @NonNull LinearLayout linearLayout18, @NonNull ConstraintLayout myCart,
      @NonNull RadioButton radioButtonGiftCard, @NonNull TextView textView14,
      @NonNull TextView textViewPrice, @NonNull TextView titleCard) {
    this.rootView = rootView;
    this.buttonAddMyCart = buttonAddMyCart;
    this.buttonCheckout = buttonCheckout;
    this.buttonDeleteMyItemCard = buttonDeleteMyItemCard;
    this.imageView8 = imageView8;
    this.linearLayout14 = linearLayout14;
    this.linearLayout16 = linearLayout16;
    this.linearLayout17 = linearLayout17;
    this.linearLayout18 = linearLayout18;
    this.myCart = myCart;
    this.radioButtonGiftCard = radioButtonGiftCard;
    this.textView14 = textView14;
    this.textViewPrice = textViewPrice;
    this.titleCard = titleCard;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentMyCartBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentMyCartBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_my_cart, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentMyCartBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonAddMyCart;
      Button buttonAddMyCart = ViewBindings.findChildViewById(rootView, id);
      if (buttonAddMyCart == null) {
        break missingId;
      }

      id = R.id.buttonCheckout;
      Button buttonCheckout = ViewBindings.findChildViewById(rootView, id);
      if (buttonCheckout == null) {
        break missingId;
      }

      id = R.id.buttonDeleteMyItemCard;
      Button buttonDeleteMyItemCard = ViewBindings.findChildViewById(rootView, id);
      if (buttonDeleteMyItemCard == null) {
        break missingId;
      }

      id = R.id.imageView8;
      ImageView imageView8 = ViewBindings.findChildViewById(rootView, id);
      if (imageView8 == null) {
        break missingId;
      }

      id = R.id.linearLayout14;
      LinearLayout linearLayout14 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout14 == null) {
        break missingId;
      }

      id = R.id.linearLayout16;
      LinearLayout linearLayout16 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout16 == null) {
        break missingId;
      }

      id = R.id.linearLayout17;
      LinearLayout linearLayout17 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout17 == null) {
        break missingId;
      }

      id = R.id.linearLayout18;
      LinearLayout linearLayout18 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout18 == null) {
        break missingId;
      }

      ConstraintLayout myCart = (ConstraintLayout) rootView;

      id = R.id.radioButtonGiftCard;
      RadioButton radioButtonGiftCard = ViewBindings.findChildViewById(rootView, id);
      if (radioButtonGiftCard == null) {
        break missingId;
      }

      id = R.id.textView14;
      TextView textView14 = ViewBindings.findChildViewById(rootView, id);
      if (textView14 == null) {
        break missingId;
      }

      id = R.id.textViewPrice;
      TextView textViewPrice = ViewBindings.findChildViewById(rootView, id);
      if (textViewPrice == null) {
        break missingId;
      }

      id = R.id.titleCard;
      TextView titleCard = ViewBindings.findChildViewById(rootView, id);
      if (titleCard == null) {
        break missingId;
      }

      return new FragmentMyCartBinding((ConstraintLayout) rootView, buttonAddMyCart, buttonCheckout,
          buttonDeleteMyItemCard, imageView8, linearLayout14, linearLayout16, linearLayout17,
          linearLayout18, myCart, radioButtonGiftCard, textView14, textViewPrice, titleCard);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
