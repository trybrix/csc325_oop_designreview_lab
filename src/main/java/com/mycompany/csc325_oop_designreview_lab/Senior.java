package com.mycompany.csc325_oop_designreview_lab;

public class Senior extends Student {

  // constructor for senior
  public Senior(String name, short age, int credits) {
    super(name, age, credits);
    if (credits < 85) {
      throw new IllegalArgumentException("Senior students must have at least 85 credits.");
    }
  }

  // override toString
  @Override
  public String toString() {
    return "Senior\nName: " + getName() + " | Age: " + getAge() + " | Credits: " + getCredits() + " | GPA: " + getGpa()
        + "}";
  }
}
