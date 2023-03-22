package _06_day_type_casting;

public class TypeCasting {
    public static void main(String[] args){
//        byte b=5;
//        short s= 129;
//        b=(byte)s;
//       // System.out.println(b);
//
//        int i=10;
//        double d=20;
//        d=i;
//          //4byte=8byte
//                i=(int)d;
//
//                float f=2.5f;
//                i=(int)f;
      //  System.out.println(i);  ----> 2 cikar.
        
        // (null)  
        String pencil = "";
      //  System.out.println(pencil);
//        byte x=10;
//        byte y=20;
//        byte z=(byte)(x+y);
//
//
        short a=5;            // byte,short, int turunde degiskenler ile islem yapilirken sonuc devamli int
        short b=10;           // ... olacaktir. bu nedenle cast islemi gerekir. !!!
        short c=(short)(a+b);
        int d=a+b;     // ---> zaten int olarak ciktigi icin hata vermedi.
        System.out.println(c);

//        double x=5.2;
//        int y=5;
//        int z=(int)(x)+y; // ----> y zaten int oldugu icin


    }
}
