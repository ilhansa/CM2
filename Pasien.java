public class Pasien {
    String nama;
    String nik;
    String keluhan;

    Pasien(String nama, String nik, String keluhan) {
        this.nama = nama;
        this.nik = nik;
        this.keluhan = keluhan;
    }

    void TampilInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("Nik: " + nik);
        System.out.println("Keluhan: " + keluhan);
    }
}
