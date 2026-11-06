package soal2;

/**
 * Merepresentasikan lingkaran dengan jari-jari, luas, dan keliling.
 */
public class Lingkaran {
    private double jariJari;

    /**
     * Membuat lingkaran dengan jari-jari tertentu.
     *
     * @param jariJari jari-jari lingkaran, tidak boleh negatif
     * @throws IllegalArgumentException jika jari-jari negatif
     */
    public Lingkaran(double jariJari) {
        if (jariJari < 0) {
            throw new IllegalArgumentException("Jari-jari tidak boleh negatif.");
        }
        this.jariJari = jariJari;
    }

    /**
     * Menghitung luas lingkaran.
     *
     * @return luas lingkaran
     */
    public double luas() {
        return Math.PI * jariJari * jariJari;
    }

    /**
     * Menghitung keliling lingkaran.
     *
     * @return keliling lingkaran
     */
    public double keliling() {
        return 2.0 * Math.PI * jariJari;
    }
}
