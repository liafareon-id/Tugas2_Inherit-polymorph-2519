package soal2;

/**
 * Kelas turunan A yang meng-override init untuk menguji urutan inisialisasi objek.
 */
public class B extends A {
    private int nilai = 5;

    /**
     * Membuat objek B setelah constructor superclass selesai dijalankan.
     */
    public B() {
        super();
        System.out.println("B dibuat, nilai=" + nilai);
    }

    /**
     * Menampilkan nilai saat init dipanggil melalui constructor A.
     */
    @Override
    public void init() {
        System.out.println("init B, nilai=" + nilai);
    }
}
