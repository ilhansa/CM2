package CM2;
public class TransaksiLayanan {
    Pasien pasien;
    Dokter dokter;
    int durasi;
    int biaya;

    public TransaksiLayanan(Pasien pasien, Dokter dokter, int durasi) {
        this.pasien = pasien;
        this.dokter = dokter;
        this.durasi = durasi;
        int harga = 50000; // harga perjam 
        biaya = durasi * harga;
    }

    void tampil() {
        System.out.println("Nama pasien: " + pasien.nama);
        System.out.println("Nama dokter: " + dokter.nama);
        System.out.println("Durasi: " + durasi);
        System.out.println("Biaya: " + biaya);
    }

    public Pasien getPasien() {
        return pasien;
    }

    public Dokter getDokter() {
        return dokter;
    }

    public int getDurasiLayanan() {
        return durasi;
    }

    public double getBiaya() {
        return biaya;
    }
}
