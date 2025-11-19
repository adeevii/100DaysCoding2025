import java.util.Scanner;

public class Day73 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int b;
        int c = 0;

        System.out.print("Masukan angka: ");
        b = a.nextInt();

        while (b >= 0) {
            c += b;
            System.out.print("Masukan angka: ");
            b = a.nextInt();

        }
        System.out.println("\nProgram berhenti karena anda memasukan angka negatif.");
        System.out.println("Total: "+c);
    }
}
