package flamingo.aprendendo.basico.estruturarepeticao;

import java.util.Scanner;

public class Exercicio08 {
    static void main(String[] args) {

        int quantidadeProdutos;
        double valorProduto;
        double totalCompra = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de produtos: ");
        quantidadeProdutos = sc.nextInt();

        System.out.println("Digite o valor do produto: ");
        valorProduto = sc.nextDouble();

        for(int numero = 1; numero <= quantidadeProdutos; numero++){
            totalCompra = totalCompra + valorProduto;
        }

        System.out.println("O total da sua compra é: R$ " + totalCompra);

        sc.close();
    }
}

