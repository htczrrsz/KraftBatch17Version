package _36_Day_Wrapper_Class;

public class C03_AlininYasi {
    public static void main(String[] args) {





        // "Ali'nin dogum yili 1996" ise 10 yil sonra ali kac yasinda olur?
        // Ali 37 yasinda olur.

        String str="Ali'nin dogum yili 1996";
        String[] strArrayName=str.split("'");
        String name=strArrayName[0];
        String[] strArrayYil=str.split(" ");
        String yil=strArrayYil[strArrayYil.length-1];


        int onYilSonrakiYas=2023-Integer.parseInt(yil)+10;
        System.out.println(name + " " + onYilSonrakiYas + " yasinda olur. ");


    }
}
