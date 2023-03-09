import java.util.Scanner;

public class IndexNilai {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Masukan nilai: ");
    
    int nilai = input.nextInt();
    String index;

    if (nilai >= 75){
      index = "A";
    }else if (nilai >= 65){
      index = "B";
    }else if (nilai >= 55){
      index = "C";
    }else {
      index = "D";
    }

    System.out.println("Index nilai dari " + nilai + ", adalah: " + index);

    input.close();
  }
}
