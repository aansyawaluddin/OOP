public class Tabungan extends Rekening {
    private int sukuBunga;

    public Tabungan(String nomorRekening, int saldo, Customer pemilikRek, int sukuBunga) {
        this.setNomorRekening(nomorRekening);
        this.setSaldo(saldo);
        this.setPemilikRekening(pemilikRek);
        this.setSukuBunga(sukuBunga);
    }

    public int getSukuBunga() {
        return sukuBunga;
    }
    public void setSukuBunga(int sukuBunga) {
        this.sukuBunga = sukuBunga;
    }

    public void infoRekening() {
        super.infoRekening();
        System.out.println("Suku Bunga      : " + this.getSukuBunga());
    }
}
