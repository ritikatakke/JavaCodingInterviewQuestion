package JavaPracticePrograms;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {

        int[] Array = {1,4,5,2,78,23,45,56,13,89,32,35,54};
        Arrays.sort(Array);
        for(int a : Array){
            System.out.println(a);


        }
        //for Descending order
        System.out.println("Descending Order");
        for(int i=Array.length-1;i>=0;i--){
            System.out.println(Array[i]);

        }
    }
}
