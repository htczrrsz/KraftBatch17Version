package _38_Day_Constructors;

public class C04_StringArgsExample {

    // ozel bir metod
    // args arguments kisaltilmisi
    // String[] args
    // bu argumanlar disardan girilen veriler

    public static void main(String[] args) {
        System.out.println("args.length = " + args.length);
        for (String arg : args) {
            System.out.println(arg);
        }
        args[0]="Isa";
        args[1]="Musa";
        
        System.out.println();

        for (String arg : args) {
            System.out.println(arg);
        }

    }


}
