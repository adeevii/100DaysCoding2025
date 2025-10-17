import java.util.Scanner;

public class Day41 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Kalkulator Sederhana");
        System.out.println("1.Perkalian");
        System.out.println("2.Pembagian");
        System.out.println("3.Penjumlahan");
        System.out.println("4Pengurangan");
        System.out.print("Pilih : ");
        int pilih = ip.nextInt();
        System.out.print("Masukkan angka : ");
        double a = ip.nextDouble();
        System.out.print("Masukkan angka : ");
        double b = ip.nextDouble();
        if (pilih == 1) {
            double c = a * b;
            System.out.println(a + " X " + b + " : " + c);
        } else if (pilih == 2) {
            double c = a / b;
            System.out.println(a + " / " + b + " : " + c);
        } else if (pilih == 3) {
            double c = a + b;
            System.out.println(a + " + " + b + " : " + c);
        } else if (pilih == 4) {
            double c = a - b;
            System.out.println(a + " - " + b + " : " + c);
        }else{
            System.out.println("Tidak Valid");
        }
        ip.close();
    }
}
