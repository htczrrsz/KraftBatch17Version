package _26_Day_StringExamples;

public class YeniSorular {
    public static void main(String[] args) {

//       System.out.println(containMethod("Haticee", "ice"));
//        System.out.println(containMethod("Hatice", "ece"));
//        System.out.println(containMethod("Hatice", "ace"));
//        System.out.println(containMethod("Hatice", "ati"));
//        System.out.println("-----------------------------");
//
//        System.out.println("binaryMi(110) = " + binaryMi(110));
//        System.out.println("binaryMi(112) = " + binaryMi(112));
//        System.out.println("-----------------------------");
//
//        System.out.println("ebobBul(10,5) = " + ebobBul(10, 5));
//        System.out.println("ebobBul(25,50) = " + ebobBul(25, 50));
//        System.out.println("ebobBul(18,45) = " + ebobBul(18, 45));
//        System.out.println("-----------------------------");

        System.out.println("ekokBul(2,4) = " + ekokBul(2, 4));
        System.out.println("ekokBul(12,18) = " + ekokBul(12, 18));
        System.out.println("ekokBul(10,20) = " + ekokBul(10, 20));
        System.out.println("ekokBul(0,2) = " + ekokBul(0, 2));

//        System.out.println("bosMu(\"\") = " + bosMu(""));
//        System.out.println("bosMu(\" \") = " + bosMu(" "));
//        System.out.println("bosMu(\"Hatice\") = " + bosMu("Hatice"));




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





//Girilen bir sayının Binary olup olmadığını bulan bir metot yazın.
// 110 true
// 112 false

    public static boolean binaryMi(int sayi){
       String sayi1=(" " + sayi).trim();
       String result="";
        for (int i = 0; i <sayi1.length() ; i++) {
                result=sayi1.substring(i,i+1);

                if (!(result.equals("0") || result.equals("1"))){
                    return false;
                }
        }return true;
    }




//girilen 2 adet sayının EBOB'unu bulan bir metot yazınız (en büyük ortak bölen)

      public static int ebobBul(int sayi1, int sayi2){
        int ebob=1;
        int min=Math.min(sayi1,sayi2);
          for (int i = 1; i <=min   ; i++) {  //  <= sayi1 && i<=sayi2  --> uzun yolu
              if (sayi1 % i==0 && sayi2 % i==0 ){
                  ebob=i;
              }

          } return ebob;
      }




//girilen 2 adet sayının EKOK'unu bulan bir metot yazınız (en küçük ortak kat)
    // Ekok(a, b) = (a x b) / EBOB(a, b)
    // a.b= ebob(a,b).ekok(a.b)

public static int ekokBul(int sayi1, int sayi2){

        return sayi1*sayi2/ebobBul(sayi1,sayi2);

}




//isEmpty() metodunu kullanmadan girilen bir değerin boş (null değil) olup olmadigini kontrol eden bir motot yazınız.

    public static boolean bosMu(String str){
        if ((str.length()==0)){
            return true;
        }
return false;
    }


}
