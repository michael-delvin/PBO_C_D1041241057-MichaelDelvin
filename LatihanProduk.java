/*
Nim: D1041241057
Nama: Michael Delvin
LATIHAN
Program Informasi Produk
*/

public class LatihanProduk {
    public static final double PAJAK = 0.11;
    public static void main(String[] args) {
        //Deklarasi Nama produk dengan (String)
        String namaProduk = "Laptop Asus";
        //Deklarasi Harga produk per satuannya (int)
        int hargaProduk = 7000000;
        //Deklarasi Jumlah stok produk (int)
        int jumlahStok = 15;
        //Deklarasi Status ketersediaan produk (boolean)
        boolean isProdukAvail = true;
        
        //Menampilkan informasi produk
        System.out.println("=== INFORMASI PRODUK ===");
        System.out.println("Nama Produk: " + namaProduk);
        System.out.println("Harga Satuan: " + hargaProduk);
        System.out.println("Jumlah Stok: " + jumlahStok);
        System.out.println("Status Tersedia: " + isProdukAvail);
        //Menampilkan total nilai stok dari produk dan pajaknya
        System.out.println("---");
        System.out.println("Total Nilai Stok: Rp " + hargaProduk * jumlahStok);
        System.out.println("Pajak (11%): Rp " + (int) (PAJAK * (hargaProduk * jumlahStok)));
        //Perubahan double menjadi int diperlukan karena tipe data KONSTANTA PAJAK adalah double 
    }
}
