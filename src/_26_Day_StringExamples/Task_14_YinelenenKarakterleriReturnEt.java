package _26_Day_StringExamples;

public class Task_14_YinelenenKarakterleriReturnEt {
    public static void main(String[] args) {

        System.out.println(yinelenenKarakterler("Java"));
        System.out.println(yinelenenKarakterler("Derslerime cok calisiyorum."));

    }
    // Kullanıcıdan bir kelime alan ve sonucunda yinelenen kelimeleri string olarak return eden methot yazınız.
    //" Java " output:a
    //" Javva " output:av
    //" Derslerime cok calisiyorum" output:erslimco

    public static String yinelenenKarakterler(String str){
        String result="";
        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);
            if (result.indexOf(ch)!=-1){
                result+=ch;
            }
        }return result.trim();
    }


}
