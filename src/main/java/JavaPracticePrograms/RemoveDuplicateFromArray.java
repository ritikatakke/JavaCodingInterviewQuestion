package JavaPracticePrograms;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromArray {
    public static void main(String[] args) {
        int[] array = {1,3,2,5,4,7,2,3,9,7,5,3,12,43,12,45,2,7,5};
        Set<Integer> set = new HashSet<>() ;
        for(int a : array){
            set.add(a);
        }

        System.out.println(set);


    }
}
