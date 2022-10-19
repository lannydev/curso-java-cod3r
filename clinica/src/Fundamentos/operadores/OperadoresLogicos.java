package Fundamentos.operadores;

public class OperadoresLogicos {

    public static void main(String[] args) {

        /*
        && - condição e
        || - condição ou
        ^ - ou exclusivo
        ! - negação
         */

        boolean condicao1 = true;
        boolean condicao2 = 2 > 5;

        System.out.println(condicao1 && condicao2);
        System.out.println(condicao1 || condicao2);
        System.out.println(condicao1 ^ condicao2);
        System.out.println(!condicao1);
        System.out.println(!condicao2);

        System.out.println("\n\n");

        // tabela verdade E
        System.out.println(true && true); // verdadeiro
        System.out.println(true && false); // falso
        System.out.println(false && true); // false
        System.out.println(false && false); // false

        // tabela verdade OU
        System.out.println(true || true); // verdadeiro
        System.out.println(true || false); // verdadeiro
        System.out.println(false || true); // verdadeiro
        System.out.println(false || false); // false


        // tabela verdade OU exclusivo
        System.out.println(true ^ true); // falso
        System.out.println(true ^ false); // verdadeiro
        System.out.println(false ^ true); // verdadeiro
        System.out.println(false ^ false); // false


    }

}
