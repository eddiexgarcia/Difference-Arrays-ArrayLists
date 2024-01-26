// Importing the ArrayList class from the java.util package.
// ArrayList is a dynamic array implementation provided by Java Collections Framework.
import java.util.ArrayList;

public class DifferenceArraysArrayLists {
    public static void main(String[] args) {
        // Arrays
        // Creating an array of integers with a fixed size of 5.
        int[] array = new int[5];
        
        // Initializing the first two elements of the array.
        array[0] = 1;
        array[1] = 2;

        // ArrayLists
        // Creating an ArrayList to store integers dynamically.
        // The ArrayList class is part of the Java Collections Framework.
        // The angle brackets (<>) denote the type of elements the ArrayList will hold.
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        // Adding elements to the ArrayList.
        // The add() method is used to append elements to the end of the list.
        arrayList.add(1);
        arrayList.add(2);

        // Print elements and sizes
        // Displaying elements and sizes of both the array and ArrayList.
        System.out.println("Array Elements: " + array[0] + ", " + array[1] +
                "\nArrayList Elements: " + arrayList.get(0) + ", " + arrayList.get(1));

        // Displaying the sizes of both the array and ArrayList.
        System.out.println("Array Size: " + array.length +
                "\nArrayList Size: " + arrayList.size());
    }
}
