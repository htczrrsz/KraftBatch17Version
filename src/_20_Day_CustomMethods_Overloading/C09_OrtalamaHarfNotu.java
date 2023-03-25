package _20_Day_CustomMethods_Overloading;

public class C09_OrtalamaHarfNotu {
    public static void main(String[] args) {

        System.out.println("ortalamaHarfNotu(40,78,83) = " + ortalamaHarfNotu(40, 78, 83));
        double ortalama = ortalamaHarfNotu(40,78,83);
        System.out.println(ortalama + " = " + ortalamaHarfNotu(40,78,83));


    }

    public static char ortalamaHarfNotu (int not1, int not2, int not3){
        char harfNotu = ' ' ;
        double ortalama = (not1+not2+not3)/3;
        if (ortalama>76){
            harfNotu= 'A';
        }else if (ortalama>51){
            harfNotu='B';
        }else if (ortalama>=0){
            harfNotu='C';
        }
        return harfNotu;
    }




}
