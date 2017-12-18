package net.zerktos.utilslibrary.utils;

/**
 * @author Zerktos
 * @version 0.1
 */
public class ArrayTransformer {

    /**
     *
     * @param s the string which will get transformed to a char array
     * @return the returned char[] will be filled with the string
     */

    public char[] transformStringToCharArray(String s){
        if(s == null || s.equals("")) return null;


        return s.toCharArray();
    }


}
