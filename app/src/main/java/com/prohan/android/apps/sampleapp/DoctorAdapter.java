package com.prohan.android.apps.sampleapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Adapter for recycler view.
 */
public class DoctorAdapter extends RecyclerView.Adapter<DoctorViewHolder> {
  private final List<Doctor> doctors;
  private final LayoutInflater layoutInflater;

  public DoctorAdapter(Context context, List<Doctor> doctors) {
    this.doctors = doctors;
    this.layoutInflater = LayoutInflater.from(context);
  }

  @Override
  public int getItemCount() {
    return doctors.size();
  }

  @Override
  public DoctorViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    View itemView = layoutInflater.inflate(R.layout.doctor_list_item, parent, false);
    return new DoctorViewHolder(itemView);
  }

  @Override
  public void onBindViewHolder(DoctorViewHolder holder, int position) {
    Doctor doctor = doctors.get(position);
    holder.setDoctorName(doctor.getName());
    holder.setDoctorIcon(doctor.getIconId());
  }
}
