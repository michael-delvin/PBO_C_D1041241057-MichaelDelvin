/*
Nim: D1041241057
Nama: Michael Delvin
LATIHAN
Program Latihan Hari Bulan
*/

public class LatihanHariBulan {
    public static void main(String[] args) {
        //Deklrasi bulan dan hari
        int month = 4;
        int day;
        String monthName;

        //Tampilkan jumlah hari dalam bulan
        System.out.println("=== JUMLAH HARI DALAM BULAN ===");

        //Buat switch untuk Bulan
        switch (month) {
            case 1:
                monthName = "Januari";
                System.out.println("Bulan: " + monthName + " (bulan ke-" + month + ")" );
                break;
            case 2:
                monthName = "Februari";
                System.out.println("Bulan: " + monthName + " (bulan ke-" + month + ")" );
                break;
            case 3:
                monthName = "Maret";
                System.out.println("Bulan: " + monthName + " (bulan ke-" + month + ")" );
                break;
            case 4:
                monthName = "April";
                System.out.println("Bulan: " + monthName + " (bulan ke-" + month + ")" );
                break;
            case 5:
                monthName = "Mei";
                System.out.println("Bulan: " + monthName + " (bulan ke-" + month + ")" );
                break;
            case 6:
                monthName = "Juni";
                System.out.println("Bulan: " + monthName + " (bulan ke-" + month + ")" );
                break;
            case 7:
                monthName = "Juli";
                System.out.println("Bulan: " + monthName + " (bulan ke-" + month + ")" );
                break;
            case 8:
                monthName = "Agustus";
                System.out.println("Bulan: " + monthName + " (bulan ke-" + month + ")" );
                break;
            case 9: 
                monthName = "September";
                System.out.println("Bulan: " + monthName + " (bulan ke-" + month + ")" );
                break;              
            case 10:
                monthName = "Oktober";
                System.out.println("Bulan: " + monthName + " (bulan ke-" + month + ")" );
                break;
            case 11:
                monthName = "November";
                System.out.println("Bulan: " + monthName + " (bulan ke-" + month + ")" );
                break;
            case 12:
                monthName = "Desember";
                System.out.println("Bulan: " + monthName + " (bulan ke-" + month + ")" );
                break;
            default:
                monthName = "Angka bulan tidak valid (1-12)";
                System.out.println("Error: " + monthName);
                break;
        }

        //Buat fall trough Switch untuk hari dalam bulan
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                //fall through - bulan dengan 31 hari 
                day = 31;
                System.out.println("Jumlah Hari : " + day);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                //fall through - bulan dengan 30 hari
                day = 30;
                System.out.println("Jumlah Hari : " + day);
                break;
            case 2:
                //fall through - bulan dengan 28 hari
                day = 28;
                System.out.println("Jumlah Hari : " + day);
                break;

            //default case jika bulan di luar range 1 - 12
            default:
                System.out.println("Error : Bulan tidak valid");
                break;
        }
    }
}