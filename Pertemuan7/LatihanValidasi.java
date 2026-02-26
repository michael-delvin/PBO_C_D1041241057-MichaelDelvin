/*
Nim: D1041241057
Nama: Michael Delvin
LATIHAN
Program Latihan Validasi
*/

public class LatihanValidasi {
    public static void main(String[] args) {
        //Deklarasi nilai dan iterasi
        int nilai = 0;
        int iterasi = 1;

        //Tampilkan Validasi Nilai Ujian
        System.out.println("=== VALIDASI NILAI UJIAN ===");
        System.out.println();

        //do looping untuk tetap berjalan jika tidak dalam range 0-100
        do {
            //Melakukan simulasi input 3x
            if (iterasi == 1) {
                nilai = -10;
            } else if (iterasi == 2) {
                nilai = 150;
            } else {
                nilai = 85;
            }
            System.out.println("Percobaan input: " + nilai);

            //jika nilai diluar range 1-100 
            if (nilai < 0 || nilai > 100){
                System.out.println("Error: Nilai harus antara 0-100!");
                System.out.println();
            }
            //iterasi bertambah 1
            iterasi++;

        }
        //Ketika nilai tidak valid 
        while (nilai < 0 || nilai > 100);
        System.out.println("Nilai valid: " + nilai);
    }
}