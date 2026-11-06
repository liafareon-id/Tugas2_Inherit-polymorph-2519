package soal2;

/**
 * Kelas induk untuk percobaan pemanggilan method override dari constructor.
 */
public class A {
    /**
     * Membuat objek A, lalu memanggil init untuk menunjukkan dispatch dinamis.
     */
    public A() {
        System.out.println("A dibuat");
        init();
    }

    /**
     * Menampilkan proses inisialisasi dasar.
     */
    public void init() {
        System.out.println("init A");
    }
}
