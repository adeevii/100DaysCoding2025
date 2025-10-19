import java.util.Scanner;

public class Day42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan gaji pokok : ");
        double gaji = sc.nextDouble();

        System.out.print("Masukan tunjangan : ");
        double tunjangan = sc.nextDouble();

        System.out.print("Masukan potongn : ");
        double potongan = sc.nextDouble();

        double gajiBersih = gaji + tunjangan - potongan;
        System.out.println("\nGaji bersih : Rp "+gajiBersih);
    }
}
