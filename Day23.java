import java.util.Scanner;

public class Day23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan panjang persegi panjang : ");
        int panjang = sc.nextInt();

        System.out.print("Masukkan lebar persegi panjang : ");
        int lebar = sc.nextInt();

        int luas = panjang * lebar; //hitung luas
        System.out.println("Luas persegi panjang : " + luas);
    }
}
