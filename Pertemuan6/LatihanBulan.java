/*
Nim: D1041241057
Nama: Michael Delvin
LATIHAN
Program Latihan Bulan
*/

public class LatihanBulan {
    public static void main(String[] args) {
        //Deklarasi bulan
        //int month = 5;
        //Nilai bulan yang tidak sesuai
        int month = 13;
        String monthName;

        //Tampilkan konversi bulan
        System.out.println("=== KONVERSI BULAN ===");
        System.out.println("Angka Bulan: " + month);

        //buat switch case untuk 12 bulan
        switch (month){
            case 1:
                monthName = "Januari";
                System.out.println("Nama Bulan: " + monthName);
                break;
            case 2:
                monthName = "Februari";
                System.out.println("Nama Bulan: " + monthName);
                break;
            case 3:
                monthName = "Maret";
                System.out.println("Nama Bulan: " + monthName);
                break;
            case 4:
                monthName = "April";
                System.out.println("Nama Bulan: " + monthName);
                break;
            case 5:
                monthName = "Mei";
                System.out.println("Nama Bulan: " + monthName);
                break;
            case 6:
                monthName = "Juni";
                System.out.println("Nama Bulan: " + monthName);
                break;
            case 7:
                monthName = "Juli";
                System.out.println("Nama Bulan: " + monthName);
                break;
            case 8:
                monthName = "Agustus";
                System.out.println("Nama Bulan: " + monthName);
                break;
            case 9:
                monthName = "September";
                System.out.println("Nama Bulan: " + monthName);
                break;
            case 10:
                monthName = "Oktober";
                System.out.println("Nama Bulan: " + monthName);
                break;
            case 11:
                monthName = "November";
                System.out.println("Nama Bulan: " + monthName);
                break;
            case 12:
                monthName = "Desember";
                System.out.println("Nama Bulan: " + monthName);
                break;

            //default case jika bulan di luar range 1 - 12
            default:
                monthName = "Angka bulan tidak valid (1-12)";
                System.out.println("Error: " + monthName);
                break;
        }
    }
}