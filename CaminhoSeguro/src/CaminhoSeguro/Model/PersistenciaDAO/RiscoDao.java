package CaminhoSeguro.Model.PersistenciaDAO;

import java.sql.Clob;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import CaminhoSeguro.Model.Risco;


public class RiscoDao {

    //@Override
    public List<Risco> listar() {
        Connection conexao = null;
        PreparedStatement stmt = null;
        ResultSet result = null;

        String sql = "SELECT * FROM RISCO";

        try {

            conexao = FabricaConexoes.getConnection();
            stmt = conexao.prepareStatement(sql);
            result = stmt.executeQuery();
            List<Risco> riscos = new ArrayList<Risco>();

            while (result.next()) {
                int idRisco = result.getInt("id");
                String regiao = result.getString("regiao");
                char classificacao  = (char) result.getShort("classificacao"); 
                String cor = result.getString("cor_regiao");
                String periodo = result.getString("periodo");
                
                Risco risco = new Risco();
                //Risco risco = new Risco(regiao, classificacao,cor,periodo); //construtor ideal
                
                riscos.add(risco);
            }
            return riscos;    
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
    public Risco consultar(int id) {
        if(id > 0){
            Connection conexao = null;
            PreparedStatement stmt = null;
            ResultSet result = null;

            String sql = "SELECT * FROM RISCO WHERE ID = ?";

            try {
                conexao = FabricaConexoes.getConnection();
                stmt = conexao.prepareStatement(sql);
                stmt.setInt(1, id);
                result = stmt.executeQuery();

                if(result.next()){

                    int idRisco = result.getInt("id");
                    String regiao = result.getString("regiao");
                    char classificacao  = (char) result.getShort("classificacao"); 
                    String cor = result.getString("cor_regiao");
                    String periodo = result.getString("periodo");   
                    Risco crime = new Risco();
                    //Risco risco = new Risco(regiao, classificacao,cor,periodo); //construtor ideal
                    return crime;
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
    public int inserir(Risco risco) {
        if(risco != null){
            Connection conexao = null;
            PreparedStatement stmt = null;
            ResultSet result = null;

            String sql = "INSERT INTO RISCO (REGIAO,CLASSIFICACAO,COR_REGIAO,PERIODO) VALUES (?,?,?,?)";

            try {
                conexao = FabricaConexoes.getConnection();
                stmt = conexao.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
                stmt.setString(1, risco.getRegiao());
                stmt.setLong(2, risco.getClassificacao());
                stmt.setString(3, risco.getCor());
                String converterperiodo = risco.getPeriodo().toString();
                stmt.setString(4, converterperiodo);
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
    public boolean alterar(Risco risco) {

        if(risco != null){
            Connection conexao = null;
            PreparedStatement stmt = null;
            ResultSet result = null;
            String sql = "UPDATE RISCO SET REGIAO,CLASSIFICACAO,COR_REGIAO,PERIODO = ?,?,?,? WHERE ID = ?";

            try {
                conexao = FabricaConexoes.getConnection();
                stmt = conexao.prepareStatement(sql);
                stmt.setString(1, risco.getRegiao());
                stmt.setLong(2, risco.getClassificacao());
                stmt.setString(3, risco.getCor());
                String converterperiodo = risco.getPeriodo().toString();
                stmt.setString(4, converterperiodo);
                //stmt.setInt(1, risco.getId()); //caso coloquemos id futuramente na entidade
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
            String sql = "DELETE FROM RISCO WHERE ID = ?";

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
