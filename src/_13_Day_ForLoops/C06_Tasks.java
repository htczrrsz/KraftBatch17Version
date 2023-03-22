package _13_Day_ForLoops;

public class C06_Tasks {
    public static void main(String[] args) {


        // Bir prig yazin  0-100 arasindaki tum sayilari yazdirsin

        for (int i = 0; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println("==================");

// 15-100 arasi sayilari yazdirin

        for (int i = 15; i <= 100; i++) {
            System.out.print(i + " ");
        }

        System.out.println("------------------");


        for (int i = 100; i >= 0; i--) {

            System.out.print(i + " ");
        }

        System.out.println("=================");
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        //   for (int i=0; i<=100; i+=2)  de kullanilabilir.

        System.out.println("==========");

        // 0-100 arasi tek sayilari

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }

        System.out.println("------------");

        //1-100 arasindaki sayilarin toplamini bulunuz

        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i; // sum= sum+i

        }
        System.out.println("sum = " + sum);   // bilerek disari yazdik. hepsini toplayip disari yazsin diye.

        System.out.println("===============");

        for (int i=1; i<=20; i++){
            System.out.print(i+" "+i*i*i);
        }

        System.out.println("----------");

// 23 ile 50 derece arasinda olan tum fahrenheit degerlerini ekrana yazdirin
        // C=(F-32)/1.8     F=1.8C+32 F   23*1.8+32

        for (int i=23; i<=50; i++){
            System.out.print(i+"C = "+ i*1.8+32+ " F");
        }

        System.out.println("==============");

        // a'dan zye kadar olan harfleri ekrana yazdirin
        for (char ch= 'a' ; ch<='z' ; ch++){
            System.out.print(ch+ " ");
        }

        System.out.println("---------");

        for (char ch= 'A' ; ch<='Z' ; ch++) {
            System.out.print(ch + " ");
        }

        System.out.println("======");

        for (int i =1; i<=10; i++){
            System.out.println("9 X " + i + " = " + 9*i);
        }

    }
}
