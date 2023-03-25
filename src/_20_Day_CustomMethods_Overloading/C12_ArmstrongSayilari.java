package _20_Day_CustomMethods_Overloading;

public class C12_ArmstrongSayilari {
    public static void main(String[] args) {

        armstrongNumbers();


    }

    public static void armstrongNumbers() {
        int sayi;

        for (int i = 100; i <999 ; i++) {
            sayi=i;
            int birlerBasamagi= sayi%10;
            int onlarBas= (sayi/10)%10;
            int yuzlerBas= (sayi/10)/10;
            double toplam= Math.pow(birlerBasamagi,3)+ Math.pow(onlarBas,3)+Math.pow(yuzlerBas,3);

            if (i==toplam){
                System.out.println(i);
            }
        }



    }



}





