package JavaPracticePrograms;

public class RemoveSpace {
    public static void main(String[] args) {
        String text = " Hi May Mand hhjd";
        String str = text.replaceAll("\\s","");
        System.out.println(str);
        String str1=new String("Scaler");
        String str2=new String("Scaler");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));


    }
    }

