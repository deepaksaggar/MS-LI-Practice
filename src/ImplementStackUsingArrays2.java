import java.util.Arrays;
import java.util.EmptyStackException;

public class ImplementStackUsingArrays2 {
    public static void main(String arg[]) {
        Stack obj = new Stack();
        System.out.println((("Is Stack empty : " + Boolean.toString(obj.isEmpty()))));
        obj.push("45");
        obj.push("4");
        obj.push("4895");
        obj.push("7");
        obj.peek();
        obj.pop();
        obj.pop();
        System.out.println((("Is Stack empty : " + Boolean.toString(obj.isEmpty()))));
    }

    public static class Stack {
        int elementCount = 0;
        int len = 2;
        String data[] = new String[len];

        public String peek() {
            if (isEmpty()) {
                throw new EmptyStackException();
            }
            System.out.println("peek : " + data[elementCount - 1]);
            return data[elementCount - 1];
        }

        public void push(String ele) {
            if (elementCount == data.length) {
                data = Arrays.copyOf(data, data.length + 1);
                len++;
            }
            data[elementCount++] = ele;
            System.out.println("push : " + Arrays.toString(data));
        }

        public String pop() {
            String ele = peek();
            data[--elementCount] = null;
            System.out.println("pop : " + Arrays.toString(data));
            return ele;
        }

        public Boolean isEmpty() {
            return elementCount == 0;
        }
    }
}