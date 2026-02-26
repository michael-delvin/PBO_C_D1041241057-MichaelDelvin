/*
Nim: D1041241057
Nama: Michael Delvin
LATIHAN
Program Latihan Tabel Perkalian
*/

public class LatihanTabelPerkalian {
    public static void main(String[] args) {
        //Deklarasi angka
        int angka = 7;
        
        //Tampilkan Tabel Perkalian
        System.out.println("=== TABEL PERKALIAN 7 ===");
        for (int i = 1; i <= 12; i++){
            int perkalianAngka = angka * i;
            System.out.println("7 x " + i + " = " + perkalianAngka);
        }
    }
}