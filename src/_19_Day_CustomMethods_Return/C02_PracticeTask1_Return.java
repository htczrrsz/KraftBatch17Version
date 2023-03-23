package _19_Day_CustomMethods_Return;

public class C02_PracticeTask1_Return {
    public static void main(String[] args) {

        System.out.println("oddNumbers = " + oddNumbers());
        System.out.println("-------");
        System.out.println(evenNumbers());

        System.out.println("-------");

        System.out.println("eligibleForAlcoholPurchase(30) = " + eligibleForAlcoholPurchase(30));
        System.out.println("-------");

        System.out.println("eligibleToVote(30,\"tr\") = " + eligibleToVote(15, "tr"));
        System.out.println("-------");

        System.out.println("grades(67) = " + grades(67));
        System.out.println("grades(98) = " + grades(98));
        System.out.println("-------");

        System.out.println("areaOfCircle(2) = " + areaOfCircle(2));

        System.out.println("-------");
        System.out.println("areaOfSquare(4) = " + areaOfSquare(4));

        System.out.println("-------");
        System.out.println("dollarToTL(1500) = " + dollarToTL(1500));


    }


    // 1. create a method that can return odd numbers between 1-100 in a same line separated by space

    /**
     * a method that can return a str odd numbers between 1-100 in a same line separated by space
     */
    public static String oddNumbers(){
       String result= " ";
        for (int i = 1; i <100 ; i+=2) {
            result+=i+" ";
        }
        return result;

    }




    //    2. create a method that can print even numbers between 1~100 in a same line separated by space

    /**
     * a method that can print even numbers between 1~100 in a same line separated by space
     * @return
     */
    public static String evenNumbers(){
        String result=" ";
        for (int i=2; i<100; i+=2){
            result+=i+" ";
        }
        return result;
    }


    //    3. create a method that returns a boolean value if a person is eligible to buy alcohol

    /**
     * a method that can check if a person is eligible to buy alcohol
     * and age limit is 21
     * @param age
     */
    public static boolean eligibleForAlcoholPurchase(int age){
        boolean eligible ;
        if (age<=21){
           eligible=false;
        }else{
            eligible=true;
        }
        return eligible;
    }


    //    4. create a method that can check if a person is eligible to vote
    //    Ex:
    //                eligibleToVote(19, "TR");
    //
    //            output:
    //                You are not eligible to vote!

    /**
     * a method that can check if a person is eligible to vote
     * @param age
     * @param citizenship
     */
    public static boolean eligibleToVote(int age, String citizenship){
        boolean isEligible= age>=18 && citizenship.equalsIgnoreCase("TR");
        return isEligible;

    }





//    5. create a method that can calculate the grade of the student based on the score
// score >= 90 grade 'A'
// score >= 80 grade 'B'
// score >= 70 grade 'C'
// score >= 60 grade 'D'
// score < 60 grade 'F'

    /**
     * a method that return char calculate the grade of the student based on the score
     * score >= 90 grade 'A'
     * score >= 80 grade 'B'
     * score >= 70 grade 'C'
     * score >= 60 grade 'D'
     * score < 60 grade 'F'
     * @param score
     */
    public static char grades(int score){
        char grade;
        if (score>=90){
            grade='A';
        }else if (score>=80){
            grade='B';
        }else if (score>=70){
            grade='C';
        }else if (score>=60){
            grade='D';
        }else {
            grade='F';
        }

        return grade;

}



//    6. create a method that can calculate the area of a circle

    /**
     * a method that return calculate the area of a circle
     * @param radius
     */
    public static double areaOfCircle(int radius){
        double area;
        area= Math.round(Math.PI *radius*radius*100)/100.0;
        return area;
    }


//    7. create a method that can calculate the area of a square

    /**
     * a method that return calculate the area of a square
     * @param side
     */
    public static double areaOfSquare(int side){
        return side*side;
    }




//    8. create a method that return convert dollar to TL rate:19.04
    /**
     * a method that return convert dollar to TL rate:19.04
     */
    public static double dollarToTL(int dollar){
        return dollar*19.04;
    }


}
