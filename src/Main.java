import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Produto> listaDeProduto = new ArrayList<>();

        System.out.println("Seja Bem-vindo!");
        System.out.println("Quantos produtos você deseja cadastrar?");

        int quantidade = scanner.nextInt();
        scanner.nextLine();

        if (quantidade <= 0) {
            System.out.println("Quantidade inválida. O sistema será encerrado.");
        } else {
            for (int i = 0; i < quantidade; i++) {
                System.out.println("\n--- Cadastro do Produto " + (i + 1) + " ---");

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

            // Pergunta o desconto uma única vez no final de todos os cadastros
            System.out.println("\nQuanto de desconto (%) o cliente terá no valor total do pedido?: ");
            float descontoGeral = scanner.nextFloat();
            scanner.nextLine();

            exibirProduto(listaDeProduto, descontoGeral);
        }
        scanner.close();
        System.out.println("\nSistema encerrado. Muito Obrigado!");
    }

    public static void exibirProduto(ArrayList<Produto> lista, float descontoGeral) {
        System.out.println("\n=====================================");
        System.out.println("   LISTA DOS PRODUTOS CADASTRADOS   ");
        System.out.println("=====================================");

        float totalSemDesconto = 0;

        for (int i = 0; i < lista.size(); i++) {
            Produto produtoAtual = lista.get(i);
            System.out.print((i + 1) + ". ");
            produtoAtual.exibirProduto();
            totalSemDesconto += produtoAtual.total();
        }

        // Cálculo do desconto total do pedido
        float valorDesconto = totalSemDesconto * (descontoGeral / 100);
        float totalFinal = totalSemDesconto - valorDesconto;

        System.out.println("\n=====================================");
        System.out.println("RESUMO DO PEDIDO");
        System.out.println("Total sem desconto: R$ " + totalSemDesconto);
        System.out.println("Desconto aplicado: " + descontoGeral + "% (R$ " + valorDesconto + ")");
        System.out.println("Valor final a pagar: R$ " + totalFinal);

        if (totalFinal >= 2000) {
            System.out.println("-> Status: Compra mínima atingida! (Frete 30/60/90 dias liberado)");
        } else {
            System.out.println("-> Status: Compra mínima não atingida!");
        }
        System.out.println("=====================================");
    }

    public static class Produto {
        String produto;
        String cor;
        int qtde;
        float preco;

        public float total() {
            return preco * qtde;
        }

        public void exibirProduto() {
            System.out.println("Produto: " + produto + " | Cor: " + cor + " | Quantidade: " + qtde + " | Preço Un.: R$ " + preco + " | Subtotal: R$ " + total());
        }
    }
}