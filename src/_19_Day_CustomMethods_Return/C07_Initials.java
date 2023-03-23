package _19_Day_CustomMethods_Return;

public class C07_Initials {
    public static void main(String[] args) {


        System.out.println("initials(\"hatice\", \"zararsiz\") = " + initials("hatice", "zararsiz"));


    }

//1. Create a method that can display the initials of the person.    initials(String firstName, String lastName)

    public static String initials(String firstName, String lastName ){
        String result=" ";
        result= firstName.charAt(0)+"."+lastName.charAt(0);
        result=result.toUpperCase();
        return result;
    }



}
