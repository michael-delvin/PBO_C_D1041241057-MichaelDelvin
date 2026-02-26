/*
Nim: D1041241057
Nama: Michael Delvin
LATIHAN
Program Latihan Kombinasi Nested Loop dan Break
*/

public class LatihanKombinasiLoop {
    public static void main(String[] args) {
        //Deklarasi boolean untuk syarat pencarian telah selesai
        boolean isFound = false;
        //Tampilkan Pencarian Koordinat [2,3]
        System.out.println("=== PENCARIAN KOORDINAT [2,3] ===");

        //Looping baris
        for (int baris = 1; baris <= 3; baris++) {
            //Looping kolom
            for (int kolom = 1; kolom <= 5; kolom++) {
                System.out.println("Cek: [" + baris + "," + kolom + "]" );
                
                //Kondisi baris dan kolom sesuai dengan koordinat
                if (baris == 2 && kolom == 3) {
                    System.out.println("Koordinat ditemukan!");
                    isFound = true;
                    break; // Keluar Loop Inner
                }
            }
            if (isFound) {
                break; // Keluar Loop Outer
            }
        }
        System.out.println("Pencarian selesai.\n");
    }
}