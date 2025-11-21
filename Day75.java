import java.util.Scanner;

public class Day75 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a;

        char b;
        do {
            System.out.print("Masukan Nama: ");
            a = sc.nextLine();
            System.out.println("Panjang Nama: "+a.length());
            System.out.println("Huruf Besar: "+a.toUpperCase());
            System.out.println("Huruf Kecil: "+a.toLowerCase());

            System.out.print("Lagi? (y/n): ");
            b = sc.next().charAt(0);
            sc.nextLine();
        } while (b == 'y' || b == 'Y');
        System.out.println("Program selesai.");
    }
}
