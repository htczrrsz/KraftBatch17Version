package _44_Day_Final;

public class C extends B {
    int a=5;


    void metodC(){
        System.out.println(super.a);  // C classinin superi B oldugu icin B'deki a'nin karsiligini verir. yani 10.
        metodA();
        metodB();
        metodC();

    }



}
