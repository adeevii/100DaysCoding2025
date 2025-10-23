import java.util.Scanner;

public class Day46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("======= MENU WARUNG ANDA =======");
        System.out.println("1. Bakso Urat      -Rp15.000");
        System.out.println("2. Bakso Tenis     -Rp18.000");
        System.out.println("3. Bakso Campur    -Rp18.000");
        System.out.println("4. Bakso Biasa     -Rp13.000");
        System.out.println("5. Es Teh Manis/Tawar -Rp5.000");
        System.out.println("-------------------------------");
        System.out.print("Pilih Menu : ");
        int pilih = sc.nextInt();
        switch (pilih) {
            case 1:
                System.out.println("Anda memilih bakso urat, harga Rp15.000");
                break;
            case 2:
                System.out.println("Anda memilih bakso tenis, harga Rp18.000");
                break;
            case 3:
                System.out.println("Anda memilih bakso campur, harga Rp18.000");
                break;
            case 4:
                System.out.println("Anda memilih bakso biasa, harga Rp13.000");
                break;
            case 5:
                System.out.println("Anda memilih es teh manis/tawar, harga Rp5.000");
        }
    }
}
