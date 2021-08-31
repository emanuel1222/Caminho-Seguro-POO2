package CaminhoSeguro.Model.PersistenciaDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import CaminhoSeguro.Model.LinhaOnibus;

public class LinhaOnibusDao {

    //@Override
    public List<LinhaOnibus> listar() {
        Connection conexao = null;
        PreparedStatement stmt = null;
        ResultSet result = null;

        String sql = "SELECT * FROM LINHA_ONIBUS";

        try {

            conexao = FabricaConexoes.getConnection();
            stmt = conexao.prepareStatement(sql);
            result = stmt.executeQuery();
            List<LinhaOnibus> linhasOnibus = new ArrayList<LinhaOnibus>();

            while (result.next()) {
                int idLinhaOnibus = result.getInt("id");
                int ID = result.getInt("identificador_linha");
                
                LinhaOnibus linhaOnibus = new LinhaOnibus(ID, null);
                
                linhasOnibus.add(linhaOnibus);
            }
            return linhasOnibus;
        
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
    public LinhaOnibus consultar(int id) {
        if(id > 0){
            Connection conexao = null;
            PreparedStatement stmt = null;
            ResultSet result = null;

            String sql = "SELECT * FROM LINHA_ONIBUS WHERE ID = ?";

            try {
                conexao = FabricaConexoes.getConnection();
                stmt = conexao.prepareStatement(sql);
                stmt.setInt(1, id);
                result = stmt.executeQuery();

                if(result.next()){
                    int idLinhaOnibus = result.getInt("id");
                    int identificadorLinhaOnibus = result.getInt("identificador_linha");
                    LinhaOnibus linhaOnibus = new LinhaOnibus(identificadorLinhaOnibus,null);
                    return linhaOnibus;
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
    public int inserir(LinhaOnibus linhaOnibus) {
        if(linhaOnibus != null){
            Connection conexao = null;
            PreparedStatement stmt = null;
            ResultSet result = null;

            String sql = "INSERT INTO LINHA_ONIBUS (IDENTIFICADOR_LINHA) VALUES (?)";

            try {
                conexao = FabricaConexoes.getConnection();
                stmt = conexao.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
                stmt.setInt(1, linhaOnibus.getID());
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
    public boolean alterar(LinhaOnibus linhaOnibus) {
        if(linhaOnibus != null){
            Connection conexao = null;
            PreparedStatement stmt = null;
            ResultSet result = null;
            String sql = "UPDATE LINHA_ONIBUS SET IDENTIFICADOR_LINHA = ? WHERE ID = ?";

            try {
                conexao = FabricaConexoes.getConnection();
                stmt = conexao.prepareStatement(sql);
                stmt.setInt(1, linhaOnibus.getID());
                //stmt.setInt(1, linhaOnibus.getId()); //caso coloquemos id futuramente na entidade
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
            String sql = "DELETE FROM LINHA_ONIBUS WHERE ID = ?";

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
