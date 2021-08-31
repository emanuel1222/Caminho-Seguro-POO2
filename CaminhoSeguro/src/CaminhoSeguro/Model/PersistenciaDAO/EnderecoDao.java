package CaminhoSeguro.Model.PersistenciaDAO;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import CaminhoSeguro.Model.Bairro;
import CaminhoSeguro.Model.Endereco;

public class EnderecoDao {

    //@Override
    public List<Endereco> listar() {
        Connection conexao = null;
        PreparedStatement stmt = null;
        ResultSet result = null;

        String sql = "SELECT * FROM ENDERECO";

        try {

            conexao = FabricaConexoes.getConnection();
            stmt = conexao.prepareStatement(sql);
            result = stmt.executeQuery();
            List<Endereco> enderecos = new ArrayList<Endereco>();

            while (result.next()) {
                int idEndereco = result.getInt("id");
                String rua = result.getString("rua");
                Bairro bairro = (Bairro) result.getClob("bairro");
                
                Endereco endereco = new Endereco(rua,bairro);
                
                enderecos.add(endereco);
            }
            return enderecos;    
        } catch (SQLException e){ 
            e.printStackTrace();
        } finally {
            try {
                if (result != null)
                result.close();
            if (stmt != null)
                stmt.close();
            if (conexao != null)
                conexao.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    //@Override
    public Endereco consultar(int id) {
        if(id > 0){
            Connection conexao = null;
            PreparedStatement stmt = null;
            ResultSet result = null;

            String sql = "SELECT * FROM ENDERECO WHERE ID = ?";

            try {
                conexao = FabricaConexoes.getConnection();
                stmt = conexao.prepareStatement(sql);
                stmt.setInt(1, id);
                result = stmt.executeQuery();

                if(result.next()){

                    int idBairro = result.getInt("id");
                    String rua = result.getString("rua");
                    Bairro bairro = (Bairro) result.getClob("bairro");  
                    Endereco endereco = new Endereco(rua,bairro);
                    return endereco;
                }
                return null;
                
            } catch (SQLException e){
                e.printStackTrace();
                } finally {
                    try {
                        if (result != null)
                        result.close();
                    if (stmt != null)
                        stmt.close();
                    if (conexao != null)
                        conexao.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
        }
        return null;
    }

    //@Override
    public int inserir(Endereco endereco) {
        if(endereco != null){
            Connection conexao = null;
            PreparedStatement stmt = null;
            ResultSet result = null;

            String sql = "INSERT INTO ENDERECO (RUA,BAIRRO) VALUES (?,?)";

            try {
                conexao = FabricaConexoes.getConnection();
                stmt = conexao.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
                stmt.setString(1, endereco.getRua());
                stmt.setClob(2, (Clob) endereco.getBairro());
                stmt.executeUpdate();
                result = stmt.getGeneratedKeys();

                if(result.next()) {
                    return result.getInt(1);
                } else {
                    return -1;
                }
                
            } catch(SQLException e) {
                e.printStackTrace();

            } finally {
                try {
                    if (result != null)
                    result.close();
                if (stmt != null)
                    stmt.close();
                if (conexao != null)
                    conexao.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            
        } 
        return -1;
    }

    //@Override
    public boolean alterar(Endereco endereco) {
        if(endereco != null){
            Connection conexao = null;
            PreparedStatement stmt = null;
            ResultSet result = null;
            String sql = "UPDATE BAIRRO SET RUA,BAIRRO = ?,? WHERE ID = ?";

            try {
                conexao = FabricaConexoes.getConnection();
                stmt = conexao.prepareStatement(sql);
                stmt.setString(1, endereco.getRua());
                stmt.setClob(2, (Clob) endereco.getBairro());
                //stmt.setInt(1, bairro.getId()); //caso coloquemos id futuramente na entidade
                int afectedLines = stmt.executeUpdate();

                if(afectedLines == 1){
                    return true;
                } else {
                    return false;
                }

            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (result != null)
                    result.close();
                if (stmt != null)
                    stmt.close();
                if (conexao != null)
                    conexao.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            return false;
        }
        else {
            return false;
        }
    }

    //@Override
    public boolean remover(int id) {
        if(id > 0){
            Connection conexao = null;
            PreparedStatement stmt = null;
            ResultSet result = null;
            String sql = "DELETE FROM ENDERECO WHERE ID = ?";

            try {
                conexao = FabricaConexoes.getConnection();
                stmt = conexao.prepareStatement(sql);
                stmt.setInt(1, id);
                
                int afectedLines = stmt.executeUpdate();

                if(afectedLines == 1){
                    return true;
                } else {
                    return false;
                }
            } catch(SQLException e){
                e.printStackTrace();
            } finally {
                try {
                if (result != null)
                    result.close();
                if (stmt != null)
                    stmt.close();
                if (conexao != null)
                    conexao.close();
                } catch (Exception e) {
                    e.printStackTrace();
                } 
            }
        } else {
            return false;
        }
        return false;
    }
    
}
