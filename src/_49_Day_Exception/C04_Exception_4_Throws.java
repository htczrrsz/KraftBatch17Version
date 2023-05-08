package _49_Day_Exception;

public class C04_Exception_4_Throws {
    public static void main(String[] args) {



    }


       public static void a(){
     //    d();   // d duzeltilmedigi icin hata almaya devam eder

       }


    public static void b(){
     c();
    }


    public static void c() {
        try {
            d();
        } catch (Exception e) {
        }
    }



    public static void d() throws InterruptedException {  // check exceptionlarda bunu kullanabiliyoruz. unchecklerde handle etmemiz gerek.
       Thread.sleep(3000);
    }




}
