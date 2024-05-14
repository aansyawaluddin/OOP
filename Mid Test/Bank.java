public class Bank {
    private String nama, alamat;

    public Bank(String nama, String alamat) {
        this.setNama(nama);
        this.setAlamat(alamat);
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
}
