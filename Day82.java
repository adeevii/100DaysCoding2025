import java.util.Scanner;

public class Day82 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan jumlah Array: ");
        int a  = sc.nextInt();

        int[] angka = new int[a];
        System.out.println("\nMasukan Array: ");
        for (int i = 0; i < a; i++) {
            System.out.print("Elemen ke-" + i + ": ");
            angka[i] = sc.nextInt();

        }
        System.out.println("\nIsi Array yang sudah dimasukan: ");
        for (int i = 0; i < angka.length; i++) {
            System.out.println("Index: "+ i +" = "+ angka[i]);

        }
    }
}
