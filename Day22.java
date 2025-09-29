import java.util.Scanner;

public class Day22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan panjang persegi : ");

        int sisi = sc.nextInt();
        int luas = sisi * sisi; //hitung luas
        System.out.println("Luas persegi : " + luas);
    }
}
