import java.util.Scanner;

public class SOAL1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Masukan jumlah barang yang dibeli
        System.out.print("Masukkan jumlah barang yang dibeli: ");
        int jumlahBarang = scanner.nextInt();

        // Masukan harga per barang
        System.out.print("Masukkan harga per barang: Rp.");
        double hargaPerBarang = scanner.nextDouble();

        // Hitung total harga sebelum diskon
        double totalHarga = jumlahBarang * hargaPerBarang;

        // Hitung diskon berdasarkan jumlah barang yang dibeli
        double diskon = 0.0;
        if (jumlahBarang >= 5 && jumlahBarang <= 10) {
            diskon = 0.05; // Diskon 5%
        } else if (jumlahBarang >= 11 && jumlahBarang <= 20) {
            diskon = 0.10; // Diskon 10%
        } else if (jumlahBarang > 20) {
            diskon = 0.20; // Diskon 20%
        }

        // Hitung total harga setelah diskon
        double totalHargaSetelahDiskon = totalHarga - (totalHarga * diskon);

        // Tampilkan hasil
        System.out.println("Total harga sebelum diskon: " + totalHarga);
        System.out.println("Diskon: " + (diskon * 100) + "%");
        System.out.println("Total harga setelah diskon: " + totalHargaSetelahDiskon);

        scanner.close();
    }
}
