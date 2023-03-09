import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class GajiBulanan {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    NumberFormat nf = NumberFormat.getInstance(new Locale("id", "id"));

    System.out.print("Masukan gaji pokok: ");
    double gajiPokok = input.nextDouble();

    System.out.print("Masukan lama jam lembur: ");
    int lembur = input.nextInt();

    System.out.print("Masukan bonus: ");
    double bonus = input.nextDouble();

    final double upahLembarPerJam = ((double)(1) / 173) * gajiPokok;
    double totalUpahLembur;

    if (lembur > 5){
      totalUpahLembur = (5 * 1.5 * upahLembarPerJam);
      totalUpahLembur += (lembur - 5) * 2 * upahLembarPerJam;
    } else {
      totalUpahLembur = lembur * 1.5 * upahLembarPerJam;
    }

    double gajiBulanan = gajiPokok + totalUpahLembur + bonus;
    System.out.println("Lama lembur: " + lembur + " jam");
    System.out.println("Total upah lembur: " + nf.format(totalUpahLembur));
    System.out.println("Total bonus: " + nf.format(bonus));
    System.out.println("Total gaji bulanan: " + nf.format(gajiBulanan));

    input.close();
  }
}
