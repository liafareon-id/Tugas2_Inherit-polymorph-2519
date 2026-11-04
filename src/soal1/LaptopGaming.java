package soal1;

/**
 * Merepresentasikan Laptop Gaming yang mewarisi kelas Laptop (multi-level inheritance).
 * Memberikan tambahan garansi 6 bulan dan menyimpan informasi kartu grafis.
 */
public class LaptopGaming extends Laptop {
    private static final int TAMBAHAN_GARANSI_BULAN = 6;

    private String kartuGrafis;

    /**
     * Membuat objek LaptopGaming baru dengan tambahan garansi otomatis 6 bulan.
     *
     * @param merek merek laptop gaming
     * @param harga harga laptop gaming
     * @param garansiBulan garansi dasar dalam bulan (akan ditambah 6 bulan)
     * @param ramGb kapasitas RAM dalam GB
     * @param ukuranLayarInci ukuran layar dalam inci
     * @param kartuGrafis nama atau seri kartu grafis (GPU)
     */
    public LaptopGaming(String merek, double harga, int garansiBulan, int ramGb, double ukuranLayarInci, String kartuGrafis) {
        super(merek, harga, garansiBulan + TAMBAHAN_GARANSI_BULAN, ramGb, ukuranLayarInci);
        this.kartuGrafis = kartuGrafis;
    }

    /**
     * Menghasilkan informasi singkat laptop gaming beserta spesifikasi GPU.
     *
     * @return teks informasi singkat laptop gaming
     */
    @Override
    public String infoSingkat() {
        return super.infoSingkat() + " | GPU " + kartuGrafis;
    }
}
