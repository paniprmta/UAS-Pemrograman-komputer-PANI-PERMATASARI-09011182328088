import java.util.Scanner;

public class SOAL6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kata atau frase: ");
        String input = scanner.nextLine();

        if (isPalindrom(input)) {
            System.out.println("'" + input + "' adalah palindrom.");
        } else {
            System.out.println("'" + input + "' bukan palindrom.");
        }

        scanner.close();
    }

    // Metode untuk mengecek apakah suatu string adalah palindrom
    public static boolean isPalindrom(String str) {
        // Menghapus spasi dan mengubah huruf menjadi huruf kecil
        String cleanedStr = str.replaceAll("\\s", "").toLowerCase();

        int length = cleanedStr.length();
        for (int i = 0; i < length / 2; i++) {
            if (cleanedStr.charAt(i) != cleanedStr.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}

