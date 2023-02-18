package CompararStringMetodocompareTO;

public class main {

    public static void main(String[] args) {

        String s1 = "card";
        String s2 = "chair";

        //compara uma String com outra. valor Negativo quer dizer que a primeira é menor
        //se for positivo a primeira é maior em termos alfabéticos.
        int r = s1.compareTo(s2);
        System.out.println(r);

    }
}
