package pl.marcinblok.array;

public class ArrayExample {

    private int[] array;
    private int count;

    ArrayExample(int length) {
        array = new int[length];
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(array[i]);
        }
    }

    // If array is full -> resize it
    // add the new item at the end
    public void insert(int item) {
        if (array.length == count) {
            // Create a new array (twice the size)
            int[] newArray = new int[count * 2];
            // Copy all the existing items into a new array
            for (int i = 0; i < count; i++) {
                newArray[i] = array[i];
            }
            // Set array to newArray
            array = newArray;

        }
        array[count++] = item;

    }

    public void removeAt(int index) {
        // Validate index
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException();
        } else {
            // Shift the items to the left to fill the hole
            for (int i = index; i < count-1; i++) {
                array[i] = array[i + 1];
            }
            count--;
        }
    }


    // If we find return index
    // otherwise return -1
    public int indexOf(int value) {
        for (int i = 0; i < count; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public int getCount() {
        return count;
    }
}
