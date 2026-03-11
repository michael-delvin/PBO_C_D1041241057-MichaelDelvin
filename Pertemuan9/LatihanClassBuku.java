/*
Nim: D1041241057
Nama: Michael Delvin
LATIHAN
Program Latihan Class Diagram Buku
*/


//Membuat Class buku
class Buku {
    //Membuat Atribut
    String judul;
    String pengarang;
    int harga;
    //Membuat Method tampilkanInfo
    public void tampilkanInfo(){
        System.out.println("=== INFORMASI BUKU ===");
        System.out.println();
        System.out.println("Judul : " + judul);
        System.out.println();
        System.out.println("Pengarang : " + pengarang);
        System.out.println();
        System.out.println("Harga : Rp " + harga);
        System.out.println();
    }
}
public class LatihanClassBuku {
     public static void main(String[] args) {
            //Membuat object buku1
            Buku buku1 = new Buku();
            buku1.judul = "Pemrograman Java";
            buku1.pengarang = "Budi Raharjo";
            buku1.harga = 125000;

            //Membuat object buku2
            Buku buku2 = new Buku();
            buku2.judul = "Algoritma dan Struktur Data";
            buku2.pengarang = "Rinaldi Munir";
            buku2.harga = 150000;

            //Menampilkan data buku1
            buku1.tampilkanInfo();

            System.out.println();

            //Menampilkan data buku2
            buku2.tampilkanInfo();
    }
}