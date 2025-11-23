import java.util.Scanner;

public class Day77 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a;
        String b;

        do {
            System.out.println("Masukan Nama: ");
            a = sc.nextLine();
            System.out.println("\nHasil String");

            if (a.length() >= 3) {
                System.out.println("Substring (0-3): "+a.substring(0, 3));
            } else {
                System.out.println("Nama terlalu pendek masukan minimal 3 huruf.");
            }
            System.out.println("(Replace) Ganti a dengan 'c': "+a.replace("a", "c"));
            System.out.println("(Trim) Hapus spasi di awal & akhir: "+a.trim()+" ");
            System.out.print("\nCoba lagi? (y/n): ");
            b = sc.nextLine();
        } while (b.equalsIgnoreCase("y"));
        System.out.println("\nProgram Selesai.");
    }
}
