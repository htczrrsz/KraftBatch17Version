package _31_Day_Arrays_1;

import java.util.Arrays;

public class C01_Array_1 {
    public static void main(String[] args) {

     //   String x="Harun";

//        String[] y= new String[6];  // ---> kapasiteyi onceden belirliyoruz bu sekilde
//        int z[]=new int[3];         // ---> bu sekilde de olur
//        int t[];
//
//        t=new int[8];


        int z[]=new int[5];
//        System.out.println(z);  // ---> referans yazdirir.
//        System.out.println(z[3]);  //   0 , cunku deger atamadik.
 //       System.out.println(z[5]);  hata verir cunku asmis olduk 5i

        z[0]=105;
        z[1]=89;
        z[2]=63;
        z[3]=56;
        z[4]=107;
        System.out.println("Arrays.toString(z) = " + Arrays.toString(z));
        z[3]= 100;
        System.out.println("Arrays.toString(z) = " + Arrays.toString(z));

//        z[5]=77;     out of bound


        System.out.println(z[3]);


     String str[]=new String[3];   // -->  String [] str=new String[3] bu sekilde de olur

     str[0]="Hatice";
     str[1]="Alperen";
     str[2]="Mia";

        System.out.println(str[1]);

        String str2[]={"Hatice","Alperen"};  // kisaca boyle yazilir. alttakileri yazmis gibi oluruz.
        // = String str2[]=new String[2];
        // str2[0]="Hatice";
        // str2[1]="Alperen";

        System.out.println(str[0]);
        str2[1]="Mia";    // bu sekilde de atadigimiz stringi degistirebiliyoruz.
        System.out.println(str2[1]);

// iki deger alan int turunde array olusturun
// deger atayin ve bu iki degeri toplayin

        int x[]={3,4};
        int toplam=x[0]+x[1];
        System.out.println(toplam);

        int[] sayilar=new int[2];
        sayilar[0]=89;
        sayilar[1]=105;
        int toplam1=sayilar[0]+sayilar[1];
        System.out.println(toplam1);


    }


}
