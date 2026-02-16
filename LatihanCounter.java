/*
Nim: D1041241057
Nama: Michael Delvin
LATIHAN
Program Counter
*/

public class LatihanCounter {
    public static void main(String[] args) {
        //Deklarasi Counter
        int Counter = 10;

        //Menampilkan nilai awal
        System.out.println("=== COUNTER ===");
        System.out.println("Nilai awal: " + Counter);

        //Melakukan penjumlahan nilai dua kali dengan perulangan
        int Loop = 0;
        while(Loop < 2) {
            Counter++;
            Loop++;
        }
        //Menampilkan nilai setelah penjumlahan dua kali
        System.out.println("Setelah ++ (2x): " + Counter);

        //Melakukan pengurangan nilai
        Counter--;
        //Menampilkan nilai setelah pengurangan
        System.out.println("Setelah --: " + Counter);

        //Melakukan penjumlahan nilai sebanyak 5
        Counter += 5;
        //Menampilkan nilai setelah penjumlahan
        System.out.println("Setelah += 5: " + Counter);

        //Melakukan pengurangan nilai sebanyak 3
        Counter -= 3;
        //Menampilkan nilai setelah pengurangan
        System.out.println("Setelah -= 3: " + Counter);

        //Melakukan perkalian nilai dikali dua
        Counter *= 2;
        //Menampilkan nilai setelah perkalian
        System.out.println("Setelah *= 2: " + Counter);
    }
}
