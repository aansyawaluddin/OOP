import java.util.Scanner;

public class soal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Pertanyaan 1
        System.out.println("1. Apa ibu kota Indonesia?");
        System.out.println("a. Jakarta");
        System.out.println("b. Bandung");
        System.out.println("c. Surabaya");
        System.out.println("d. Medan");
        System.out.print("Jawaban Anda: ");
        String jawaban1 = input.nextLine();

        // Pertanyaan 2
        System.out.println("2. Siapakah presiden pertama Indonesia?");
        System.out.println("a. Soekarno");
        System.out.println("b. Soeharto");
        System.out.println("c. BJ Habibie");
        System.out.println("d. Megawati Soekarnoputri");
        System.out.print("Jawaban Anda: ");
        String jawaban2 = input.nextLine();

        // Pertanyaan 3
        System.out.println("3. Apa mata uang Indonesia?");
        System.out.println("a. Rupiah");
        System.out.println("b. Dollar");
        System.out.println("c. Euro");
        System.out.println("d. Yen");
        System.out.print("Jawaban Anda: ");
        String jawaban3 = input.nextLine();

        int benar = 0;
        int salah = 0;

        // Pengecekan jawaban
        if (jawaban1.equalsIgnoreCase("a")) {
            benar++;
        } else {
            salah++;
        }

        if (jawaban2.equalsIgnoreCase("a")) {
            benar++;
        } else {
            salah++;
        }

        if (jawaban3.equalsIgnoreCase("a")) {
            benar++;
        } else {
            salah++;
        }

        // Output hasil pengecekan
        System.out.println("Jawaban benar: " + benar);
        System.out.println("Jawaban salah: " + salah);
    }
}