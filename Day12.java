import java.util.Scanner;
public class Day12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("BIODATA DIRI");
        System.out.println("--------------------------");
        System.out.print("Masukan Nama : ");
        final String nm = sc.nextLine();
        System.out.print("Masukan Alamat : ");
        String almt =sc.nextLine();
        System.out.print("Masukan Umur : ");
        int umur = sc.nextInt();
        System.out.print("Masukkan Gender L/P: ");
        char gender = sc.next().charAt(0);
        System.out.print("Masukkan Tinggi : ");
        double tg =sc.nextDouble();
        System.out.print("Berat Badan : ");
        float br = sc.nextFloat();
        System.out.println("--------------------------");
        System.out.println("Nama \t\t: "+nm);
        System.out.println("Alamat \t\t: "+almt);
        System.out.println("Umur\t\t: "+umur+" thn");
        System.out.println("Gender\t\t: "+gender);
        System.out.println("Tinggi Badan: "+tg+" cm");
        System.out.println("Berat Badan\t: "+br+" Kg");

    }
}
