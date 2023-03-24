package _19_Day_CustomMethods_Return;

public class C08_Odev_Gunler {

    public static void main(String[] args) {
        System.out.println("daysOfWeek(4) = " + daysOfWeek(4));
        System.out.println("daysOfWeek(0) = " + daysOfWeek(0));


    }
    // Create a method that returns the name of the day based on the given number to the method

    public static String daysOfWeek (int number){
        String name= " ";
        switch (number){
            case 1:
                name="Monday";
                break;
            case 2:
                name="Tuesday";
                break;
            case 3:
                name="Wednesday";
                break;
            case 4:
                name="Thursday";
                break;
            case 5:
                name= "Friday";
                break;
            case 6:
                name="Saturday";
                break;
            case 7:
                name= "Sunday";
                break;
            default:
                name= "Invalid";

        }
        return name ;
    }


}
