/*
Nim: D1041241057
Nama: Michael Delvin
LATIHAN
Program Latihan Constructor Persegi
*/


//Membuat Class Persegi
class Persegi {
    //Membuat Atribut
    int sisi;
    int luas;
    int keliling;
    //Membuat Method tampilkanHasil
    public void tampilkanHasil(){
        System.out.println("=== PERSEGI ===");
        System.out.println("Sisi    : " + sisi + " cm");
        System.out.println("Luas    : " + luas + " cm²");
        System.out.println("Keliling: " + keliling + " cm");
        System.out.println();
    }
    //Membuat Constructor dengan validasi
    public Persegi(int sisi){
        //jika sisi kurang dari 1 maka otomatis set sisi ke 1
        if (sisi <= 0){
            System.out.println("ERROR: Sisi tidak boleh <= 0. Diset ke default (1).");
            this.sisi = 1;
        } else {
            this.sisi = sisi;
        }
        luas = this.sisi * this.sisi;
        keliling = this.sisi * 4;
    }
}
public class LatihanPersegiConstructor {
     public static void main(String[] args) {
        //Membuat object persegi1 yang valid menggunakan Constructor yang divalidasi
        Persegi persegi1 = new Persegi(5);

        //Menampilkan data persegi1
        persegi1.tampilkanHasil();

        //Membuat object persegi2 yang tidak valid menggunakan Constructor yang divalidasi
        Persegi persegi2 = new Persegi(-3);

        //Menampilkan data persegi2
        persegi2.tampilkanHasil();
    }
}