import java.util.Scanner;

public class Day56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;

        do {
            System.out.print("Masukan angka : ");
            a = sc.nextInt();
            System.out.println("Kamu memasukan : "+a);
        }while (a != 0);
        System.out.println("Program selesai");
    }
}
