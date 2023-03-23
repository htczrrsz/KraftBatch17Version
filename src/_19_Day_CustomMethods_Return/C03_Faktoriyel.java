package _19_Day_CustomMethods_Return;

public class C03_Faktoriyel {
    public static void main(String[] args) {

        System.out.println("faktoriyelHesapla(4) = " + faktoriyelHesapla(4));
        System.out.println("------");
        int sonuc= faktoriyelHesapla(4);
        System.out.println("sonuc = " + sonuc);


    }


    // verdigimiz bir sayinin faktoryelini hesaplayip
    // sonucu bize donduren bir method olusturun
    /* Method olujsturma asamalari
    1.Public static (Standart)
    2. olusturacagimiz metod bize bir sonuc dondurecekse data typ belirtmek gerekiyor.
    3. metod adi dollarToTl
    4. metodun parantezleri () parametre olup olmayacagi ve parametre data tipleri ve isimleri parantez icerisine yazilir.
    5. body acilir. {
    donduurlmesi gereken islem yapilir. }
    6. return keyword u ile dondurulmesi planlanan deger dondurulur.
     */




      public static int faktoriyelHesapla (int sayi){
        int faktoriyel=1;   // cunku en kucuk aktoriyel 1e esit
          for (int i=1; i<=sayi; i++){
              faktoriyel*=i;
          }
          return faktoriyel;
      }




}
