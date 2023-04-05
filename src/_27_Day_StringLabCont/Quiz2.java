package _27_Day_StringLabCont;

public class Quiz2 {
    public static void main(String[] args) {

        System.out.println(vucutKitleEndeksiHesapla(60, 175));

    }

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
