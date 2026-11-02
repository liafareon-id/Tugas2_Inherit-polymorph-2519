package soal1;

/**
 * Merepresentasikan perangkat elektronik dasar yang dijual di toko.
 * Menyimpan data merek, harga, dan masa garansi perangkat.
 */
public class Perangkat {
    private static final double TARIF_PAJAK = 0.10;

    private String merek;
    protected double harga;
    private int garansiBulan;

    /**
     * Membuat objek Perangkat baru dengan validasi merek dan harga.
     *
     * @param merek merek perangkat, tidak boleh kosong
     * @param harga harga perangkat, tidak boleh negatif
     * @param garansiBulan lama garansi dalam bulan
     * @throws IllegalArgumentException jika merek kosong atau harga negatif
     */
    public Perangkat(String merek, double harga, int garansiBulan) {
        if (merek == null || merek.trim().isEmpty()) {
            throw new IllegalArgumentException("Merek tidak boleh kosong.");
        }
        if (harga < 0) {
            throw new IllegalArgumentException("Harga tidak boleh negatif.");
        }
        this.merek = merek;
        this.harga = harga;
        this.garansiBulan = garansiBulan;
    }

    /**
     * Mengambil nama merek perangkat.
     *
     * @return merek perangkat
     */
    public String getMerek() {
        return merek;
    }

    /**
     * Mengambil masa garansi perangkat dalam bulan.
     *
     * @return lama garansi dalam bulan
     */
    public int getGaransiBulan() {
        return garansiBulan;
    }

    /**
     * Menghitung pajak perangkat sebesar 10 persen dari harga.
     *
     * @return nilai pajak perangkat
     */
    public double hitungPajak() {
        return harga * TARIF_PAJAK;
    }

    /**
     * Menghasilkan informasi singkat mengenai merek dan garansi perangkat.
     *
     * @return teks informasi singkat perangkat
     */
    public String infoSingkat() {
        return merek + " | garansi " + garansiBulan + " bulan";
    }
}
