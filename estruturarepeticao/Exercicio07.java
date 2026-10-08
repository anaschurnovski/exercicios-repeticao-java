package flamingo.aprendendo.basico.estruturarepeticao;

import java.util.Scanner;

public class Exercicio07 {
    static void main(String[] args) {

        int quantidadeVendas;
        double valorVenda;
        double faturamentoTotal = 0.0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de vendas: ");
        quantidadeVendas = sc.nextInt();

        System.out.println("Digite o valor da venda: ");
        valorVenda = sc.nextInt();

        for(int numero = 1; numero <= quantidadeVendas; numero++){
            faturamentoTotal += valorVenda;
        }

        System.out.println("Quantidade:  " + quantidadeVendas);
        System.out.println("Faturamento total: R$ " + faturamentoTotal);

        sc.close();

    }

}

