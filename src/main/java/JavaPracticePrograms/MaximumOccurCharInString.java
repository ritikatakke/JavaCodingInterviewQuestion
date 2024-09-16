package JavaPracticePrograms;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MaximumOccurCharInString {
    public static void main(String[] args) {
        String string1 = "responsibility";
        MaximumOccurCharInString maxChar = new MaximumOccurCharInString();
        System.out.println(maxChar.getMap(string1));
        HashMap<Character,Integer> map= maxChar.getMap(string1);
       char max=  Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
        System.out.println(max);



    }

    public HashMap<Character, Integer> getMap(String string1) {
        //Converts given string into character array
        char string[] = string1.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();

        System.out.println("Duplicate characters in a given string: ");
        //Counts each character present in the string
        for (int i = 0; i < string.length; i++) {
            int count = 1;
            for (int j = i + 1; j < string.length; j++) {
                if (string[i] == string[j] && string[i] != '0') {
                    count++;
                    //Set string[j] to 0 to avoid printing visited character
                    string[j] = '0';
                }
            }
            //A character is considered as duplicate if count is greater than 1
            if (count >= 1 && string[i]!='0') {
                System.out.println(string[i] + " is repeted for " + count);

                map.put(string[i], count);
            }


        }
        return map;

    }
}

