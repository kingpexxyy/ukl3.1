package ukl;
import java.util.Scanner;

public class ratanilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int jumlahsiswa = input.nextInt();

        double totalnilai = 0;

        for (int i = 1; i <= jumlahsiswa; i++) {
            System.out.print("Masukkan nilai siswa ke-" + i + ": ");
            double nilai = input.nextDouble();
            totalnilai += nilai;
        }

        double ratarata = totalnilai / jumlahsiswa;

        System.out.println("\n=== Hasil Rekapitulasi Nilai ===");
        System.out.println("Jumlah siswa : " + jumlahsiswa);
        System.out.println("Total nilai  : " + totalnilai);
        System.out.println("Nilai rata-rata : " + ratarata);

        input.close();
    }
}
