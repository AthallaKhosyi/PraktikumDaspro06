import java.util.Scanner;

public class StudiKasus206 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data utama
        System.out.print("Nama mahasiswa : ");
        String nama = input.nextLine();

        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        String jenisKegiatan = input.nextLine();

        System.out.print("Jumlah dokumen : ");
        int jumlahDokumen = input.nextInt();

        // Pemilihan bersarang (Nested IF)
        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") ||
            jenisKegiatan.equalsIgnoreCase("BAKORMA") ||
            jenisKegiatan.equalsIgnoreCase("MANDIRI")) {

            System.out.print("Peringkat juara : ");
            int juara = input.nextInt();

            if (jumlahDokumen < 4) {
                int kurang = 4 - jumlahDokumen;
                System.out.println("Status : Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan.");
            } else {
                if (juara >= 1 && juara <= 3) {
                    System.out.println("Status : Dokumen lengkap. Selamat, Anda berhak mendapatkan dana penghargaan!");
                } else {
                    System.out.println("Status : Juara Harapan atau peserta tidak memperoleh dana penghargaan.");
                }
            }

        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {

            System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos) : ");
            int statusPKM = input.nextInt();

            if (jumlahDokumen < 4) {
                int kurang = 4 - jumlahDokumen;
                System.out.println("Status : Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan.");
            } else {
                if (statusPKM == 1) {
                    System.out.println("Status : Dokumen lengkap. Selamat, tim Anda lolos pendanaan dan berhak menerima dana penghargaan!");
                } else {
                    System.out.println("Status : Tim tidak lolos pendanaan, tidak memperoleh dana penghargaan.");
                }
            }

        } else {
            System.out.println("Status : Kegiatan di luar ketentuan tidak memperoleh dana penghargaan.");
        }

        input.close();
    }
}

