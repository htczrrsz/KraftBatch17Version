package _13_Day_ForLoops;

public class C09_CalismaTekrar {
    public static void main(String[] args) {

        // [0-100] arasindaki tum sayilari yazdirsin.

        for (int i=0 ; i<=100 ; i++){
            System.out.print(i + " ");

            }
        System.out.println("================");
        // [15-100] arasindaki sayilar
        for (int i=15; i<=100; i++){
            System.out.print(i+" ");
        }
        System.out.println("--------------");

        // 100 den baslayip tersten yazdir 0'a kadar.
        for (int i =100; i>=0  ; i--){
            System.out.print(i+ " ");
        }

        System.out.println("============");

        //0-100 arasindaki tum cift sayilari yazdir.

        for (int i=0; i<=100; i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }


        System.out.println("---------");

        // 0-100 arasi tek sayilar.
        for (int i=1; i<=100; i++){
            if(i%2==1){
                System.out.print(i+" ");
            }
        }

        System.out.println("==========");

        // 1-100 arasindaki sayilarin toplamini konsola yazdirin.

        int sum=0;
        for (int i=1; i<=100; i++){
         sum=sum+i; // sum+=i;
        }
        System.out.print("Sum= " + sum);

        System.out.println("-------------");

        //1-20 kadar olan sayilarin kuplerini alin carpin
        for (int i=1; i<=20; i++){
            System.out.println(i +"="+ i * i * i);
        }

        System.out.println("==========");

        //23 derece ile 50 arasi olan tum fahrenheit degerlerini ekrana yazdiriniz.
        // (C=(F-32)/1.8)  F=1.8C+32    23*1.8+32=F

        for (int i=23; i<=50; i++){
            System.out.println(i + " C = " + ((i*1.8)+32) + "F");
        }

        System.out.println("---------");

        // a dan z ye kadar olan sayilari yazdirin.
        for (char ch = 'a'; ch<='z' ; ch++){   // char ch='A' dersek de buyuk harfleri yazar.
            System.out.print(ch+" ");



        }

    }
}
