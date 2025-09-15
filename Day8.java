public class Day8 {
   public static void main(String[] args) {
     String nama = "Yiran";
     String pesan = "Halo, selamat datang";

     System.out.println("Nama : " + nama);
     System.out.println("Pesan : " + pesan);  

   //menggabungkan String
     String gabungan = pesan + " " + nama;
     System.out.println("Gabungan : " + gabungan);

     //menghitung panjang text
     System.out.println("Panjang nama : " + nama.length());

     //mengambil karakter tertentu (indexnya dimulai dari 0)
     System.out.println("Huruf pertama dari nama : " + nama.charAt(0));

     //mengubah huruf menjadi besar
     System.out.println("Huruf besar : " + nama.toUpperCase());

     //huruf kecil
     System.out.println("Huruf kecil : " + nama.toLowerCase());
   }
}
