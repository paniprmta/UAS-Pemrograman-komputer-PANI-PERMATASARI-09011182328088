import java.util.Scanner;

public class SOAL8 {
    public static void main(String[] args) {
        // Membuat akun
        Akun akun1 = new Akun("pani_permatasari", "pani123");

        // Menampilkan informasi akun
        System.out.println("Informasi Akun 1:");
        akun1.tampilkanInfoAkun();

        // Mengaktifkan atau menonaktifkan akun
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nApakah Anda ingin mengaktifkan atau menonaktifkan akun 1? (aktif/nonaktif): ");
        String status = scanner.nextLine();

        if (status.equalsIgnoreCase("aktif")) {
            akun1.aktifkanAkun();
        } else if (status.equalsIgnoreCase("nonaktif")) {
            akun1.nonaktifkanAkun();
        }

        // Menampilkan informasi akun setelah perubahan status
        System.out.println("\nInformasi Akun 1 setelah perubahan status:");
        akun1.tampilkanInfoAkun();

        scanner.close();
    }
}

class Akun {
    private String username;
    private String password;
    private boolean aktif;

    // Konstruktor untuk inisialisasi akun
    public Akun(String username, String password) {
        this.username = username;
        this.password = password;
        this.aktif = false;
    }

    // Metode untuk menampilkan informasi akun
    public void tampilkanInfoAkun() {
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Status: " + (aktif ? "Aktif" : "Nonaktif"));
    }

    // Metode untuk mengaktifkan akun
    public void aktifkanAkun() {
        if (!aktif) {
            System.out.println("Akun berhasil diaktifkan.");
            aktif = true;
        } else {
            System.out.println("Akun sudah aktif.");
        }
    }

    // Metode untuk menonaktifkan akun
    public void nonaktifkanAkun() {
        if (aktif) {
            System.out.println("Akun berhasil dinonaktifkan.");
            aktif = false;
        } else {
            System.out.println("Akun sudah nonaktif.");
        }
    }
}
