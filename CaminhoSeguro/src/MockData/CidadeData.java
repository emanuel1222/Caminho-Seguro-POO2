/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MockData;
import java.util.HashMap;
import java.util.ArrayList;
import CaminhoSeguro.Model.*;

/**
 *
 * @author vinic
 */
public class CidadeData {
    private final HashMap<String, Cidade> cidades;
    
    public CidadeData(BairroData bairroData) {
        cidades = new HashMap();
        ArrayList<Bairro> bairrosVitoria = new ArrayList<>();
        ArrayList<Bairro> bairrosVilaVelha = new ArrayList<>();
        ArrayList<Bairro> bairrosSerra = new ArrayList<>();
        
        ArrayList<Bairro> bairros = bairroData.getBairros();
        for (int i = 0; i < bairros.size(); i++) {
            Bairro bairro = bairros.get(i);
            if (bairro.getCidade().equalsIgnoreCase("VITORIA")){
                bairrosVitoria.add(bairro);
            }
            else if (bairro.getCidade().equalsIgnoreCase("VILA VELHA")){
                bairrosVilaVelha.add(bairro);
            }
            else {
                bairrosSerra.add(bairro);
            }
        }
        cidades.put("VITORIA", new Cidade("VITORIA", bairrosVitoria));
        cidades.put("VILA VELHA", new Cidade("VILA VELHA", bairrosVilaVelha));
        cidades.put("SERRA", new Cidade("SERRA", bairrosSerra));
    }
    public Cidade getCidadePorNome(String nome) {
        return cidades.get(nome);
    }
}
