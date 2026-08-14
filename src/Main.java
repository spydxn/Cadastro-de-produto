import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Produto> listaDeProduto = new ArrayList<>();

        System.out.println("Seja Bem-vindo!");
        System.out.println("Quantos produtos você deseja cadastrar?");

        int quantidade = scanner.nextInt();  // armazenando número inteiro
        scanner.nextLine();  //Limpeza de buffer
        }

public static class Produto {
        String produto;
        String cor;
        int qtde;
        float preco;

public void exibirProduto(){
    System.out.println("Produto: " + produto + "Cor: " + cor + "Quantidade: " + qtde + "Preço: " + preco);

}
}

}

//realizar calculo preço * qtde
