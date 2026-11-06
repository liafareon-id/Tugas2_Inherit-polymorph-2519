package soal4;

/**
 * Merepresentasikan langganan digital dengan harga berdasarkan durasi berlangganan.
 */
public class Langganan extends ProdukDigital {
    private static final double DISKON_LANGGANAN = 0.20;
    private static final int BATAS_DISKON_BULAN = 12;
    private int durasiBulan;

    /**
     * Membuat langganan dengan urutan parameter sesuai ketentuan tugas.
     *
     * @param kode kode produk
     * @param nama nama langganan
     * @param hargaDasar harga dasar per bulan
     * @param ukuranMb ukuran konten digital dalam MB
     * @param durasiBulan lama berlangganan dalam bulan, harus lebih besar dari nol
     * @throws IllegalArgumentException jika durasi tidak valid atau data dasar tidak valid
     */
    public Langganan(String kode, String nama, double hargaDasar,
                     double ukuranMb, int durasiBulan) {
        super(kode, nama, hargaDasar, ukuranMb);
        if (durasiBulan <= 0) {
            throw new IllegalArgumentException("Durasi langganan harus lebih besar dari nol.");
        }
        this.durasiBulan = durasiBulan;
    }

    /**
     * Mengembalikan durasi langganan.
     *
     * @return durasi dalam bulan
     */
    public int getDurasiBulan() {
        return durasiBulan;
    }

    /**
     * Menghitung harga berdasarkan durasi, dengan diskon khusus jika durasi minimal 12 bulan.
     * Langganan tidak menggunakan diskon digital.
     *
     * @return harga langganan setelah diskon yang berlaku
     */
    @Override
    public double hitungHargaAkhir() {
        double total = getHargaDasar() * durasiBulan;
        if (durasiBulan >= BATAS_DISKON_BULAN) {
            total *= (1.0 - DISKON_LANGGANAN);
        }
        return total;
    }

    /**
     * Menghasilkan keterangan langganan dan durasinya.
     *
     * @return deskripsi langganan
     */
    @Override
    public String deskripsi() {
        return "langganan " + durasiBulan + " bulan";
    }
}
