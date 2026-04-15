import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Cadastrar Produto");
            System.out.println("2 - Listar Produtos");
            System.out.println("3 - Adicionar Estoque");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();

                    System.out.print("Preço: ");
                    double preco = sc.nextDouble();

                    System.out.print("Quantidade: ");
                    int quantidade = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Categoria: ");
                    String categoria = sc.nextLine();

                    Produto p = new Produto(nome, preco, quantidade, categoria);
                    produtos.add(p);

                    System.out.println("Produto cadastrado!");
                    break;

                case 2:
                    for (Produto produto : produtos) {
                        System.out.println(produto);
                    }
                    break;

                case 3:
                    System.out.print("Digite o índice do produto: ");
                    int index = sc.nextInt();

                    if(index >= 0 && index < produtos.size()){
                        System.out.print("Quantidade a adicionar: ");
                        int qtd = sc.nextInt();

                        produtos.get(index).adicionarEstoque(qtd);
                        System.out.println("Estoque atualizado!");
                    } else {
                        System.out.println("Produto inválido!");
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }
}