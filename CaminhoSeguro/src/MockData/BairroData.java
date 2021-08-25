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
public class BairroData {
    private final HashMap<String, Bairro> bairros;
    
    public BairroData() {
        bairros = new HashMap();
        bairros.put("CRUZAMENTO", new Bairro("CRUZAMENTO","VITORIA"));
        bairros.put("ROMAO", new Bairro("ROMAO","VITORIA"));    
        bairros.put("ILHA DO PRINCIPE", new Bairro("ILHA DO PRINCIPE","VITORIA"));
        bairros.put("SANTA MARTA", new Bairro("SANTA MARTA","VITORIA"));
        bairros.put("GURIGICA", new Bairro("GURIGICA","VITORIA"));
        bairros.put("DO QUADRO", new Bairro("DO QUADRO","VITORIA"));
        
        bairros.put("ULISSES GUIMARAES", new Bairro("ULISSES GUIMARAES","VILA VELHA"));
        bairros.put("PRAIA DA COSTA", new Bairro("PRAIA DA COSTA","VILA VELHA"));
        bairros.put("JARDIM MARILANDIA", new Bairro("JARDIM MARILANDIA","VILA VELHA"));
        bairros.put("SANTA RITA", new Bairro("SANTA RITA","VILA VELHA"));
        bairros.put("VILA BATISTA", new Bairro("VILA BATISTA","VILA VELHA"));
        bairros.put("DOM JOAO BATISTA", new Bairro("DOM JOAO BATISTA","VILA VELHA"));
        bairros.put("VILA NOVA", new Bairro("VILA NOVA","VILA VELHA"));
        
        bairros.put("PRAIA DE CAPUBA", new Bairro("PRAIA DE CAPUBA","SERRA"));
        bairros.put("JARDIM CARAPINA", new Bairro("JARDIM CARAPINA","SERRA"));
        bairros.put("VISTA DA SERRA I", new Bairro("VISTA DA SERRA I","SERRA"));
        bairros.put("PLANALTO SERRANO", new Bairro("PLANALTO SERRANO","SERRA"));
        bairros.put("CIDADE POMAR", new Bairro("CIDADE POMAR","SERR"));
        bairros.put("VILA NOVA DE COLARES", new Bairro("VILA NOVA DE COLARES","SERRA"));
        bairros.put("BELVEDERE", new Bairro("BELVEDERE","SERRA"));
    }
    
    public Bairro getBairroPorNome(String nome){
        return this.bairros.get(nome);
    }
    
    public ArrayList<Bairro> getBairros(){
        return new ArrayList<>(bairros.values());
    }
}
