package JavaPracticePrograms;

public class CountOfVowels {
    public static void main(String[] args) {
        String text = "my native place is vaibhavwadi";
        int vowel =0 ;
        int consonants =0;
        for(char c : text.toCharArray()){
            if("aeiouAEIOU".indexOf(c) != -1 ){

                vowel ++;

            }
            else if(c !=' '){
                consonants ++;
            }
        }
        System.out.println("In String there are " +vowel +" and " + consonants +" consonants");
    }
}
