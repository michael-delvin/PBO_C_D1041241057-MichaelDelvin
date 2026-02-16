/*
Nim: D1041241057
Nama: Michael Delvin
LATIHAN
Program Data Mahasiswa
*/

public class LatihDataMahasiswa {
    public static void main(String[] args) {
        //Deklarasi NIM dengan tipe data angka misal Long
        long NIM = 1041241057L;
        //Deklarasi Nama
        String Nama = "Michael Delvin";
        //Deklarasi Kelas
        char Kelas = 'C';
        //Deklarasi Status
        boolean Status = true;
        //Deklarasi IPK dengan double karena desimal
        Double IPK = 3.83;
        //Deklarasi SKS
        int SKS = 66;
        
        //Menampilkan Data Mahasiswa
        System.out.println("=== DATA MAHASISWA ===");
        System.out.println("NIM          : D" + NIM);
        System.out.println("Nama         : " + Nama);
        System.out.println("Kelas        : " + Kelas);
        System.out.println("Status Aktif : " + Status);
        System.out.println("IPK Semester : " + IPK);
        System.out.println("Total SKS    : " + SKS);
    }
}
