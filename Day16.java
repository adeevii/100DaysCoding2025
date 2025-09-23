import java.util.Scanner;

public class Day16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan nilai a : ");
        double a = sc.nextDouble();

        System.out.print("Masukan nilai b : ");
        double b = sc.nextDouble();

        System.out.print("Masukan nilai c : ");
        double c = sc.nextDouble();

        double hasil = a * b / c;
        System.out.println("Hasil : " + hasil);
    }
}
