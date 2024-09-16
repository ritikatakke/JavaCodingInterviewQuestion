package JavaPracticePrograms;

public class StringOccuranceOfWord {
    public static void main(String[] args) {
        String text = "My name is ritu. my native place is ritu.";

        String[] array = text.toLowerCase().split(" ");
        int count;
        for(int i=0;i< array.length;i++){
            count=1;
            for(int j=i+1;j<array.length;j++){
                if(array[i].equals(array[j])){
                    count++;
                    array[j]="0";

                }
            }
            if(count>1 && array[i]!="0") {
                System.out.println("Substring " + array[i] + " is repeted for " + count);
            }

            }
        }

    }

