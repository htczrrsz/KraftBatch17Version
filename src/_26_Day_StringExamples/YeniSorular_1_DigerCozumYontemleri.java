package _26_Day_StringExamples;

public class YeniSorular_1_DigerCozumYontemleri {
    public static void main(String[] args) {

//        System.out.println(containMethod("Haticee", "ice"));
//        System.out.println(containMethod("Hatice", "ece"));
//        System.out.println(containMethod("Hatice", "ace"));
//        System.out.println(containMethod("Hatice", "ati"));

//        System.out.println(containMethodDiger("Hatice", "ice"));

  //      System.out.println(contain("Hatice", "ice"));

    }

    // contain() kullanmadan contain metodunu yazınız?
// (2 kelime alan ve 2.kelimenin ilk kelimenin içinde olup olmadığını kontrol eden)

    public static boolean containMethod(String str, String str2) {
        String result = "";

        if (!str.equalsIgnoreCase(str2)){
            for (int i = 0; i <str.length() ; i++) {
                result+=str.substring(i,i+1);
                if (!result.equalsIgnoreCase(str2)){
                    if (result.length()>=str2.length()){
                        result= result.replace(result.substring(0,1),"");
                    }continue;

                }
                return true;
            } return false;
        }

        return true;
    }



    // diger cozum

    public static boolean contain(String str1,String str2){
        boolean result=false;
        for (int i = 0; i <str1.length() ; i++) {
            if(str1.substring(i).startsWith(str2)){
                result=true;
                break;
            }
        }
        return result;
    }


    // diger cozum

    public static boolean containMethodDiger(String str, String target){
        if (str==null) return false;
        str=str.toLowerCase();
        target=target.toLowerCase();
        return str.indexOf(target)!=-1;

    }

}
