package soal1;

/**
 * Merepresentasikan perangkat bertipe Laptop yang mewarisi kelas Perangkat.
 * Memiliki spesifikasi tambahan berupa kapasitas RAM dan ukuran layar.
 */
public class Laptop extends Perangkat {
    private static final double PERSEN_PEMBAGI = 100.0;

    private int ramGb;
    private double ukuranLayarInci;

    /**
     * Membuat objek Laptop baru.
     *
     * @param merek merek laptop
     * @param harga harga laptop
     * @param garansiBulan lama garansi dalam bulan
     * @param ramGb kapasitas RAM dalam GB
     * @param ukuranLayarInci ukuran layar dalam inci
     */
    public Laptop(String merek, double harga, int garansiBulan, int ramGb, double ukuranLayarInci) {
        super(merek, harga, garansiBulan);
        this.ramGb = ramGb;
        this.ukuranLayarInci = ukuranLayarInci;
    }

    /**
     * Menghitung harga laptop setelah dikurangi diskon promo.
     * Mengakses atribut protected harga dari superclass secara langsung.
     *
     * @param diskonPersen persentase diskon promo
     * @return harga setelah diskon
     */
    public double hitungHargaPromo(double diskonPersen) {
        return harga - (harga * diskonPersen / PERSEN_PEMBAGI);
    }

    /**
     * Menghasilkan informasi singkat laptop beserta spesifikasi RAM dan layar.
     *
     * @return teks informasi singkat laptop
     */
    @Override
    public String infoSingkat() {
        return super.infoSingkat() + " | RAM " + ramGb + " GB | layar " + ukuranLayarInci + " inci";
    }
}
