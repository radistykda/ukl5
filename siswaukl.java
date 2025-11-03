import java.util.Scanner;

public class siswaukl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Jumlah Siswa: ");
        int jumlahsiswa = input.nextInt();

        double totalnilai = 0;

        for (int i = 1; i <= jumlahsiswa; i++) {
            System.out.print("Masukkan Nilai Siswa ke-" + i + ": ");
            double nilai = input.nextDouble();
            totalnilai += nilai;
        }

        double ratarata = totalnilai / jumlahsiswa;
        System.out.println(" ");
        System.out.println("Jumlah Siswa: " + jumlahsiswa);
        System.out.println("Total Nilai: " + totalnilai);
        System.out.println("Nilai Rata-Rata Siswa: " + ratarata);

        input.close();

    }
}