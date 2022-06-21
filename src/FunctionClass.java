import java.util.LinkedList;

public class FunctionClass {
    LinkedList<Integer> queue = new LinkedList<>();

    public void enQueue(int data) {
        queue.add(data);

    }

    public void deQueue() {
        if (queue.size() == 0) {
            System.out.println("Queue list is empty");
        } else {
            queue.pop();
        }
    }
    public void toPrint() {
        System.out.println("Stack list is :");
        for (Integer i : queue) {
            System.out.println(" " + i);
        }
    }
}
