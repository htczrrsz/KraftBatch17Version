package _40_Day_Encapsulation;

import java.util.Random;
import java.util.Scanner;

public class KraftBank_Odev {

    private String customerId;
    private String customerFullName;
    private boolean isSms;
    private double customerAccount;
    private String customerToken;




    public KraftBank_Odev(String customerId, String customerFullName, boolean isSms){
        this.customerId=customerId;
        this.customerFullName=customerFullName;
        this.isSms=isSms;
    }

    public KraftBank_Odev(String customerId, String customerFullName, boolean isSms, double customerAccount){
        this.customerId=customerId;
        this.customerFullName=customerFullName;
        this.isSms=isSms;
        this.customerAccount=customerAccount;
        this.customerToken=createToken();
    }




    private String createToken(){
        Random random= new Random();
        int randomSayi=random.nextInt(8999)+1000;
        String ilkIkiHarf=customerId.substring(0,2);
        String ilkIki=customerFullName.substring(0,2);
        customerToken=ilkIkiHarf+ilkIki+randomSayi;

        return customerToken;
    }


    public double addMoney(double money){
        return this.customerAccount=this.customerAccount+money;
    }



    public String toString(){
        return "KraftBank{ Customer ID= " +customerId +", customer full name = " +customerFullName + ", is sms =" + isSms+
                ", customer account = "+ customerAccount+ ", customer token= " + customerToken+" }";
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getCustomerFullName() {
        return customerFullName;
    }

    public void setCustomerFullName(String newCustomerFullName) {
        Scanner scan= new Scanner(System.in);
        System.out.println("token giriniz :");
        String token= scan.nextLine();
        if (!token.equals(this.customerToken)){
            System.out.println("Hatali token girildigi icin degistirilmedi !!! ");
            return;
        }
        System.out.println("basarili");
        this.customerFullName = newCustomerFullName;

    }

    public double getCustomerAccount() {
        return customerAccount;
    }

    public String getCustomerToken() {
        return customerToken;
    }

    public boolean getIsSms() {
        return isSms;
    }

    public void setIsSms(boolean sms) {
        isSms = sms;
    }



}
