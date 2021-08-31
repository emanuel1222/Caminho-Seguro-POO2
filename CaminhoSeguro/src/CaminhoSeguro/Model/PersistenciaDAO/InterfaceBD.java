package CaminhoSeguro.Model.PersistenciaDAO;
import java.util.List;

public interface InterfaceBD {

  public List<Object> listar();
  public Object consultar (int id);
  public int inserir (Object obj);
  public boolean alterar(Object obj);
  public boolean remover (int id);

}