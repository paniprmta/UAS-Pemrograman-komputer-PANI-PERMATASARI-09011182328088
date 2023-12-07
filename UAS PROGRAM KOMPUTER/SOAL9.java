import java.util.Stack;

public class SOAL9 {
    public static void main(String[] args) {
        String ekspresi = "((5 + 4) * (5 * 5))";

        if (cekUrutanKurung(ekspresi)) {
            System.out.println("Urutan kurung pada ekspresi benar.");
        } else {
            System.out.println("Urutan kurung pada ekspresi salah.");
        }
    }

    // Metode untuk memeriksa urutan kurung pada ekspresi matematika
    public static boolean cekUrutanKurung(String ekspresi) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < ekspresi.length(); i++) {
            char karakter = ekspresi.charAt(i);

            if (karakter == '(') {
                stack.push(karakter);
            } else if (karakter == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false; // Kurung tutup tanpa pasangan kurung buka
                }
            }
            
        }

        return stack.isEmpty(); // Jika stack kosong, urutan kurung benar
    }
}
