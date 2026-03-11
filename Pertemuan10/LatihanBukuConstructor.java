/*
Nim: D1041241057
Nama: Michael Delvin
LATIHAN
Program Latihan Constructor Buku
*/


//Membuat Class Buku
class Buku {
    //Membuat Atribut
    String judul;
    String pengarang;
    int harga;
    //Membuat Methode tampilkanInfo
    public void tampilkanInfo(){
        System.out.println("=== INFORMASI BUKU ===");
        System.out.println("Judul    : " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Harga    : Rp " + harga);
        System.out.println();
    }
    //Membuat Constructor tanpa parameter
    public Buku(){
        judul = "Belum Diisi";
        pengarang = "Belum Diisi";
        harga = 0;
    }
    //Membuat Constructor dengan parameter
    public Buku(String judul, String pengarang, int harga){
        this.judul = judul;
        this.pengarang = pengarang;
        this.harga = harga;
    }
}

public class LatihanBukuConstructor {
    public static void main(String[] args) {

        //Membuat object buku1 menggunakan constructor dengan tanpa parameter
        Buku buku1 = new Buku();

        //Membuat object buku2 dan buku3 menggunakan constructor dengan paramater
        Buku buku2 = new Buku("Pemrograman Java","Budi Raharjo",125000);
        Buku buku3 = new Buku("Algoritma dan Struktur Data","Rinaldi Munir",150000);

        //Menampilkan data buku1
        buku1.tampilkanInfo();

        //Menampilkan data buku2
        buku2.tampilkanInfo();

        //Menampilkan data buku3
        buku3.tampilkanInfo();
    }
}