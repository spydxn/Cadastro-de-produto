import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //Scannerconversa com o usuário
        ArrayList<Produto> listaDeProduto = new ArrayList<>();

        System.out.println("Seja Bem-vindo!");
        System.out.println("Quantos produtos você deseja cadastrar?");

        int quantidade = scanner.nextInt();  // armazenando número inteiro
        scanner.nextLine();

        if (quantidade <= 0) {
            System.out.println("Quantidade inválida. O sistema será encerrado.");
        } else {
            for (int i = 0; i < quantidade; i++) {
                System.out.println("\n--- Cadastro do Produto" + (i + 1) + " ---");

                Produto novoProduto = new Produto();
                System.out.println("Digite seu produto: ");
                novoProduto.produto = scanner.nextLine();

                System.out.println("Digite a cor: ");
                novoProduto.cor = scanner.nextLine();

                System.out.println("Digite a quantidade: ");
                novoProduto.qtde = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Digite o preço: ");
                novoProduto.preco = scanner.nextFloat();
                scanner.nextLine();

                listaDeProduto.add(novoProduto);
            }

            exibirProduto(listaDeProduto);
        }
        scanner.close();
        System.out.println("\nSistema encerrado. Muito Obrigado!");

    }

    public static void exibirProduto(ArrayList<Produto> lista) {
        System.out.println("=====================================");
        System.out.println("\n   LISTA DOS PRODUTOS CADASTRADOS   ");
        System.out.println("=====================================");

        for (int i = 0; i < lista.size(); i++) {
            Produto produtoAtual = lista.get(i);
            System.out.println((i + 1) + ". ");
            produtoAtual.exibirProduto();

            if (produtoAtual.preco >= 2000) {
                System.out.println("-> Status: Compra minima atingida!");
            } else {
                System.out.println("-> Status: Compra minima não atingida!");
            }
        }

    }

    public static class Produto {
        String produto;
        String cor;
        int qtde;
        float preco;

        public void exibirProduto() {
            System.out.println("Produto: " + produto + " | Cor: " + cor + " | Quantidade: " + qtde + " | Preço: " + preco);

        }
    }

}

//realizar calculo preço * qtde
//se o preço passar de 2000 reais ganha frete de 30/60/90 dias
//representante pode escolher junto com a empresa quanto de desconto o cliente pode ganhar com o pedido
//escolha da forma de pagamento

