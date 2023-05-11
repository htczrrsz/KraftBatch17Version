package _50_Exception_Collection;

public class C02_Exception_6 {
    public static void main(String[] args)  {

//
//        //  chrome u ac
//            Thread.sleep(5000);
//        for (int i = 0; i <10 ; i++) {
//            Thread.sleep(3000);  // kodu 3 saniye uyutuyor
//            System.out.print(i);
//        }




          b();







    }


   static void b()  {
        try{
            a();
        }catch (Exception e){
            e.printStackTrace();
        }

    }


   static void a() throws InterruptedException {
        Thread.sleep(3000);
    }




}
