package _48_day_OOP_Review;

public class Spotify {
    public static void main(String[] args) {


        String departmentName = "Spotify";

        ProductOwner po = new ProductOwner("Daghan", 30, 'M', 50000, 321321, departmentName);

        BusinessAnalyst ba = new BusinessAnalyst("Umit", 35, 'M', 45000, 300400, departmentName);

        ScrumMaster sm = new ScrumMaster("Emine", 34, 'F', 42000, 400500, departmentName);

        Tester tester1 = new Tester("Ugur", 30, 'M', 30000, 321456, departmentName, "Java");
        Tester tester2 = new Tester("Ali", 30, 'M', 30000, 321457, departmentName, "Java");
        Tester tester3 = new Tester("Eda", 30, 'F', 30000, 321458, departmentName, "Java");


        Tester[] testers = {tester1, tester2};

        Developer developer1 = new Developer("Isa", 28, 'M', 35000, 654321, departmentName, "Python");
        Developer developer2 = new Developer("Ahmet", 28, 'M', 95000, 654321, departmentName, "JS");
        Developer developer3 = new Developer("Emine", 28, 'M', 15000, 654321, departmentName, "Java");
        Developer developer4 = new Developer("Ziya", 28, 'M', 25000, 654321, departmentName, "Python");
        Developer developer5 = new Developer("Nuran", 28, 'M', 45000, 654321, departmentName, "Python");


        Developer[] developers = {developer1, developer2, developer3, developer4};


        ScrumTeam scrumTeam = new ScrumTeam(po, ba, sm);


        scrumTeam.addDeveloper(developer5);
        scrumTeam.addDeveloper(developers);

        scrumTeam.addTester(tester3);
        scrumTeam.addTester(testers);

        System.out.println(scrumTeam);

        System.out.println("----------------------------");
        for (Tester tester : scrumTeam.testers) {
            System.out.println(tester.name);
            System.out.println(tester.getId());
        }

    }
}