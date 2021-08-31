package CaminhoSeguro.Model.PersistenciaDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import CaminhoSeguro.Model.Cidade; 

public class CidadeDao /*implements InterfaceBD*/ {

    //@Override
    public List<Cidade> listar() {
        Connection conexao = null;
        PreparedStatement stmt = null;
        ResultSet result = null;

        String sql = "SELECT * FROM CIDADE";

        try {

            conexao = FabricaConexoes.getConnection();
            stmt = conexao.prepareStatement(sql);
            result = stmt.executeQuery();
            List<Cidade> cidades = new ArrayList<Cidade>();

            while (result.next()) {
                int idCidade = result.getInt("id");
                String nome = result.getString("nome");
                
                Cidade cidade = new Cidade(nome);
                
                cidades.add(cidade);
            }
            return cidades;
        
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
    public Cidade consultar(int id) {
        if(id > 0){
            Connection conexao = null;
            PreparedStatement stmt = null;
            ResultSet result = null;

            String sql = "SELECT * FROM CIDADE WHERE ID = ?";

            try {
                conexao = FabricaConexoes.getConnection();
                stmt = conexao.prepareStatement(sql);
                stmt.setInt(1, id);
                result = stmt.executeQuery();

                if(result.next()){
                    int idCidade = result.getInt("id");
                    String nome = result.getString("nome");
                    Cidade cidade = new Cidade(nome);
                    return cidade;
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
    public int inserir(Cidade cidade) {
        if(cidade != null){
            Connection conexao = null;
            PreparedStatement stmt = null;
            ResultSet result = null;

            String sql = "INSERT INTO CIDADE (NOME) VALUES (?)";

            try {
                conexao = FabricaConexoes.getConnection();
                stmt = conexao.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
                stmt.setString(1, cidade.getNome());
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
    public boolean alterar(Cidade cidade) {
        if(cidade != null){
            Connection conexao = null;
            PreparedStatement stmt = null;
            ResultSet result = null;
            String sql = "UPDATE CIDADE SET NOME = ? WHERE ID = ?";

            try {
                conexao = FabricaConexoes.getConnection();
                stmt = conexao.prepareStatement(sql);
                stmt.setString(1, cidade.getNome());
                //stmt.setInt(1, cidade.getId()); //caso coloquemos id futuramente na entidade
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
            String sql = "DELETE FROM CIDADE WHERE ID = ?";

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
