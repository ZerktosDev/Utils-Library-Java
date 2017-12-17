package net.zerktos.utilslibrary.utils;

/**
 * @author Zerktos
 * @version 0.1
 */

public class ArraySorter {

    /**
     *
     * @param arr array which will be sorted
     * @return -1: array not initialized; 1: array successfully sorted
     */
    public int sortIntArray(int[] arr){
        if(arr == null) return -1;
        for(int i = 0; i<arr.length; i++){
            for (int j = 0; j < arr.length - 1; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return 1;
    }

    /**
     *
     * @param arr array which will be sorted
     * @return -1: array not initialized; 1: array successfully sorted
     */
    public int sortFloatArray(float[] arr){
        if(arr == null) return -1;
        for(int i = 0; i<arr.length; i++){
            for (int j = 0; j < arr.length - 1; j++) {
                if(arr[j] > arr[j+1]){
                    float temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return 1;
    }

    /**
     *
     * @param arr array which will be sorted
     * @return -1: array not initialized; 1: array successfully sorted
     */
    public int sortDoubleArray(double[] arr){
        if(arr == null) return -1;
        for(int i = 0; i<arr.length; i++){
            for (int j = 0; j < arr.length - 1; j++) {
                if(arr[j] > arr[j+1]){
                    double temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return 1;
    }


}
