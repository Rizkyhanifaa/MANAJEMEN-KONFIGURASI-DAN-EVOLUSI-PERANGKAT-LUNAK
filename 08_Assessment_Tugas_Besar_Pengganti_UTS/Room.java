public class Room {
    private String jenisKamar;
    private double hargaPerMalam;

    public Room(String jenisKamar, double hargaPerMalam) {
        this.jenisKamar = jenisKamar;
        this.hargaPerMalam = hargaPerMalam;
    }

    public String getJenisKamar() {
        return jenisKamar;
    }

    public double getHargaPerMalam() {
        return hargaPerMalam;
    }

    public void tampilkanDetailKamar() {
        System.out.println("Jenis Kamar  : " + jenisKamar);
        System.out.println("Harga/Malam  : " + hargaPerMalam);
    }
}
