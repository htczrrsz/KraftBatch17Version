package _26_Day_StringExamples;

public class Task_2_Bosluklara_YuzdeIsareti_EKle {
    public static void main(String[] args) {


        System.out.println(yuzdeIsaretiEkleBosluklara("   mer  haba  "));
    }

    // Kullanıcıdan bir dize sözcük alın ve her boşluğa % ibaresi ekleyin.
    // Merhaba dünya Merhaba%dünya


    public static String yuzdeIsaretiEkleBosluklara(String str){
        return str.replace(" ","%");
    }



}
