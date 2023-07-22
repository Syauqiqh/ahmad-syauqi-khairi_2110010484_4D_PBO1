# ahmad-syauqi-khairi_2110010484_4D_PBO1
# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh menu pembelian di restaurant menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nomor menu,jumlah barang dan pertanyaan di antar atau tidaknya pesanan, dan memberikan output berupa daftar menu, berapa jumlah barang, pertanyaan pengantaran, dan informasi detail harga total pesanan.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Menu`, `Pesanan`, `PesananDelivery` dan `MainIndex` adalah contoh dari class.

```bash
public class Menu {
    ...
}
public class Pesanan {
    ...
}

public class PesananDelivery extends Pesanan {
    ...
}

public class MainIndex {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, ` pesanan = new PesananDelivery(menuPesanan, jumlahPesanan, alamat);` dan ` pesanan = new Pesanan(menuPesanan, jumlahPesanan);` adalah contoh pembuatan object.

```bash
 pesanan = new PesananDelivery(menuPesanan, jumlahPesanan, alamat);
 pesanan = new Pesanan(menuPesanan, jumlahPesanan);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama`, `harga`, `jumlah`, `diskon` dan `alamat` adalah contoh atribut.

```bash
 String nama;
 double harga;
 int jumlah;
 double diskon;
 String alamat;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Menu`,`Pesanan` dan `PesananDelivery`.

```bash
public Menu(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

public Pesanan(Menu menu, int jumlah) {
        this.menu = menu;
        this.jumlah = jumlah;
    }

public PesananDelivery(Menu menu, int jumlah, String alamat) {
        super(menu, jumlah);
        this.alamat = alamat;
    }
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setDiskon` adalah contoh method mutator.

```bash
public void setDiskon(double diskon) {
        this.diskon = diskon;
    }
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getHarga`, `getMenu`, `getJumlah`, `getDiskon`, `getTotalHarga`, dan `getAlamat` adalah contoh method accessor.

```bash
public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }
public void setDiskon(double diskon) {
        this.diskon = diskon;
    }
public Menu getMenu() {
        return menu;
    }


    public int getJumlah() {
        return jumlah;
    }

    public double getTotalHarga() {
        double totalHarga = menu.getHarga() * jumlah;
        return totalHarga - diskon;
    }
public String getAlamat() {
        return alamat;
    }

```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut  `nama`, `harga`, `jumlah`, `diskon` dan `alamat` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
 private String nama;
 private double harga;
 private int jumlah;
 private double diskon;
 private String alamat;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `MahasiswaDetail` mewarisi `Mahasiswa` dengan sintaks `extends`.

```bash
public class PesananDelivery extends Pesanan {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `getTotalHarga()` di `PesananDelivery` merupakan override dari method `getTotalHarga` di `Pesanan`.

```bash
 public double getTotalHarga() {
        double totalHarga = menu.getHarga() * jumlah;
        return totalHarga - diskon;
    }

@Override
    public double getTotalHarga() {
        // Menggunakan harga dasar pesanan ditambah biaya pengiriman
        double totalHargaPesanan = super.getTotalHarga();
        double biayaPengiriman = 7000;
        if (getJumlah() > 3) {
            double diskon = totalHargaPesanan * 0.1; // Diskon 10% dari total harga
            setDiskon(diskon);
            totalHargaPesanan -= diskon;
        }

        return totalHargaPesanan + biayaPengiriman;
    }
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getTotalHarga`dan pemilihan antar pesanan di class `MainIndex` berupa`(pesanan instanceof PesananDelivery)`, dan seleksi `switch` dalam class `MainIndex`.

```bash
 public double getTotalHarga() {
        // Menggunakan harga dasar pesanan ditambah biaya pengiriman
        double totalHargaPesanan = super.getTotalHarga();
        double biayaPengiriman = 7000;
        if (getJumlah() > 3) {
            double diskon = totalHargaPesanan * 0.1; // Diskon 10% dari total harga
            setDiskon(diskon);
            totalHargaPesanan -= diskon;
        }

        return totalHargaPesanan + biayaPengiriman;
    }

if (isDelivery.equalsIgnoreCase("y")) {
            System.out.print("Masukkan alamat pengiriman: ");
            String alamat = scanner.next();
           ...error handling...
        } else {
            pesanan = new Pesanan(menuPesanan, jumlahPesanan);
        }
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk menampilkan daftar menu.

```bash
for (int i = 0; i < menuArray.length; i++) {
           System.out.println((i + 1) + ". " + menuArray[i].getNama() + " - Rp" + menuArray[i].getHarga());}
       
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
        System.out.print("Pilih menu (1-5): ");
        int pilihanMenu = scanner.nextInt();
       ....error handling....
 System.out.print("Jumlah pesanan: ");
        int jumlahPesanan = scanner.nextInt();
      ....error handling...
      ....switch case....
System.out.print("Apakah pesanan mau diantar? (y/n): ");
        String isDelivery = scanner.next();
..
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, ` Menu[] menuArray = {menu1, menu2, menu3, menu4, menu5};` adalah contoh penggunaan array.

```bash
 Menu[] menuArray = {menu1, menu2, menu3, menu4, menu5};
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
 try {
            if (pilihanMenu < 1 || pilihanMenu > 5) {
                throw new Exception("Menu tidak valid.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }
try {
            if (jumlahPesanan <= 0) {
                throw new Exception("Jumlah pesanan harus lebih dari 0.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }
 try {
                if (alamat.isEmpty()) {
                    throw new Exception("Alamat pengiriman tidak boleh kosong.");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                return;
            }
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Ahamad Syauqi Khairi
NPM: 2110010484
Ask AI to edit or generate...
