public class HelperMid {
    public static void showMyData() {
        System.out.println("DATA DIRI");
        System.out.println("NAMA    : Aan Syawaluddin Adi Putra");
        System.out.println("NIM     : H071221031");
        System.out.println("KELAS   : B");
        System.out.println("PAKET   : B");
    }

    public static void showFeedbackLab() {
        System.out.println("Kritik dan Saran");
        System.out.println("-".repeat(20));
        // System.out.println("AAA AAAAA AAAAA AAAAA AAAAA AAAAA AAAA AAA ");
        HelperMid.cutLineString("Kalau dari saya sendiri kak, saya harap banyak praktik secara langsung pada saat jadwal lab. Jadi bukan hanya sebatas teori lalu Quiz kak, tapi ada sesi praktiknya kak sesuai nama mata kuliahnya. Terima kasih sebelumnya kak");
    }

    public static void cutLineString(String text) {
        String[] textArray = text.split(" ");

        for (int i = 0; i < textArray.length; i++) {
            if (i % 3 == 0 && i != 0) {
                System.out.println();
            }
            System.out.print(textArray[i] + " ");
        }
    }
}
