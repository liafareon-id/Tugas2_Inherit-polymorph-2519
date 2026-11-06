package soal2;

/**
 * Merepresentasikan hewan umum untuk menunjukkan overriding dan polimorfisme.
 */
public class Hewan {
    protected String nama;

    /**
     * Membuat hewan dengan nama tertentu dan menampilkan pesan pembuatan.
     *
     * @param nama nama hewan
     */
    public Hewan(String nama) {
        this.nama = nama;
        System.out.println("Hewan dibuat: " + nama);
    }

    /**
     * Menampilkan suara umum hewan.
     */
    public void suara() {
        System.out.println("...");
    }

    /**
     * Menampilkan aktivitas makan lalu memanggil suara secara polimorfis.
     */
    public void makan() {
        System.out.println(nama + " makan");
        suara();
    }
}
