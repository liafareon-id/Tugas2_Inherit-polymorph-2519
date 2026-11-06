package soal4;

/**
 * Merepresentasikan produk digital yang memperoleh potongan harga digital.
 */
public class ProdukDigital extends Produk {
    protected static final double DISKON_DIGITAL = 0.10;
    private double ukuranMb;

    /**
     * Membuat produk digital dengan ukuran file tertentu.
     *
     * @param kode kode produk
     * @param nama nama produk
     * @param hargaDasar harga dasar produk
     * @param ukuranMb ukuran produk digital dalam MB, tidak boleh negatif
     * @throws IllegalArgumentException jika ukuran negatif atau data dasar tidak valid
     */
    public ProdukDigital(String kode, String nama, double hargaDasar, double ukuranMb) {
        super(kode, nama, hargaDasar);
        if (ukuranMb < 0) {
            throw new IllegalArgumentException("Ukuran digital tidak boleh negatif.");
        }
        this.ukuranMb = ukuranMb;
    }

    /**
     * Mengembalikan ukuran produk digital.
     *
     * @return ukuran file dalam MB
     */
    public double getUkuranMb() {
        return ukuranMb;
    }

    /**
     * Menghitung harga setelah diskon digital sepuluh persen.
     *
     * @return harga produk digital setelah diskon
     */
    @Override
    public double hitungHargaAkhir() {
        return getHargaDasar() * (1.0 - DISKON_DIGITAL);
    }

    /**
     * Menjelaskan bahwa produk merupakan produk digital beserta ukuran filenya.
     *
     * @return deskripsi produk digital
     */
    @Override
    public String deskripsi() {
        return "digital " + ukuranMb + " MB";
    }
}
