# Tugas 2 Praktikum Pemrograman Berorientasi Objek

## Identitas Mahasiswa

| Keterangan | Data |
|---|---|
| Nama | Aulia Faradina |
| NPM | 250810701100019 |
| Kelas Praktikum | A |
| Repository | https://github.com/liafareon-id/Tugas2_Inherit-polymorph-2519 |

## Deskripsi Singkat

Project ini menyelesaikan empat latihan Praktikum Pemrograman Berorientasi Objek tentang inheritance, composition, dan polimorfisme menggunakan Java. Setiap soal ditempatkan pada package terpisah agar kode mudah diuji dan dikembangkan.

## Fitur Utama

- **Soal 1 – Hierarki Perangkat Elektronik:** menampilkan data laptop, ponsel, dan laptop gaming; menghitung pajak; menghitung harga promo; serta menerapkan tambahan garansi laptop gaming.
- **Soal 2 – Analisis Output, Error, dan Polimorfisme:** mendemonstrasikan urutan constructor, overriding, upcasting, downcasting, `ClassCastException`, dan dynamic dispatch.
- **Soal 3 – Titik dan Garis:** menghitung panjang garis dari dua objek titik, menerapkan constructor overloading, dan menjaga data dengan defensive copy.
- **Soal 4 – Mini Project Toko Digital:** mengelola produk fisik, digital, dan langganan; menghitung harga dan total dengan polimorfisme; mencetak struk; serta menolak kode produk duplikat.

## Konsep OOP yang Diterapkan

| Konsep | Lokasi penerapan | Alasan penggunaan |
|---|---|---|
| Inheritance | `Laptop`, `Ponsel`, `LaptopGaming`; `Kucing`; `B`; `ProdukFisik`, `ProdukDigital`, `Langganan` | Membagikan perilaku dan data umum kepada kelas yang lebih spesifik. |
| `protected` | Atribut `harga` di `Perangkat` | Memungkinkan subclass `Laptop` mengakses harga secara langsung sesuai instruksi soal. |
| `super` | Constructor dan `infoSingkat()` subclass Soal 1 | Memanggil constructor serta perilaku superclass tanpa menduplikasi kode. |
| Multilevel inheritance | `Perangkat` → `Laptop` → `LaptopGaming` dan `Produk` → `ProdukDigital` → `Langganan` | Menunjukkan pewarisan bertingkat. |
| Overriding dan dynamic dispatch | `infoSingkat()`, `suara()`, `init()`, `hitungHargaAkhir()`, `deskripsi()` | Memungkinkan objek subclass memberikan perilaku yang sesuai meskipun diakses melalui tipe superclass. |
| Upcasting dan downcasting | `Hewan h = new Kucing(...)` dan `Keranjang.hitungPerJenis()` | Menunjukkan penggunaan referensi superclass serta konversi kembali yang harus diperiksa. |
| Composition | `Garis` memiliki dua objek `Titik`; `Keranjang` memiliki daftar `Produk` | Objek kompleks dibentuk dari objek lain yang memiliki tanggung jawab tersendiri. |
| Overloading | Constructor `Garis` | Menyediakan lebih dari satu cara membuat garis dengan parameter berbeda. |
| Defensive copy | Constructor, getter, dan setter `Garis` | Mencegah perubahan objek `Titik` dari luar mengubah keadaan internal garis. |
| Exception handling | Validasi constructor produk/perangkat dan `Keranjang.tambah()` | Menolak data yang tidak valid dan menangani kode produk duplikat. |

## Struktur Project

```text
Tugas2_Inherit-polymorph-2519/
├── src/
│   ├── soal1/
│   │   ├── Perangkat.java
│   │   ├── Laptop.java
│   │   ├── Ponsel.java
│   │   ├── LaptopGaming.java
│   │   └── TesSoal1.java
│   ├── soal2/
│   │   ├── Hewan.java
│   │   ├── Kucing.java
│   │   ├── A.java
│   │   ├── B.java
│   │   ├── Lingkaran.java
│   │   ├── Titik.java
│   │   └── TesSoal2.java
│   ├── soal3/
│   │   ├── Titik.java
│   │   ├── Garis.java
│   │   └── TesSoal3.java
│   └── soal4/
│       ├── Produk.java
│       ├── ProdukFisik.java
│       ├── ProdukDigital.java
│       ├── Langganan.java
│       ├── Keranjang.java
│       └── TesSoal4.java
├── .gitignore
└── README.md
```

## Prasyarat

- JDK 17 atau lebih baru.
- IDE yang disarankan: IntelliJ IDEA atau Visual Studio Code dengan Extension Pack for Java.
- Alternatif menjalankan program: Terminal/Command Prompt dengan perintah `java` dan `javac`.

## Cara Menjalankan Program

### Melalui command line (Windows PowerShell)

Jalankan semua perintah dari folder utama project.

```powershell
# Kompilasi seluruh package
javac -d out src/soal1/*.java src/soal2/*.java src/soal3/*.java src/soal4/*.java

# Jalankan penguji masing-masing soal
java -cp out soal1.TesSoal1
java -cp out soal2.TesSoal2
java -cp out soal3.TesSoal3
java -cp out soal4.TesSoal4
```

Folder `out` hanya berisi hasil kompilasi dan dikecualikan dari Git melalui `.gitignore`.

### Melalui IntelliJ IDEA

1. Buka folder utama project melalui **File → Open**.
2. Pastikan JDK 17 atau lebih baru sudah dipilih pada **Project Structure → Project SDK**.
3. Buka salah satu file `TesSoal1.java`, `TesSoal2.java`, `TesSoal3.java`, atau `TesSoal4.java`.
4. Klik ikon ▶ di samping deklarasi `main`, lalu pilih **Run**.
5. Ulangi untuk kelas penguji soal lainnya.

## Contoh Output

### Soal 1

```text
Asus | garansi 24 bulan | RAM 16 GB | layar 14.0 inci
Samsung | garansi 12 bulan | 128 GB | 3 kamera
MSI | garansi 18 bulan | RAM 32 GB | layar 15.6 inci | GPU RTX 4060
Pajak laptop: Rp800000
Promo laptop 10 persen: Rp7200000
```

### Soal 2

```text
Hewan dibuat: Tom
Kucing dibuat
Tom makan
meong
meong
Tom memanjat
Hewan dibuat: Generik
ClassCastException tertangani: h2 bukan objek Kucing.
Downcasting aman dilewati: h2 bukan Kucing.
A dibuat
init B, nilai=0
B dibuat, nilai=5
78.53981633974483
0.0
0.0
```

### Soal 3

```text
(0.0, 0.0) - (3.0, 4.0) panjang=5.0
(1.0, 1.0) - (5.0, 5.0)
```

### Soal 4

```text
F01 | Keyboard Mekanik | fisik 1.5 kg | Rp515000
D01 | Ebook Java | digital 20.0 MB | Rp90000
L01 | Kelas Online | langganan 12 bulan | Rp1440000
TOTAL: Rp2045000
Fisik: 1, Digital: 1, Langganan: 1
Gagal: Kode produk F01 sudah ada di keranjang.
```

**Screenshot hasil eksekusi:** setelah menjalankan masing-masing kelas penguji di komputer, ambil screenshot terminal/Run Console untuk Soal 1 sampai Soal 4. Sisipkan screenshot tersebut di bagian ini sebelum pengumpulan. Screenshot harus berasal dari eksekusi project ini, bukan gambar ilustrasi.

## Jawaban Soal dan Analisis Konsep

### Pertanyaan tambahan Soal 1

Jika atribut `harga` pada `Perangkat` diubah dari `protected` menjadi `private`, baris `return harga * (1.0 - diskonPersen / 100.0);` pada `Laptop` tidak dapat mengakses atribut tersebut. Pesan utama compiler adalah `harga has private access in Perangkat`. Hal ini terjadi karena anggota `private` hanya dapat diakses langsung dari dalam kelas yang mendeklarasikannya, bukan dari subclass. Atribut `protected` dipakai pada tugas ini agar subclass dapat mengakses harga secara langsung sesuai ketentuan.

### Soal 2 – Bagian A

**1. Output dan jalannya program**

Pada kode asli tanpa penanganan exception, program mencetak baris berikut sampai terjadi exception:

```text
Hewan dibuat: Tom
Kucing dibuat
Tom makan
meong
meong
Tom memanjat
Hewan dibuat: Generik
Exception in thread "main" java.lang.ClassCastException: ...
```

Teks detail exception setelah titik dua dapat berbeda menurut versi Java. Pada file pengujian project ini, exception tersebut ditangkap agar demonstrasi dapat berlanjut ke perbaikan `instanceof`, Bagian B, dan Bagian C.

**2. Jika `h.panjat()` diaktifkan**

Akan terjadi compile-time error, bukan runtime error. Tipe statis variabel `h` adalah `Hewan`, sedangkan method `panjat()` hanya dideklarasikan pada `Kucing`. Compiler memeriksa method yang tersedia berdasarkan tipe statis referensi, sehingga pemanggilan `h.panjat()` tidak diizinkan meskipun objek sebenarnya adalah `Kucing`.

**3. Baris penyebab `ClassCastException` dan perbaikannya**

Baris yang bermasalah adalah `Kucing k2 = (Kucing) h2;`. Variabel `h2` bertipe statis `Hewan`, dan objek yang dibuat juga benar-benar `Hewan`, bukan `Kucing`, sehingga downcasting gagal saat runtime. Perbaikannya adalah memeriksa `h2 instanceof Kucing` terlebih dahulu, baru melakukan cast di dalam cabang yang benar. Tipe deklarasi `h2` tetap `Hewan`.

**4. Method `suara()` pada `h.makan()`**

Method `makan()` memang dideklarasikan di `Hewan`, tetapi pemanggilan `suara()` di dalamnya bersifat virtual. Tipe statis referensi `h` adalah `Hewan`, sedangkan tipe dinamis objek yang dirujuk adalah `Kucing`. Karena itu, Java menjalankan override `suara()` milik `Kucing` dan mencetak `meong`.

### Soal 2 – Bagian B

**5. Prediksi output `new B()` dan alasan nilai nol**

```text
A dibuat
init B, nilai=0
B dibuat, nilai=5
```

Constructor `A` berjalan lebih dahulu dan memanggil `init()`. Karena objek yang sedang dibuat sebenarnya adalah `B`, dynamic dispatch menjalankan `B.init()`, tetapi inisialisasi field milik `B` belum dilakukan sehingga `nilai` masih bernilai default `0`. Setelah constructor `A` selesai, inisialisasi field `nilai = 5` dan constructor `B` baru dilanjutkan. Memanggil method yang dapat dioverride dari constructor berisiko menjalankan kode subclass saat atribut subclass belum siap.

### Soal 2 – Bagian C

**6. Alasan `l3.luas()` menghasilkan nol dan evaluasi relasi is-a**

Tipe statis `l3` adalah `Lingkaran`, tetapi objek yang dibuat menggunakan `new Titik()`, sehingga override `luas()` milik `Titik` yang dipanggil. Hasilnya `0.0`, sama seperti pemanggilan melalui variabel `l2` yang bertipe `Titik`. Relasi “Titik adalah Lingkaran” tidak tepat secara konseptual karena titik bukan jenis lingkaran; keduanya lebih tepat menjadi konsep geometri yang berbeda. Jika method menerima `Lingkaran` dengan asumsi luas selalu positif, objek `Titik` dapat melanggar ekspektasi tersebut dan menunjukkan pelanggaran prinsip substitusi Liskov (LSP).

### Soal 3 – Titik dan Garis

**1. Output sebelum defensive copy**

Jika constructor `Garis(Titik, Titik)` hanya menyimpan referensi objek yang diterima, baris kedua akan mencetak:

```text
(100.0, 1.0) - (5.0, 5.0)
```

Hal ini terjadi karena `t` dan field `awal` pada `g2` menunjuk objek `Titik` yang sama. Perubahan `t.setX(100)` ikut mengubah titik awal yang disimpan garis.

**2. Output setelah defensive copy**

Implementasi final membuat salinan setiap titik pada constructor, setter, dan getter. Karena itu, setelah `t.setX(100)`, output baris kedua menjadi:

```text
(1.0, 1.0) - (5.0, 5.0)
```

Perubahan pada objek `t` dari luar tidak mengubah salinan titik di dalam `g2`.

**3. Kapan aliasing atau defensive copy lebih tepat?**

Aliasing dapat lebih tepat ketika beberapa objek memang harus berbagi satu keadaan yang sama dan perubahan oleh satu pihak harus langsung terlihat oleh pihak lain. Pendekatan ini juga menghindari pembuatan salinan objek yang tidak diperlukan. Defensive copy lebih tepat ketika suatu kelas harus menjaga invariannya dan tidak ingin data internal diubah tanpa melalui kontrol kelas tersebut. Pada `Garis`, defensive copy dipilih agar koordinat garis stabil setelah objek dibuat.

**4. Masalah jika `Garis extends Titik`**

Inheritance menyatakan relasi is-a, seolah-olah sebuah garis merupakan sebuah titik, padahal garis tersusun dari dua titik. Satu objek `Titik` hanya memiliki satu pasangan koordinat, sehingga tidak cukup untuk mewakili titik awal dan akhir garis. Composition lebih tepat karena `Garis` memiliki dua objek `Titik` dan dapat menggunakan perilaku keduanya tanpa mengklaim bahwa garis adalah titik.

### Analisis Konsep

**1. Perbedaan overriding dan overloading**

Overriding terjadi ketika subclass menyediakan implementasi baru untuk method superclass dengan signature yang sama, seperti `Laptop.infoSingkat()` yang memperluas `Perangkat.infoSingkat()`. Overloading terjadi ketika beberapa method atau constructor memiliki nama sama tetapi daftar parameternya berbeda, seperti dua constructor `Garis`, yaitu `Garis(Titik, Titik)` dan `Garis(double, double, double, double)`. Overriding mendukung polimorfisme runtime karena implementasi dipilih berdasarkan objek sebenarnya. Overloading dipilih berdasarkan daftar argumen saat kompilasi.

**2. Kapan memilih inheritance dan composition**

Inheritance tepat ketika terdapat relasi is-a yang benar dan subclass dapat menggantikan superclass tanpa merusak ekspektasi perilakunya. Contohnya `Laptop` adalah `Perangkat`, sehingga laptop dapat mewarisi data dan perilaku dasar perangkat. Composition tepat ketika sebuah objek dibentuk dari atau memiliki objek lain sebagai bagian dari tanggung jawabnya. Contohnya `Garis` memiliki dua `Titik`, sedangkan `Keranjang` memiliki daftar objek `Produk`.

**3. Mengapa `cetakStruk()` tidak membutuhkan `instanceof`, tetapi `hitungPerJenis()` membutuhkannya?**

`cetakStruk()` hanya perlu memanggil `deskripsi()` dan `hitungHargaAkhir()` pada setiap referensi bertipe `Produk`; implementasi subclass akan dipilih otomatis oleh polimorfisme. `hitungPerJenis()` memiliki tugas berbeda, yaitu mengelompokkan objek berdasarkan jenis konkretnya, sehingga perlu memeriksa tipe menggunakan `instanceof`. Downcasting tidak selalu aman karena referensi superclass belum tentu menunjuk objek dari subclass yang dituju. Pemeriksaan `instanceof` sebelum cast mencegah `ClassCastException`.

## Batasan dan Pengembangan Lanjutan

- Program ini merupakan latihan OOP berbasis console dan belum menggunakan antarmuka grafis atau penyimpanan basis data.
- Tantangan opsional `ProdukBundel` belum diimplementasikan karena bukan bagian wajib tugas.
- Validasi dapat diperluas, misalnya membatasi nilai berat, ukuran, atau harga pada aturan bisnis yang lebih rinci.
