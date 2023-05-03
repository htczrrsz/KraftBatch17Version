package _46_Day_AbstractClassAndInterface.animal;

public abstract class Animal {


    private String name;

    private final String breed;

    private final char gender;

    private int age;

    private String size;

    private final String color;

    public static boolean canBreathe;


    static{
        canBreathe=true;
    }



    public Animal(String name, String breed, char gender, int age, String size, String color) {
        setName(name);
        this.breed = breed;
        if (!(gender=='M' || gender=='m'|| gender=='f' || gender=='F')){
            System.err.println("Invalid Gender" + gender);
        }
        this.gender = gender;

        setAge(age);
        setSize(size);
        this.color = color;
    }


    public void setName(String name) {
        if (name.isEmpty()){
            System.err.println("Invalid Name" + name);
        }
        this.name = name;
    }


    public void setAge(int age) {
        if (age<=0){
            System.err.println("Invalid Age" + age);
        }
        this.age = age;
    }


    public void setSize(String size) {
        this.size = size;
    }



    public String getName() {
        return name;
    }



    public String getBreed() {
        return breed;
    }


    public char getGender() {
        return gender;
    }


    public int getAge() {
        return age;
    }

    public String getSize() {
        return size;
    }


    public String getColor() {
        return color;
    }


    public abstract void eat();  // abstract class different in all animals

    public final void drink(){
        System.out.println(name + " is drinking water");
    }








    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }




/*Animal task:


               Create an abstract class named Animal:
                    Variables:
                    name, breed(final), gender(final),  age, size, color(final)

                    Encapsulate all the fields

                    Add a constructor that can set all the fields

                    Methods:
                        eat(); ==> different animals eat different foods   // abstract method
                        drink() ==> all the animals drink water           // normal method
                        toString() ==> to display the full info of the animal
*/









}
