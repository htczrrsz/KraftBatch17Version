package _28_Day_Quiz;

public class Quiz2 {
    public static void main(String[] args) {

        System.out.println(vucutKitleEndeksiHesapla(60, 175));
        System.out.println(vucutKitleEndeksiHesapla(85, 186));

    }
//Kullanicinin kilo(kg) ve boyunu(cm) isteyip
//Aldiginiz degerleri bir metoda gondererek hesaplatin vucutKitleEndeksiHesapla(kilo,boy)
//vucut kitle endeksi = (kilo*10000 / (boy *boy))
//30’dan buyukse obez, 25-30 arasi ise kilolu,
//vucut kitle endeksi
//20-25 arasi ise normal,
//20’den kucukse zayif yazdirin.



    public static String vucutKitleEndeksiHesapla(int kilo, int boy ){
        int vucutKitleEndeksi= (kilo*10000/(boy*boy));
        if (vucutKitleEndeksi>=30){
            return "obez";
        } else if (vucutKitleEndeksi>=25) {
            return "kilolu";

        } else if (vucutKitleEndeksi>=20) {
            return "normal";

        } return "zayif";
    }


}
