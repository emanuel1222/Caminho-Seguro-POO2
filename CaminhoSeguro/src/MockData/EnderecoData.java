/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MockData;
import java.util.HashMap;
import CaminhoSeguro.Model.*;
import java.util.ArrayList;

/**
 *
 * @author vinic
 */
public class EnderecoData {
    private final HashMap<String, Endereco> enderecos;
    
    EnderecoData(BairroData bairro) {
        enderecos = new HashMap<>();
        enderecos.put("RUA LISANDRO NICOLETTI", new Endereco("RUA LISANDRO NICOLETTI", bairro.getBairroPorNome("CRUZAMENTO")));
        enderecos.put("RUA ORMANDO AGUIAR", new Endereco("RUA ORMANDO AGUIAR", bairro.getBairroPorNome("CRUZAMENTO")));
        enderecos.put("BECO 15", new Endereco("BECO 15", bairro.getBairroPorNome("CRUZAMENTO")));
        enderecos.put("RUA LAURY TAVARES", new Endereco("RUA LAURY TAVARES", bairro.getBairroPorNome("CRUZAMENTO")));
        
        enderecos.put("ESCADARIA ALDÁRIO PEREIRA", new Endereco("ESCADARIA ALDÁRIO PEREIRA", bairro.getBairroPorNome("ROMAO")));
        enderecos.put("ESC PEDRO ROSINDO DA SILVA", new Endereco("ESC PEDRO ROSINDO DA SILVA", bairro.getBairroPorNome("ROMAO")));
        enderecos.put("RUA DOUTOR SOCRATES", new Endereco("RUA DOUTOR SOCRATES", bairro.getBairroPorNome("ROMAO")));
        
        enderecos.put("RUA GETULIO MIRANDA", new Endereco("RUA GETULIO MIRANDA", bairro.getBairroPorNome("ILHA DO PRINCIPE")));
        enderecos.put("RUA JOSE FRANCISCO BERTHOLDO", new Endereco("RUA JOSE FRANCISCO BERTHOLDO", bairro.getBairroPorNome("ILHA DO PRINCIPE")));
        
        enderecos.put("RUA LUIZ PEREIRA DE MELLO", new Endereco("RUA LUIZ PEREIRA DE MELLO", bairro.getBairroPorNome("SANTA MARTA")));
        
        enderecos.put("RUA ALDOMARIO SOARES PINTO", new Endereco("RUA ALDOMARIO SOARES PINTO", bairro.getBairroPorNome("GURIGICA")));
        enderecos.put("ESC SAO COSME", new Endereco("ESC SAO COSME", bairro.getBairroPorNome("GURIGICA")));
        enderecos.put("RUA NATALINA SIRTOLI DE ANGELI", new Endereco("RUA NATALINA SIRTOLI DE ANGELI", bairro.getBairroPorNome("GURIGICA")));
        enderecos.put("RUA EMILIO FERREIRA DA SILVA", new Endereco("RUA EMILIO FERREIRA DA SILVA", bairro.getBairroPorNome("GURIGICA")));
        
        enderecos.put("AV FERNANDO FERRARI", new Endereco("AV FERNANDO FERRARI", bairro.getBairroPorNome("DO QUADRO")));
        enderecos.put("FRANCISCO ALVARENGA RABEL", new Endereco("FRANCISCO ALVARENGA RABEL", bairro.getBairroPorNome("DO QUADRO")));
        enderecos.put("AVENIDA JOAO MENDES", new Endereco("AVENIDA JOAO MENDES", bairro.getBairroPorNome("DO QUADRO")));
        
        enderecos.put("RUA ALEXANDRE QUEIROZ DA SILVA", new Endereco("RUA ALEXANDRE QUEIROZ DA SILVA", bairro.getBairroPorNome("ULISSES GUIMARAES")));
        enderecos.put("RUA XAVANTES", new Endereco("RUA XAVANTES", bairro.getBairroPorNome("ULISSES GUIMARAES")));
        enderecos.put("RUA BONFINOPOLIS", new Endereco("RUA BONFINOPOLIS", bairro.getBairroPorNome("ULISSES GUIMARAES")));
        
        enderecos.put("RUA ADOLFINO ZAMPROGNO", new Endereco("RUA ADOLFINO ZAMPROGNO", bairro.getBairroPorNome("PRAIA DA COSTA")));
        enderecos.put("RUA SINVAL MORAES", new Endereco("RUA SINVAL MORAES", bairro.getBairroPorNome("PRAIA DA COSTA")));
        
        enderecos.put("AV JUPARANA", new Endereco("AV JUPARANA", bairro.getBairroPorNome("JARDIM MARILANDIA")));
        
        enderecos.put("AV RIO MARINHO", new Endereco("AV RIO MARINHO", bairro.getBairroPorNome("SANTA RITA")));
        enderecos.put("AV CAPUABA", new Endereco("AV CAPUABA", bairro.getBairroPorNome("SANTA RITA")));
        enderecos.put("RUA RAUL POMPEIA", new Endereco("RUA RAUL POMPEIA", bairro.getBairroPorNome("SANTA RITA")));
        enderecos.put("RUA RAUL POMPEIA", new Endereco("RUA RAUL POMPEIA", bairro.getBairroPorNome("SANTA RITA")));
        
        enderecos.put("RUA IDALESTE CARONE", new Endereco("RUA IDALESTE CARONE", bairro.getBairroPorNome("VILA BATISTA")));
        enderecos.put("RUA MARIA VESTTERINE MONTEIR", new Endereco("RUA MARIA VESTTERINE MONTEIR", bairro.getBairroPorNome("VILA BATISTA")));
        enderecos.put("RUA JUDITE VOZES COUTINHO", new Endereco("RUA JUDITE VOZES COUTINHO", bairro.getBairroPorNome("VILA BATISTA")));
        
        enderecos.put("RUA IDALECIO CARONE", new Endereco("RUA IDALECIO CARONE", bairro.getBairroPorNome("DOM JOAO BATISTA")));
        enderecos.put("RUA GRACILIANO RAMOS", new Endereco("RUA GRACILIANO RAMOS", bairro.getBairroPorNome("DOM JOAO BATISTA")));
        enderecos.put("RUA VISCONDE TAUNAY", new Endereco("RUA VISCONDE TAUNAY", bairro.getBairroPorNome("DOM JOAO BATISTA")));
        
        enderecos.put("RUA LIMA", new Endereco("RUA LIMA", bairro.getBairroPorNome("PRAIA DE CAPUBA")));
        enderecos.put("RUA LOREDO", new Endereco("RUA LOREDO", bairro.getBairroPorNome("PRAIA DE CAPUBA")));
        
        enderecos.put("RUA GETULIO VARGAS", new Endereco("RUA GETULIO VARGAS", bairro.getBairroPorNome("JARDIM CARAPINA")));
        
        enderecos.put("RUA BASILIO SERRI", new Endereco("RUA", bairro.getBairroPorNome("VISTA DA SERRA I")));
        enderecos.put("RUA JOÃO MILTON VAREJÃO", new Endereco("RUA JOÃO MILTON VAREJÃO", bairro.getBairroPorNome("VISTA DA SERRA I")));
        enderecos.put("RUA BARCELONA", new Endereco("RUA BARCELONA", bairro.getBairroPorNome("VISTA DA SERRA I")));
        enderecos.put("RUA LONDRINA", new Endereco("RUA LONDRINA", bairro.getBairroPorNome("VISTA DA SERRA I")));
        
        enderecos.put("RUA TIRADENTES", new Endereco("RUA TIRADENTES", bairro.getBairroPorNome("PLANALTO SERRANO")));
        enderecos.put("RUA IPATINGA", new Endereco("RUA IPATINGA", bairro.getBairroPorNome("PLANALTO SERRANO")));
        enderecos.put("RUA HERMES DA FONSECA", new Endereco("RUA HERMES DA FONSECA", bairro.getBairroPorNome("PLANALTO SERRANO")));
        
        enderecos.put("RUA SUCUPIRA", new Endereco("RUA SUCUPIRA", bairro.getBairroPorNome("CIDADE POMAR")));
        enderecos.put("RUA CHUI", new Endereco("RUA CHUI", bairro.getBairroPorNome("CIDADE POMAR")));
        enderecos.put("RUA ALECRIM", new Endereco("RUA ALECRIM", bairro.getBairroPorNome("CIDADE POMAR")));
        
        enderecos.put("RUA SEIS", new Endereco("RUA SEIS", bairro.getBairroPorNome("VILA NOVA")));
        enderecos.put("RUA BRAUNA", new Endereco("RUA BRAUNA", bairro.getBairroPorNome("VILA NOVA")));
        
        enderecos.put("RUA PRESIDENTE MEDICE", new Endereco("RUA PRESIDENTE MEDICE", bairro.getBairroPorNome("BELVEDERE")));
    }
    
    public ArrayList<Endereco> getEnderecos(){
        return new ArrayList<>(enderecos.values());
    }
    
}
