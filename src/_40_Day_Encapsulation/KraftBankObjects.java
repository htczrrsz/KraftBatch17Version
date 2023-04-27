package _40_Day_Encapsulation;

public class KraftBankObjects {
    public static void main(String[] args) {


        KraftBank_Odev kraftBank1 = new KraftBank_Odev("ABC123", "Yildiz Yildiz", true);
        KraftBank_Odev kraftBank2 = new KraftBank_Odev("ABC123", "Yildiz Yildiz", true, 4000);

        System.out.println("kraftBank2 = " + kraftBank2);
        System.out.println("kraftBank2.getCustomerToken() = " + kraftBank2.getCustomerToken());

        System.out.println("kraftBank2.getCustomerAccount() = " + kraftBank2.getCustomerAccount());
        System.out.println("kraftBank2.getCustomerId() = " + kraftBank2.getCustomerId());

        kraftBank2.setIsSms(false);
        System.out.println("kraftBank2 = " + kraftBank2);

        kraftBank1.addMoney(5000);
        System.out.println("kraftBank1.getCustomerAccount() = " + kraftBank1.getCustomerAccount());

        // kraftBank2.setCustomerFullName("Hatice Z");
       // System.out.println("kraftBank2 = " + kraftBank2);



    }
}