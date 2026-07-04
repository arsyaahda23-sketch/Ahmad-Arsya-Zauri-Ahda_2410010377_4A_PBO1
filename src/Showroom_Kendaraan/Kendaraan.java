
package Showroom_Kendaraan;

public class Kendaraan {
    // 1.Atribut (Encapsulation - private)
    private String merk;
    private int tahunProduksi;
    
    //2. Constructor
    public Kendaraan (String merk, int tahunProduksi) {
        this.merk = merk;
        this.tahunProduksi = tahunProduksi;
    }
    //3. Accessor (Getter)
    public String getMerk() {return merk;}
    public int getTahunProduksi() {return tahunProduksi; }
    
    //4. Mutator (Setter)
    public void setTahunproduksi(int tahunBaru) {
        if (tahunBaru > 1900){ //seleksi untuk validasi
            this.tahunProduksi = tahunBaru;
        }
    }
    //5. method untuk polymorphism
    public void tampilkanInfo(){
        System.out.println("Kendaraan | Merk: " + merk + " | Tahun : " + tahunProduksi);
    }
}
