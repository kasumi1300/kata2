
package kata2;

import java.util.Scanner;
public class Kata2 {

    public static void main(String[] args) {
        array array1 = new array();
        array1.createArray();
        array1.findNumber();
        System.out.println("El mayor número es:"+array1.returnMaxNum());
     
    }
}
