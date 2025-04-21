
public class Guest {

    private String nama;
    private String nomorKTP;
    private String nomorTelepon;
    private String email;
    private String jenisKelamin;

    public Guest(String nama, String nomorKTP, String nomorTelepon, String email, String jenisKelamin) {
        this.nama = nama;
        this.nomorKTP = nomorKTP;
        this.nomorTelepon = nomorTelepon;
        this.email = email;
        this.jenisKelamin = jenisKelamin;
    }

    public String getNama() {
        return nama;
    }

    public String getNomorKTP() {
        return nomorKTP;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    public String getEmail() {
        return email;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void tampilkanDataTamu() {
        System.out.println("Nama Pemesan : " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("No. KTP      : " + nomorKTP);
        System.out.println("Telepon      : " + nomorTelepon);
        System.out.println("Email        : " + email);
    }
}
