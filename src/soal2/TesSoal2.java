package soal2;

/**
 * Menjalankan demonstrasi constructor, overriding, upcasting, downcasting, dan LSP.
 */
public class TesSoal2 {
    /**
     * Menjalankan seluruh bagian pengujian Soal 2.
     *
     * @param args argumen command line (tidak digunakan)
     */
    public static void main(String[] args) {
        // Bagian A: overriding, upcasting, dan downcasting.
        Hewan h = new Kucing("Tom");
        h.makan();
        h.suara();
        // h.panjat(); // Tidak dapat dikompilasi karena tipe statis h adalah Hewan.
        Kucing k = (Kucing) h;
        k.panjat();

        Hewan h2 = new Hewan("Generik");
        try {
            Kucing k2 = (Kucing) h2;
            k2.panjat();
        } catch (ClassCastException exception) {
            System.out.println("ClassCastException tertangani: h2 bukan objek Kucing.");
        }

        // Perbaikan yang aman: periksa tipe dinamis sebelum melakukan downcasting.
        if (h2 instanceof Kucing) {
            Kucing k2 = (Kucing) h2;
            k2.panjat();
        } else {
            System.out.println("Downcasting aman dilewati: h2 bukan Kucing.");
        }

        // Bagian B: method override dipanggil dari constructor superclass.
        new B();

        // Bagian C: tipe variabel Lingkaran tidak mengubah tipe objek sebenarnya.
        Lingkaran l1 = new Lingkaran(5);
        Titik l2 = new Titik();
        Lingkaran l3 = new Titik();
        System.out.println(l1.luas());
        System.out.println(l2.luas());
        System.out.println(l3.luas());
    }
}
