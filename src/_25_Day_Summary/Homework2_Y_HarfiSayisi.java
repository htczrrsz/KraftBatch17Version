package _25_Day_Summary;

public class Homework2_Y_HarfiSayisi {
    public static void main(String[] args) {
//"javayı Seviyor muyum?" ifadesindeki y harfinin sayısını veren bir program yazın.

        String a= "Javayi Seviyor Muyum ?";
        String ySiz= a.replace("y","");
        System.out.println("y harfi sayisi :  " + (a.length() - ySiz.length()));


    }
}
