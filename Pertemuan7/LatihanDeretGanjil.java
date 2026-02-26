/*
Nim: D1041241057
Nama: Michael Delvin
LATIHAN
Program Latihan Deret Ganjil
*/

public class LatihanDeretGanjil {
    public static void main(String[] args) {
        //Deklarasi Angka
        int angka = 1;

        //Tampilkan Bilangan Ganjil 1-15
        System.out.println("=== BILANGAN GANJIL 1-15 ===");

        //looping while sampai 15
        while (angka <= 15){
            System.out.print(angka + " ");
            //menambahkan angka sebanyak 2 sehingga hanya menampilkan angka ganjil
            angka += 2;
        }
    }
}