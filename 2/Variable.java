public class Variable {
  public static void main(String args[]){
    int panjang, lebar, luas;

    panjang = 10;
    lebar = 20;

    luas = panjang * lebar;

    System.out.println(luas);


    System.out.println("============INTEGER============");
    System.out.println(Integer.MAX_VALUE);
    System.out.println(Integer.MIN_VALUE);

    System.out.println("============DOUBLE============");
    System.out.println(Double.MAX_VALUE);
    System.out.println(Double.MIN_VALUE);

    System.out.println("============LONG============");
    System.out.println(Long.MAX_VALUE);
    System.out.println(Long.MIN_VALUE);

    System.out.println("============FLOAT============");
    System.out.println(Float.MAX_VALUE);
    System.out.println(Float.MIN_VALUE);

    System.out.println("============BOOLEAN============");
    boolean varA = false;
    boolean varB = true;
    boolean hasilDari = varA && varB;
    System.out.println(hasilDari);

    System.out.println("============STRING============");
    String strA = "abc";
    String strB = "abc";
    System.out.println(strA == strB);

    System.out.println("============ARRAY============");
    String[] arrA = {"Supardi", "Gunawan"};
    String[] arrB = {"Supardi", "Gunawan"};
    System.out.println(arrA == arrB); // false
    System.out.println(arrA.equals(arrB)); // false
  }
}
