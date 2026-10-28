import java.util.*;
public class StackQueue{
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(90);
        System.out.println("popped element: "+s.pop());

        Queue<Integer> l = new LinkedList<>();
        l.add(23);
        l.add(54);
        System.out.println("removed element: "+l.remove());

    }

}