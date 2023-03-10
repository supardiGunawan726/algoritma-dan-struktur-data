import java.util.Scanner;

public class WhileLoop {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    int pilihan = 0;

    do {
      // clear terminal
      System.out.print("\033[H\033[2J");  
      System.out.flush();  

      System.out.println("1. Input Data");
      System.out.println("2. Lihat \nData");
      System.out.println("3. Keluar");
      System.out.print("Pilih menu: ");
      pilihan = scanner.nextInt();
    } while (pilihan != 3);

    scanner.close();
  }
}
