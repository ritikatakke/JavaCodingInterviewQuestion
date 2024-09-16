package JavaPracticePrograms;

public class String_Reverse_WIthouthUsing_String_Builder {

    public static void main(String[] args) {

        String name = "Ritika";
        int size = name.length();
        char[]  reverse_array = new char[size];
        int j=0;

       for(int i=size-1; i>=0 ;i--){


               reverse_array[i] = name.charAt(j);
               j++;
               
           }
        String reverse = String.copyValueOf(reverse_array);
        System.out.println(reverse);

       }

    }

