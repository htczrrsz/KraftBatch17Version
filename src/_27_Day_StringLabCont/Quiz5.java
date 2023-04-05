package _27_Day_StringLabCont;

public class Quiz5 {
    public static void main(String[] args) {

        System.out.println(polindromMu(" aka"));
        System.out.println(polindromMu("Merhaba"));

    }

    public static boolean polindromMu(String str) {
        String reverse = "";
        for (int i = str.trim().length() - 1; 0 <= i; i--) {
            reverse += str.trim().substring(i, i + 1);
        }
        if (reverse.equalsIgnoreCase(str.trim())) {
            return true;
        }
        return false;

    }
}