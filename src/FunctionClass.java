import java.util.LinkedList;

public class FunctionClass {
    LinkedList<Integer> stack = new LinkedList<>();

    public void insert(int data) {
        stack.addFirst(data);
    }

    public void toPrint() {
        System.out.println("Stack list is :");
        for (Integer i : stack) {
            System.out.println(" " + i);
        }
    }
}
