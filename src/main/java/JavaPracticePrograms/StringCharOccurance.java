package JavaPracticePrograms;

import java.util.Scanner;

public class StringCharOccurance {
    /*public static void main(String[] args) {
        String text = "Hi My Name is Ritika";
        Scanner sc = new Scanner(System.in);
        char[] array = text.toLowerCase().toCharArray();
        int count ;
        for (int i = 0; i < array.length; i++) {
            count =1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j] && array[i] != ' ') {
                    count++;
                    array[j] = 0;
                }


            }
            if (count > 1 && array[i] != '0') {
                System.out.println("Duplicate char " + array[i] + " is repeated for " + count);

            }


        }

    }*/
    public static void main(String[] args) {
        String string1 = "Great responsibility";
        int count;

        //Converts given string into character array
        char string[] = string1.toCharArray();

        System.out.println("Duplicate characters in a given string: ");
        //Counts each character present in the string
        for(int i = 0; i <string.length; i++) {
            count = 1;
            for(int j = i+1; j <string.length; j++) {
                if(string[i] == string[j] && string[i] != ' ') {
                    count++;
                    //Set string[j] to 0 to avoid printing visited character
                    string[j] = '0';
                }
            }
            //A character is considered as duplicate if count is greater than 1
            if(count > 1 && string[i] != '0')
                System.out.println(string[i] +" is repeted for "+count);
        }
    }

}
