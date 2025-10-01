import java.util.Scanner;

public class Day24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jari-jari lingkaran = ");
        double r = sc.nextDouble();

        double pi = 3.14;
        double luas = pi * r * r;
        System.out.println("Luas lingkaran = "+ luas);
    }
}
