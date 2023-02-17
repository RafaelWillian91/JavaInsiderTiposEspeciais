package stringBuilder;

public class Stringapp3 {

    public static void main(String[] args) {
        //Para trabalhar com contatenacao de String dentro de Loops
        StringBuilder s1 = new StringBuilder();

        for(char c = 'A'; c < 'Z'; c++){
            s1.append(c);
        }

        System.out.println(s1.reverse());


    }

}
