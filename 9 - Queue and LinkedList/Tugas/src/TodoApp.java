import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.io.Console;
import java.text.DateFormat;
import java.util.ArrayDeque;
import java.util.Calendar;
import java.util.Queue;

public class TodoApp {
  Queue<Task> tasks;
  Queue<Task> finishedTasks;

  TodoApp(){
    tasks = new ArrayDeque<Task>();
    finishedTasks = new ArrayDeque<Task>();
  }

  void run(){
    Console console = System.console();

    while(true){
      System.out.print("\033[H\033[2J");  
      System.out.flush();  
      printTasks();

      System.out.println("1. Add task");

      if (tasks.size() > 0) {
        Task lastTask = tasks.peek();
        System.out.println("2. Do first undone task " + "(" + lastTask.name + ")");
      }

      System.out.println("0. Exit");

      String input = console.readLine("input: ");
      
      if (input.equals("1")){
        String taskName = console.readLine("Task name: ");
        String[] taskDue = console.readLine("Task due time (HH:MM): ").split(":");

        Calendar calendar = GregorianCalendar.getInstance();
        calendar.setTime(new Date());
        calendar.set(Calendar.HOUR_OF_DAY, Integer.parseInt(taskDue[0]));
        calendar.set(Calendar.MINUTE, Integer.parseInt(taskDue[1]));
        calendar.set(Calendar.SECOND, 0);
        
        addTask(taskName, calendar.getTime());
      }else if (input.equals("2")){
        doTask();
      }else if (input.equals("0")){
        break;
      }
    }
  }

  void addTask(String name){
    tasks.add(new Task(name, new Date()));
  }

  void addTask(String name, Date dueTime){
    tasks.add(new Task(name, dueTime));
  }

  void doTask(){
    Task task = tasks.poll();

    task.isDone = true;
    System.out.println(task.name + " is done");
    finishedTasks.add(task);
  }

  void printTasks(){
    Locale locale = new Locale("id", "ID");
    DateFormat dateFormat = DateFormat.getTimeInstance(DateFormat.DEFAULT, locale);

    System.out.println("==================Task==================");
    System.out.println("Name\t\tDue time\tStatus");

    if (tasks.size() + finishedTasks.size() < 1){
      System.out.println("\t\tTask is empty");
    }

    for (Task task : finishedTasks) {
      System.out.print(task.name + "\t" + dateFormat.format(task.dueDate) + "\t" + "Done");
      System.out.println();
    }

    for (Task task : tasks) {
      System.out.print(task.name + "\t" + dateFormat.format(task.dueDate) + "\t" + "Undone");
      System.out.println();
    }
  }


}

class Task {
  String name;
  Date dueDate;
  boolean isDone = false;

  Task(String name, Date dueDate){
    this.name = name;
    this.dueDate = dueDate;
  }

  void done(){
    this.isDone = true;
  }
}