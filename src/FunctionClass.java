import java.util.LinkedList;

public class FunctionClass {
    LinkedList<Integer> stack = new LinkedList<>();

    public void insert(int data) {
        stack.addFirst(data);
    }

    public void peek() {
        System.out.println("stack list in the peek is :" + stack.peek());
    }

    public void pop() {
        if (stack.size() == 0) {
            System.out.println("List is empty");
        } else {
            stack.pop();
        }
    }

    public void toPrint() {
        System.out.println("Stack list is :");
        for (Integer i : stack) {
            System.out.println(" " + i);
        }
    }
}
