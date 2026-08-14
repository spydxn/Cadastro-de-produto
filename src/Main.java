import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Produto> listaDeProduto = new ArrayList<>();

        System.out.println("Seja Bem-vindo!");
        System.out.println("Quantos produtos você deseja cadastrar?");

        int quantidade = scanner.nextInt();  // armazenando número inteiro
        scanner.nextLine();

        if(quantidade <= 0){
            System.out.println("Quantidade inválida. O sistema será encerrado.");
        }else{
            for (int i = 0; i < quantidade; i++){
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
            scanner.close();
            System.out.println("\nSistema encerrado. Muito Obrigado!");
        }

        //Limpeza de buffer
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
