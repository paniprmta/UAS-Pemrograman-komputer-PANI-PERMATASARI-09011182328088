import java.util.Scanner;

public class SOAL7 {
    public static void main(String[] args) {
        // Membuat objek buku
        Buku buku1 = new Buku("Harry Potter", "J.K. Rowling", 2001);
        Buku buku2 = new Buku("Sherlock Holmes", "Arthur Conan Doyle", 1892);
        Buku buku3 = new Buku("London Love Story", "Tisa TS", 2015);

        System.out.println("====== PERPUSTAKAAN ======");

        // Menampilkan informasi buku
        System.out.println("Informasi Buku 1:");
        buku1.tampilkanInfoBuku();

        System.out.println("\nInformasi Buku 2:");
        buku2.tampilkanInfoBuku();

        System.out.println("\nInformasi BUKU 3:");
        buku3.tampilkanInfoBuku();

        // Meminjam buku
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nApakah Anda ingin meminjam buku 1 ? (ya/tidak): ");
        String jawaban = scanner.nextLine();

        if (jawaban.equalsIgnoreCase("ya")) {
            buku1.pinjamBuku();
        }

        // Menampilkan informasi buku setelah peminjaman
        System.out.println("\nInformasi Buku 1 setelah peminjaman:");
        buku1.tampilkanInfoBuku();

         // Meminjam buku lain
         System.out.print("\nApakah Anda ingin meminjam buku 2? (ya/tidak): ");
         jawaban = scanner.nextLine();
 
         if (jawaban.equalsIgnoreCase("ya")) {
             buku2.pinjamBuku();
         }
 
         // Menampilkan informasi buku 2 setelah peminjaman
         System.out.println("\nInformasi Buku 2 setelah peminjaman:");
         buku2.tampilkanInfoBuku();

          // Meminjam buku lain
        System.out.print("\nApakah Anda ingin meminjam buku 3? (ya/tidak): ");
        jawaban = scanner.nextLine();

        if (jawaban.equalsIgnoreCase("ya")) {
            buku2.pinjamBuku();
        }

        // Menampilkan informasi buku 2 setelah peminjaman
        System.out.println("\nInformasi Buku 3 setelah peminjaman:");
        buku2.tampilkanInfoBuku();

        scanner.close();
    }
}

class Buku {
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private boolean dipinjam;

    // Konstruktor untuk inisialisasi buku
    public Buku(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.dipinjam = false;
    }

    // Metode untuk menampilkan informasi buku
    public void tampilkanInfoBuku() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Tahun Terbit: " + tahunTerbit);
        System.out.println("Status: " + (dipinjam ? "Dipinjam" : "Tersedia"));
    }

    // Metode untuk meminjam buku
    public void pinjamBuku() {
        if (!dipinjam) {
            System.out.println("Buku berhasil dipinjam.");
            dipinjam = true;
        } else {
            System.out.println("Buku sedang tidak tersedia untuk dipinjam.");
        }
    }
}

