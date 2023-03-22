package _12_day_SwitchCase;

public class C14_Task_Sayi_NestedIF {
    public static void main(String[] args) {

        int sayi = 19;

        if (sayi>5) {
            System.out.println("Sayi 5'ten buyuktur.");
        }if (sayi>5&&sayi<25){
            System.out.println("Sayi 5'ten buyuk ancak 25'ten kucuktur.");

        }else if (sayi>25){
            System.out.println("Hem 5, hem 25'ten buyuktur.");
        }else{
            System.out.println("Sayi 50'den buyuktur.");
        }


    }
}
