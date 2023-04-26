package _39_Day_Constructor_Overloading;



public class Odev_Cat {

    public String eyeColor;
    public String breed;
    public boolean isFat;
    public boolean isPet;

    public Odev_Cat(){
    };

    public Odev_Cat(String eyeColor){
        this.eyeColor=eyeColor;
    }

    public Odev_Cat(String eyeColor, String breed){
        this.eyeColor=eyeColor;
        this.breed=breed;
    }

    public Odev_Cat(String eyeColor, String breed, boolean isFat){
        this.eyeColor=eyeColor;
        this.breed=breed;
        this.isFat=isFat;
    }


    public Odev_Cat(String eyeColor, String breed, boolean isFat, boolean isPet){
        this.eyeColor=eyeColor;
        this.breed=breed;
        this.isFat=isFat;
        this.isPet=isPet;
    }

    public void sleep(){
        System.out.println("The cat is sleeping. ");
    }

    public void food(){
        System.out.println("The cat is eating. ");
    }

    public void run(){
        System.out.println("The cat is running. ");
    }

    public String toString(){
        return "Cat { eye color = " + eyeColor +", breed = "+ breed +", is fat = " + isFat +", is pet = " + isPet +" }";
    }

}


class CatObjects{
    public static void main(String[] args) {
        Odev_Cat cat1= new Odev_Cat("Green","British Shorthair",true,true);

        System.out.println("cat1 = " + cat1);
        cat1.sleep();
        cat1.food();
        cat1.run();


    }



}
