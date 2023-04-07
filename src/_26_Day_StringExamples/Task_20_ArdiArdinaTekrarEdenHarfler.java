package _26_Day_StringExamples;

public class Task_20_ArdiArdinaTekrarEdenHarfler {
    public static void main(String[] args) {

       System.out.println(ardiArdinaTekrarEdenHarfler("aabcccseeeeeefff"));
        System.out.println(ardiArdinaTekrarEdenHarfler("abaccb"));
       System.out.println(ardiArdinaTekrarEdenHarfler("Arsiz"));

    }

    // Kullanıcıdan bir kelime alın ve ardı ardına tekrar eden harfleri döndüren metodu yazın.
    // aabccccseeeeeefff acef
    // abaccb c
    // Arsız ardı ardına tekrar eden harf yoktur amannsız n

    public static String ardiArdinaTekrarEdenHarfler (String str) {
        String result = "";
        while (str.length()>1){
            if (str.substring(0,1).equals(str.substring(1,2))) {
                result += str.substring(0,1);

            }str = str.replace(str.substring(0,1), "");

        }
        return result;

    }

}
