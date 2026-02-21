package project;

public class LecturerMain05 {
  public static void main(String[] args) {
    Lecturer05 d1 = new Lecturer05();
    d1.lecturerID = "DSN01";
    d1.name = "Dr. Aris";
    d1.isActive = true;
    d1.joinYear = 2015;
    d1.specialty = "Machine Learning";

    Lecturer05 d2 = new Lecturer05("DSN02", "Prof. Siti", true, 2010, "Software Engineering");

    System.out.println("--- Lecturer 1 ---");
    d1.displayInformation();
    d1.setActiveStatus(false);
    System.out.println("Masa Kerja: " + d1.calculateTimeWork(2025) + " tahun");
    d1.changeSkill("Deep Learning");
    d1.displayInformation();

    System.out.println("\n--- Lecturer 2 ---");
    d2.displayInformation();
  }
}