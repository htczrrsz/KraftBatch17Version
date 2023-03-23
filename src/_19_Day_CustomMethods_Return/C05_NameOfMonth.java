package _19_Day_CustomMethods_Return;

public class C05_NameOfMonth {
    public static void main(String[] args) {

        System.out.println("nameOfMonth(7) = " + nameOfMonth(7));
        System.out.println("nameOfMonth(1) = " + nameOfMonth(1));


    }


    public static String nameOfMonth(int number) {
        String name = " ";
        switch (number) {
            case 1:
                name += "Jan";
                break;
            case 2:
                name += "Feb";
                break;
            case 3:
                name += "Mar";
                break;
            case 4:
                name += "Apr";
                break;
            case 5:
                name += "May";
                break;
            case 6:
                name += "Jun";
                break;
            case 7:
                name += "July";
                break;
            case 8:
                name += "Aug";
                break;
            case 9:
                name += "Sep";
                break;
            case 10:
                name += "Oct";
                break;
            case 11:
                name += "Nov";
                break;
            case 12:
                name += "Dec";
                break;
            default:
                name += "Invalid";


        }
        return ("Month name : " + name);


    }


}
