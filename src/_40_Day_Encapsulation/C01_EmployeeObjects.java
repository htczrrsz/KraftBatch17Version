package _40_Day_Encapsulation;

public class C01_EmployeeObjects {
    public static void main(String[] args) {

        Employee employee1=new Employee("Ahmet",'M',30,32000);
        // isim yerine "" yazsaydik null atayacakti. setname in icindeki sartlardan oturu
     // employee1.age diyince gelmiyor cunku private degisken yaptik. public olsaydi bu sekilde erisebilirdik.

        // employee1.name yazsak da gelmez isim, ancak metodla degiskene erisebiliriz. private oldugu icin
        System.out.println("employee1.getName() = " + employee1.getName());

        System.out.println("employee1.getGender() = " + employee1.getGender());

        System.out.println("employee1 = " + employee1);

        Employee employee2= new Employee("Umit", 'M',20,25000);

        System.out.println("employee2 = " + employee2);

        Employee employee3= new Employee("", 'a',-20,-25000);
        System.out.println("employee3 = " + employee3);

        employee3.setGender('M');   // set metodu ile degistirebiliyoruz.
        employee3.setAge(38);
        employee3.setSalary(33000);

        System.out.println("employee3 = " + employee3);


    }
}
