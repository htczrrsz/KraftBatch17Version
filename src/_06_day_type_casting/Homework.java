package _06_day_type_casting;

public class Homework {
    public static void main(String[] args) {

//        Bir musluğu A musluğu tek başına 12 saatte, B musluğu 30 saatte dolduruyor,
//        c musluğu ise dolu havuzu 9 saatte boşaltıyor.
//        Buna göre bu 3 musluk birlikte açıldığında boş havuz kaç saatte dolar.


        double a=12;
        double b=30;
        double c=9;
        double havuzDolmaSuresi=(1/(1/a+1/b-1/c));
        System.out.println(havuzDolmaSuresi);

//        double a=12;
//        double b=18;
//        double c=-9;
//        double havuzunDolmaSuresi=(1/(1/a+1/b+1/c));
//        System.out.println(havuzunDolmaSuresi);




    }
}
