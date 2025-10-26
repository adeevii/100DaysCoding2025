import java.util.Scanner;

public class Day49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan angka : ");
        int a = sc.nextInt();

        String b = (a % 2 == 0) ? "Genap" : "Ganjil";
        System.out.println("Bilangan "+b);
    }
}
