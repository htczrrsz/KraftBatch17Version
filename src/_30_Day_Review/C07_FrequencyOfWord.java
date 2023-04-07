package _30_Day_Review;

public class C07_FrequencyOfWord {
    public static void main(String[] args) {

        System.out.println(frequencyOfWord("JavaJavaJAvaPythonC+++", "Java"));

    }
    // bir metod string

    public static int frequencyOfWord(String sentence, String word){
        int frequency=0;
        while (sentence.contains(word)){
           sentence= sentence.replaceFirst(word,"");
            frequency++;
        }

        return frequency;
    }



}
