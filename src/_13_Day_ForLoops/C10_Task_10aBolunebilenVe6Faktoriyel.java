package _13_Day_ForLoops;

public class C10_Task_10aBolunebilenVe6Faktoriyel {
    public static void main(String[] args) {

        for (int i=10; i<=1000; i++){
            if(i%10==0){
                System.out.print(i+" ");
            }
        }

        System.out.println("=============");

        //6! sonucu nedir ?
        int faktoriyel=1;
        for (int i =1; i<=6; i++){
            faktoriyel=faktoriyel*i;
        }
        System.out.println("6! = " + faktoriyel);

    }
}
