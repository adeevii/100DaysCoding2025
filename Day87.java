import java.util.Scanner;

public class Day87 {
    public static void main(String[] args) {
        int[] a = {10, 5, 12, 8, 3};
        Scanner sc = new Scanner(System.in);
        System.out.print("Angka yang dicari: ");
        int b = sc.nextInt();
        boolean c = false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == b) {
                c = true;
                System.out.println("Angka ditemukan di index-" +i);
                break;
            }

        } if (!c) {
            System.out.println("Tidak anda angka dalam array.");
        }
    }
}
