import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * TODO 1
         * Instance Objek Bank
         * Pemberian nilai bisa dari constructor ataupun setter
         */
        Bank bank = new Bank("BNI", "Jl. Pongtiku");

        /*
         * TODO 2
         * Instance Objek Customer
         * Pemberian nilai bisa dari constructor ataupun setter
         */
        Customer customer = new Customer("Aan", "Kompleks SKarda N", "082192833189", true);

        /*
         * TODO 3
         * Instance Objek Tabungan
         * Pemberian nilai bisa dari constructor ataupun setter
         */
        Tabungan tabungan = new Tabungan("12345678", 10000000, customer, 50);

        /*
         * TODO 4
         * Instance Objek Giro
         * Pemberian nilai bisa dari constructor ataupun setter
         */
        Giro giro = new Giro("12345678", 10000000, customer, 100000, 50);

        /*
         * TODO 5
         * Kirimkan objek bank, tabungan dan giro
         * ke method runApp
         */
        runApp(bank, customer, tabungan, giro);
    }

    private static void runApp(Bank bank, Customer customer, Tabungan tabungan, Giro giro) {
        /*
         * TODO 6
         * Tampilkan data bank dan customer seperti contoh berikut :
         * Selamat datang ke Bank BCA
         * Tuan, Zoro (Gunakan tuan jika isMale true, dan nona jika isMale false)
         */
        System.out.println("Selamat datang ke Bank " + bank.getNama());
        System.out.println(customer.isMale() ? "Tuan" : "Nyonya" + customer.getNama());

        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Informasi Tabungan");
        System.out.println("2. Informasi Giro");
        System.out.println("3. Show Feedback");

        System.out.print("> ");
        int inp = scanner.nextInt();
        switch (inp) {
            case 1:
                System.out.println("-".repeat(25));
                System.out.println("Informasi Tabungan");
                // TODO 7 : Tampilkan Info Rekening Tabungan
                tabungan.infoRekening();
                break;
            case 2:
                System.out.println("-".repeat(25));
                System.out.println("Informasi Giro");
                // TODO 8 : Tampilkan Info Rekening Giro
                giro.infoRekening();
                break;
            case 3:
                System.out.println("=".repeat(25));
                // TODO 9 : Tampilkan Data Diri (showMyData)
                HelperMid.showMyData();
                // TODO 10 : Tampilkan Kritik dan Saran
                HelperMid.showFeedbackLab();
                System.out.println();
                System.out.println("=".repeat(25));
                break;
            default:
                break;
        }

        scanner.close();
    }
}