package soal3;

/**
 * Merepresentasikan titik dua dimensi dengan koordinat x dan y.
 */
public class Titik {
    private double x;
    private double y;

    /**
     * Membuat titik pada koordinat asal (0, 0).
     */
    public Titik() {
        this(0.0, 0.0);
    }

    /**
     * Membuat titik pada koordinat tertentu.
     *
     * @param x koordinat horizontal
     * @param y koordinat vertikal
     */
    public Titik(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Mengembalikan koordinat x.
     *
     * @return koordinat x
     */
    public double getX() {
        return x;
    }

    /**
     * Mengubah koordinat x.
     *
     * @param x koordinat x yang baru
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * Mengembalikan koordinat y.
     *
     * @return koordinat y
     */
    public double getY() {
        return y;
    }

    /**
     * Mengubah koordinat y.
     *
     * @param y koordinat y yang baru
     */
    public void setY(double y) {
        this.y = y;
    }

    /**
     * Menghitung jarak Euclidean dari titik ini ke titik lain.
     *
     * @param lain titik tujuan
     * @return jarak antara kedua titik
     * @throws IllegalArgumentException jika titik tujuan null
     */
    public double jarakKe(Titik lain) {
        if (lain == null) {
            throw new IllegalArgumentException("Titik tujuan tidak boleh null.");
        }
        return Math.hypot(x - lain.x, y - lain.y);
    }

    /**
     * Mengubah titik menjadi teks berformat (x, y).
     *
     * @return koordinat titik dalam format (x, y)
     */
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
