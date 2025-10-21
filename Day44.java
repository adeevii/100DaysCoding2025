import java.util.Scanner;

public class Day44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan nilai : ");
        int nilai = sc.nextInt();

        if (nilai >= 85)
            System.out.println("Prediksi nilai: A ");
        else if (nilai >= 70) 
            System.out.println("Prediksi nilai: B ");
        else if (nilai >= 55)
            System.out.println("Prediksi nilai: C ");
        else if (nilai >= 40)
            System.out.println("Prediksi nilai: D ");
        else
            System.out.println("Prediksi nilai: E");
    }
}
