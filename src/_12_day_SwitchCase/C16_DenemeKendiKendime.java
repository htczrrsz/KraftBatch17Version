package _12_day_SwitchCase;

public class C16_DenemeKendiKendime {
    public static void main(String[] args) {

        String str = "teneke";
        String reversed = " ";

        for (int i=str.length()-1 ; 0<=i ;  i--){
            reversed+=str.charAt(i);
        }System.out.println(reversed);

    }
}
