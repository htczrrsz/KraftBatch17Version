package _57_Day_JavaReview2;

 class A{
    public A() {
        System.out.println("The constructor of Class A is executing");
    }

    public int x;
    public final static int y=33;


   public final void methodA(){
         System.out.println("Method A");
     }

}


class B extends A{

     public B(){
//         super();  gerek yok --> default olarak cagiriyor zaten
         System.out.println("The constructor of class B is executing");
     }


//    public void methodA(){         yulardakine final yazdigimiz icin override edilemedi, hata verdi .
//        System.out.println("Method A (overriden by Class B) ");
//    }

}


public class C04_InheritanceReview {
    public static void main(String[] args) {


   A objA = new A();
        System.out.println("----------------");
        B objB = new B();   // default super() cagirmis oldu --> class A is executing yazdi

        System.out.println("objB.x = " + objB.x);
        System.out.println("B.y = " + B.y);

        objB.methodA();


    }
}
