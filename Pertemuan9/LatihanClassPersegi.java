/*
Nim: D1041241057
Nama: Michael Delvin
LATIHAN
Program Latihan Class Diagram Mobil
*/


//Membuat Class Persegi
class Persegi {
    //Membuat Atribut
    int sisi;
    int luas;
    int keliling;
    //Membuat Method hitungLuas
    public void hitungLuas(){
        luas = sisi * sisi;
    }
    //Membuat Method hitungKeliling
    public void hitungKeliling(){
        keliling = sisi * 4;
    }
    //Membuat Method tampilkanHasil
    public void tampilkanHasil(){
        System.out.println("=== PERSEGI ===");
        System.out.println();
        System.out.println("Sisi    : " + sisi + " cm");
        System.out.println();
        System.out.println("Luas    : " + luas + " cm²");
        System.out.println();
        System.out.println("Keliling: " + keliling + " cm");
        System.out.println();
    }
}
public class LatihanClassPersegi {
     public static void main(String[] args) {
        //Membuat object persegi1
        Persegi persegi1 = new Persegi();
        persegi1.sisi = 5;

        //Menampilkan perhitungan luas persegi
        persegi1.hitungLuas();
        
        //Menampilkan perhitungan keliling persegi
        persegi1.hitungKeliling();

        //Menampilkan data persegi
        persegi1.tampilkanHasil();
    }
}