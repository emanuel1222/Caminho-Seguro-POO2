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
import CaminhoSeguro.Model.Crime;
import CaminhoSeguro.Model.Endereco;


public class CrimeDao {
    //@Override
    public List<Crime> listar() {
        Connection conexao = null;
        PreparedStatement stmt = null;
        ResultSet result = null;

        String sql = "SELECT * FROM CRIME";

        try {

            conexao = FabricaConexoes.getConnection();
            stmt = conexao.prepareStatement(sql);
            result = stmt.executeQuery();
            List<Crime> crimes = new ArrayList<Crime>();

            while (result.next()) {
                int idCrime = result.getInt("id");
                Date data = result.getDate("data");
                String incidente = result.getString("incidente");
                Endereco endereco = (Endereco) result.getClob("endereco");
                Double latitude = result.getDouble("latitude");
                Double longitude = result.getDouble("longitude");

                
                Crime crime = new Crime();
                
                crimes.add(crime);
            }
            return crimes;    
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
    public Crime consultar(int id) {
        if(id > 0){
            Connection conexao = null;
            PreparedStatement stmt = null;
            ResultSet result = null;

            String sql = "SELECT * FROM CRIME WHERE ID = ?";

            try {
                conexao = FabricaConexoes.getConnection();
                stmt = conexao.prepareStatement(sql);
                stmt.setInt(1, id);
                result = stmt.executeQuery();

                if(result.next()){

                    int idCrime = result.getInt("id");
                    Date data = result.getDate("data");
                    String incidente = result.getString("incidente");
                    Endereco endereco = (Endereco) result.getClob("endereco");
                    Double latitude = result.getDouble("latitude");
                    Double longitude = result.getDouble("longitude");   
                    Crime crime = new Crime();
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
    public int inserir(Crime crime) {
        if(crime != null){
            Connection conexao = null;
            PreparedStatement stmt = null;
            ResultSet result = null;

            String sql = "INSERT INTO CRIME (DATA,INCIDENTE,ENDERECO,LATITUDE,LONGITUDE) VALUES (?,?,?,?,?)";

            try {
                conexao = FabricaConexoes.getConnection();
                stmt = conexao.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
                stmt.setDate(1, null, (Calendar) crime.getData());
                String converterIncidente = crime.getIncidente().toString();
                stmt.setString(2, converterIncidente);
                stmt.setClob(3, (Clob) crime.getEndereco());
                stmt.setDouble(4, crime.getLatitude());
                stmt.setDouble(5, crime.getLongitude());
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
    public boolean alterar(Crime crime) {

        if(crime != null){
            Connection conexao = null;
            PreparedStatement stmt = null;
            ResultSet result = null;
            String sql = "UPDATE CRIME SET DATA,INCIDENTE,ENDERECO,LATITUDE,LONGITUDE = ?,?,?,?,? WHERE ID = ?";

            try {
                conexao = FabricaConexoes.getConnection();
                stmt = conexao.prepareStatement(sql);
                stmt.setDate(1, null, (Calendar) crime.getData());
                String converterIncidente = crime.getIncidente().toString();
                stmt.setString(2, converterIncidente);
                stmt.setClob(3, (Clob) crime.getEndereco());
                stmt.setDouble(4, crime.getLatitude());
                stmt.setDouble(5, crime.getLongitude());
                //stmt.setInt(1, crime.getId()); //caso coloquemos id futuramente na entidade
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
            String sql = "DELETE FROM CRIME WHERE ID = ?";

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
