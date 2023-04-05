package _27_Day_StringLabCont;

public class Quiz3 {
    public static void main(String[] args) {
        System.out.println("kacCharVar(\"Merhaba\",'a') = " + kacCharVar("Merhaba", 'a'));

    }
    public static int kacCharVar(String str, char ch){
        String result="";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==ch){
                result+=str.charAt(i);

            }
        }return result.length();
    }

}
