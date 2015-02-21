package com.prohan.android.apps.sampleapp;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * View holder for doctor item in recycler view.
 */
public class DoctorViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
  private final ImageView doctorIconView;
  private final TextView doctorNameView;

  public DoctorViewHolder(final View itemView) {
    super(itemView);
    this.doctorIconView = (ImageView) itemView.findViewById(R.id.doctor_list_item_icon);
    this.doctorNameView = (TextView) itemView.findViewById(R.id.doctor_list_item_name);
    itemView.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Toast.makeText(itemView.getContext(), String.format("Item clicked %d", getPosition()),
            Toast.LENGTH_SHORT).show();
      }
    });
  }

  public void setDoctorName(String name) {
    this.doctorNameView.setText(name);
  }

  public void setDoctorIcon(int resourceId) {
    this.doctorIconView.setImageResource(resourceId);
  }
}
