package JavaPracticePrograms;

public class A {



    static int x = 1111;

    static {
        x = x-- - --x;
        System.out.println(x);


        {
            x = x++ + ++x; //-2 +
        }


    }

    public static void main(String[] args) {
        System.out.println(x);
    }
}

