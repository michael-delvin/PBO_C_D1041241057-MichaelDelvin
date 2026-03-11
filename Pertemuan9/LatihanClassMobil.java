/*
Nim: D1041241057
Nama: Michael Delvin
LATIHAN
Program Latihan Class Diagram Mobil
*/


//Membuat Class Mobil
class Mobil {
    //Membuat Atribut
    String merk;
    String warna;
    int tahun;
    int kecepatan;
    //Membuat Method tampilkanSpesifikasi
    public void tampilkanSpesifikasi(){
        System.out.println("=== SPESIFIKASI MOBIL ===");
        System.out.println();
        System.out.println("Merk : " + merk);
        System.out.println();
        System.out.println("Warna: " + warna);
        System.out.println();
        System.out.println("Tahun: " + tahun);
        System.out.println();
    }
    //Membuat Method percepat
    public void percepat(){
        kecepatan += 20;
        System.out.println("Mobil dipercepat...");
        System.out.println();
    }
    //Membuat Method tampilkanKecepatan
    public void tampilkanKecepatan(){
        System.out.println("Kecepatan saat ini: " + kecepatan + " km/jam");
        System.out.println();
    }
}
public class LatihanClassMobil {
     public static void main(String[] args) {
        //Membuat object mobil1
        Mobil mobil1 = new Mobil();
        mobil1.merk = "Toyota Avanza";
        mobil1.warna = "Silver";
        mobil1.tahun = 2020;
        mobil1.kecepatan = 0;

        //Menampilkan data spesifikasi dari mobil1
        mobil1.tampilkanSpesifikasi();
        System.out.println();
        System.out.println();

        //Percepat mobil1 2x
        mobil1.percepat();
        mobil1.percepat();

        //Menampilkan kecepatan mobil
        mobil1.tampilkanKecepatan();
        System.out.println();
    }
}