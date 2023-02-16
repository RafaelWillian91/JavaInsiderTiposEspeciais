package appMetodoIntern;

public class Stringapp1 {

    public static void main(String[] args) {

        String s1 ="ABC";
        String s2 = "ABC";
        String s3 = "ABC";
        String s4 = s2;
        String s5 = s1;
        String s6 = new String("ABC");

        qualityEquals(s1, s2);
        qualityEquals(s2, s3);
        qualityEquals(s4, s5);
        qualityEquals(s4, s6);

        System.out.println("--------------------------");
        //Metodo intern() coloca a string no pool se já existir ele reaproveita.
        String s7 = s6.intern();

        qualityEquals(s7, s2);

    }

    private static void qualityEquals(String a, String b){
        System.out.println();
        System.out.println(a + " == " + b + " " + (a == b));
        System.out.println(a + " equals => " + b + a.equals(b));
    }

}
