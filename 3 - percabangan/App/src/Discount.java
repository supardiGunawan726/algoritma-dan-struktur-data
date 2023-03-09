import java.util.Scanner;

public class Discount {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Masukan total belanja: ");
    double total = input.nextDouble();
    double discount = 0;

    if (total >= 100000){
        discount = 0.05 * total;
        total = total - discount;
        System.out.println(discount);
    }

    System.out.println("Total bayar: " + total);
    input.close();
}
}
