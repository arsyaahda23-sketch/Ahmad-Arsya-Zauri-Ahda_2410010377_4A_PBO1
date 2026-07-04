
package Showroom_Kendaraan;

public class Mobil extends Kendaraan {
    //Construktor
    public Mobil(String merk, int tahunProduksi){
        super(merk, tahunProduksi);
    }
    //Polymorphism (Method overriding)
    public void tampilkanInfo(){
        System.out.println("Mobil | Merk: " + getMerk() + " | Tahun: " + getTahunProduksi());
    }
}
