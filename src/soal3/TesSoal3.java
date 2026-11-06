package soal3;

/**
 * Menjalankan pengujian composition, constructor overloading, dan defensive copy pada Garis.
 */
public class TesSoal3 {
    /**
     * Menjalankan contoh penggunaan kelas Titik dan Garis.
     *
     * @param args argumen command line (tidak digunakan)
     */
    public static void main(String[] args) {
        Garis g = new Garis(0, 0, 3, 4);
        System.out.println(g + " panjang=" + g.getPanjang());

        Titik t = new Titik(1, 1);
        Garis g2 = new Garis(t, new Titik(5, 5));
        t.setX(100);
        System.out.println(g2);
    }
}
