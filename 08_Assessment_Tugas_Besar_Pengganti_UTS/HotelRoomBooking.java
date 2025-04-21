import java.util.Date;

public class HotelRoomBooking {

    private Guest tamu; 
    private Room kamar;
    private int jumlahTamu;
    private int jumlahMalam;
    private Voucher voucher;
    private boolean sudahDibayar;
    private Date tanggalCheckin;
    private Date tanggalCheckout;
    private BookingStatus status;

    public HotelRoomBooking(Guest tamu, Room kamar, int jumlahTamu, int jumlahMalam,
            Date tanggalCheckin, Date tanggalCheckout, BookingStatus status,
            Voucher voucher, boolean sudahDibayar) {

        this.tamu = tamu;
        this.kamar = kamar;
        this.jumlahTamu = jumlahTamu;
        this.jumlahMalam = jumlahMalam;
        this.tanggalCheckin = tanggalCheckin;
        this.tanggalCheckout = tanggalCheckout;
        this.status = status;
        this.voucher = voucher;
        this.sudahDibayar = sudahDibayar;
    }

    public void cetakDetailPemesanan() {
        System.out.println("===== DETAIL PEMESANAN KAMAR =====");
        tamu.tampilkanDataTamu();
        kamar.tampilkanDetailKamar();
        System.out.println("Jumlah Tamu  : " + jumlahTamu);
        System.out.println("Jumlah Malam : " + jumlahMalam);
        System.out.println("Check-in     : " + tanggalCheckin);
        System.out.println("Check-out    : " + tanggalCheckout);
        System.out.println("Status Aktif : " + status);
        System.out.println("Voucher      : " + (voucher != null ? voucher.getKode() : "-"));
        System.out.println("Sudah Dibayar: " + sudahDibayar);
        System.out.println("Total Biaya  : Rp " + hitungTotalBiaya());
        System.out.println("Tipe Tamu    : " + klasifikasiTamu());
        System.out.println("===================================");
    }

    public double hitungTotalBiaya() {
        double total = kamar.getHargaPerMalam() * jumlahMalam;
        if (jumlahTamu > 2) {
            total += (jumlahTamu - 2) * 100000;
        }
        if (voucher != null) {
            total -= voucher.hitungDiskon();
        }
        if (!status.isActive()) {  // Menggunakan enum BookingStatus
            total = 0;
        }
        return total;
    }

    public String klasifikasiTamu() {
        if (jumlahTamu == 1)
            return "Individu";
        else if (jumlahTamu == 2)
            return "Pasangan";
        else
            return "Keluarga";
    }

    public int getJumlahMalam() {
        return jumlahMalam;
    }

    public void setJumlahMalam(int jumlahMalam) {
        this.jumlahMalam = jumlahMalam;
    }
    
    public boolean isSudahDibayar() {
        return sudahDibayar;
    }

    public void setSudahDibayar(boolean sudahDibayar) {
        this.sudahDibayar = sudahDibayar;
    }
}
