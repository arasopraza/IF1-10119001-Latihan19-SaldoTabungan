import java.text.NumberFormat;
import java.util.Locale;
/**
 *
 * @author
 * NAMA     : Arsy Opraza Akma
 * KELAS    : IF1
 * NIM      : 10119001
 * Deskripsi Program: Program ini menampilkan saldo tabungan
 * sesuai dengan bunga per bulan
 *
 */

public class SaldoTabungan {
    public static void main(String[] args) {
        int saldoAwal, lamaNabung, i;
        double bungaPerBulan;

        bungaPerBulan = 0.15;
        lamaNabung = 6;
        i = 1;
        saldoAwal = 2500_000;

        do {
            saldoAwal = (int) (saldoAwal + (saldoAwal * bungaPerBulan));
            NumberFormat numberFormat = NumberFormat.getInstance(new Locale("id", "ID"));
            System.out.println("Saldo di bulan ke-" + i + " Rp." + numberFormat.format(saldoAwal));
            i++;
        } while (i <= lamaNabung);
    }
}