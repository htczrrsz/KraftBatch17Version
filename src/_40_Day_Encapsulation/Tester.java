package _40_Day_Encapsulation;

public class Tester {
// bir tane public class olabilir ancak !


    private String name;
    private double salary;
    private char gender;

    public String getName(){
        if (name==null){
            System.err.println("Name has not been set");
        }
        return name;
    }

    public void setName(String name){
        if (name==null){
            System.err.println("Name has not been set");
        }
        if (name.isEmpty()){
            System.err.println("Name cannot be empty");
        }
        if (name.length()<2){
            System.err.println("Name should be at least two characters");
        }
        this.name=name;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        if (salary<0){
            System.err.println("Salary cannot be less than 0");
        }
        this.salary=salary;
    }


    public char getGender(){
        return gender;
    }


    public void setGender(char gender){
        if (!(gender=='M' || gender=='m' || gender=='F' || gender=='f')){
            System.err.println("Please eneter a valid gender as 'M' , 'm' , 'F', 'f' ");
            return;
        }
        this.gender=gender;
    }







}

class TesterObjects{
    public static void main(String[] args) {
        Tester tester1=new Tester();

     tester1.setName("Ali");
        System.out.println("tester1.getName() = " + tester1.getName());

        tester1.setSalary(-2000);
        System.out.println("tester1.getSalary() = " + tester1.getSalary());

        tester1.setGender('L');
        System.out.println("tester1.getGender() = " + tester1.getGender());

    }
}