package project;

public class Course05 {
  String courseCode;
  String name;
  int credits;
  int totalHours;

  public Course05() {
  }

  public Course05(String courseCode, String name, int credits, int totalHours) {
    this.courseCode = courseCode;
    this.name = name;
    this.credits = credits;
    this.totalHours = totalHours;
  }

  void displayInformation() {
    System.out.println("Course Code: " + courseCode);
    System.out.println("Course Name: " + name);
    System.out.println("Credits    : " + credits);
    System.out.println("Total Hours: " + totalHours);
    System.out.println("---------------------------");
  }

  void modifyCredits(int newCredits) {
    this.credits = newCredits;
    System.out.println("Credits has changed to: " + credits);
  }

  void addHours(int hour) {
    this.totalHours += hour;
  }

  void reduceHours(int hours) {
    if (this.totalHours >= hours) {
      this.totalHours -= hours;
      System.out.println("Hours reduced. Total Hours Now: " + totalHours);
    } else {
      System.out.println("Hours can't be reduced: Insufficient total hours.");
    }
  }
}