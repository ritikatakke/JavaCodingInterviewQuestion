package JavaPracticePrograms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class LargestInArray {
    public static void main(String[] args) {
        int[] array ={ 12,54,35,78,98,55,23,};
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        for(int a : array){
            arrayList.add(a);
        }
      int max=   Collections.max(arrayList);
        System.out.println("Maximum number is "+max);
      LargestInArray largestInArray  = new LargestInArray();
        System.out.println("mximum number for 2nd array" +largestInArray.withoutCollections());


    }

    public int withoutCollections(){
        int array[] = {12,15,35,32,800,65,34,989};
        int max= array[0];
        for (int a: array){
            if(a>max){
                max=a;
            }
        }
        return max;
    }
}
