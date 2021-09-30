package pl.marcinblok.array;

public class Main {
    public static void main(String[] args) {

        ArrayExample arrayExample = new ArrayExample(3);
        arrayExample.insert(10);
        arrayExample.insert(20);
        arrayExample.insert(30);
        arrayExample.insert(40);
        arrayExample.insert(50);
        arrayExample.insert(60);
        arrayExample.insert(70);
        arrayExample.removeAt(3);
        System.out.println(arrayExample.getCount());
        arrayExample.print();
        System.out.println(arrayExample.indexOf(100));


    }
}
