import java.util.Scanner;

public class Day98 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan jumlah nilai: ");
        int n = sc.nextInt();
        int a = 1;
        int b = 1;

        System.out.println("Deretan fibonacci: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(" "+a);

            int c = a + b;
            a = b;
            b = c;
        }
    }
}
