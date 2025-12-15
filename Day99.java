import java.util.Scanner;

public class Day99 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan nilai: ");
        int n = sc.nextInt();

        System.out.print("Deretan bilangan prima dari 1 sampai "+n+ ": ");
        for (int i = 2; i <= n; i++) {
            boolean a = true;

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    a = false;
                    break;
                }
            }
            if (a) {
                System.out.print(i + " ");
            }
        }
    }
}
