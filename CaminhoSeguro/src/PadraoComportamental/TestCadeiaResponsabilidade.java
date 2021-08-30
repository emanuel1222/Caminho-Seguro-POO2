/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PadraoComportamental;

import CaminhoSeguro.Model.Periodo;
import PadraoConstrucao.Data;
import PadraoConstrucao.FabricaData;

/**
 *
 * @author vinic
 */
public class TestCadeiaResponsabilidade {

    public static void main(String[] args) {
        FabricaData fabricaData = new FabricaData();
        Data data = fabricaData.geraData("MOCKDATA");
        
        RiscoBairro riscoBairro = new RiscoBairro();
        RiscoCidade riscoCidade = new RiscoCidade();
        RiscoLinhaOnibus riscoLinhaOnibus = new RiscoLinhaOnibus();
        
        riscoBairro.setNextHandler(riscoCidade);
        riscoCidade.setNextHandler(riscoLinhaOnibus);
        
        BuscaRisco br = new BuscaRisco(data.getLinhaPorId("121"), Periodo.noite);
        BuscaRisco br1 = new BuscaRisco(data.getBairroPorNome("CRUZAMENTO"), Periodo.tarde);
        BuscaRisco br2 = new BuscaRisco(data.getCidadePorNome("VILA VELHA"), Periodo.manha);
        
        riscoBairro.processHandler( br, data );
        riscoBairro.processHandler( br1, data );
        riscoBairro.processHandler( br2, data );
    }
    
}
