import java.util.Arrays;

public class ImplementStackUsingArrays {
    public static void main(String arg[]) {
        Stack obj = new Stack();
        System.out.println((("Is Stack empty : " + Boolean.toString(obj.isEmpty()))));
        obj.push(45);
        obj.push(4);
        obj.push(4895);
        obj.push(7);
        obj.peek();
        obj.pop();
        System.out.println((("Is Stack empty : " + Boolean.toString(obj.isEmpty()))));
        System.out.println("Stack : "+obj.toString());
    }

    public static class Stack {
        int max = 5;
        int top = -1;
        int num[] = new int[max];

        public Stack() {
            top = -1;
        }

        public int pop() {
            int deletedElement = 0;
            if (top == -1) {
                System.out.println("Can't pop, stack is empty");
            } else {
                deletedElement = num[top];
                num[top--] = 0;
                System.out.println(deletedElement+" deleted from Stack");
            }
            return deletedElement;

        }

        public boolean push(int x) {
            if (max == 0){
                System.out.println("Can't push, stack with length 0");
                return false;
            } else if (top == max-1) {
                System.out.println("Can't push, stack is already full");
                return false;
            } else {
                num[++top] = x;
                System.out.println(+num[top]+" pushed into Stack");
                return true;
            }
        }

        public int peek() {
            if (top == -1) {
                System.out.println("Peeked but stack is empty");
                return 0;
            } else {
                System.out.println(num[top]+" is at the top of Stack");
                return num[top];
            }
        }

        public boolean isEmpty() {
            return top < 0;
        }

        @Override
        public String toString() {
            return Arrays.toString(num);
        }
    }
}