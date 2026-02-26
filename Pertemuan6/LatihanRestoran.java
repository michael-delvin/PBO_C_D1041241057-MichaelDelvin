/*
Nim: D1041241057
Nama: Michael Delvin
LATIHAN
Program Latihan Restoran Sederhana
*/

public class LatihanRestoran {
    public static void main(String[] args) {
        //Deklarasi kode menu dan jumlah pesanan
        int menuCode = 1;
        int quantity = 2;

        //Deklarasi nama menu dan harga
        String menuName;
        int price;
        int totalPrice;

        //Tampilkan menu restoran
        System.out.println("=== MENU RESTORAN ===");
        System.out.println("Kode Menu: " + menuCode);
        System.out.println("Jumlah: " + quantity);
        System.out.println();
        System.out.println("Pesanan Anda:");

        //Buat Switch untuk menu
        switch (menuCode){
            case 1: 
                menuName = "Nasi Goreng";
                price = 15000;
                totalPrice = price * quantity;
                System.out.println("Nama Menu: " + menuName);
                System.out.println("Harga Satuan: Rp " + price);
                System.out.println("Jumlah: " + quantity);
                System.out.println("---");
                System.out.println("Total Bayar: Rp " + totalPrice);
                break;
            case 2:
                menuName = "Mie Ayam";
                price = 12000;
                totalPrice = price * quantity;
                System.out.println("Nama Menu: " + menuName);
                System.out.println("Harga Satuan: Rp " + price);
                System.out.println("Jumlah: " + quantity);
                System.out.println("---");
                System.out.println("Total Bayar: Rp " + totalPrice);
                break;
            case 3:
                menuName = "Bakso";
                price = 10000;
                totalPrice = price * quantity;
                System.out.println("Nama Menu: " + menuName);
                System.out.println("Harga Satuan: Rp " + price);
                System.out.println("Jumlah: " + quantity);
                System.out.println("---");
                System.out.println("Total Bayar: Rp " + totalPrice);
                break;
            case 4:
                menuName = "Soto Ayam";
                price = 13000;
                totalPrice = price * quantity;
                System.out.println("Nama Menu: " + menuName);
                System.out.println("Harga Satuan: Rp " + price);
                System.out.println("Jumlah: " + quantity);
                System.out.println("---");
                System.out.println("Total Bayar: Rp " + totalPrice);
                break;
            case 5:
                menuName = "Es Teh";
                price = 3000;
                totalPrice = price * quantity;
                System.out.println("Nama Menu: " + menuName);
                System.out.println("Harga Satuan: Rp " + price);
                System.out.println("Jumlah: " + quantity);
                System.out.println("---");
                System.out.println("Total Bayar: Rp " + totalPrice);
                break;

            //default case jika kode menu diluar range 1 - 5
            default:
                menuName = "Menu Tidak Valid (1-5)";
                System.out.println("Error : " + menuName);
                break;
        }
    }
}