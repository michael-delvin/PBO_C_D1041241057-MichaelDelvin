/*
Nim: D1041241057
Nama: Michael Delvin
LATIHAN
Program Latihan Refleksi
*/

public class LatihanRefleksi {
    public static void main(String[] args) {
        //Deklarasi Angka
        int angka = 1;

        //Tampilkan looping menggunakan while
        System.out.println("=== MENGGUNAKAN WHILE ===");
        //Looping dengan menggunakan while
        while (angka <= 5){
            System.out.print(angka + " ");
            //Menambahkan angka sehingga iterasi bertambah
            angka++;
        }
        //Mengembalikan nilai angka ke 1
        angka = 1;
        System.out.println();

        //Tampilkan looping menggunakan do-while
        System.out.println("=== MENGGUNAKAN DO-WHILE ===");
        //Looping dengan menggunakan do-while
        do { 
            System.out.print(angka + " ");
            //Menambahkan angka sehingga iterasi bertambah
            angka++;
        } while (angka <= 5); //kondisi while
        System.out.println();

        //Tampilkan looping menggunakan for
        System.out.println("=== MENGGUNAKAN FOR ===");
        //Looping dengan menggunakan for 
        for (int i = 1; i <= 5; i++){
            System.out.print(i + " ");
        }
    }
}