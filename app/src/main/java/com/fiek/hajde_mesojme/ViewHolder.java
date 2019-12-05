package com.fiek.hajde_mesojme;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.fiek.hajde_mesojme.R;
import com.squareup.picasso.Picasso;

public class ViewHolder extends RecyclerView.ViewHolder
{


    public TextView lenda_name;
    public ImageView lenda_image;
    //View mView;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        lenda_image = itemView.findViewById(R.id.rImageView);
        lenda_name = itemView.findViewById(R.id.rDescriptionTv);


    }
}
