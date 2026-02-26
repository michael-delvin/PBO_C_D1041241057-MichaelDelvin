/*
Nim: D1041241057
Nama: Michael Delvin
LATIHAN
Program Latihan Diskon
*/

public class LatihanDiskon {
    public static void main(String[] args) {
        //Deklarasi total belanja dan diskon
        double totalBelanja = 750000;
        double diskon;

        //tampilkan Kalkulator Diskon
        System.out.println("=== KALKULATOR DISKON ===");
        System.out.println("Total Belanja: Rp " + totalBelanja);

        if (totalBelanja >= 1000000){
            //jika total belanja lebih dari sama dengan 1 juta diskonnya 15%
            diskon = totalBelanja * 0.15;

            System.out.println("Diskon (15%): Rp " + diskon);
        } else if (totalBelanja >= 500000 && totalBelanja < 1000000){
            //jika total belanja di antara 500.000 sampai 999.999 diskonnya 10%
            diskon = totalBelanja * 0.1;

            System.out.println("Diskon (10%): Rp " + diskon);
        } else if (totalBelanja >= 100000 && totalBelanja < 500000){
            //jika total belanja di antara 100.000 sampai 499.999 diskonnya 5%
            diskon = totalBelanja * 0.05;

            System.out.println("Diskon (5%): Rp " + diskon);
        } else {
            //jika total belanja lebih dari kurang dari 100rb Tidak diskon
            diskon = totalBelanja * 0;

            System.out.println("Diskon (0%): Rp " + diskon);
        }
        //Deklrasi Harga akhir 
        double hargaAkhir = totalBelanja - diskon;

        System.out.println("Harga Akhir: Rp " + hargaAkhir);
        System.out.println("Anda hemat: Rp " + diskon);
    }
}
