package main.basicEgorov._06_05_2023;
//написать метод где каждый # == backspace

public class HomeExample {
    public static void main(String[] args) {
        //по две равные стринги
        String str = "Java##";
        String str_str = "Ja";

        String str2 = "Ja#va###";
        String str2str = "";

        String str4 = "#Java";
        String str4str = "Java";

        String str5="#Hello#World#";
        String str55 = "HellWorl";



        getWorld(str, str_str);
        getWorld(str2, str2str);
        getWorld(str4, str4str);
        getWorld(str5,str55);

    }
    public static String getWorld(String str, String str2) {
        String newString = "";
        for (int i = 0; i < str.length(); i++) {

            char currentChar = str.charAt(i);

            if (currentChar == '#' && newString.length() > 0) {
                newString = newString.substring(0, newString.length() - 1);
            }else if (str.charAt(i) != '#'){
                newString += str.charAt(i);
            }
        }
        System.out.println(newString);

        if (newString.equals(str2)) {
            System.out.println("строки одинаковые");
        } else {
            System.out.println("строки не одинаковые");
        }


        return newString;
    }
}
