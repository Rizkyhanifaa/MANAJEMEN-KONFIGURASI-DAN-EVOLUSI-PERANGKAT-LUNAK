public class Voucher {
    private String kode;

    public Voucher(String kode) {
        this.kode = kode;
    }

    public boolean isValid() {
        return kode != null && kode.length() > 3;
    }

    public double hitungDiskon() {
        return isValid() ? 50000 : 0;
    }

    public String getKode() {
        return kode;
    }
}
