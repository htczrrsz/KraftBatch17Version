package _49_Day_Exception;

public class C03_Exception_3_Throws_Finally {
    public static void main(String[] args) {


        System.out.println("1");
        try {
            System.out.println("2");
            System.out.println(5/0);
        }catch (Exception e){
            System.out.println("3");

        }finally {       //              bu finally blogu her durum ve sartta calisir.

            System.out.println("4");
        }
        System.out.println("5");


        System.out.println(metot(null));


    }

    public static String metot(String str) {
         try {
            String result = "";
            for (int i = str.length() - 3; i < str.length(); i++) {   // nullpointerexception hatasi
                result += str.charAt(i);
            }
            return result;
        }catch (Exception e){
            return null;
        }
    }



    public  static  void normalMEthod() throws InterruptedException {
        check();                        //   veya try catch kullanilir.
    }




    public static void check() throws InterruptedException {

        Thread.sleep(3000);    // InterruptedException

    }



}
