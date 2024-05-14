public class Customer {
    private String nama, alamat, nomorTelepon;
    private boolean isMale;

    public Customer(String nama, String alamat, String nomorTelepon, boolean isMale) {
        this.setNama(nama);
        this.setAlamat(alamat);
        this.setNomorTelepon(nomorTelepon);
        this.setMale(isMale);
    }

    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }
    public void setNomorTelepon(String nomorTelepon) {
        this.nomorTelepon = nomorTelepon;
    }

    public boolean isMale() {
        return isMale;
    }
    public void setMale(boolean isMale) {
        this.isMale = isMale;
    }
}
