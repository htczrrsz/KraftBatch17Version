package _24_Day_StringClass;

public class C07_ReverseString {
    public static void main(String[] args) {

        String str= "Java programlama Dili";
        String reversed="";

        for (int i=str.length()-1; 0<=i ; i--){
            reversed+= str.charAt(i);
        }
        System.out.println(reversed);



    }
}
