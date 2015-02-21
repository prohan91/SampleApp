package com.prohan.android.apps.sampleapp;

import java.util.ArrayList;
import java.util.List;

/**
 * Client to access data.
 */
public class DataClient {
  private static DataClient dataClient;
  private List<Doctor> doctors;

  private DataClient() {
    doctors = new ArrayList<>();
    for (int i = 0; i < 20; i++) {
      Doctor doctor = new Doctor();
      doctor.setName(String.format("Doctor %d", i));
      doctor.setIconId(R.drawable.ic_launcher);
      doctors.add(doctor);
    }
  }

  public List<Doctor> getDoctors() {
    return doctors;
  }

  public static synchronized DataClient getInstance() {
    if (dataClient == null) {
      dataClient = new DataClient();
    }
    return dataClient;
  }
}
