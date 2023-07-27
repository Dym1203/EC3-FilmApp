// Generated by view binder compiler. Do not edit!
package com.ec3.dylan.myapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.ec3.dylan.myapplication.R;
import com.google.android.material.imageview.ShapeableImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentMovieFavoriteBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ShapeableImageView imgmoviefavorite;

  @NonNull
  public final TextView txtmoviefavorite;

  @NonNull
  public final TextView txtmoviefavoriterelease;

  @NonNull
  public final TextView txtmovieid;

  @NonNull
  public final TextView txtmoviepopularity;

  @NonNull
  public final TextView txtmovievote;

  private FragmentMovieFavoriteBinding(@NonNull ConstraintLayout rootView,
      @NonNull ShapeableImageView imgmoviefavorite, @NonNull TextView txtmoviefavorite,
      @NonNull TextView txtmoviefavoriterelease, @NonNull TextView txtmovieid,
      @NonNull TextView txtmoviepopularity, @NonNull TextView txtmovievote) {
    this.rootView = rootView;
    this.imgmoviefavorite = imgmoviefavorite;
    this.txtmoviefavorite = txtmoviefavorite;
    this.txtmoviefavoriterelease = txtmoviefavoriterelease;
    this.txtmovieid = txtmovieid;
    this.txtmoviepopularity = txtmoviepopularity;
    this.txtmovievote = txtmovievote;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentMovieFavoriteBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentMovieFavoriteBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_movie_favorite, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentMovieFavoriteBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imgmoviefavorite;
      ShapeableImageView imgmoviefavorite = ViewBindings.findChildViewById(rootView, id);
      if (imgmoviefavorite == null) {
        break missingId;
      }

      id = R.id.txtmoviefavorite;
      TextView txtmoviefavorite = ViewBindings.findChildViewById(rootView, id);
      if (txtmoviefavorite == null) {
        break missingId;
      }

      id = R.id.txtmoviefavoriterelease;
      TextView txtmoviefavoriterelease = ViewBindings.findChildViewById(rootView, id);
      if (txtmoviefavoriterelease == null) {
        break missingId;
      }

      id = R.id.txtmovieid;
      TextView txtmovieid = ViewBindings.findChildViewById(rootView, id);
      if (txtmovieid == null) {
        break missingId;
      }

      id = R.id.txtmoviepopularity;
      TextView txtmoviepopularity = ViewBindings.findChildViewById(rootView, id);
      if (txtmoviepopularity == null) {
        break missingId;
      }

      id = R.id.txtmovievote;
      TextView txtmovievote = ViewBindings.findChildViewById(rootView, id);
      if (txtmovievote == null) {
        break missingId;
      }

      return new FragmentMovieFavoriteBinding((ConstraintLayout) rootView, imgmoviefavorite,
          txtmoviefavorite, txtmoviefavoriterelease, txtmovieid, txtmoviepopularity, txtmovievote);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
