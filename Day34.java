public class Day34 {
    public static void main(String[] args) {
        int a = 10, b = 5, c = 10;

        //operator aritmatika
        System.out.println("a + b = "+(a+b));
        System.out.println("a - b / c = "+(a-b/c) * (a));

        //operator perbandingan
        System.out.println("a >  b "+ (a > b));
        System.out.println("a <= b "+ (a <= b));

        //operator logika
        boolean x = (a > b);   // true
        boolean y = (a == c);  // true
        boolean z = (b > a);   // false

        System.out.println("x && y = " + (x && y));
        System.out.println("x || z = " + (x || z));
        System.out.println("!z = " + (!z));

        boolean hasil = ((a + b) > c) && (a >= b) || !(a < b);
        System.out.println("Hasil kombinasi = " + hasil);
    }
}
