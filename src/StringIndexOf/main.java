package StringIndexOf;

public class main {

    public static void main(String[] args) {

        String str = "Java is the greatest language!the";

        //Senão encontra retorna -1. a segundo parametro é para procurar a partir dali.
        int a = str.indexOf("the", 10);

        System.out.println(a);

        //Metodo retorna a ultima ocorrencia encontrada.
        int b = str.lastIndexOf("a");

        System.out.println(b);

    }

}
