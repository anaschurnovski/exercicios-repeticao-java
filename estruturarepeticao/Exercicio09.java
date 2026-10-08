package flamingo.aprendendo.basico.estruturarepeticao;

public class Exercicio09 {
    static void main(String[] args) {

        int tentativas = 0;

        while (tentativas < 3) {
            System.out.println("Tentando fazer login...");
            tentativas++;
        }

        System.out.println("Número máximo de tentativas atingido");
    }
}

