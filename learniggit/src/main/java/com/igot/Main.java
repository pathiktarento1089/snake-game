package com.igot;

public class Main {

    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j + 1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // Function to print the array
    public static void printArray(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        Main main = new Main();  // Create an instance of the Main class
        int[] array = {64, 34, 25, 12, 22, 11, 90};

        main.bubbleSort(array);  // Call the bubbleSort method

        System.out.println("Sorted array:");
        main.printArray(array);  // Call the printArray method
    }
}