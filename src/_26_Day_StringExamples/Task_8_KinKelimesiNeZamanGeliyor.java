package _26_Day_StringExamples;

public class Task_8_KinKelimesiNeZamanGeliyor {
    public static void main(String[] args) {


        System.out.println(kinKelimesiIlktenSonraMi1("Kinlenmek"));
        System.out.println(kinKelimesiIlktenSonraMi1("Kin tutmak"));
        System.out.println(kinKelimesiIlktenSonraMi1("ekin ektim"));
        System.out.println(kinKelimesiIlktenSonraMi1("Keskin ilesinden geciyorum"));
        System.out.println(kinKelimesiIlktenSonraMi1("Neden kin tutuyorsun ?"));


    }

// Kullanıcıdan bir kelime alın ve kin kelimesi başından veya ilk karakterden sonra gelip gelmediğini kontrol edin
// geliyorsa true gelmiyorsa false döndürün;
// Kinlenmek true
// Kin tutmak true
// Ekin ektim true
// Keskin ilçesinden geçiyorum false Neden kin tutuyorsun false




    public static boolean kinKelimesiIlktenSonraMi1(String kelime){
            if ((kelime.substring(0,3).equalsIgnoreCase("kin")) ||
            (kelime.substring(1,4).equalsIgnoreCase("kin"))){
                return true;
        }else{
            return false;
        }
    }

}
