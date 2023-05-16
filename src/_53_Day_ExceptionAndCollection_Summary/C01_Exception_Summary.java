package _53_Day_ExceptionAndCollection_Summary;

public class C01_Exception_Summary {
    public static void main(String[] args) {

//        System.out.println("Program calisti");
//        try {
//            System.out.println(5 / 0);
//        }catch (ArithmeticException ae){
//            ae.printStackTrace();
//            System.out.println("Hata var kontrol ediniz");
//            System.out.println("Bu hata aritmetik exception hatasidir.");
//        }catch (Exception e){
//            e.printStackTrace();
//        }catch (Throwable t){
//            t.printStackTrace();
//        }

//        System.out.println("program calismaya devam ediyor");



a(5,10);
        System.out.println("ok");
    }
    public static void a(int x, int y){
        if (y-x==5){
            throw new IndexOutOfBoundsException (" 5 olamaz ");
        }

    }



}
