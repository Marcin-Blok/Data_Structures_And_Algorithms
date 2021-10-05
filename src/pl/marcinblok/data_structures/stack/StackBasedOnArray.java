package pl.marcinblok.data_structures.stack;

public class StackBasedOnArray {

    private int[] array;
    private int topOfStack;

    StackBasedOnArray(int size) {
        array = new int[size];
        topOfStack = -1;
        System.out.println("The Stack has been created with size of: " + size);
    }

    public boolean isEmpty() {
        if (topOfStack == -1) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if (topOfStack == array.length - 1) {
            System.out.println("The Stack is full!");
            return true;
        }
        return false;
    }

    public void push(int value) {
        if (isFull()) {
        } else {
            array[++topOfStack] = value;
            System.out.println("Value has been successfully inserted.");
            //   System.out.println(topOfStack);
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.print("The Stack is empty! ");
            return -1;
        } else {
            int i = array[topOfStack];
            System.out.print("Value removed from the stack ");
            topOfStack--;
            return i;
        }
    }

    public int peek(){
        if (isEmpty()){
            System.out.println("The Stack is empty!");
            return -1;
        }else {
            return array[topOfStack];
        }
    }

    public void deleteStack(){
        array = null;
    }
}
