public class Giro extends Rekening {
    private int batasTarikTunai, bunga;

    public Giro(String nomorRekening, int saldo, Customer pemilikRek, int batasTarikTunai, int bunga) {
        this.setNomorRekening(nomorRekening);
        this.setSaldo(saldo);
        this.setPemilikRekening(pemilikRek);
        this.setBatasTarikTunai(batasTarikTunai);
        this.setBunga(bunga);
    }

    public int getBatasTarikTunai() {
        return batasTarikTunai;
    }
    public void setBatasTarikTunai(int batasTarikTunai) {
        this.batasTarikTunai = batasTarikTunai;
    }

    public int getBunga() {
        return bunga;
    }
    public void setBunga(int bunga) {
        this.bunga = bunga;
    }

    public void infoRekening() {
        super.infoRekening();
        System.out.println("Batas Penarikan : " + this.getBatasTarikTunai());
        System.out.println("Bunga           : " + this.getBunga());
    }
}
