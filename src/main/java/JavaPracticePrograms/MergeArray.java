package JavaPracticePrograms;

public class MergeArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        int[] array2 = {7,8,9,10};
        int[] merge = new int[array.length+ array2.length];
        /*public static void arraycopy(Object source_arr, int sourcePos,
        Object dest_arr, int destPos, int len)
        Parameters :
        source_arr : array to be copied from
        sourcePos : starting position in source array from where to copy
        dest_arr : array to be copied in
        destPos : starting position in destination array, where to copy in
        len : total no. of components to be copied.
        */

        System.arraycopy(array,0,merge,0,array.length);
        System.arraycopy(array2,0,merge,array.length,array2.length);

        for(int a: merge){
            System.out.println(a);
        }

    }
}
