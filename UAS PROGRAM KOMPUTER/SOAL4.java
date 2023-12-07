public class SOAL4 {
    public static void main(String[] args) {
        int bilangan = 30; 

        System.out.print("Faktorisasi " + bilangan + ": ");
        faktorisasi(bilangan);
    }

    // memfaktorisasi bilangan dan menampilkannya
    public static void faktorisasi(int bilangan) {
        for (int i = 2; i <= bilangan; i++) {
            while (bilangan % i == 0) {
                System.out.print(i);
                bilangan /= i;

                if (bilangan > 1) {
                    System.out.print(" * ");
                }
            }
        }
    }
}
