package _29_Day_FullReview;

public class C05_FrequencyOfCharacters {
    public static void main(String[] args) {
        System.out.println(frequencyOfChars("AAABBBC",'A'));


    }
    //  Write a method that can return the frequency of a char from a String
    //
    //            Ex:
    //                str = "AAABBBC" ch = 'A'
    //
    //            Output:
    //                3

    public static int frequencyOfChars(String str, char ch){
        int frequency=0;
        for (int i = 0; i <str.length() ; i++) {
            char eachChar= str.charAt(i);
            if (eachChar==ch){
                frequency++;
            }
        }return frequency;
    }


}
