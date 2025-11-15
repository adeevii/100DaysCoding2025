package Evaluasi;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i = 0; i < a; i++) {
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int e = sc.nextInt();

            if (b == c && c == d && d == e) {
                System.out.println("Persegi");
            } else {
                System.out.println("Tidak mungkin");
            }
        }
    }
}
