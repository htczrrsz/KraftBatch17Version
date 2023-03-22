package _12_day_SwitchCase;

import java.util.Scanner;

public class C15_Task_Motel {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Lutfen motelimizi tanimak icin 1-2-3 bir kat numarasi girin : ");
        int kat= scan.nextInt();
        switch (kat){
            case 1 :
                System.out.println("Lutfen oda adi numarasi girin : \n1.Resepsion\n2.Guvenlik\n3.Oda Hizmetleri ");
                int kat1= scan.nextInt();
                switch (kat1){
                    case 1:
                        System.out.println("Resepsion : Tum islemleriniz icin bekleriz.");
                        break;

                    case 2 :
                        System.out.println("Guvenlik : Profesyonel bir hizmettir.");
                        break;
                    case 3:
                        System.out.println("Oda Hizmetleri : Temizlik ve tasima hizmetleri icin 101 dahili hattan ulasabilirsiniz.");
                        break;
                    default:
                        System.out.println("Hatali giris");
                }break;
            case 2 :
                System.out.println("Lutfen oda adi numarasi girin : \n1.Yemekhane\n2.Dinlenme Salonu\n3.Room1-Room-2");
                int kat2 = scan.nextInt();
                switch (kat2){
                    case 1:
                        System.out.println("Yemekhane : Kahvalti 08-11 \nOgle Yemegi 12-15 \nAksam Yemegi 18-21");
                        break;
                    case 2:
                        System.out.println("Dinlenme Salonu : 24 saat cay servisi ile hzmetinizdedir.");
                        break;
                    case 3:
                        System.out.println("Room1 , Room2 : Ekonomik Oda");
                        break;
                    default:
                        System.out.println("Hatali giris");
                }break;
            case 3:
                System.out.println("Lutfen oda adi numarasi girin : \n1.Room3-Room4 \n2.Room5-Room6");
                int kat3= scan.nextInt();
                switch (kat3){
                    case 1:
                        System.out.println("Room3, Room4 : Standart Oda ");
                        break;
                    case 2:
                        System.out.println("Room5, Room6 : Ozel Oda ");
                        break;
                    default:
                        System.out.println("Hatali giris ");
                }
                break;

        }




    }
}
