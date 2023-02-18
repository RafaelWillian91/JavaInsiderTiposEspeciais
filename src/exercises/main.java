package exercises;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        //StringBuilder stringBuilder = new StringBuilder();
        //Texto Invertido
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um texto para ser invertido:" + '\n');
       // StringBuilder stringBuilder = new StringBuilder(sc.nextLine());
        //String a = sc.nextLine();

        //stringBuilder = stringBuilder.append(sc.nextLine()).reverse();


        //Internamente o construtor de StringBuilder recebe uma String que é
        //fornecida pelo metodo da classe scanner (nextLine) e ja encadeio o append da classe scanner
        //com o reverse para inverter. Varias formas de fazer.

       // System.out.println(new StringBuilder().append(sc.nextLine()).reverse());
        System.out.println(new StringBuilder(sc.nextLine()).reverse());
    }

}
