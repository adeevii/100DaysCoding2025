import java.util.Scanner;

public class Day45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan nilai A-E: ");
        char nilai = sc.next().toUpperCase().charAt(0);

        switch (nilai) {
            case 'A' :
                System.out.println("Sangat baik");
                break;
            case 'B' :
                System.out.println("Baik");
                break;
            case 'C' :
                System.out.println("Cukup baik");
                break;
            case 'D' :
                System.out.println("Kurang baik");
                break;
            case 'E' :
                System.out.println("Sangat kurang");
                break;
        }
    }
}
