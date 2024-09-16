package JavaPracticePrograms;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        boolean prime= true;
        for(int i=2;i<n;i++){
            if(n%i==0){
                prime=false;
                break;
            }
        }
        if(prime){
            System.out.println("Prime Number");
        }else {
            System.out.println("Not Prime");
        }

    }
}
