/*
Nim: D1041241057
Nama: Michael Delvin
LATIHAN
Program Latihan Total Genap
*/

public class LatihanTotalGenap {
    public static void main(String[] args) {
        //Deklarasi total untuk perhitungan
        int total = 0;
        //Tampilkan Total Bilangan Genap 1 - 20
        System.out.println("=== TOTAL BILANGAN GENAP 1-20 ===");

        for(int tambah = 1; tambah <= 20; tambah++) {
            if (tambah % 2 != 0) {
                continue; // melewati bilangan ganjil
            }
                total += tambah;
                System.out.println("Tambah: " + tambah + " -> Total: " + total);
        }
        System.out.println("---\n");
        System.out.println("Total akhir: " + total);
    }
}
