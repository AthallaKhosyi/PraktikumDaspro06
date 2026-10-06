import java.util.Scanner;

public class StudiKasus1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Deklarasi
        int hargaPerCup = 18000;
        int jumlahCup, uangBayar;
        int totalHarga, diskon, totalBayar;
        int kembalian, kurang;

        // Input data
        System.out.print("Masukkan jumlah cup : ");
        jumlahCup = input.nextInt();

        System.out.print("Masukkan uang bayar : ");
        uangBayar = input.nextInt();

        // Hitung total harga awal dan set diskon awal
        totalHarga = jumlahCup * hargaPerCup;
        diskon = 0;

        // Cek diskon minimal total belanja 100.000 diskon 10%
        if (totalHarga >= 100000) {
            diskon = totalHarga * 10 / 100;
        }

        // Hitung total yang harus dibayar
        totalBayar = totalHarga - diskon;

        // Tampilkan ringkasan total dan diskon
        System.out.println("Total harga         : Rp " + totalHarga);
        System.out.println("Diskon              : Rp " + diskon);
        System.out.println("Total bayar         : Rp " + totalBayar);

        // Cek kecukupan pembayaran
        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian           : Rp " + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang tidak cukup, kurang Rp " + kurang);
        }

        input.close();
    }
}