package _12_day_SwitchCase;

public class C02_Homework_Ve_ExtraSoru {
    public static void main(String[] args) {

//        int x,y,z;
//        x=50;
//        y=60;
//        z=15;
            //      System.out.println("max deger"
            //                        + (Math.max(Math.max(x,y),z)  ));


        // 2.YOL
        // int first=Math.max(x,y);
        // int max= Math.max(first,z);
        //  System.out.println("max deger: " + max);

// IF , IF ELSE ile

//        if(x>=y && x>=z){
//            System.out.println(x);
//        }else if(y>=x && y>=z){
//            System.out.println(y);
//        }else {
//            System.out.println(z);
//        }

// 3 sayi alin sayilar birbirine esit olan sayiyi ekrana getiren
        // esit sayi yok ise esit sayi yoktur yazan programi yaziniz.

        int x = 30;
        int y = 50;
        int z= 40;

//        if (x==y && y!=z){
//            System.out.println("x ve y birbirine esittir : " + x);
//        }else if (y==z && x!=z) {
//            System.out.println("y ve z birbirine esittir : " + y);
//        }else if (x==z && x!=y){
//            System.out.println("x ve z birbirine esittir : " + z);
//        }else if (x==y && y!=z){
//            System.out.println("sayilarin hepsi birbirine esittir ");
//        }else{
//            System.out.println("esit sayi yoktur.");
//        }

        // HOCA COZUMU

        if (x==y){
            System.out.println(x);
        }else if (y==z){
            System.out.println(y);
        }else if (x==z){
            System.out.println(z);
        }else{
            System.out.println("sayilar birbirine esit degildir");
        }


    }
}
