import java.util.Scanner;

public class Day43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan Bilangan : ");
        int a = sc.nextInt();

        if (a % 3 == 0)
            System.out.println("Kelipatan 3");
        if (a % 5 == 0)
            System.out.println("Kelipatan 5");
        if (a % 3 != 0 && a % 5 != 0)
            System.out.println("Bukan kelipatan 3 ataupun 5");
    }
}
