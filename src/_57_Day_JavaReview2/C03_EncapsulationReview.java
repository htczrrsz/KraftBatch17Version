package _57_Day_JavaReview2;

class Employee{

   private String name;

   private double salary;

   private char gender;

    public Employee(String name, double salary, char gender) {
        setName(name);
        setSalary(salary);
        setGender(gender);
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", gender=" + gender +
                '}';
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary<=0){
            throw new RuntimeException("Salary can not be set to zero or negative number ! ");
        }
        if (salary<=10000){
            throw new RuntimeException(" Insufficient salary for a human being, employees are not your slaves !! ");
        }
        this.salary = salary;
    }


    public char getGender() {
        return gender;
    }


    public void setGender(char gender) {
        if (!(gender=='M' || gender=='m' || gender=='f' || gender=='F')){
            throw new RuntimeException("Invalid gender, please enter 'M' or 'm' for Male , 'F' or 'f' for Female ");
        }
        this.gender = gender;
    }


    public String getName() {
        if (name==null){
            throw new RuntimeException("Name has not been set !");
        }
        return name;
    }


    public void setName(String name) {
        if (name==null){
            throw new RuntimeException("Name can not be set to Null !");
        }
        if (name.isEmpty()){
            throw new RuntimeException("Name can not be Empty !");
        }
        this.name = name;
    }


}




public class C03_EncapsulationReview {
    public static void main(String[] args) {

        Employee employee1= new Employee("Serka",23000,'M');   // default constructor
//        System.out.println("employee1.name = " + employee1.name); // private oldugu icin boyle erisilmez.

        employee1.setName("Serkan");
        System.out.println("employee1.getName() = " + employee1.getName());


        Employee employee2= new Employee("Sener", 28000,'M');
        employee2.setSalary(50000);

        employee2.setGender('n');
        System.out.println(employee2);





    }
}
