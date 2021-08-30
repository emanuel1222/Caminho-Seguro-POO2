/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PadraoComportamental;
import CaminhoSeguro.Model.*;
import MockData.*;
import PadraoConstrucao.Data;
import java.util.ArrayList;
/**
 *
 * @author vinic
 */
public class RiscoBairro extends AbstractRiscoHandler{
    private static final TipoBuscaRisco tipo = TipoBuscaRisco.bairro;
    
    @Override
    public TipoBuscaRisco getTipo() {
        return tipo;
    }

    @Override
    public void handlerRisco( BuscaRisco buscaRisco, Data data) {
        ArrayList<Crime> crimesNoBairroNoPeriodo = data.getCrimesBairroNoPeriodo(buscaRisco.bairro.getNome(), buscaRisco.periodo);
        int pontuacao = getPontuacao(crimesNoBairroNoPeriodo, data);
        Risco risco =  new Risco(buscaRisco.bairro.getNome(), buscaRisco.periodo, pontuacao);
        risco.descricao();
    }

    public int getPontuacao(ArrayList<Crime> crimes, Data data) {
        int pontuacao = 0;
        for (Crime crime : crimes ) {
            pontuacao += data.getPontucaoIncidente(crime.getIncidente());
        }
        return pontuacao;
    }
}
