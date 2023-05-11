package _50_Exception_Collection;

public class C05_Exception_9_throw_new {

    public static void main(String[] args) {

        c();
        d();

        try{
            throw new  HarunException("");
        }catch (HarunException h){
            System.out.println(h.message);
        }





    }




    static void a() throws Exception {
        throw new Exception("harun hata firlatti");

    }





    static void b() throws Exception {
        a();
    }





    static void c(){
        try{
            b();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }


    static void d(){
        c();
    }





}
