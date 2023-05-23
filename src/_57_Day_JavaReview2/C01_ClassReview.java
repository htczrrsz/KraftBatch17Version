package _57_Day_JavaReview2;

class Person{
    public String name;
    public char gender;
    public int age;

    public static String species  ="Homo Sapiens";
    public static final String speciesInEnglish ="Human";



    public Person (String name){
        this.name=name;
    }


    public Person(String name, char gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';

    }
}




public class C01_ClassReview {
    public static void main(String[] args) {

        Person person1 = new Person("Harun");    // default constructor will work if no constructor written in the class
        System.out.println("person1.name = " + person1.name);
        person1.name="Hans";
        person1.age=35;
        person1.gender='M';



        System.out.println("person1.name = " + person1.name);

        System.out.println(person1);   // will print out reference to the console , we don't have toString() method


        Person person2= new Person("Sam",'M',41);
        Person person3= new Person("Tony",'M',26);
        Person person4= new Person("Jony",'M',30);

        System.out.println("person2 = " + person2);
        System.out.println("person3 = " + person3);
        System.out.println("person4 = " + person4);

        System.out.println("Person.species = " + Person.species);
        System.out.println("Person.speciesInEnglish = " + Person.speciesInEnglish);

//      System.out.println("person1.species = " + person1.species);  ide onermez cunku class adiyla ulasmamiz dogru. kendimiz yazabiliriz ama tavsiye degil

//      person1.species="Homo Erectus";     birini degistirince hepsinde degisti, cunku static
//      System.out.println("person4.species = " + person4.species);



    }
}
