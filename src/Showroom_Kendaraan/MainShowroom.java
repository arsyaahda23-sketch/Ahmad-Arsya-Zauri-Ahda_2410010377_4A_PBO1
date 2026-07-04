
package Showroom_Kendaraan;

import java.util.Scanner; // impor untuk i/o sederhana
public class MainShowroom {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukan kapasitas showroom: ");
        int kapasitas = input.nextInt();
        input.nextLine();
        
        //Array: menampung objek kendaraan
        Kendaraan[] daftarshowroom = new Kendaraan[kapasitas];
        
        for (int i = 0; i <daftarshowroom.length; i++){
            System.out.println("\n--- Input Data Kendaraan ke-" + (i + 1) + "---");
            System.out.println("Jenis (1: Kendaraan Biasa, 2: Mobil):");
            int jenis = input.nextInt();
            input.nextLine();
            
            System.out.println("Masukan Merk Kendaraan: ");
            String merk = input.nextLine();
            
            System.out.print("Masukan Tahun Produksi: ");
            int tahun = input.nextInt();
            
            // Seleksi (if-else)
            if (jenis == 1) {
                daftarshowroom[i] = new Kendaraan(merk, tahun);
            }else if (jenis == 2){
                daftarshowroom[i] = new Mobil(merk,tahun);
            }else {
                System.out.println("pilihan salah! Otomatis dianggap kendaraan biasa.");
                daftarshowroom[i] = new Kendaraan(merk, tahun);
            }
        }
        // OUTPUT MENGGUNAKAN POLYMORPHISM
        System.out.println("\n================");
        System.out.println("   DAFTAR KENDARAAN SHOWROOM  ");
        System.out.println("=================");
        for (Kendaraan K :daftarshowroom){
            K.tampilkanInfo();
        }
        // Demo Mutator & Accessor
        if (daftarshowroom.length > 0){
            System.out.println("\n--- Demo Perubahan data (Mutator)---");
            System.out.println("Mengubah tahun kendaraan pertaman menjadi 2026...");
            daftarshowroom[0].setTahunproduksi(2026);
            System.out.println("Data Terbaru -> ");
            daftarshowroom[0].tampilkanInfo();
        }
        input.close();
                
    }
    
}
