import java.io.Console;

public class App {
  public static void main(String[] args){
    Console console = System.console();
    TodoApp todoApp = new TodoApp();

    System.out.println("Pilih program: ");
    System.out.println("1. Todo app");
    System.out.println("2. Zakat app (LinkedList)");
    System.out.println("3. Exit");

    String input = console.readLine("Input: ");
    if (input.equals("3")) return;

    if (input.equals("1")){
      System.out.print("\033[H\033[2J");  
      System.out.flush();  
      todoApp.run();
    }else if (input.equals("2")){

    }

  }
}
