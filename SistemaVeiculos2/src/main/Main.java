package main;

import Sistema_veiculos.*;

public class Main { // Classe principal que executa o programa

    public static void main(String[] args) {

        try {
            // Criando objeto Automóvel Doméstico
            AutomovelDomestico carro = new AutomovelDomestico("Civic", 2024, "Honda", "Prata", 9000.0, 5, "ABS", "Sim");
            System.out.println("Automóvel Doméstico:");
            System.out.println(carro.descricao()); // Exibe a descrição do carro
            // Inserir o carro no banco de dados
            carro.inserirNoBanco(); // Chama o método que insere no banco de dados
        } catch (IllegalArgumentException deuErro) {
            // Tratamento de erro caso haja falha na criação do objeto Automóvel Doméstico
            System.out.println("Erro ao criar o Automóvel Doméstico: " + deuErro.getMessage());
        }

        try {
            // Criando objeto Motocicleta
            Motocicleta moto = new Motocicleta("MT-09", 2022, "Yamaha", "Preta", 1000.0, 847, 8);
            System.out.println("\nMotocicleta:");
            System.out.println(moto.descricao()); // Exibe a descrição da moto
            // Inserir a moto no banco de dados
            moto.inserirNoBanco(); // Chama o método que insere no banco de dados
        } catch (IllegalArgumentException deuErro) {
            // Tratamento de erro caso haja falha na criação do objeto Motocicleta
            System.out.println("Erro ao criar a Motocicleta: " + deuErro.getMessage());
        }

        try {
            // Criando objeto Caminhão
            Caminhao caminhao = new Caminhao("Scania 620S V8", 2022, "Scania", "Branco", 200000.0, 6, 16000);
            System.out.println("\nCaminhão:");
            System.out.println(caminhao.descricao()); // Exibe a descrição do caminhão
            // Inserir o caminhão no banco de dados
            caminhao.inserirNoBanco(); // Chama o método que insere no banco de dados
        } catch (IllegalArgumentException deuErro) {
            // Tratamento de erro caso haja falha na criação do objeto Caminhão
            System.out.println("Erro ao criar o Caminhão: " + deuErro.getMessage());
        }

        try {
            // Criando objeto Bicicleta
            Bicicleta bicicleta = new Bicicleta("Gios FRX", "Gios", "Prata chumbo", "Alumínio", 21, "Sim");
            System.out.println("\nBicicleta:");
            System.out.println(bicicleta.descricao()); // Exibe a descrição da bicicleta
            // Inserir a bicicleta no banco de dados
            bicicleta.inserirNoBanco(); // Chama o método que insere no banco de dados
        } catch (IllegalArgumentException deuErro) {
            // Tratamento de erro caso haja falha na criação do objeto Bicicleta
            System.out.println("Erro ao criar a Bicicleta: " + deuErro.getMessage());
        }

        try {
            // Criando objeto Skate
            Skate skate = new Skate("LONGBOARD", "Mormaii", "Preto", "Revenge");
            System.out.println("\nSkate:");
            System.out.println("Modelo: " + skate.getModelo()); // Exibe o modelo do skate
            System.out.println("Marca: " + skate.getMarca()); // Exibe a marca do skate
            System.out.println("Cor: " + skate.getCor()); // Exibe a cor do skate
            System.out.println("Tipo das Rodas: " + skate.getTipoRodas()); // Exibe o tipo das rodas do skate
            // Inserir o skate no banco de dados
            skate.inserirNoBanco(); // Chama o método que insere no banco de dados
        } catch (IllegalArgumentException deuErro) {
            // Tratamento de erro caso haja falha na criação do objeto Skate
            System.out.println("Erro ao criar o Skate: " + deuErro.getMessage());
        }
    }
}
