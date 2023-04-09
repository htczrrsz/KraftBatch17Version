package _26_Day_StringExamples;

public class Task_28_IcindekiHarfSayilariBasinaYazilacak {
    public static void main(String[] args) {
        System.out.println(harfSayilariniBaslarinaYaz("Merhaba"));
        System.out.println(harfSayilariniBaslarinaYaz("Seni seviyorum"));

    }

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



}
