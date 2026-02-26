/*
Nim: D1041241057
Nama: Michael Delvin
LATIHAN
Program Latihan Cari Kelipatan
*/

public class LatihanCariKelipatan {
    public static void main(String [] args) {
        //Tampilkan Cari Kelipatan 7
        System.out.println("=== CARI KELIPATAN 7 ===");

        for (int cek = 1; cek <= 50; cek++) {
            System.out.println("Cek: " + cek);

            if(cek == 7) {
                System.out.println("Kelipatan 7 pertama: " + cek);
                break; // berhenti looping
            }
        }
        System.out.println("Pencarian selesai.\n");
    }
}
