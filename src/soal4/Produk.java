package soal4;

/**
 * Kelas abstrak yang menyimpan identitas dan harga dasar seluruh produk toko.
 */
public abstract class Produk {
    private String kode;
    private String nama;
    private double hargaDasar;

    /**
     * Membuat produk setelah memvalidasi kode, nama, dan harga dasar.
     *
     * @param kode kode unik produk, tidak boleh kosong
     * @param nama nama produk, tidak boleh kosong
     * @param hargaDasar harga dasar produk, tidak boleh negatif
     * @throws IllegalArgumentException jika kode atau nama kosong, atau harga negatif
     */
    public Produk(String kode, String nama, double hargaDasar) {
        if (kode == null || kode.trim().isEmpty()) {
            throw new IllegalArgumentException("Kode produk tidak boleh kosong.");
        }
        if (nama == null || nama.trim().isEmpty()) {
            throw new IllegalArgumentException("Nama produk tidak boleh kosong.");
        }
        if (hargaDasar < 0) {
            throw new IllegalArgumentException("Harga dasar tidak boleh negatif.");
        }
        this.kode = kode.trim();
        this.nama = nama.trim();
        this.hargaDasar = hargaDasar;
    }

    /**
     * Mengembalikan kode produk.
     *
     * @return kode produk
     */
    public String getKode() {
        return kode;
    }

    /**
     * Mengembalikan nama produk.
     *
     * @return nama produk
     */
    public String getNama() {
        return nama;
    }

    /**
     * Mengembalikan harga dasar produk.
     *
     * @return harga dasar
     */
    public double getHargaDasar() {
        return hargaDasar;
    }

    /**
     * Menghitung harga akhir sesuai aturan jenis produk.
     *
     * @return harga akhir produk
     */
    public abstract double hitungHargaAkhir();

    /**
     * Menghasilkan keterangan jenis produk.
     *
     * @return deskripsi produk
     */
    public abstract String deskripsi();
}
