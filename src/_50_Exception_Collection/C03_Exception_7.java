package _50_Exception_Collection;

public class C03_Exception_7 {
    public static void main(String[] args) {


//        int i=50;
//        if (i<100){
//            System.out.println(1);
//        } else if (i<70){
//            System.out.println(2);
//        }else if (i<50){
//            System.out.println(3);
//        }else{
//            System.out.println(4);
//        }


        String str=null;
//        if (str==null){
//
//        }
        try{
            for (int i = 0; i <str.length() ; i++) {   // str null oldugu icin uzunlugu yok. hata nullpointerexception
                System.out.println(i);
            }
        }catch (ArithmeticException a) {
            System.out.println(1);
//        }catch (NullPointerException n) {
//            n.printStackTrace();
//            System.out.println(2);
        }catch (RuntimeException r){
            System.out.println(3);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println(4);
        }finally {
            
        }
        System.out.println("kod devam ediyor.");



//        try{
//            System.out.println(5/0);
//        }catch (ArithmeticException a){
//            System.out.println(1);
//        }catch (Exception e){
//            System.out.println(2);
//        }
//        System.out.println("kod devam ediyor");





    }
}
