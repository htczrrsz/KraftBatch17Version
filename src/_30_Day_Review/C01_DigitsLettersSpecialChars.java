package _30_Day_Review;

public class C01_DigitsLettersSpecialChars {
    public static void main(String[] args) {

char ch='A';
int num= 'A';
        System.out.println(num);

separateCharacters("ABCDE     xyz1234567890) (*&^%$#@!");


    }

    /*Create a method that takes a String and prints out
    3 different String of Letters, digits and special chars
    * of that string to console. space is not considered as a special char
     input :
     "ABCDExyz1234567890) (*&^%$#@!"
     digits= ABCDExyz
     specialChars=)(*&^%$#@!

     */

    public static void separateCharacters(String str){
        String letters="";
        String digits="";
        String specialChars= "";

        for (int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            if (ch>= 'A' && ch<='Z'){
                letters+=ch;
            }else if (ch>='a' && ch<='z'){
                letters+=ch;
            }else if (ch>='0' && ch<='9'){
                digits+=ch;
            }else{
                if (ch!=' '){
                    specialChars+=ch;
                }
            }



        }
        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("specialChars = " + specialChars);


    }





}
