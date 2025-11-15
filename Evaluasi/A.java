package Evaluasi;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i = 1; i <= a; i++) {
            int b = sc.nextInt();
            if (b%3 == 0) {
                System.out.println(0);
            } else if ((b % 3) == 1) {
                System.out.println(2);
            } else if (b % 3 == 2){
                System.out.println(1);
            }
        }
    }
}
