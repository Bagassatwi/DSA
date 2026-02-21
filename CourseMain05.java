package project;

public class CourseMain05 {
  public static void main(String[] args) {
    Course05 mk1 = new Course05();
    mk1.courseCode = "ALSD_01";
    mk1.name = "Algoritma dan Struktur Data";
    mk1.credits = 2;
    mk1.totalHours = 4;

    Course05 mk2 = new Course05("OOP_02", "Object Oriented Programming", 3, 6);

    mk1.displayInformation();
    mk1.modifyCredits(3);
    mk1.addHours(2);
    mk1.reduceHours(1);
    mk1.displayInformation();

    mk2.displayInformation();
    mk2.reduceHours(10);
  }
}