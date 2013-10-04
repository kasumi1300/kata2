package kata2;

import java.util.Scanner;

public class array {
    private int maxNum=Integer.MIN_VALUE;
    private int[]array;
    private Scanner entry = new Scanner(System.in);
    
    public array(){
        System.out.println("Introduce el tamaño del vector: ");
        array=new int[entry.nextInt()]; 
    }
    public void createArray(){
        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduce el número: ");
            array[i]=entry.nextInt();            
        }
    }
    public int findNumber(){
        for (int i = 0; i < array.length; i++) {
            maxNumber(array[i]);           
        }
        return maxNum;
    }
    private void maxNumber(int number){
        if(number>maxNum){
            maxNum=number;
        }     
    }
    public int returnMaxNum(){return maxNum;}
    
}
