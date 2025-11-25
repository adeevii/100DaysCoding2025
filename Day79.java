import java.util.Scanner;

public class Day79 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String urs;
        String password;

        System.out.println("Buat Akun");
        System.out.print("Ursname: ");
        urs = sc.nextLine();

        System.out.print("Password: ");
        password = sc.nextLine();

        System.out.println("\nAkun Berhasil Dibuat\n");

        String userIn;
        String passIn;
        System.out.println("Login");

        do {
            System.out.print("Ursname: ");
            userIn = sc.nextLine();
            System.out.print("Password: ");
            passIn = sc.nextLine();

            if (!userIn.equals(urs) || !passIn.equals(password)) {
                System.out.println("Login Gagal. Coba lagi.\n");
            }
        } while (!userIn.equals(urs) || !passIn.equals(password));
        System.out.println("Login Berhasil. Halo Selamat Datang, "+urs);
    }
}
