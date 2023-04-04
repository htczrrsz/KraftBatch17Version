package _26_Day_StringExamples;

public class Task_3_KelimeninIkinbiYarisiniDondur {
    public static void main(String[] args) {


        System.out.println(kelimeninIkinciYarisiniDondur("Merhaba"));
        System.out.println(kelimeninIkinciYarisiniDondur("Tereyagi"));
    }

    //Kullanıcın girdiği eşit uzunlukta bir kelimenin 2. yarısını döndüren bir program yazdırın.
    //Sanayagı yagı Mutluluk uluk


public static String kelimeninIkinciYarisiniDondur(String str){
        if (str.length()%2==0){
            return str.substring(str.length()/2);
        }else{
            return str.substring(str.length()/2+1);
        }
}

}
