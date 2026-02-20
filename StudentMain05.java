package project;

public class StudentMain05 {
  public static void main(String[] args) {
    Mahasiswa05 mhs1 = new Mahasiswa05();
    mhs1.nama = "Bagas Satrio Wicaksono";
    mhs1.nim = "254107020186";
    mhs1.kelas = "TI 1I";
    mhs1.ipk = 3.75;

    mhs1.tampilkanInformasi();
    mhs1.ubahKelas("TKI 1A");
    mhs1.updateIpk(4);
    mhs1.tampilkanInformasi();

    Mahasiswa05 mhs2 = new Mahasiswa05("Nabila Salsabila Putri", "252105020125", "TKI 1A", 3.78);
    mhs2.updateIpk(3.95);
    mhs2.tampilkanInformasi();
  }
}
