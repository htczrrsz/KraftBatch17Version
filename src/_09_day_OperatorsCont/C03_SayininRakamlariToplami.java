package _09_day_OperatorsCont;

import java.util.Scanner;

public class C03_SayininRakamlariToplami {
    public static void main(String[] args) {
        // Kullanicidan 3 basamakli bir sayi alin
        // ve sayinin rakamlar toplamini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen uc basamakli pozitif bir sayi giriniz: ");


        int number = scan.nextInt();  // 142   --> 1+4+2  =  7
        int lastDigit = number%10;  // lastdigit=2
        int totalOfDigits= lastDigit;  // 2


        number = number/10;  //14
        lastDigit = number%10;  //4
        totalOfDigits= totalOfDigits+lastDigit;   //2+4=6
// totalofdigits +=lastdigits   -->


        number= number/10;   // 14/10=1
        lastDigit=number%10;  //1
        totalOfDigits=totalOfDigits+lastDigit;

        System.out.println("Girilen sayinin rakamlar toplami : " + totalOfDigits);







    }
}
