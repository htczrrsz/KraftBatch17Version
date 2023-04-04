package _26_Day_StringExamples;

public class C03_StringExamples {
    public static void main(String[] args) {


     //   System.out.println(harfKaldir("Merhaba", "a"));
        System.out.println(harfKaldir2("Merhaba", 'a'));

    }

    // kullanicidan bi kelime ve harf alin
    // kelimenizin icinde bu harfin hpsi kaldirilmis sekilde
    // string donduren program
    // (merhaba,a ) merhb

    public static String harfKaldir(String str,String harf){
      return  str.replace(harf,"");
    }

    public static String harfKaldir2(String str,char harf){
        String result="";
        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i)!=harf){
                result+=str.charAt(i);
            }
        }
       return result;
    }

}
