public class Day95 {
    static void cetak(String a, int b){
        for (int i = 0; i <= b ; i++) {
            System.out.println(i + ", "+a);
        }
    }
    public static void main(String[] args) {
        cetak("Halooo!", 2);
        cetak("Haiii!", 3);
    }
}
