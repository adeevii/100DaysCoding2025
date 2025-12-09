public class Day93 {
    public static void main(String[] args) {
        double[] angka = {2.4, 4.2};

        System.out.println("Pembulatan angka");
        for (double a : angka) {
            System.out.println("Amgka: "+a);
            System.out.println("ceil(): "+Math.ceil(a));
            System.out.println("floor(): "+Math.floor(a));
            System.out.println("round(): "+Math.round(a));
            System.out.println("--------------------------------");
        }
    }
}
