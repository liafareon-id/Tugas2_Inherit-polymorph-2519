package soal1;

/**
 * Merepresentasikan ponsel yang mewarisi data dasar dari Perangkat.
 */
public class Ponsel extends Perangkat {
    private int kapasitasGb;
    private int jumlahKamera;

    /**
     * Membuat ponsel dengan kapasitas penyimpanan dan jumlah kamera tertentu.
     *
     * @param merek merek ponsel
     * @param harga harga ponsel
     * @param garansiBulan lama garansi dalam bulan
     * @param kapasitasGb kapasitas penyimpanan dalam GB, harus lebih besar dari nol
     * @param jumlahKamera jumlah kamera, harus lebih besar dari nol
     * @throws IllegalArgumentException jika kapasitas atau jumlah kamera tidak valid
     */
    public Ponsel(String merek, double harga, int garansiBulan,
                  int kapasitasGb, int jumlahKamera) {
        super(merek, harga, garansiBulan);
        if (kapasitasGb <= 0) {
            throw new IllegalArgumentException("Kapasitas penyimpanan harus lebih besar dari nol.");
        }
        if (jumlahKamera <= 0) {
            throw new IllegalArgumentException("Jumlah kamera harus lebih besar dari nol.");
        }
        this.kapasitasGb = kapasitasGb;
        this.jumlahKamera = jumlahKamera;
    }

    /**
     * Menambahkan informasi penyimpanan dan kamera pada informasi dasar perangkat.
     *
     * @return informasi singkat ponsel
     */
    @Override
    public String infoSingkat() {
        return super.infoSingkat()
                + " | " + kapasitasGb + " GB"
                + " | " + jumlahKamera + " kamera";
    }
}
