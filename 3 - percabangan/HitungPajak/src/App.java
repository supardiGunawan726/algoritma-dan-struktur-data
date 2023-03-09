import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        NumberFormat nf = NumberFormat.getInstance(new Locale("id", "id"));

        System.out.println();
        System.out.print("Masukan penghasilan bersih (Tahunan): ");
        double penghasilanBersih = input.nextDouble();

        System.out.print("Sudah menikah (ya/tidak)?: ");
        boolean sudahMenikah = input.next().trim().equals("ya");

        // jika sudah menikah, cek apakah punya anak
        int jumlahAnak = 0;
        if (sudahMenikah){
            System.out.print("Masukan jumlah anak: ");
            jumlahAnak = input.nextInt();
        }

        double penghasilanTidakKenaPajak = hitungPTKP(penghasilanBersih, sudahMenikah, jumlahAnak);
        if (penghasilanBersih < penghasilanTidakKenaPajak){
            System.out.println("Kamu bebas pajak");
            input.close();
            return;
        }

        double penghasilanKenaPajak = penghasilanBersih - penghasilanTidakKenaPajak;
        double pajakTahunan = hitungPPH(penghasilanKenaPajak);
        System.out.println();
        System.out.println("Status: " + (sudahMenikah ? "Menikah" : "Belum menikah"));
        if (sudahMenikah){
            System.out.println("Jumlah anak: " + jumlahAnak + " anak");
        }
        System.out.println("Penghasilan bersih: " + nf.format(penghasilanBersih));
        System.out.println("Penghasilan tidak kena pajak: " + nf.format(penghasilanTidakKenaPajak));
        System.out.println("Penghasilan kena pajak: " + nf.format(penghasilanKenaPajak));
        System.out.println("Pajak tahunan: " + nf.format(pajakTahunan));
        System.out.println("Pajak perbulan: " + nf.format(pajakTahunan / 12));
        input.close();
    }

    // method untuk menghitung penghasilan tidak kena pajak
    private static double hitungPTKP(double penghasilanBersih, boolean statusNikah, int jumlahAnak){
        double wajibPajak = 54000000;
        // wajib pajak pribadi
        if (!statusNikah) return wajibPajak;

        // wajib pajak yang sudah menikah ditambah 4.5jt
        wajibPajak += 4500000;

        // maksimum anak yang dihitung wajib pajak adalah 3
        if (jumlahAnak > 3){
            jumlahAnak = 3;
        }

        // hitung tambahan wajib pajak 4.5jt per anak, maks 3 anak
        wajibPajak += jumlahAnak * 4500000;

        return wajibPajak;
    }

    // method untuk menghitung pajak penghasilan tahunan
    private static double hitungPPH(double penghasilanKenaPajak){
        double pph = 0;
        double sisa = penghasilanKenaPajak;

        // golongan pertama
        double golonganPertama = 50_000_000;
        if (penghasilanKenaPajak <= golonganPertama){
            pph += penghasilanKenaPajak * 0.05;
            return pph;
        }
        pph += golonganPertama * 0.05;
        sisa -= golonganPertama;

        // gologan kedua
        double golonganKedua = 250_000_000 - golonganPertama;
        if (sisa <= golonganKedua){
            pph += sisa * 0.15;
            return pph;
        }
        pph += golonganKedua * 0.15;
        sisa -= golonganKedua;

        // golongan ketiga
        double golonganKetiga = 500_000_000 - golonganKedua;
        if (sisa <= golonganKetiga){
            pph += sisa * 0.25;
            return pph;
        }
        pph += golonganKetiga * 0.25;
        sisa -= golonganKetiga;

        // golongan keempat
        if (sisa > 0) {
            pph += sisa * 0.5;
        }

        return pph;
    }
}
