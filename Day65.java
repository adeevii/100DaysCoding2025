import java.util.Scanner;

public class Day65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan bilangan: ");
        int a = sc.nextInt();

        int hasil = 1;
        for (int i = 1; i <= a; i++) {
            hasil *= i;
        }

        System.out.println("Faktorial dari "+a + " adalah: "+hasil);
    }
}
