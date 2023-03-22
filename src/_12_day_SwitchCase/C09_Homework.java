package _12_day_SwitchCase;

public class C09_Homework {
    public static void main(String[] args) {



        int beden = 50;
        switch (beden){
            case 38,40,42:
                System.out.println("small");
                break;
            case 44,46,48:
                System.out.println("medium");
                break;
            case 50,52,54:
                System.out.println("large");
            default:
                System.out.println("beden mevcut degildir");


        }
    }
}
