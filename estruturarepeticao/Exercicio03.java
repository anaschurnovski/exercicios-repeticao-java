package flamingo.aprendendo.basico.estruturarepeticao;

import java.util.Scanner;

public class Exercicio03 {
    static void main(String[] args) {

        int numero = 1;
        int contador;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para descobrir a tabuada: ");
        contador = sc.nextInt();

        while (numero <= 10) {
            System.out.println(numero + "X" + numero + "=" + (numero * contador));

            numero++;

        }

        sc.close();
    }

}