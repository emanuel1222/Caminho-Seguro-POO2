/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PadraoComportamental;
import CaminhoSeguro.Model.*;

/**
 *
 * @author vinic
 */
public class BuscaRisco {
    public TipoBuscaRisco tipo;
    public LinhaOnibus linha;
    public Bairro bairro;
    public Cidade cidade;
    public Periodo periodo;
  
    public BuscaRisco(LinhaOnibus linha, Periodo periodo) {
        this.tipo = TipoBuscaRisco.linhaOnibus;
        this.linha = linha;
        this.periodo = periodo;
    }
    public BuscaRisco(Bairro bairro, Periodo periodo) {
        this.tipo = TipoBuscaRisco.bairro;
        this.bairro = bairro;
        this.periodo = periodo;
    }
    public BuscaRisco( Cidade cidade, Periodo periodo) {
        this.tipo = TipoBuscaRisco.cidade;
        this.cidade = cidade;
        this.periodo = periodo;
    }
}
