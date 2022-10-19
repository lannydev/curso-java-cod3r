package Fundamentos.operadores;

import java.util.Scanner;

public class DesafiosLogicos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("vc trabalou na terça? ");
        boolean trabalho1 = sc.nextBoolean();
        System.out.println("vc trabalhou na quinta? ");
        boolean trabalho2 = sc.nextBoolean();

        if (trabalho1 && trabalho2 == true){
            System.out.println("Parabéns vc pode comprar uma tv de 50 polegadas");
        } else if (trabalho1 || trabalho2 == true) {
            System.out.println("Parabém vc pode comprar uma tv de 20 polegadas");
        }else {
            System.out.println("Poxa, sem trabalho vc toma sorvete em casa");
        }


        sc.close();
    }
}
