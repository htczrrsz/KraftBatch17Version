package _39_Day_Constructor_Overloading;

import java.util.Random;

public class Odev_KraftBank {

    public String customerId;
    public String customerFullName;
    public boolean isSms;
    public double customerAccount;
    public String customerToken;


    public Odev_KraftBank(String customerId,String customerFullName, boolean isSms){
        this.customerId=customerId;
        this.customerFullName=customerFullName;
        this.isSms=isSms;
    }

    public Odev_KraftBank(String customerId,String customerFullName, boolean isSms, double customerAccount,String customerToken){
        this(customerId,customerFullName,isSms);
        this.customerAccount=customerAccount;
        this.customerToken=createToken();
    }




    public String createToken(){
        Random random= new Random();
        int randomSayi=random.nextInt(8999)+1000;
        customerToken=(customerId.substring(0,2).concat(customerFullName.substring(0,2).concat(Integer.toString(randomSayi))));
        return customerToken;
    }


  public double addMoney(double money){
      return  this.customerAccount=this.customerAccount+money;
  }



   public String toString(){
        return "KraftBank{ Customer ID= " +customerId +", customer full name = " +customerFullName + ", is sms =" + isSms+
                ", customer account = "+ customerAccount+ ", customer token= " + customerToken+" }";
   }



}

class KraftBankObjects{
    public static void main(String[] args) {

        Odev_KraftBank KraftBank= new Odev_KraftBank("ABC123","Yildiz Yildiz",true);


        System.out.println("KraftBank = " + KraftBank);
        System.out.println("KraftBank.customerToken = " + KraftBank.customerToken);
        System.out.println("KraftBank.createToken() = " + KraftBank.createToken());

        System.out.println("KraftBank.customerToken = " + KraftBank.customerToken);

        KraftBank.customerAccount=4000;
        System.out.println("KraftBank = " + KraftBank);

        System.out.println("KraftBank.addMoney(4500) = " + KraftBank.addMoney(4500));
        System.out.println("KraftBank.customerAccount = " + KraftBank.customerAccount);


    }
}