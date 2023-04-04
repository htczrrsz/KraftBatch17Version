package _27_Day_StringLabCont;

public class _06_YinelenenKarakter {
    public static void main(String[] args) {

        System.out.println(yinelenenHarfCikart("Ananas"));
        System.out.println(yinelenenHarfCikart("Merhaba"));
        System.out.println(yinelenenHarfCikart1("Ananas"));

    }

    public static String yinelenenHarfCikart(String str){
        String result="";
        for (int i=0; i<str.length(); i++){
            if (!result.contains(str.substring(i,i+1))){
                result+=str.substring(i,i+1);
            }
        }return result;
    }

    public static String yinelenenHarfCikart1(String str) {
        String result = "";
        for (; str.length() > 0; ) {
            result += str.substring(0, 1);
            str = str.replace(str.substring(0, 1), "");
        }
        return result;

    }

}
