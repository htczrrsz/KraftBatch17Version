package _26_Day_StringExamples;

public class Task_27_SonuIstenenKelimeIleBitiyorsa {
    public static void main(String[] args) {
        System.out.println(sonundaIstenenKelimeVarMi("Kullanacak", "acak"));
        System.out.println(sonundaIstenenKelimeVarMi("Zamlanacak", "acak"));
        System.out.println(sonundaIstenenKelimeVarMi("Farkindalik", "acak"));
        System.out.println(sonundaIstenenKelimeVarMi("Farkinda", "acak"));


    }
    // Soru 27
    // Kullanıcıdan bir kelime alın ve sonu acak ile bitiyorsa true,
    // bitmiyorsa false döndüren metodu yazdırın.
    // Kullanacak true
    // Zamlanacak true
    // Farkındalık false
    // Farkında false

      public static boolean sonundaIstenenKelimeVarMi (String str,String ileBitenKelime){
        if (str.substring(str.length()-(ileBitenKelime.length())).equalsIgnoreCase(ileBitenKelime)){
            return true;
        }
        return false;
      }

}
