package JavaPracticePrograms;

import java.util.Scanner;

public class Palindrome_UsingStringBuffer {
    public static void main(String[] args) {
        String name;
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        StringBuffer sb = new StringBuffer(name);
        String reverse = sb.reverse().toString();
        if(name.equals(reverse)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }

    }
}
