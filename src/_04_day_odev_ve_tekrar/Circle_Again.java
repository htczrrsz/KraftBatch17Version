package _04_day_odev_ve_tekrar;

public class Circle_Again {
    public static void main(String[] args) {
        double PI = 3.14;
        double r = 5.5;
        double area = PI*r*r;
        System.out.println("area = " + area);


        r=4;  // boyle yaparsam yukardaki degeri bu yazdigim 4 ile degistirir.


        double perimeter = PI*2*r;
        System.out.println("perimeter = " + perimeter);

        System.out.println("PI = " + PI);
        System.out.println("r = " + r);





    }
}

/*  Calculate the area & perimeter ...
hints: PI=3.14
area= radius * radius * PI
perimeter= diameter*PI

 */