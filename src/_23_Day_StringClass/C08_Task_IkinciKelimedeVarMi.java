package _23_Day_StringClass;

public class C08_Task_IkinciKelimedeVarMi {
//    public static void main(String[] args) {

//        // ikinci kelimede var mi
//
//        Scanner scan= new Scanner(System.in);
//        System.out.println("iki kelime giriniz : ");
//        String kelime1= scan.next();
//        String kelime2= scan.next();
//
//        System.out.println(kelime2.indexOf(kelime1.charAt(0)));





//    }
// kullanicidan iki kelime yazmasini isteyin. ilk kelimenin bas harfi ikinci kelimede varsa
    // o kelimedeki inkexini yazdirin.


    public static int ikinciKelimedeVarMi(String str1, String str2){
       return str2.indexOf(str1.trim().charAt(0));

    }

    public static void main(String[] args) {
        String str5="Merhaba";
        String str6= "ErMan";
        if (ikinciKelimedeVarMi(str5,str6)>=0){
            System.out.println("icinde var ve 2.kelimenin " + ikinciKelimedeVarMi(str5,str6) + ". indeksinde yer aliyor" );
        }else{
            System.out.println("2.kelimenin icerisinde " + ikinciKelimedeVarMi(str5,str6) + " kelimesi yer almiyor");
        }
    }
}
