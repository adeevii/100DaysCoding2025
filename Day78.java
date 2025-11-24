import java.util.Scanner;

public class Day78 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a;
        String b;

        do {
            System.out.print("Masukan sebuah teks: ");
            a = sc.nextLine();
            System.out.println("\n=== HASIL STRING ===");

            System.out.println("1. Panjang teks (length): " + a.length());
            System.out.println("2. Huruf kapital (toUpperCase): " + a.toUpperCase());
            System.out.println("3. Huruf kecil (toLowerCase): " + a.toLowerCase());
            System.out.println("4. Banding equals 'Halo': " + a.equals("Halo"));
            System.out.println("5. Banding equalsIgnoreCase 'halo': " + a.equalsIgnoreCase("halo"));
            System.out.println("6. Mengandung kata 'a' (contains): " + a.contains("a"));
            System.out.println("7. Apakah kosong? (isEmpty): " + a.isEmpty());

            if (a.length() >= 3) {
                System.out.println("8. substring(0,3): " + a.substring(0, 3));
            } else {
                System.out.println("8. (substring) Teks kurang dari 3 karakter");
            }

            System.out.println("9. Replace 'a' → 'o': " + a.replace("a", "o"));
            System.out.println("10. Trim (hapus spasi awal & akhir): '" + a.trim() + "'");

            if (!a.isEmpty()) {
                System.out.println("11. Karakter pertama (charAt(0)): " + a.charAt(0));
            } else {
                System.out.println("11. charAt: Teks kosong");
            }

            System.out.println("12. Dimulai dengan 'A' (startsWith): " + a.startsWith("A"));
            System.out.println("13. Diakhiri dengan 'n' (endsWith): " + a.endsWith("n"));

            System.out.print("\nCoba lagi? (y/n): ");
            b = sc.nextLine();

        } while (b.equalsIgnoreCase("y"));

        System.out.println("\nProgram selesai.");
    }
}
