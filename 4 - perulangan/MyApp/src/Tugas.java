public class Tugas {
  public static void main(String[] args){
    nomer1();
    nomer2();
    nomer3();
    nomer4();
    nomer5();
    nomer6();
  }

  private static void nomer1(){
    System.out.println("\nNomer 1)");
    for(int i = 1; i<=11; i++){
      if (i % 2 == 1){
        System.out.print(i+" ");
      }
    }
  }

  private static void nomer2(){
    System.out.println("\n\nNomer 2)");
    for (int i = 20; i >= 0;i -= 5){
      System.out.print(i+" ");
    }
  }

  private static void nomer3(){
    System.out.println("\n\nNomer 3)");
    int a = 0;
    int b = 1;
    int c = a + b;
    System.out.print(a + " " + b + " ");
    for (int i = 1; c < 13; i++){
      c = a + b;
      System.out.print(c + " ");
      a = b;
      b = c;
    }
  }

  private static void nomer4(){
    System.out.println("\n\nNomer 4)");
    int a = 1;
    int b = 2;
    int c = 3;
    int d = a + b + c;
    System.out.print(a + " " + b + " " + c + " ");
    for (int i = 1; c < 37; i++){
      d = a + b + c;
      System.out.print(d + " ");
      a = b;
      b = c;
      c = d;
    }
  }

  private static void nomer5(){
    System.out.println("\n\nNomer 5)");
    for (int a = 1; a <= 3; a++){
      for (int b = a; b <= a + 3; b++){
        System.out.print(b+" ");
      }
      System.out.println();
    }
  }

  private static void nomer6(){
    System.out.println("\n\nNomer 6)");
    for (int a = 3; a <= 5; a++){
      for (int b = a - 1; b <= a + 1; b++){
        System.out.println(a + " * " + b + " = " + (a * b));
      }
    }
  }
}
