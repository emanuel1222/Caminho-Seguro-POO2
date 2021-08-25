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
public class LinhaOnibusData {
    private final HashMap<String, LinhaOnibus> linhasOnibus;
    
    public LinhaOnibusData(BairroData bairro) {
        linhasOnibus = new HashMap<>();
        ArrayList<Bairro> bairrosLinha301 = new ArrayList<>();
        ArrayList<Bairro> bairrosLinha510 = new ArrayList<>();
        ArrayList<Bairro> bairrosLinha551 = new ArrayList<>();
        ArrayList<Bairro> bairrosLinha121 = new ArrayList<>();
        
        bairrosLinha301.add(bairro.getBairroPorNome("ILHA DO PRINCIPE"));
        bairrosLinha301.add(bairro.getBairroPorNome("SANTA MARTA"));
        bairrosLinha301.add(bairro.getBairroPorNome("PRAIA DA COSTA"));
        bairrosLinha301.add(bairro.getBairroPorNome("JARDIM MARILANDIA"));
        
        bairrosLinha510.add(bairro.getBairroPorNome("GURIGICA"));
        bairrosLinha510.add(bairro.getBairroPorNome("DO QUADRO"));
        bairrosLinha510.add(bairro.getBairroPorNome("ULISSES GUIMARAES"));
        bairrosLinha510.add(bairro.getBairroPorNome("CRUZAMENTO"));
        bairrosLinha510.add(bairro.getBairroPorNome("ROMAO"));
        
        bairrosLinha551.add(bairro.getBairroPorNome("CIDADE POMAR"));
        bairrosLinha551.add(bairro.getBairroPorNome("VILA NOVA"));
        bairrosLinha551.add(bairro.getBairroPorNome("BELVEDERE"));
        bairrosLinha551.add(bairro.getBairroPorNome("PRAIA DE CAPUBA"));
        bairrosLinha551.add(bairro.getBairroPorNome("JARDIM CARAPINA"));
        
        bairrosLinha121.add(bairro.getBairroPorNome("SANTA RITA"));
        bairrosLinha121.add(bairro.getBairroPorNome("VILA BATISTA"));
        bairrosLinha121.add(bairro.getBairroPorNome("DOM JOAO BATISTA"));
        bairrosLinha121.add(bairro.getBairroPorNome("CRUZAMENTO"));
        bairrosLinha121.add(bairro.getBairroPorNome("ROMAO"));
        
        linhasOnibus.put("301", new LinhaOnibus("301", bairrosLinha301));
        linhasOnibus.put("510", new LinhaOnibus("510", bairrosLinha510));
        linhasOnibus.put("551", new LinhaOnibus("551", bairrosLinha551));
        linhasOnibus.put("121", new LinhaOnibus("121", bairrosLinha121));
    }
    public LinhaOnibus getLinhaPorId(String id) {
        return linhasOnibus.get(id);
    }
}
