package _31_Day_Arrays_1;

public class C02_Array_2 {
    public static void main(String[] args) {

        int array[]={105,89,63,56,107};
        System.out.println(array); // referansi getirir

        for (int i = 0; i <array.length ; i++) {  // i<5   0,1,2,3,4
            System.out.print(array[i]+ " ");
        }

        System.out.println("array.length = " + array.length);

//
//        for (int x:array) {
//            // x=array[0]  1.Dongu
//            // x=array[1]  2.Dongu
//            // x=array[2]  3.Dongu
//            // x=array[3]  4.Dongu
//            // x=array[4]  5.Dongu
//            System.out.print(x+" ");
//        }


        // arraydeki cift sayilar kac tane
         int ciftSayi=0;
        for (int x:array) {
            if (x%2==0){
                ciftSayi++;
            }
        }System.out.println(ciftSayi);


       // arraydeki tek sayilari yazdir
        int tekSayilar=0;
        for (int x:array) {
            if (x%2!=0){
                tekSayilar++;
            }
            System.out.println(x);
        }System.out.println(tekSayilar);




         int toplam=0;
        for (int x:array) {
            toplam+=x;

        }System.out.println(toplam);

        int toplam1=0;
        for (int i = 0; i <array.length ; i++) {
            toplam1+=array[i];
        }
        System.out.println(toplam1);



    }



}
