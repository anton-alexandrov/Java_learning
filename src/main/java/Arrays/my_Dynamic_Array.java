package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class my_Dynamic_Array {
    static int currentElementIndex = 0;
    static int availableCapacity = 0;

    public my_Dynamic_Array() {
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter number of elements");
        int size = Integer.parseInt(reader.readLine());
        int[] array = new int[size];
        availableCapacity = array.length;

        for(int i = 0; i < array.length; ++i) {
            System.out.println("Enter " + i + " element");
            if (availableCapacity > 0) {
                addNewElement(array, Integer.parseInt(reader.readLine()));
            }
        }

        while(true) {
            System.out.println("Do you want to add more elements (y/n):");
            char answer = reader.readLine().charAt(0);
            int i;
            if (answer == 'n') {
                System.out.println("Result array:");

                for(i = 0; i < currentElementIndex; ++i) {
                    System.out.println(array[i]);
                }

                return;
            }

            System.out.println("You can add: " + availableCapacity + " elements");
            System.out.println("Add new element to the array:");
            i = Integer.parseInt(reader.readLine());
            if (availableCapacity > 0) {
                addNewElement(array, i);
            } else {
                array = expandArray(array);
                addNewElement(array, i);
            }
        }
    }

    private static int[] expandArray(int[] array) {
        int newSize = array.length * 2;
        int[] newArray = new int[newSize];

        for(int i = 0; i < array.length; ++i) {
            newArray[i] = array[i];
        }

        availableCapacity = newArray.length - array.length;
        return newArray;
    }

    private static void addNewElement(int[] array, int number) {
        array[currentElementIndex] = number;
        ++currentElementIndex;
        --availableCapacity;
    }
}
