package soal4;

import java.util.ArrayList;
import java.util.List;

/**
 * Menyimpan kumpulan Produk dan menghitung total serta jumlah produk per jenis.
 */
public class Keranjang {
    private List<Produk> daftarProduk;

    /**
     * Membuat keranjang belanja kosong.
     */
    public Keranjang() {
        daftarProduk = new ArrayList<>();
    }

    /**
     * Menambahkan produk jika kodenya belum digunakan di keranjang.
     *
     * @param produk produk yang akan ditambahkan
     * @throws IllegalArgumentException jika produk null
     * @throws IllegalStateException jika kode produk sudah ada
     */
    public void tambah(Produk produk) {
        if (produk == null) {
            throw new IllegalArgumentException("Produk tidak boleh null.");
        }
        for (Produk item : daftarProduk) {
            if (item.getKode().equals(produk.getKode())) {
                throw new IllegalStateException(
                        "Kode produk " + produk.getKode() + " sudah ada di keranjang.");
            }
        }
        daftarProduk.add(produk);
    }

    /**
     * Menghitung total harga seluruh produk menggunakan polimorfisme.
     *
     * @return total harga keranjang
     */
    public double hitungTotal() {
        double total = 0.0;
        for (Produk produk : daftarProduk) {
            total += produk.hitungHargaAkhir();
        }
        return total;
    }

    /**
     * Mencetak setiap produk dan total belanja tanpa pemeriksaan instanceof.
     * Perhitungan harga ditentukan oleh implementasi subclass masing-masing.
     */
    public void cetakStruk() {
        for (Produk produk : daftarProduk) {
            System.out.printf("%s | %s | %s | Rp%.0f%n",
                    produk.getKode(), produk.getNama(),
                    produk.deskripsi(), produk.hitungHargaAkhir());
        }
        System.out.printf("TOTAL: Rp%.0f%n", hitungTotal());
    }

    /**
     * Menghitung jumlah fisik, digital, dan langganan dengan instanceof serta downcasting aman.
     * Langganan harus diperiksa lebih dahulu karena merupakan subclass ProdukDigital.
     */
    public void hitungPerJenis() {
        int jumlahFisik = 0;
        int jumlahDigital = 0;
        int jumlahLangganan = 0;

        for (Produk produk : daftarProduk) {
            if (produk instanceof Langganan) {
                Langganan langganan = (Langganan) produk;
                langganan.getDurasiBulan();
                jumlahLangganan++;
            } else if (produk instanceof ProdukDigital) {
                ProdukDigital digital = (ProdukDigital) produk;
                digital.getUkuranMb();
                jumlahDigital++;
            } else if (produk instanceof ProdukFisik) {
                ProdukFisik fisik = (ProdukFisik) produk;
                fisik.getBeratKg();
                jumlahFisik++;
            }
        }

        System.out.println("Fisik: " + jumlahFisik
                + ", Digital: " + jumlahDigital
                + ", Langganan: " + jumlahLangganan);
    }
}
