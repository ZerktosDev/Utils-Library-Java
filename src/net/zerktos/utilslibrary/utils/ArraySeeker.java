package net.zerktos.utilslibrary.utils;

import java.util.Objects;

/**
* @author Zerktos
* @version 0.1
*/

public class ArraySeeker {
    /**
    *
    * @param arr The array where the int val will be searched
    * @param val The value which will be searched in the array arr
    * @return -1: array = null; -2: val not found in the array; return higher then -1: index of val
    */
    public Integer indexOfValueInIntArray(int[] arr, int val){

        if(arr == null) return -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == val){
                return i;
            }
        }

        return -2;
    }
    /**
     *
     * @param arr The array where the int val will be searched
     * @param val The value which will be searched in the array arr
     * @return -1: array = null; -2: val not found in the array; return higher then -1: index of val
     */
    public Integer indexOfValueInStringArray(String[] arr, String val){

        if(arr == null) return -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals(val)){
                return i;
            }
        }

        return -2;
    }

    /**
     *
     * @param arr The array where the int val will be searched
     * @param val The value which will be searched in the array arr
     * @return -1: array = null; -2: val not found in the array; return higher then -1: index of val
     */

    public Integer indexOfValueInDoubleArray(Double[] arr, Double val){

        if(arr == null) return -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals(val)){
                return i;
            }
        }

        return -2;
    }

    /**
     *
     * @param arr The array where the int val will be searched
     * @param val The value which will be searched in the array arr
     * @return -1: array = null; -2: val not found in the array; return higher then -1: index of val
     */

    public Integer indexOfValueInFloatArray(Float[] arr, Float val){

        if(arr == null) return -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals(val)){
                return i;
            }
        }

        return -2;
    }

    /**
     *
     * @param arr The array where the int val will be searched
     * @param val The value which will be searched in the array arr
     * @return -1: array = null; -2: val not found in the array; return higher then -1: index of val
     */

    public Integer indexOfValueInCharArray(char[] arr, char val){

        if(arr == null) return -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == val){
                return i;
            }
        }

        return -2;
    }
}
