package _09_day_OperatorsCont;

public class C05_RelationalOperators {
    public static void main(String [] args){

        // >, >= , < , <=, ==, !=

        boolean result1= (60>40);
        System.out.println("result1 = " + result1);

        boolean result2= (200>=200);    // ---> true
        System.out.println("result2 = " + result2);

        boolean result3= (200>=300);    // ---> true
        System.out.println("result3 = " + result3);

        System.out.println("----");

        // findexScore of 1500
        int findexScore = 1650;

        boolean isEligibleForLoan = (findexScore >=1500);
        System.out.println("isEligibleForLoan = " + isEligibleForLoan);

        System.out.println("------");

        boolean result4 = 100<200;
        System.out.println("result4 = " + result4);

        boolean result5= 300<200 ;
        System.out.println("result5 = " + result5);

        System.out.println("------");

        int score= 75;
        boolean hasFailed= score<=59;
        System.out.println("hasFailed = " + hasFailed);

        boolean result6 = 45<= 60;
        System.out.println("result6 = " + result6);

        int x = 100;
        int y = 200;
        boolean isEqual = x==y;
        System.out.println("isEqual = " + isEqual);

        boolean result7 = "Ihsan" == "Ahmet";
        System.out.println("\nresult7 = " + result7);

        boolean result8= 'A' == 'a';
        System.out.println("result8 = " + result8);

        boolean result9 = "Java" == "Java";   // STRINGLERDE == (RELATIONAL) KULLANILMAZ !!!
        System.out.println("result9 = " + result9);

        System.out.println("------");

        boolean result10 = 100 != 200;
        System.out.println("result10 = " + result10);

        boolean result11= 200!=200;
        System.out.println("result11 = " + result11);

        boolean result12= "Java" != "Zor";
        System.out.println("result12 = " + result12);



    }
}
