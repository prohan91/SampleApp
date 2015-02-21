package com.prohan.android.apps.sampleapp;

/**
 * Model for doctor.
 */
public class Doctor {
  private String name;
  private int iconId;

  public Doctor() {
    this.name = null;
    this.iconId = -1;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getIconId() {
    return iconId;
  }

  public void setIconId(int iconId) {
    this.iconId = iconId;
  }
}
