package _15_Day_IfElse_Switch_Loops_Summary;

public class C01_If_Else {
    public static void main(String[] args) {

        int not = -84;
        String str = "";

        if (not>=0 && not<40){
            str= "F";
        }else if (not>=40&&not<55){
            str="D";
        }else if (not>=55&&not<70){
            str="C";
        } else if (not>=70&&not<85) {
            str="B";
        } else if (not>=85 && not<=100) {
            str="A";
        }else {
            System.out.println("Hatali Giris");
        }

        if (!str.equals("")){    // icine bi deger atanmis mi atanmamis mi onu kontrol ediyoruz.
            System.out.println(str);
        }



    }
}
