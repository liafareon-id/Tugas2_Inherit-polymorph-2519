package soal3;

/**
 * Merepresentasikan garis yang tersusun dari dua objek Titik (composition).
 * Garis menyimpan salinan defensif agar perubahan titik dari luar tidak mengubah garis.
 */
public class Garis {
    private Titik awal;
    private Titik akhir;

    /**
     * Membuat garis dari dua titik dengan defensive copy.
     *
     * @param awal titik awal garis
     * @param akhir titik akhir garis
     * @throws IllegalArgumentException jika salah satu titik null
     */
    public Garis(Titik awal, Titik akhir) {
        if (awal == null || akhir == null) {
            throw new IllegalArgumentException("Titik awal dan akhir tidak boleh null.");
        }
        this.awal = salinTitik(awal);
        this.akhir = salinTitik(akhir);
    }

    /**
     * Membuat garis dari empat koordinat dengan memanfaatkan constructor dua titik.
     *
     * @param x1 koordinat x titik awal
     * @param y1 koordinat y titik awal
     * @param x2 koordinat x titik akhir
     * @param y2 koordinat y titik akhir
     */
    public Garis(double x1, double y1, double x2, double y2) {
        this(new Titik(x1, y1), new Titik(x2, y2));
    }

    /**
     * Mengembalikan salinan titik awal agar referensi internal tidak bocor.
     *
     * @return salinan titik awal
     */
    public Titik getAwal() {
        return salinTitik(awal);
    }

    /**
     * Mengganti titik awal dengan salinan dari titik yang diberikan.
     *
     * @param awal titik awal yang baru
     * @throws IllegalArgumentException jika titik null
     */
    public void setAwal(Titik awal) {
        if (awal == null) {
            throw new IllegalArgumentException("Titik awal tidak boleh null.");
        }
        this.awal = salinTitik(awal);
    }

    /**
     * Mengembalikan salinan titik akhir agar referensi internal tidak bocor.
     *
     * @return salinan titik akhir
     */
    public Titik getAkhir() {
        return salinTitik(akhir);
    }

    /**
     * Mengganti titik akhir dengan salinan dari titik yang diberikan.
     *
     * @param akhir titik akhir yang baru
     * @throws IllegalArgumentException jika titik null
     */
    public void setAkhir(Titik akhir) {
        if (akhir == null) {
            throw new IllegalArgumentException("Titik akhir tidak boleh null.");
        }
        this.akhir = salinTitik(akhir);
    }

    /**
     * Menghitung panjang garis dengan memanggil jarakKe milik Titik.
     *
     * @return panjang garis
     */
    public double getPanjang() {
        return awal.jarakKe(akhir);
    }

    /**
     * Mengubah garis menjadi teks dengan memanfaatkan toString milik Titik.
     *
     * @return representasi titik awal dan titik akhir garis
     */
    @Override
    public String toString() {
        return awal.toString() + " - " + akhir.toString();
    }

    /**
     * Membuat salinan baru dari sebuah titik.
     *
     * @param sumber titik yang akan disalin
     * @return titik baru dengan koordinat yang sama
     */
    private Titik salinTitik(Titik sumber) {
        return new Titik(sumber.getX(), sumber.getY());
    }
}
