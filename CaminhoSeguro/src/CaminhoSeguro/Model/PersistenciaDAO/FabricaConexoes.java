package CaminhoSeguro.Model.PersistenciaDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexoes {

   public static Connection getConnection() throws SQLException{
       String url = "jdbc:mysql://localhost:3306/trabalhoPooDB?serverTimezone=UTC";
       String user = "root";
       String password = "senha_da_bd";

       Connection conexao = DriverManager.getConnection(url, user, password);
       

       return conexao;
       
   }

}
