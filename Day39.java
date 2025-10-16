package pkg100h_ngoding;

import java.util.Scanner;

public class day39 {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("================================");
        System.out.println("|          Daftar Menu          |");
        System.out.println("================================");
        System.out.println("1.Bakso Biasa");
        System.out.println("2.Bakso Beranak");
        System.out.println("3.Mie Pangsit Bakso");
        System.out.println("4.Bakso Mercon");
        System.out.print("Pilih :");
        int pilih = ip.nextInt();
         System.out.println("================================");
        if (pilih == 1) {
            System.out.println("Anda Memilih Bakso Biasa");
        }else if(pilih ==2 ){
            System.out.println("Anda Memilih Bakso Beranak");
        }else if(pilih ==3 ){
            System.out.println("Anda Memilih Mie Pangsit Bakso");
        }else if(pilih ==4 ){
            System.out.println("Anda Memilih Bakso Mercon");
        }else{
            System.out.println("Input Tidak Valid");
        }
         System.out.println("================================");
       ip.close();
    }
}
