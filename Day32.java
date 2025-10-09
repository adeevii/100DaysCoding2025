public class Day32 {
    public static void main(String[] args) {
        int nilai = 85;
        int absensi = 90;   

        System.out.println("Nilai siswa : "+nilai);
        System.out.println("Presentase kehadiran : "+absensi+"%");
        boolean hasil = (nilai >= 75) || (absensi >= 80);
        System.out.println("Apakah siswa lulus? : "+hasil);
    }
}
