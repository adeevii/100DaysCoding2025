public class Day81 {
    public static void main(String[] args) {
        int[] a = {10, 8, 0, 15, 2};
        System.out.println("Isi Array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println("Index "+ i + " = "+ a[i]);

        }
        System.out.println("\nAkses elemen tertentu: ");
        System.out.println("Elemen pertama: "+a[0]);
        System.out.println("Elemen ketiga: "+a[2]);
        System.out.println("Elemen terakhir: "+a[a.length - 1]);
    }
}
