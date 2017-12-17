package net.zerktos.utilslibrary;

import net.zerktos.utilslibrary.utils.ArraySorter;

public class TestClass {

    private static int[] arr = {10, 6, 11, 90, 2, 1, 5};

    public static void main(String[] args) {

        ArraySorter arraySorter = new ArraySorter();

        System.out.print("| ");

        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " | ");
        }
        System.out.println("\n");

        arraySorter.sortIntArray(arr);

        System.out.print("| ");

        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " | ");
        }
        System.out.println("\n");

    }

}
