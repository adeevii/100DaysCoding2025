package Ang_Ang;

public class AngAngAng2 {
    public static void main(String[] args) {
        int gelas_a = 16;
        int gelas_b = 90;
        int gelas_c = 76;
        int gelas_d = gelas_a;
        System.out.println("Sebelum di shuffle A = "+gelas_a+","+" B = "+gelas_b+","+" C = "+gelas_c);
        gelas_a = gelas_c ;
        gelas_c = gelas_b;
        gelas_b = gelas_d;
        System.out.println("setelah di shuffle A = "+gelas_a+","+" B = "+gelas_b+","+" C = "+gelas_c);
    }

}