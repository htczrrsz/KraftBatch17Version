package _26_Day_StringExamples;

public class Task_20_ArdiArdinaTekrarEdenHarfler {
    public static void main(String[] args) {

        System.out.println(ardiArdinaTekrarEdenHarfler("aabcccseeeeeefff"));

    }
    public static String ardiArdinaTekrarEdenHarfler (String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i + 1).equals(str.substring(i + 1, i + 2))) {
                result += str.substring(i, i + 1);
                str = str.replace(str.substring(i), "");

            }
          return result;
        }
        return "ardi ardina tekrar eden harf yoktur.";
    }

}
