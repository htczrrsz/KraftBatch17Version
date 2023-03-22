package _12_day_SwitchCase;

public class C06_Switch_Case {
    public static void main(String[] args) {


        // byte, short, int, String, char tipindeki degerleri karsilastirmak icin kullanilir.

        System.out.println("Giris");
        int sayi = 3;
//            \
//             \
//           ikisi ayni
        switch (sayi){
            case 1:
                System.out.println("sayi 1'e esit");
                break;
            case 2:
                System.out.println("sayi 2'ye esit");
                break;
            case 3:
                System.out.println("Sayi 3'e esit");
                break;
            default:
                System.out.println("Sayi eslesmedi ");

        }

        System.out.println("Cikis");


    }
}
