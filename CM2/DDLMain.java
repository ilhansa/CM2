package CM2;

import java.util.Scanner;

public class DDLMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue riwayatTx = new Queue(2);
        DoubleLinkListPasien antrian = new DoubleLinkListPasien();

        int pilih;
        do {
            System.out.println("Sistem antrian klinik");
            System.out.println("1. Tambah pasien ke antrian");
            System.out.println("2. Lihat antrian");
            System.out.println("3. Layani pasien");
            System.out.println("4. Cek sisa antrian pasien");
            System.out.println("5. Lihat riwayat transaksi");
            System.out.println("0. keluar");
            System.out.println("Pilih menu: ");
            pilih = scanner.nextInt();
            scanner.nextLine();

            switch (pilih) {
                case 1 -> {
                    System.out.print("Nama: ");
                    String nama = scanner.nextLine();
                    System.out.print("Nik: ");
                    String nik = scanner.nextLine();
                    System.out.print("Keluhan: ");
                    String keluhan = scanner.nextLine();
                    Pasien pasien = new Pasien(nama, nik, keluhan);
                    antrian.tambahPasien(pasien);
                    System.out.println("Pasien berhasil ditambahkan");
                }
                case 2 -> antrian.lihatAntrian();
                case 3 -> {
                    if (antrian.IsEmpty()) {
                        System.out.println("Antrian masih kosong");
                        break;
                    }
                    Pasien pasien = antrian.layaniPasien(); // mengambil pasien di antrian terdepan
                    System.out.println("Pasien " + pasien.nama + " dipanggil");
                    System.out.print("Masukkan id dokter: ");
                    String id = scanner.nextLine();
                    System.out.print("Masukkan nama dokter: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan durasi (jam): ");
                    int durasi = scanner.nextInt();
                    Dokter dokter = new Dokter(id, nama);
                    TransaksiLayanan tx = new TransaksiLayanan(pasien, dokter, durasi);
                    riwayatTx.enqueue(tx);
                }
                case 4 -> {
                    System.out.println("Sisa pasien dalam antrian: " + antrian.getSize());
                }
                case 5 -> {
                    riwayatTx.printSemua();
                }
            }
        } while(pilih != 0);
        scanner.close();
    }
}
