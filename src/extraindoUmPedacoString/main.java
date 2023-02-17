package extraindoUmPedacoString;

public class main {

    public static void main(String[] args) {

        String str = "Java is the greatest language!";
        String str1 = str.substring(4);
        System.out.println(str1);

        String substr = str.substring(4, str.length()-1);
        System.out.println(substr);
    }

}
