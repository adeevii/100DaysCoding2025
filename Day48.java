import java.util.Scanner;

public class Day48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka pertama: ");
        double a = sc.nextDouble();
        System.out.print("Masukkan angka kedua: ");
        double b = sc.nextDouble();
        System.out.print("Masukkan operasi (+, -, *, /): ");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+': System.out.println("Hasil: " + (a + b)); break;
            case '-': System.out.println("Hasil: " + (a - b)); break;
            case '*': System.out.println("Hasil: " + (a * b)); break;
            case '/': System.out.println(b != 0 ? "Hasil: " + (a / b) : "Tidak bisa bagi nol!"); break;
            default: System.out.println("Operator tidak valid!");
        }
    }
}
