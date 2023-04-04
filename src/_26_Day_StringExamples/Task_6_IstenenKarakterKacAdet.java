package _26_Day_StringExamples;

public class Task_6_IstenenKarakterKacAdet {
    public static void main(String[] args) {

        System.out.println(istenenKarakterKacAdet("Merhaba", 'a'));

        System.out.println(istenenKarakterKacAdet1("Ankara", "a"));

        System.out.println(karakterSay2("ankara", "a"));

    }

    // Kullanıcıdan bir kelime ve bir karakter alın ve
    // bu kelimenin istenen karakterin kaç adet olduğunu döndüren metodu yazınız.
    // (büyük küçük harf göz ardı edilecek)
    // Ankara,a 3 Edirne,e 2


    public static int istenenKarakterKacAdet(String str,char ch){
        int count=0;
        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i)==ch){
                count++;
            }
        } return count;
    }

    public static int istenenKarakterKacAdet1(String str,String a){
        int count=0;
        for (int i = 0; i <str.length() ; i++) {
            if (str.substring(i,i+1).equalsIgnoreCase(a)){
                count++;
            }
        } return count;
    }




    public static int karakterSay2(String str, String c){
        str=str.toLowerCase();
        c=c.toLowerCase();
        int count=0;
        for (int i = 0; i < str.length() ; i++) {
            if(str.substring(i,i+1).equals(c)){
                count++;
            }
        }
        return count;
    }

}
