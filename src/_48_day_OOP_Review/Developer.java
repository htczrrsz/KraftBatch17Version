package _48_day_OOP_Review;

public class Developer extends Employee {


    public String programmingLanguage;

    public Developer(String name, int age, char gender, double salary, int id, String departmentName, String programmingLanguage) {
        super(name, age, gender,"Developer", salary, id, departmentName);
        this.programmingLanguage = programmingLanguage;
    }


    public void fixBug(){
        System.out.println(jobTitle +" "+ name +" is coding");
    }


    public void coding(){
        System.out.println(jobTitle+" " + name +" is programming " + programmingLanguage);
    }





}
