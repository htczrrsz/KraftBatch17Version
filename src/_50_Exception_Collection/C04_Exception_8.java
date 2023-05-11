package _50_Exception_Collection;

public class C04_Exception_8 {
    public static void main(String[] args) {


       String str=null;

        try{
            for (int i = 0; i <str.length() ; i++) {   // str null oldugu icin uzunlugu yok. hata nullpointerexception
                System.out.println(i);
            }
        }catch (ArithmeticException  |  NullPointerException | IllegalArgumentException n) {   // bu sekilde de yazilabilir. | ile

            System.out.println(1);

        }catch (RuntimeException r){
            System.out.println(3);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println(4);
        }finally {
            System.out.println("her zaman calisir.");
        }
        System.out.println("kod devam ediyor.");






        try{
            System.out.println(5/0);
        }finally {
            System.out.println(1);
        }
        System.out.println("kod devam ediyor");  // kod devam etmez.











    }
}
