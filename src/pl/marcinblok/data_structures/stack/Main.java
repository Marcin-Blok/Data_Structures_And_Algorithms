package pl.marcinblok.data_structures.stack;

public class Main {
    public static void main(String[] args) {
        StackBasedOnArray stackBasedOnArray = new StackBasedOnArray(5);

        System.out.println("Is the stack full? " + stackBasedOnArray.isFull());
        stackBasedOnArray.push(1);
        stackBasedOnArray.push(2);
        stackBasedOnArray.push(3);
        stackBasedOnArray.push(4);
        stackBasedOnArray.push(5);
        stackBasedOnArray.push(6);
        System.out.println(stackBasedOnArray.peek());
        System.out.println(stackBasedOnArray.peek());

        System.out.println(stackBasedOnArray.pop());
        System.out.println(stackBasedOnArray.pop());
        System.out.println(stackBasedOnArray.pop());
        System.out.println(stackBasedOnArray.pop());
        System.out.println(stackBasedOnArray.pop());
        System.out.println(stackBasedOnArray.pop());

        stackBasedOnArray.deleteStack();

    }
}
