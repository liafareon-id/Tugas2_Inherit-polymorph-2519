package soal2;

/**
 * Merepresentasikan kucing sebagai subclass Hewan.
 */
public class Kucing extends Hewan {
    /**
     * Membuat kucing dengan nama tertentu.
     *
     * @param nama nama kucing
     */
    public Kucing(String nama) {
        super(nama);
        System.out.println("Kucing dibuat");
    }

    /**
     * Menampilkan suara khas kucing.
     */
    @Override
    public void suara() {
        System.out.println("meong");
    }

    /**
     * Menampilkan bahwa kucing sedang memanjat.
     */
    public void panjat() {
        System.out.println(nama + " memanjat");
    }
}
