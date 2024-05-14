public class Rekening {
    protected String nomorRekening;
    protected int saldo;
    protected Customer pemilikRekening;

    protected String getNomorRekening() {
        return nomorRekening;
    }
    protected void setNomorRekening(String nomorRekening) {
        this.nomorRekening = nomorRekening;
    }

    protected int getSaldo() {
        return saldo;
    }
    protected void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    protected Customer getPemilikRekening() {
        return pemilikRekening;
    }
    protected void setPemilikRekening(Customer pemilikRekening) {
        this.pemilikRekening = pemilikRekening;
    }

    protected void infoRekening() {
        System.out.println("Nomor rekening  : " + this.getNomorRekening());
        System.out.println("Nama pemilik    : " + this.getPemilikRekening().getNama());
        System.out.println("Alamat          : " + this.getPemilikRekening().getAlamat());
        System.out.println("Nomor telp      : " + this.getPemilikRekening().getNomorTelepon());
        System.out.println("Saldo           : " + this.getSaldo());
    }
}
