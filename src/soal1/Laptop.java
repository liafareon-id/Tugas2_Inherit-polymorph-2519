package soal1;

/**
 * Merepresentasikan laptop yang mewarisi data dasar dari Perangkat.
 */
public class Laptop extends Perangkat {
    private int ramGb;
    private double ukuranLayarInci;

    /**
     * Membuat laptop dengan kapasitas RAM dan ukuran layar tertentu.
     *
     * @param merek merek laptop
     * @param harga harga laptop
     * @param garansiBulan lama garansi dalam bulan
     * @param ramGb kapasitas RAM dalam GB, harus lebih besar dari nol
     * @param ukuranLayarInci ukuran layar dalam inci, harus lebih besar dari nol
     * @throws IllegalArgumentException jika RAM atau ukuran layar tidak valid
     */
    public Laptop(String merek, double harga, int garansiBulan,
                  int ramGb, double ukuranLayarInci) {
        super(merek, harga, garansiBulan);
        if (ramGb <= 0) {
            throw new IllegalArgumentException("RAM harus lebih besar dari nol.");
        }
        if (ukuranLayarInci <= 0) {
            throw new IllegalArgumentException("Ukuran layar harus lebih besar dari nol.");
        }
        this.ramGb = ramGb;
        this.ukuranLayarInci = ukuranLayarInci;
    }

    /**
     * Menghitung harga laptop setelah diskon dengan mengakses harga protected.
     *
     * @param diskonPersen persentase diskon dari 0 sampai 100
     * @return harga laptop setelah diskon
     * @throws IllegalArgumentException jika persentase diskon di luar rentang 0 sampai 100
     */
    public double hitungHargaPromo(double diskonPersen) {
        if (diskonPersen < 0 || diskonPersen > 100) {
            throw new IllegalArgumentException("Diskon harus berada pada rentang 0 sampai 100 persen.");
        }
        return harga * (1.0 - diskonPersen / 100.0);
    }

    /**
     * Menambahkan informasi RAM dan layar pada informasi dasar perangkat.
     *
     * @return informasi singkat laptop
     */
    @Override
    public String infoSingkat() {
        return super.infoSingkat()
                + " | RAM " + ramGb + " GB"
                + " | layar " + ukuranLayarInci + " inci";
    }
}
