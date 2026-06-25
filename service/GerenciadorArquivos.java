package service;

import java.io.IOException;
import java.nio.file.*;

public class GerenciadorArquivos {

    public void criarArquivo(String caminho) {
        try {
            Files.createFile(Paths.get(caminho));
            System.out.println("Arquivo criado com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao criar arquivo: " + e.getMessage());
        }
    }

    public void deletarArquivo(String caminho) {
        try {
            Files.delete(Paths.get(caminho));
            System.out.println("Arquivo deletado com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao deletar arquivo: " + e.getMessage());
        }
    }

    public void listarArquivos(String pasta) {
        try {
            Files.list(Paths.get(pasta))
                    .forEach(arquivo ->
                            System.out.println(arquivo.getFileName()));
        } catch (IOException e) {
            System.out.println("Erro ao listar arquivos: " + e.getMessage());
        }
    }

    public void copiarArquivo(String origem, String destino) {
        try {
            Files.copy(Paths.get(origem), Paths.get(destino),
                    StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Arquivo copiado com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao copiar arquivo: " + e.getMessage());
        }
    }

    public void moverArquivo(String origem, String destino) {
        try {
            Files.move(Paths.get(origem), Paths.get(destino),
                    StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Arquivo movido com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao mover arquivo: " + e.getMessage());
        }
    }

    public void renomearArquivo(String antigo, String novo) {
        moverArquivo(antigo, novo);
    }
}