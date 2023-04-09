package _26_Day_StringExamples;

public class Task_25_KacAdetSevKelimesi {
    public static void main(String[] args) {

        System.out.println(kelimeKacAdet("Seni seviyorum", "sev"));
        System.out.println(kelimeKacAdet("Sevmek veya sevmemek","sev"));
        System.out.println(kelimeKacAdet("Sev seni seveni, sevmek guzeldir.", "sev"));

    }
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




}
