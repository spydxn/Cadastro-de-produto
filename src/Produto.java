public class Produto {
    String produto;
    String cor;
    int qtde;
    float preco;

    public float total() {
        return preco * qtde;
    }

    public void exibirProduto(){
        System.out.println("Produto: " + produto + " | Cor: " + cor + " | Quantidade: " + qtde + " | Preço: " + preco + " | Subtotal: R$ " + total());
    }
}
