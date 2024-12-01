package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class VeiculoDAO {
    private final String url = "jdbc:mysql://localhost:3306/sistema_de_veiculos"; // URL do banco
    private final String user = "root";  // Usuário do banco
    private final String password = "";  // Senha do banco

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

    public void inserirVeiculo(String sql) {
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            // Executa o comando de inserção
            stmt.executeUpdate();
            System.out.println("Dados inseridos com sucesso!");

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Erro ao inserir dados: " + e.getMessage());
        }
    }
}
