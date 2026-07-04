# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data inventaris kendaraan pada sebuah showroom menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa data kapasitas showroom serta detail kendaraan (seperti tahun produksi dan jenis kendaraan), dan memberikan output berupa daftar inventaris kendaraan yang tersimpan di dalam showroom secara terstruktur.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Polymorphism (Overloading & Overriding), Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Kendaraan`, `Mobil`, dan `MainShowroom` adalah contoh dari class.

```java
public class Kendaraan {
    ...
}

public class Mobil extends Kendaraan {
    ...
}

public class MainShowroom {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `daftarshowroom = new Kendaraan[kapasitas];` disiapkan untuk menampung objek instansiasi seperti `new Kendaraan(...)` atau `new Mobil(...)`.

```java
daftarshowroom[i] = new Kendaraan(tahun); // Contoh pembuatan object
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `tahun` dan `jenis` adalah contoh atribut.

```java
int tahun;
int jenis;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor digunakan untuk menginisialisasi properti kendaraan.

```java
public Kendaraan(int tahun) {
    this.tahun = tahun;
}

public Mobil(int tahun, String merk) {
    super(tahun);
    this.merk = merk;
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setTahun` dan `setJenis` adalah contoh method mutator.

```java
public void setTahun(int tahun) {
    this.tahun = tahun;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getTahun` dan `getJenis` adalah contoh method accessor.

```java
public int getTahun() {
    return tahun;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut kendaraan dienkapsulasi dan diakses menggunakan getter dan setter.

```java
private int tahun;
private int jenis;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `Mobil` mewarisi `Kendaraan` dengan sintaks `extends`.

```java
public class Mobil extends Kendaraan {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda (Overloading atau Overriding). Pada kode ini, contohnya adalah method info kendaraan yang di-override di class turunan atau method cetak yang di-overload.

```java
@Override
public String displayInfo() {
    return "Tahun Produksi: " + getTahun();
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` atau `switch` untuk menentukan tindakan berdasarkan pilihan jenis kendaraan (1: Kendaraan Biasa, 2: Mobil).

```java
if (jenis == 1) {
    // Proses Kendaraan Biasa
} else if (jenis == 2) {
    // Proses Mobil
} else {
    System.out.println("Jenis tidak valid");
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input data kendaraan berdasarkan panjang array kapasitas showroom.

```java
for (int i = 0; i < daftarshowroom.length; i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input kapasitas serta tahun produksi, dan `System.out.print` untuk menampilkan teks panduan.

```java
Scanner input = new Scanner(System.in);
System.out.print("Masukan kapasitas showroom: ");
int kapasitas = input.nextInt();
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai atau objek dalam satu variabel. Pada kode ini, `Kendaraan[] daftarshowroom = new Kendaraan[kapasitas];` adalah contoh penggunaan array objek.

```java
Kendaraan[] daftarshowroom = new Kendaraan[kapasitas];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime (misalnya input tidak sesuai tipe data). Diimplementasikan menggunakan blok `try-catch`.

```java
try {
    int tahun = input.nextInt();
} catch (Exception e) {
    System.out.println("Error: Input harus berupa angka!");
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

Nama: Ahmad Arsya Zauri Ahda
NPM: 2410010377
