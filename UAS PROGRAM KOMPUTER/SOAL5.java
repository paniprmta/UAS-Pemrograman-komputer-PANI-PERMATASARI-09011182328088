import java.util.Scanner;

public class SOAL5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Kalkulator Sederhana =====");
        System.out.print("Masukkan angka pertama: ");
        double angka1 = scanner.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double angka2 = scanner.nextDouble();

        System.out.println("Pilih operasi:");
        System.out.println("1. Penjumlahan (+)");
        System.out.println("2. Pengurangan (-)");
        System.out.println("3. Perkalian (*)");
        System.out.println("4. Pembagian (/)");

        System.out.print("Masukkan nomor operasi: ");
        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                tambah(angka1, angka2);
                break;
            case 2:
                kurang(angka1, angka2);
                break;
            case 3:
                kali(angka1, angka2);
                break;
            case 4:
                bagi(angka1, angka2);
                break;
            default:
                System.out.println("Pilihan operasi tidak valid");
        }

        scanner.close();
    }

    // Metode untuk penjumlahan
    public static void tambah(double a, double b) {
        double hasil = a + b;
        System.out.println("Hasil penjumlahan: " + hasil);
    }

    // Metode untuk pengurangan
    public static void kurang(double a, double b) {
        double hasil = a - b;
        System.out.println("Hasil pengurangan: " + hasil);
    }

    // Metode untuk perkalian
    public static void kali(double a, double b) {
        double hasil = a * b;
        System.out.println("Hasil perkalian: " + hasil);
    }

    // Metode untuk pembagian
    public static void bagi(double a, double b) {
        if (b != 0) {
            double hasil = a / b;
            System.out.println("Hasil pembagian: " + hasil);
        } else {
            System.out.println("Tidak dapat melakukan pembagian dengan nol.");
        }
    }
}
