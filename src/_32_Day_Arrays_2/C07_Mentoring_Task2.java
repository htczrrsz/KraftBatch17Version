package _32_Day_Arrays_2;

import java.util.Arrays;

public class C07_Mentoring_Task2 {
    public static void main(String[] args) {

        String [] cars={"Toyota","Honda","BMW","Mercedes","Nissan"};

//        boolean bl=false;
//        for (int i = 0; i < cars.length ; i++) {
//            if (cars[i].equalsIgnoreCase("Honda")){
//                bl=true;
//            }
//        }
//
//        if (bl){
//            System.out.println("Bu marka arac bulunmaktadir");
//
//        }else {
//            System.out.println("Bu marka arac bulunmamaktadir");
//
//        }


     //  System.out.println(arraydeArama2(cars, "Honda"));
        System.out.println(arraydeArama2(cars, "Mazda"));

    }



    public static boolean arraydeArama(String[] array,String arananKelime ){
        for (int i = 0; i <array.length ; i++) {
            if (array[i].equalsIgnoreCase(arananKelime)){
                return true;
            }
        }return false;
    }


    public static String arraydeArama2(String[] array,String arananKelime ){
        String result="";
        for (int i = 0; i <array.length ; i++) {
            if (array[i].equalsIgnoreCase(arananKelime)){
                result="Bulunmaktadir";
                return result;
            }result="Bulunmamaktadir.";

        }
        return result;
    }


}
