package soal1;

/**
 * Merepresentasikan laptop gaming dengan GPU dan tambahan masa garansi enam bulan.
 */
public class LaptopGaming extends Laptop {
    private static final int TAMBAHAN_GARANSI_BULAN = 6;
    private String kartuGrafis;

    /**
     * Membuat laptop gaming dan meneruskan garansi dasar ditambah enam bulan ke Laptop.
     *
     * @param merek merek laptop gaming
     * @param harga harga laptop gaming
     * @param garansiBulan garansi dasar dalam bulan sebelum tambahan
     * @param ramGb kapasitas RAM dalam GB
     * @param ukuranLayarInci ukuran layar dalam inci
     * @param kartuGrafis nama kartu grafis, tidak boleh kosong
     * @throws IllegalArgumentException jika kartu grafis kosong atau data dasar tidak valid
     */
    public LaptopGaming(String merek, double harga, int garansiBulan,
                        int ramGb, double ukuranLayarInci, String kartuGrafis) {
        super(merek, harga, garansiBulan + TAMBAHAN_GARANSI_BULAN,
                ramGb, ukuranLayarInci);
        if (kartuGrafis == null || kartuGrafis.trim().isEmpty()) {
            throw new IllegalArgumentException("Kartu grafis tidak boleh kosong.");
        }
        this.kartuGrafis = kartuGrafis.trim();
    }

    /**
     * Menambahkan informasi kartu grafis pada informasi laptop.
     *
     * @return informasi singkat laptop gaming
     */
    @Override
    public String infoSingkat() {
        return super.infoSingkat() + " | GPU " + kartuGrafis;
    }
}
