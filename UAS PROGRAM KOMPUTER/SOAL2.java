import java.util.Scanner;

public class SOAL2 {
    public static void main(String[] args) {
        // Menentukan nilai username dan password yang benar
        String usernameBenar = "pani_permatasari";
        String passwordBenar = "123456";

        // Input username dan password dari pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan username: ");
        String usernameInput = scanner.nextLine();
        System.out.print("Masukkan password: ");
        String passwordInput = scanner.nextLine();

        // Melakukan autentikasi
        if (usernameInput.equals(usernameBenar) && passwordInput.equals(passwordBenar)) {
            System.out.println("Autentikasi Berhasil");
        } else {
            System.out.println("Autentikasi Gagal");
        }

        scanner.close();
    }
}
