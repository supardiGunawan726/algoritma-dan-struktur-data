public class Latihan {
  public static void main(String[] args){
    System.out.println();
    System.out.println("====================");
    System.out.println("Latihan loop pertama");

    for (int i = 1; i <= 3; i++){
      for (int j = 1; j <= 5; j++){
        System.out.print(i+" ");
      }
      System.out.println();
    }

    System.out.println();
    System.out.println("====================");
    System.out.println("Latihan loop kedua");

    for (int i = 1; i <= 3;i++){
      for (int j = 1; j <= 4;j++){
        if (j % 2 == 0){
          System.out.print("O ");
        }else{
          System.out.print("X ");
        }
      }
      System.out.println();
    }

    System.out.println();
    System.out.println("====================");
    System.out.println("Latihan loop ketiga");

    for (int i = 1; i <= 4; i++){
      for (int j = 1; j <=4; j++){
        if (i % 2 == j % 2){
          System.out.print("X ");
        }else{
          System.out.print("O ");
        }
      }
      System.out.println();
    }

    System.out.println();
    System.out.println("====================");
    System.out.println("Latihan loop keempat");

    for (int i = 1; i <= 3; i++){
      for (int j = 1; j <= 4 - i; j++){
        System.out.print("* ");
      }
      System.out.println();
    }

    System.out.println();
    System.out.println("====================");
    System.out.println("Latihan loop keempat cara 2");

    for (int i = 3; i >= 1; i--){
      for (int j = 1; j <= i; j++){
        System.out.print("* ");
      }
      System.out.println();
    }
  }


  
}
