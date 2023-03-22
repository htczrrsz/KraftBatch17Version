package _11_day_ControlFlowStatements_IF;

public class C06_IF_IfElse {
    public static void main(String[] args) {

        // A ve B 2 adet int sayiyi karsilastirin.
        // A buyuktur B den
        // B buyuktur A'dan
        // esitse de A ve B esittir.

//        int a = 10;
//        int b= 20;
//        if(a>b){
//            System.out.println("A buyuktur B'den ");
//        } else if(a==b){
//            System.out.println("A ve B esittir");
//        }else{
//            System.out.println("B buyuktur A'dan");
//        }


//        System.out.println("A");
//        if (true){
//            System.out.println("B");
//        }else if(false){
//            System.out.println("C");
//        }else if(false){
//            System.out.println("D");
//        }else {
//            System.out.println("E");
//        }
//        System.out.println("F");


        // bir prog yazin eger x =10 ise y ye 20 atansin
        //degil ise y ye 0 atansin.

//        int x= 10, y=0;
//        if (x==10){
//            y=20;
//        }
//        System.out.println("y = " + y);


        // Bir program yazın eğer x in değeri 10 ise y ye 20 atansın,.
        // x in değeri 20 ise y ye 30 atansın,
        // x in değeri 30 ise y ye 40 atansın,.
        // değil ise y ye 0 atansın.
/*
        int x=50, y=0;
        if(x==10){
            y=20;
        } else if(x==20){
            y=30;
        }else if (x==30){
            y=40;
        }else {
            System.out.println("x bulunamadi");
        }
        System.out.println("y = " + y);

*/

        //Br prog yazin sicaklik 20derece ve ustu ise String message
        // degiskenine butterfly flies assign edilsin

 /*       String str;
        int degree=19;
        if(degree>=20){
            str="Butterfly flies";
        }else {
            str="";
        }
        System.out.println(str);
*/

        // aysenin harcligi 5 liradan daha az ise bbaasi ona 10 lira versin

//        int aysePara=4;
//
//        if(aysePara<5){
//            aysePara=aysePara+10;
//        }
//        System.out.println("aysenin parasi = " + aysePara);


//        int a,b,c ;
//        a=20;
//        b=30;
//        c=30;
//
//        if((a+b)>c) {
//           // c=a-b;
//           //  c=Math.abs((a-b));
//           //  c=Math.max(a,b)-Math.min(a,b);  // eksi cikmamasi icin
//
//            if((a-b)>=0){
//                c=a-b;
//            }else{
//                c=-(a-b);
//                // c= b-a;
  //          }
  //      }
 //       System.out.println(c);


//     3 adet ic aci alsin ve ucgen olup olmadigini kontrol etsin.

//       int x,y,z;
//       x=60;
//       y=60;
//       z=65;
//       if((x+y+z)==180){
//           System.out.println("Bu bir ucgendir");
//       }else{
//           System.out.println("ucgen degildir");
//       }


        // bir prog yazin 3 aci kabul etsin, acilardan biri 90 ise bur bir dik ucgendir mesaji dondursun.

        int x,y,z;
        x=80;
        y=50;
        z=50;
        if((x+y+z==180)){
            if(x==90||y==90||z==90){
                System.out.println("Bu bir dik ucgendir");
            }else{
                System.out.println("bu bir dik ucgen degildir");
            }

        }else {
            System.out.println("Bu bir ucgen degildir");
        }




    }
}
