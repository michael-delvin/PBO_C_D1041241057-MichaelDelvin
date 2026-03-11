/*
Nim: D1041241057
Nama: Michael Delvin
LATIHAN
Program Latihan Constructor Mobil
*/


//Membuat Class Mobil
class Mobil {
    //Membuat Atribut
    String merk;
    String warna;
    int tahun; 
    //Membuat Method tampilkanSpesifikasi
    public void tampilkanSpesifikasi(){
        System.out.println("=== SPESIFIKASI MOBIL ===");
        System.out.println("Merk : " + merk);
        System.out.println("Warna: " + warna);
        System.out.println("Tahun: " + tahun);
        System.out.println();
    }
    //Membuat Constructor tanpa Parameter
    public Mobil(){
        this.merk = "Belum Diisi";
        this.warna = "Belum Diisi";
        this.tahun = 0;
    }
    //Membuat Constructor dengan 1 Parameter
    public Mobil(String merk){
        this.merk = merk;
        this.warna = "Belum Diisi";
        this.tahun = 0;
    }
    //Membuat Constructor dengan 3 Parameter
    public Mobil(String merk, String warna, int tahun){
        this.merk = merk;
        this.warna = warna;
        this.tahun = tahun;
    }
}
public class LatihanMobilConstructor {
     public static void main(String[] args) {
        //Membuat object mobil1 menggunakan Constructor dengan tanpa paramater
        Mobil mobil1 = new Mobil();

        //Membuat object mobil2 menggunakan Constructor dengan 1 paramater
        Mobil mobil2 = new Mobil("Toyota");

        //Membuat object mobil3 menggunakan Constructor dengan 3 paramater
        Mobil mobil3 = new Mobil("Honda Civic", "Merah", 2023);

        //Menampilkan data spesifikasi dari mobil1
        mobil1.tampilkanSpesifikasi();

        //Menampilkan data spesifikasi dari mobil2
        mobil2.tampilkanSpesifikasi();

        //Menampilkan data spesifikasi dari mobil3  
        mobil3.tampilkanSpesifikasi();
    }
}