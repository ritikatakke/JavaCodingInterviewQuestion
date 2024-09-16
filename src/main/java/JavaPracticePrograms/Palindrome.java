package JavaPracticePrograms;

import java.util.Arrays;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");
        String name = scanner.nextLine();
        int size = name.length();
        System.out.println(size);
        String reverse = "";
        for(int i=size-1;i>=0;i--){
            reverse = reverse + name.charAt(i);

        }
        System.out.println(reverse);
        if(name.equals(reverse))  {
            System.out.println("String is Palindrome");
        }else{
            System.out.println("String is Not Palindrome");
        }

    }


}
