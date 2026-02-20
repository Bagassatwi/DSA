package project;

public class Mahasiswa05 {
  String nama;
  String nim;
  String kelas;
  double ipk;

  public Mahasiswa05(String nama, String nim, String kelas, double ipk) {
    this.nama = nama;
    this.nim = nim;
    this.kelas = kelas;
    this.ipk = ipk;
  }

  public Mahasiswa05() {
  }

  void ubahKelas(String kelas) {
    this.kelas = kelas;
  }

  void updateIpk(double ipk) {
    this.ipk = ipk;
  }

  void tampilkanInformasi() {
    System.out.println("Nama: " + nama);
    System.out.println("NIM: " + nim);
    System.out.println("IPK: " + ipk);
    System.out.println("Kelas: " + kelas);
  }

  String nilaiKinerja() {
    if (ipk >= 3.5)
      return "Kinerja Sangat Baik";
    else if (ipk >= 3)
      return "Kinerja Baik";
    else if (ipk >= 2)
      return "Kinerja Cukup";
    else
      return "Kinerja Kurang";

  }
}
