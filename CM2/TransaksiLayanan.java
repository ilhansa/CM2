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
        System.out.println(pasien.nama + " (" + durasi + " jam): Rp " + biaya);
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
