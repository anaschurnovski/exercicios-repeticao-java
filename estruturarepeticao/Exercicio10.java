package flamingo.aprendendo.basico.estruturarepeticao;

import java.util.Scanner;

public class Exercicio10 {
    static void main(String[] args) {

        int opcao;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("1 - Cadastrar usuário");
            System.out.println("2 - Listar usuários");
            System.out.println("3 - Sair");
            System.out.println("Escolha uma opção");
            opcao = sc.nextInt();

        } while (opcao != 3);

        System.out.println("Sistema encerrado");
    }
}
