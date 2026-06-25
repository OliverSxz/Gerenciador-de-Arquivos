import service.GerenciadorArquivos;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        GerenciadorArquivos gerenciador = new GerenciadorArquivos();

        while (true) {
            System.out.println("\n=== GERENCIADOR DE ARQUIVOS ===");
            System.out.println("1 - Criar arquivo");
            System.out.println("2 - Deletar arquivo");
            System.out.println("3 - Listar arquivos");
            System.out.println("4 - Copiar arquivo");
            System.out.println("5 - Mover arquivo");
            System.out.println("6 - Renomear arquivo");
            System.out.println("0 - Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:
                    System.out.print("Caminho do arquivo: ");
                    gerenciador.criarArquivo(scanner.nextLine());
                    break;

                case 2:
                    System.out.print("Caminho do arquivo: ");
                    gerenciador.deletarArquivo(scanner.nextLine());
                    break;

                case 3:
                    System.out.print("Pasta: ");
                    gerenciador.listarArquivos(scanner.nextLine());
                    break;

                case 4:
                    System.out.print("Origem: ");
                    String origem = scanner.nextLine();

                    System.out.print("Destino: ");
                    String destino = scanner.nextLine();

                    gerenciador.copiarArquivo(origem, destino);
                    break;

                case 5:
                    System.out.print("Origem: ");
                    origem = scanner.nextLine();

                    System.out.print("Destino: ");
                    destino = scanner.nextLine();

                    gerenciador.moverArquivo(origem, destino);
                    break;

                case 6:
                    System.out.print("Arquivo atual: ");
                    String antigo = scanner.nextLine();

                    System.out.print("Novo nome/caminho: ");
                    String novo = scanner.nextLine();

                    gerenciador.renomearArquivo(antigo, novo);
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}