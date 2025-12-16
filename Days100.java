import java.util.Scanner;

public class Days100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] data = new String[10];
        int jumlah = 0;
        int pilihan;

        do {
            System.out.println("\n=== MENU CRUD ARRAY ===");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampilkan Data");
            System.out.println("3. Ubah Data");
            System.out.println("4. Hapus Data");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    if (jumlah < data.length) {
                        System.out.print("Masukkan nama: ");
                        data[jumlah] = sc.nextLine();
                        jumlah++;
                        System.out.println("Data berhasil ditambahkan");
                    } else {
                        System.out.println("Array penuh");
                    }
                    break;

                case 2:
                    System.out.println("\nData yang tersimpan:");
                    if (jumlah == 0) {
                        System.out.println("Belum ada data");
                    } else {
                        for (int i = 0; i < jumlah; i++) {
                            System.out.println((i + 1) + ". " + data[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Pilih nomor data yang ingin diubah: ");
                    int ubah = sc.nextInt();
                    sc.nextLine();

                    if (ubah > 0 && ubah <= jumlah) {
                        System.out.print("Masukkan data baru: ");
                        data[ubah - 1] = sc.nextLine();
                        System.out.println("Data berhasil diubah");
                    } else {
                        System.out.println("Nomor tidak valid");
                    }
                    break;

                case 4:
                    System.out.print("Pilih nomor data yang ingin dihapus: ");
                    int hapus = sc.nextInt();

                    if (hapus > 0 && hapus <= jumlah) {
                        for (int i = hapus - 1; i < jumlah - 1; i++) {
                            data[i] = data[i + 1];
                        }
                        jumlah--;
                        System.out.println("Data berhasil dihapus");
                    } else {
                        System.out.println("Nomor tidak valid");
                    }
                    break;

                case 5:
                    System.out.println("Program selesai");
                    break;

                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (pilihan != 5);
    }
}
