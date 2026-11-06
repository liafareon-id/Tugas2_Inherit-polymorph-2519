package soal4;

/**
 * Menjalankan pengujian mini project toko digital dan penanganan kode produk duplikat.
 */
public class TesSoal4 {
    /**
     * Menambahkan contoh produk, mencetak struk, dan menguji exception kode duplikat.
     *
     * @param args argumen command line (tidak digunakan)
     */
    public static void main(String[] args) {
        Keranjang keranjang = new Keranjang();

        keranjang.tambah(new ProdukFisik(
                "F01", "Keyboard Mekanik", 500000, 1.5));
        keranjang.tambah(new ProdukDigital(
                "D01", "Ebook Java", 100000, 20));
        keranjang.tambah(new Langganan(
                "L01", "Kelas Online", 150000, 20, 12));

        keranjang.cetakStruk();
        keranjang.hitungPerJenis();

        try {
            keranjang.tambah(new ProdukFisik(
                    "F01", "Mouse", 100000, 0.2));
        } catch (IllegalStateException exception) {
            System.out.println("Gagal: " + exception.getMessage());
        }
    }
}
