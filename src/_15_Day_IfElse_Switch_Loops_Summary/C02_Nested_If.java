package _15_Day_IfElse_Switch_Loops_Summary;

public class C02_Nested_If {
    public static void main(String[] args) {

        // alinin cebinde 100 tl var ise ve zamani varsa sinemaya gitsin.
        // 100 tl yoksa evde kalsin.

        int aliParasi= 120;
        boolean zaman=true;

        if (aliParasi>=100){
            if (zaman){
                System.out.println("Sinemaya gidebilir.");
            }else{
                System.out.println("Zamani yok gidemez.");
            }
        }else{
            System.out.println("Parasi yok gidemez.");
        }





    }
}
