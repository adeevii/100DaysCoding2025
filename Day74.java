import java.util.Scanner;

public class Day74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;

        do {
            System.out.println("HALOO YIRAN GE! PILIH SIAPAA!");
            System.out.println("1. Saya");
            System.out.println("2. Ade");
            System.out.println("3. Ade evi");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            a = sc.nextInt();

            switch (a) {
                case 1:
                    System.out.println("Kamu memilih saya!");
                    break;
                case 2:
                    System.out.println("Kamu memilih Ade.");
                    break;
                case 3:
                    System.out.println("Kamu memilih Ade evi.");
                    break;
                case 0:
                    System.out.println("Kamu memilih keluar:(.");
                    break;
            }
        } while (a != 0);
    }
}
