package com.mycompany.csc325_oop_designreview_lab;

public class Freshman extends Student {

  // constructor freshman
  public Freshman(String name, short age, int credits) {
    super(name, age, credits);
  }

  // override
  @Override
  public String toString() {
    return "Freshman\nName: " + getName() + " | Age: " + getAge() + " | Credits: " + getCredits() + " | GPA: "
        + getGpa() + "}";
  }
}
