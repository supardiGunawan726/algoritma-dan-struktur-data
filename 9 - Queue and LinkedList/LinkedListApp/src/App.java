import java.util.Arrays;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("15");
        linkedList.add("8");
        linkedList.add("10");
        linkedList.addFirst("100");
        linkedList.add(1, "16");
        linkedList.addAll(0, Arrays.asList(new String[] {"0", "1", "2"}));
        linkedList.pop();

        for (String string : linkedList) {
            System.out.print(string + ", ");
        }
    }
}
