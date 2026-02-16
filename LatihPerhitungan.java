/*
Nim: D1041241057
Nama: Michael Delvin
LATIHAN
Program Simulasi Transaksi Bank
*/

public class LatihPerhitungan {
    public static void main(String[] args) {
        //Deklarasi Saldo
        int Saldo = 1000000;

        //Menampilkan Transaksi Bank dan Saldo Awal
        System.out.println("=== Simulasi Transaksi Bank ===");
        System.out.println("Saldo Awal          : " + Saldo);

        //Deklarasi Setoran
        int Setoran = 500000;
        //Menambahkan Setoran ke Saldo Tabungan
        Saldo += Setoran;

        //Menampilkan Setoran dan Saldo setelah Setoran dilakukan
        System.out.println("Setoran             : " + Setoran);
        System.out.println("Saldo Setelah Setor : " + Saldo);

        //Deklarasi Penarikan
        int Penarikan = 250000;
        //Mengurangkan Penarikan ke Saldo Tabungan
        Saldo -= Penarikan;

        //Menampilkan Penarikan dan Saldo Akhir setelah penarikan
        System.out.println("Penarikan           : " + Penarikan);
        System.out.println("Saldo Akhir         : " + Saldo);
    }
}
