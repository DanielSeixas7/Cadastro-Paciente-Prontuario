import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conexao {
    private static final String URL = "jdbc:mysql://localhost:3306/cadastropaciente";
    private static final String USER = "root";
    private static final String PASS = "";
    public static Connection getConnection()throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conexao = DriverManager.getConnection(URL, USER, PASS);
        return conexao;
    }
     public static void classConnection(Connection conn) throws Exception {
         try{
            Connection conexao = Conexao.getConnection();
            System.out.println("Conexão obtida com sucesso");

         }catch (SQLException e){
            throw new RuntimeException("Erro ao fechar a conexao com o banco de dados: "+ e);
         }
     }

    
}
