package _20_Day_CustomMethods_Overloading;

public class C07_asalSayi {
    public static void main(String[] args) {


        System.out.println("asalSayi(8) = " + asalSayi(8));
        System.out.println("asalSayi(9) = " + asalSayi(9));
        System.out.println("asalSayi(7) = " + asalSayi(7));

    }
    public static boolean asalSayi (int sayi){
        boolean asal= true;
        if (sayi>1){
            for (int i=2; i<sayi; i++){
                if (sayi%i==0){
                    asal=false;
                    break;
                }else {
                    asal=true;
                }
            }
        }
        return asal;
    }



}
