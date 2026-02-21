package project;

public class Lecturer05 {
  String lecturerID;
  String name;
  boolean isActive;
  int joinYear;
  String specialty;

  public Lecturer05() {
  }

  public Lecturer05(String lecturerID, String name, boolean isActive, int joinYear, String specialty) {
    this.lecturerID = lecturerID;
    this.name = name;
    this.isActive = isActive;
    this.joinYear = joinYear;
    this.specialty = specialty;
  }

  void displayInformation() {
    System.out.println("Lecturer ID    : " + lecturerID);
    System.out.println("Name           : " + name);
    System.out.println("Is Active      : " + (isActive ? "Active" : "InActive"));
    System.out.println("Join Year      : " + joinYear);
    System.out.println("Specialty      : " + specialty);
  }

  void setActiveStatus(boolean status) {
    this.isActive = status;
  }

  int calculateTimeWork(int currentYear) {
    return currentYear - joinYear;
  }

  void changeSkill(String specialty) {
    this.specialty = specialty;
  }
}