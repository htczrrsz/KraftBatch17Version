package _58_Day_JavaReviews3;

public class C03_ExceptionsReview {
    public static void main(String[] args) throws Exception {


//        List<Car> myGarage = new ArrayList<>();
//        while (true){
//            myGarage.add(new Tofas());
//        }
//     outOfMemoryError  -> can not be handled

//        methodWithRunTimeException();
//        System.out.println("Bye bye Java");


        String str = "ABC";

        try{
            int num = Integer.parseInt(str);
        }catch(NumberFormatException e){
            System.out.println("Invalid numeric format " + str);
            e.printStackTrace();
        } finally {
            System.out.println("Hi guys ");
        }



        System.out.println("bye bye java");


//        System.out.println(num);   // NumberFormatException



    }



    public static void methodWithRunTimeException() throws Exception {  // method signature
        throw new RuntimeException("This is a Runtime Exception");
    }



}
