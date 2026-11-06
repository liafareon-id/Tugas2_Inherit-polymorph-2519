package soal4;

/**
 * Merepresentasikan produk fisik yang dikenai ongkos kirim berdasarkan berat.
 */
public class ProdukFisik extends Produk {
    private static final double ONGKOS_KIRIM_PER_KG = 10000.0;
    private double beratKg;

    /**
     * Membuat produk fisik dengan berat tertentu.
     *
     * @param kode kode produk
     * @param nama nama produk
     * @param hargaDasar harga dasar produk
     * @param beratKg berat produk dalam kilogram, tidak boleh negatif
     * @throws IllegalArgumentException jika berat negatif atau data dasar tidak valid
     */
    public ProdukFisik(String kode, String nama, double hargaDasar, double beratKg) {
        super(kode, nama, hargaDasar);
        if (beratKg < 0) {
            throw new IllegalArgumentException("Berat produk tidak boleh negatif.");
        }
        this.beratKg = beratKg;
    }

    /**
     * Mengembalikan berat produk fisik.
     *
     * @return berat dalam kilogram
     */
    public double getBeratKg() {
        return beratKg;
    }

    /**
     * Menghitung harga dasar ditambah ongkos kirim per kilogram.
     *
     * @return harga produk setelah ongkos kirim
     */
    @Override
    public double hitungHargaAkhir() {
        return getHargaDasar() + (beratKg * ONGKOS_KIRIM_PER_KG);
    }

    /**
     * Menjelaskan bahwa produk merupakan barang fisik beserta beratnya.
     *
     * @return deskripsi produk fisik
     */
    @Override
    public String deskripsi() {
        return "fisik " + beratKg + " kg";
    }
}
