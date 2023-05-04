package _46_Day_AbstractClassAndInterface.animal;

public class MyZoo {
    public static void main(String[] args) {


       //  Animal animal=new Animal("adas","asfasf",'f', 5,"medium", "red");
       //  abstract oldugu icin obje olusturamayiz


        Cat cat = new Cat("Cesur","Scottish",'M',9,"Medium","Gray");
        cat.eat();
        cat.meow();
        cat.play();
        cat.setSize("Large");
        cat.setName("Tufan");
        System.out.println(cat);


    }
}
