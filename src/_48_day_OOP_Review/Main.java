package _48_day_OOP_Review;

public class Main {
    public static void main(String[] args) {


        Person person=new Person("Ahmet",30,'m');

        System.out.println(person.toString());

        Employee employee= new Employee("Ahmet",30,'m',"Developer",32000,123456,"IT");

        System.out.println(employee.getId());


        Employee employee1 = new Employee("Ayse", 32, 'F', "Developer", 33000, 123457,"IT");

        employee1.work();
        employee1.eat("Cake");






    }
}
