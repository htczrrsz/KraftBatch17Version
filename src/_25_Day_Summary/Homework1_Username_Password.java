package _25_Day_Summary;

public class Homework1_Username_Password {
    public static void main(String[] args) {



        System.out.println(controlPasswordAndUsername("Hat", " ajfoa"));
        System.out.println(controlPasswordAndUsername("ha", " agsg"));
        System.out.println(controlPasswordAndUsername("Hat", " 123Hatice"));
        System.out.println(controlPasswordAndUsername("", ""));


    }
//    Kullanıcıdan userName ve password isteyen bir method yazın. Method aşağıdaki şartları kontrol etsin.
//    Password ve username alanı boş olamaz.
//    Password alanı boş olamaz
//    Password 8 karakterden az olamaz. Username 3 karakterden az olamaz.

    public static String controlPasswordAndUsername(String username, String password){
            if ((username.isEmpty()) || (password.isEmpty())){
                return "Password veya username bos olamaz " ;

            }else if(username.length()<3){
                return "Username 3 karakterden az olamaz";

            } else if (password.length()<8){
                return "Password 8 karakterden az olamaz";

              }else{
                return "Basarili";
             }


        }





    }





