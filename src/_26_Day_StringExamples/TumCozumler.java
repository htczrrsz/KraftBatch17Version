package _26_Day_StringExamples;

import java.util.Scanner;

public class TumCozumler {
    public static void main(String[] args) {

        System.out.println(yinelenenKarakterler("Java"));
        System.out.println(yinelenenKarakterler("Derslerime cok calisiyorum."));
        System.out.println("------------------");

        System.out.println(unluUnsuzHarfler("Ankara"));
        System.out.println(unluUnsuzHarfler("Hatice"));
        System.out.println("------------------");

        System.out.println(ilkUcHarfSonaEkle("Merhaba"));
        System.out.println("------------------");


        System.out.println(sonUcHarfBasa("Merhaba"));
        System.out.println(sonUcHarfBasa("Ali"));
        System.out.println(sonUcHarfBasa("Hatice"));
        System.out.println("-------------------");

        System.out.println(benzersizHarf("Merhaba"));
        System.out.println(benzersizHarf("Araba"));
        System.out.println(benzersizHarf("Karkas rotasi"));
        System.out.println("-------------------");

        System.out.println(ayniHarflerdenMiOlusuyor("Nefes", "Enfes"));
        System.out.println(ayniHarflerdenMiOlusuyor("Iftar", "Tarif"));
        System.out.println(ayniHarflerdenMiOlusuyor("Selcuk", "Elyase"));
        System.out.println(ayniHarflerdenMiOlusuyor("Ennfes", "Nefess"));
//  sonuncusu false cikmasi gerekirken true cikiyor, duzeltemedim.

        System.out.println("--------------------");

        System.out.println(ardiArdinaTekrarEdenHarfler("aabcccseeeeeefff"));
        System.out.println(ardiArdinaTekrarEdenHarfler("abaccb"));
        System.out.println(ardiArdinaTekrarEdenHarfler("Arsiz"));
        System.out.println("---------------------");


        System.out.println(ilkBenzerSizHarfiBul("Merhaba"));
        System.out.println(ilkBenzerSizHarfiBul("Araba"));
        System.out.println(ilkBenzerSizHarfiBul("Karkas rotasi"));
        System.out.println("----------------------");

        System.out.println(terstenAyniMi("Kabak"));
        System.out.println(terstenAyniMi("Nalan"));
        System.out.println(terstenAyniMi("Kasaba"));
        System.out.println(terstenAyniMi("Ahmet"));
        System.out.println(terstenAyniMi(" Talat"));
        System.out.println("----------------------");

        System.out.println(kelimeKacAdet("Seni seviyorum", "sev"));
        System.out.println(kelimeKacAdet("Sevmek veya sevmemek","sev"));
        System.out.println(kelimeKacAdet("Sev seni seveni, sevmek guzeldir.", "sev"));
        System.out.println("-----------------------");

        System.out.println(ayniSayidaMi("Ankara ile Bursa arasi 500km.", "Ankara", "Bursa"));
        System.out.println(ayniSayidaMi("Ankara Bursa kadar yeşil değil. Bursa bir başka.", "Ankara", "Bursa"));
        System.out.println(ayniSayidaMi("Istanbul çok uzak", "Ankara", "Bursa"));
        System.out.println(ayniSayidaMi("Bursa ve Istanbul deneyelim", "Bursa", "Ankara"));
        System.out.println("------------------------");

        System.out.println(sonundaIstenenKelimeVarMi("Kullanacak", "acak"));
        System.out.println(sonundaIstenenKelimeVarMi("Zamlanacak", "acak"));
        System.out.println(sonundaIstenenKelimeVarMi("Farkindalik", "acak"));
        System.out.println(sonundaIstenenKelimeVarMi("Farkinda", "acak"));
        System.out.println("------------------------");

        System.out.println(harfSayilariniBaslarinaYaz("Merhaba"));
        System.out.println(harfSayilariniBaslarinaYaz("Seni seviyorum"));
        System.out.println("------------------------");


        System.out.println(enCokOlanHarfiDondur("Merhaba"));
        System.out.println(enCokOlanHarfiDondur("aaaaaaabbccc"));
        System.out.println(enCokOlanHarfiDondur("eeemmmsssssssssshhhhhhhhhsss"));





    }



    //  soru 14
    // Kullanıcıdan bir kelime alan ve sonucunda yinelenen harfleri string olarak return eden methot yazınız.
    //" Java " output:a
    //" Javva " output:av
    //" Derslerime cok calisiyorum" output:erslimco

    public static String yinelenenKarakterler (String str){
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if (str.indexOf(ch)!=str.lastIndexOf(ch)) {
                if (result.indexOf(ch) == -1) {
                    result += "" + ch;
                }
            }

        }
        return result;
    }



    // soru 15
    // Kullanıcıdan bir kelime alın ve bu kelimenin
    // içerisindeki ünlü ve ünsüz harfleri ayrı ayrı ekrana yazan programı yazınız.
    // Ankara
    // ünlü harfler=Aa
    // Ünsüz harfler=nkr



    public static String unluUnsuzHarfler(String str){
        String unlu="";
        String unsuz="";

        for (int i = 0; i <str.length() ; i++) {
            if (str.substring(i,i+1).equalsIgnoreCase("a") || str.substring(i,i+1).equalsIgnoreCase("e") ||
                    str.substring(i,i+1).equalsIgnoreCase("i")
                    || str.substring(i,i+1).equalsIgnoreCase("o") || str.substring(i,i+1).equalsIgnoreCase("u")) {

                if (!unlu.contains(str.substring(i,i+1))){
                    unlu+=str.substring(i,i+1);
                }

            }else
            if (!unsuz.contains(str.substring(i,i+1)))
                unsuz+= str.substring(i,i+1);

        }
        return "unlu harfler : " + unlu + " unsuz harfler : " + unsuz ;
    }


    // Soru 16
    // Kullanıcıdan min 3 harf olacak şekilde bir kelime alın ve bu kelimenin ilk 3 harfini kelimeden keserek sonuna ekleyin.
    //Merhaba habaMer Ali Ali

    public static String ilkUcHarfSonaEkle(String str){
        String str1=str.trim();
        String str2= str1.replace((str1.substring(0,3)),"");
        return str2+(str1.substring(0,3));
    }

// Soru 17
//  Kullanıcıdan min 3 harf olacak şekilde bir kelime alın ve
//  bu kelimenin son 3 harfini kelimeden keserek kelimenin başına ekleyin.
//  Merhaba abaMerh Ali Ali


    public static String sonUcHarfBasa(String str){
        String str1=str.trim();
        String str2=str1.replace(str1.substring(str1.length()-3),"");
        return str1.substring(str1.length()-3).concat(str2);
    }

    // Soru 18
    // Kullanıcıdan bir kelime alın ve bu kelimenin ilk benzersiz harfini bulun.
    // (Büyük küçük harf gözardı edilecek.) Hiçbir harf benzersiz değil ise benzersiz harf yoktur ikazı versin.
    // Merhaba M
    // Araba r
    // Karkas rotası o


    public static String benzersizHarf(String str){
        String str1=str.toLowerCase().trim().replace(" ","");
        String result="";
        for (int i = 0; i <str1.length() ; i++) {
            char ch=str1.charAt(i);
            if (str1.indexOf(ch)==str1.lastIndexOf(ch)){
                result=""+ch;
                break;
            }
        }return result;
    }


// Soru 19
    //Kullanıcıdan iki kelime alın ve bu kelimeler aynı harflerden oluşuyorsa
    // (her harf eşit sayıda içerecek,büyük küçük harf göz ardı edilecek) true
    // oluşmuyorsa false yazdırın. (anagram kelime ise)
    //İftar – Tarif true
    // Zehra – Ezhar true
    // Nefes – Enfes true
    // Selcuk-Elyase false


    public static boolean ayniHarflerdenMiOlusuyor(String str, String str1) {
        //  String result = "";
        String strNew = str.toLowerCase().trim();
        String str1New = str1.toLowerCase().trim();
        if (strNew.length() != str1New.length()) {
            return false;
        }
        for (int i = 0; i < strNew.length(); i++) {
            char ch = strNew.charAt(i);
            if (str1New.indexOf(ch) == -1) {
                return false;
            }
            strNew= strNew.replace("" + ch, "");

        }
        return true;

    }


    // Soru 20
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




    // Soru 22
    // Kullanıcıdan bir kelime alın ve bu kelimenin ilk benzersiz harfini bulun.
    // (Büyük küçük harf gözardı edilecek.) Hiçbir harf benzersiz değil ise benzersiz harf yoktur ikazı versin.
    // Merhaba M
    // Araba r
    // Karkas rotası o

    public static String ilkBenzerSizHarfiBul(String str){
        str=str.toLowerCase().trim().replace(" ","");
        String result="";
        for (int i = 0; i <str.length() ; i++) {
            if (str.indexOf(str.substring(i,i+1))==str.lastIndexOf(str.substring(i,i+1))){
                result=str.substring(i,i+1);
                break;
            }
        }return result;
    }


    // Soru 23
// Kullanıcıdan bir kelime alın ve bu kelimenin tersten okunuşu
// kelime ile aynı ise true değil ise false döndüren metot yazınız.
// Kabak true
// Nalan true
// Ara true
// talat true
// Kasaba false
// ahmet false

    public static boolean terstenAyniMi(String str){
        String result="";
        String str1=str.trim().toLowerCase();
        for (int i = str1.length()-1; 0<=i ; i--) {
            result+=str1.charAt(i);
        }if (result.equals(str1)){
            return true;
        }return false;


    }


    // Soru 25
    // Kullanıcıdan bir input alın ve bu inputun içerisinde kaç adet sev bulunduğunu ekrana yazdırın.
    // Seni seviyorum 1
    // Sevmek veya sevmemek 2
    // Sev seni seveni , sevmek güzeldir. 3

    public static int kelimeKacAdet(String str,String istenenKelime){
        int count=0;
        String str1=str.toLowerCase();
        for (int i = 0; i <str1.length() ; i++) {
            if (str1.contains(istenenKelime)){
                str1=  str1.replaceFirst("sev","");
                count++;
            }
        }return count;

    }


    // Soru 26
    //  Bursa ile Ankara kelimeli cümlenin içerinde aynı sayıda dönüyorsa true
    //  farklı sayılarda dönüyorsa false yazdıran metodu yazınız.
    //  Ankara ile Bursa arası 500 km. True
    //  Ankara Bursa kadar yeşil değil. Bursa bir başka. False
    //  İstanbul çok uzak. false

    public static boolean ayniSayidaMi(String str, String istenen1, String istenen2) {
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.toLowerCase().contains(istenen1.toLowerCase())) {
                str = str.replaceFirst(istenen1, "");
                count1++;
            }
            if (str.toLowerCase().contains(istenen2.toLowerCase())) {
                str = str.replaceFirst(istenen2, "");
                count2++;
            }
        }
        if (count1 == count2 && count1!=0) {
            return true;
        }
        return false;
    }



    // Soru 27
    // Kullanıcıdan bir kelime alın ve sonu acak ile bitiyorsa true,
    // bitmiyorsa false döndüren metodu yazdırın.
    // Kullanacak true
    // Zamlanacak true
    // Farkındalık false
    // Farkında false

    public static boolean sonundaIstenenKelimeVarMi (String str,String ileBitenKelime){
        if (str.substring(str.length()-(ileBitenKelime.length())).equalsIgnoreCase(ileBitenKelime)){
            return true;
        }
        return false;
    }


    // Soru 28
    //  Kullanıcıdan bir kelime alın ve
    //  bu kelimenin içerindeki harf sayılarını başına yazarak ekrana döndürün.
    //  (büyük küçük harfler göz ardı edilecek)
    //  Merhaba 1m1e1r1h2a1b
    //  Seni seviyorum 2s2e1n2i1v1y1o1r1u1m


    public static String harfSayilariniBaslarinaYaz(String str) {
        str=str.toLowerCase().replace(" ","");
        String result = "";
        int count;
        for (int i = 0; i < str.length(); i++) {
            String harf = str.substring(i, i + 1);
            count = str.length() - (str.replace(harf, "").length());
            if (!result.contains(harf)) {
                result += count + harf;
            }

        }
        return result;
    }


    // Soru 29
    // Kullanıcıdan bir dize sözcük alın ve en çok harfi döndüren metodu yazınız.
    // Merhaba a
    // aaaaaaabbcccc a
    // eeemmmsssssssssshhhhhhhhhsss s


    public static String enCokOlanHarfiDondur(String str) {
        str=str.toLowerCase().replace(" ","");
        String result = "";
        int count;
        int sayi=0;
        for (int i = 0; i < str.length(); i++) {
            String harf = str.substring(i, i + 1);
            count = str.length() - (str.replace(harf, "").length());

            if (count>sayi  && !result.contains(harf)){
                result= harf;
                sayi=count;
            }

        }
        return result;
    }




}
