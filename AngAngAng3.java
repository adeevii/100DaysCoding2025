package Ang_Ang;

public class AngAngAng3 {
    public static void main(String[] args) {
        byte merah = 100;
        short hijau = 110;
        int biru = 90;

        System.out.printf("%d ", merah);
        hijau = merah;
        System.out.print("-> " +hijau+ "-> ");
        biru = hijau;
        System.out.println(biru);
    }
}
