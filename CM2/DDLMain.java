package CM2;

import java.util.Scanner;

public class DDLMain {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== MASUKKAN DATA PASIEN ===");
        System.out.print("Nama Pasien: ");
        String nama = scanner.nextLine();

        System.out.print("NIK Pasien: ");
        String nik = scanner.nextLine();
        System.out.println("keluhan Pasien : ");
        String keluhan = scanner.nextLine();
        

        // // Membuat objek Pasien menggunakan input
        // Pasien pasienBaru = new Pasien(nama, nik, keluhan);
        
        // // Contoh penggunaan objek pasien yang baru dibuat
        // System.out.println("\nInformasi Pasien Baru:");
        // System.out.println(pasienBaru.tampilkanInformasi());

        // scanner.close(); INI MASIH BINGUNG, NIATNYA DATA DI INPUT DARI USER GA DI TULIS MANUAL DI PARAMETER
    }
}
