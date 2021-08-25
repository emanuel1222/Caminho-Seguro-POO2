/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PadraoComportamental;

import CaminhoSeguro.Model.Periodo;
import CaminhoSeguro.Model.Risco;
import MockData.Garcon;

/**
 *
 * @author vinic
 */
public class TestCadeiaResponsabilidade {

    public static void main(String[] args) {
        Garcon garcon = new Garcon();
        garcon.Iniciar();
        
        RiscoBairro riscoBairro = new RiscoBairro();
        RiscoCidade riscoCidade = new RiscoCidade();
        RiscoLinhaOnibus riscoLinhaOnibus = new RiscoLinhaOnibus();
        
        riscoBairro.setNextHandler(riscoCidade);
        riscoCidade.setNextHandler(riscoLinhaOnibus);
        
        BuscaRisco br = new BuscaRisco(garcon.linhaOnibusData.getLinhaPorId("121"), Periodo.noite);
        BuscaRisco br1 = new BuscaRisco(garcon.bairroData.getBairroPorNome("CRUZAMENTO"), Periodo.tarde);
        BuscaRisco br2 = new BuscaRisco(garcon.cidadeData.getCidadePorNome("VILA VELHA"), Periodo.manha);
        
        riscoBairro.processHandler( br, garcon );
        riscoBairro.processHandler( br1, garcon );
        riscoBairro.processHandler( br2, garcon );
    }
    
}
