import java.util.Scanner;

public class Day76 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a;
        String b;
        do {
            System.out.print("Masukan Nama: ");
            a = sc.nextLine();
            System.out.println("Nama anda 'Ade': "+a.equals("Ade"));
            System.out.println("Nama anda 'ade': "+a.equalsIgnoreCase("ade"));
            System.out.println("Mengandung kata 'de': "+a.contains("de"));
            System.out.println("Apa String kosong?: "+a.isEmpty());

            System.out.print("\nLagi? (y/n): ");
            b = sc.nextLine();
            sc.nextLine();
        } while (b.equalsIgnoreCase("y"));
        System.out.println("\nProgram selesai.");
    }
}
