package soal2;

/**
 * Kelas percobaan yang mewarisi Lingkaran dan meng-override luas serta keliling menjadi nol.
 * Desain ini sengaja dibuat untuk membahas apakah relasi is-a tersebut masuk akal.
 */
public class Titik extends Lingkaran {
    /**
     * Membuat objek Titik dengan jari-jari lingkaran nol.
     */
    public Titik() {
        super(0.0);
    }

    /**
     * Mengembalikan luas nol sesuai skenario percobaan.
     *
     * @return 0.0
     */
    @Override
    public double luas() {
        return 0.0;
    }

    /**
     * Mengembalikan keliling nol sesuai skenario percobaan.
     *
     * @return 0.0
     */
    @Override
    public double keliling() {
        return 0.0;
    }
}
