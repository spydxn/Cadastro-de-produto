import java.util.ArrayList;

public class gerenciadorDados {
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
            System.out.println("-> Status: Compra mínima atingida! (Prazo de Pagamento 30/60/90 dias liberado)");
        } else {
            System.out.println("-> Status: Compra mínima não atingida!");
        }
        System.out.println("=====================================");
    }
    public static void salvarNoBanco(ArrayList<Produto> lista){
        System.out.println("\n[Sistema] Dados processados e pronto para serem salvos no banco.");
    }

}


//data
//Cliente
//Endereço
//Email
//