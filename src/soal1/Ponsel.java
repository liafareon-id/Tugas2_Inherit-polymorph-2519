package soal1;

/**
 * Merepresentasikan perangkat bertipe Ponsel yang mewarisi kelas Perangkat.
 * Memiliki spesifikasi tambahan berupa kapasitas penyimpanan dan jumlah kamera.
 */
public class Ponsel extends Perangkat {
    private int kapasitasGb;
    private int jumlahKamera;

    /**
     * Membuat objek Ponsel baru.
     *
     * @param merek merek ponsel
     * @param harga harga ponsel
     * @param garansiBulan lama garansi dalam bulan
     * @param kapasitasGb kapasitas penyimpanan internal dalam GB
     * @param jumlahKamera jumlah kamera pada ponsel
     */
    public Ponsel(String merek, double harga, int garansiBulan, int kapasitasGb, int jumlahKamera) {
        super(merek, harga, garansiBulan);
        this.kapasitasGb = kapasitasGb;
        this.jumlahKamera = jumlahKamera;
    }

    /**
     * Menghasilkan informasi singkat ponsel beserta kapasitas penyimpanan dan kamera.
     *
     * @return teks informasi singkat ponsel
     */
    @Override
    public String infoSingkat() {
        return super.infoSingkat() + " | " + kapasitasGb + " GB | " + jumlahKamera + " kamera";
    }
}
