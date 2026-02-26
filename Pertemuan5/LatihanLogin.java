/*
Nim: D1041241057
Nama: Michael Delvin
LATIHAN
Program Latihan Login
*/

public class LatihanLogin {
    public static void main(String[] args) {
        //Deklarasi username dan password 
        String inputUsername = "admin";
        //Password valid
        //String inputPassword = "admin123";
        //Password tidak valid 
        String inputPassword = "admin000"; 

        //Tampilkan validasi login
        System.out.println("=== VALIDASI LOGIN ===");
        System.out.println("Username: " + inputUsername);
        System.out.println("Password: ****");
        System.out.println("---");

        //cek jika username sesuai
        if (inputUsername.equals("admin")){
            System.out.println("Username valid");

            //cek jika password sesuai
            if (inputPassword.equals("admin123")){
                System.out.println("Password benar");
                System.out.println("LOGIN BERHASIL!");
                System.out.println("Selamat datang, admin");
            } else {
                System.out.println("Password salah");
                System.out.println("LOGIN GAGAL!");
            }
        } else {
            System.out.println("Username salah");
            System.out.println("LOGIN GAGAL!");
        }
    }
}
