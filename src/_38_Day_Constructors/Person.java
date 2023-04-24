package _38_Day_Constructors;

public class Person {


        public String name;
        public char gender;
        public int age;

   public Person(){    // bos constructor olusturduk ama java normalde otomatik default atar. yazarsak bizimkini kullanir.

        }


   public Person(String ad, char cinsiyet, int yas){

            this.name=ad;              // yukardaki degiskenlere erismek icin this. kullaniriz.
            this.gender=cinsiyet;
            this.age=yas;


        }



          public String toString(){
            return "Person{name=" +name+ ", gender=" + gender+ ", age=" +age + "}";
           }



    }





