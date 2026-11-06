package soal1;

/**
 * Merepresentasikan perangkat elektronik dengan data dasar merek, harga, dan garansi.
 * Kelas ini menjadi superclass bagi jenis perangkat yang lebih spesifik.
 */
public class Perangkat {
    /** Tarif pajak perangkat sebesar 10 persen. */
    protected static final double TARIF_PAJAK = 0.10;

    private String merek;
    protected double harga;
    private int garansiBulan;

    /**
     * Membuat perangkat elektronik setelah memvalidasi data dasarnya.
     *
     * @param merek merek perangkat, tidak boleh kosong
     * @param harga harga perangkat, tidak boleh negatif
     * @param garansiBulan lama garansi dalam bulan, tidak boleh negatif
     * @throws IllegalArgumentException jika merek kosong atau nilai numerik negatif
     */
    public Perangkat(String merek, double harga, int garansiBulan) {
        if (merek == null || merek.trim().isEmpty()) {
            throw new IllegalArgumentException("Merek tidak boleh kosong.");
        }
        if (harga < 0) {
            throw new IllegalArgumentException("Harga tidak boleh negatif.");
        }
        if (garansiBulan < 0) {
            throw new IllegalArgumentException("Garansi tidak boleh negatif.");
        }
        this.merek = merek.trim();
        this.harga = harga;
        this.garansiBulan = garansiBulan;
    }

    /**
     * Mengembalikan merek perangkat.
     *
     * @return merek perangkat
     */
    public String getMerek() {
        return merek;
    }

    /**
     * Mengembalikan lama garansi perangkat.
     *
     * @return lama garansi dalam bulan
     */
    public int getGaransiBulan() {
        return garansiBulan;
    }

    /**
     * Menghitung pajak berdasarkan harga dasar perangkat.
     *
     * @return nilai pajak perangkat
     */
    public double hitungPajak() {
        return harga * TARIF_PAJAK;
    }

    /**
     * Menghasilkan informasi singkat yang dapat diperluas oleh subclass.
     *
     * @return merek dan lama garansi perangkat
     */
    public String infoSingkat() {
        return merek + " | garansi " + garansiBulan + " bulan";
    }
}
