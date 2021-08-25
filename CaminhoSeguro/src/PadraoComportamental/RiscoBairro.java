/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PadraoComportamental;
import CaminhoSeguro.Model.*;
import MockData.*;
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
    public void handlerRisco( BuscaRisco buscaRisco, Garcon data) {
        ArrayList<Crime> crimesNoBairroNoPeriodo = data.crimeData.getCrimesBairroNoPeriodo(buscaRisco.bairro.getNome(), buscaRisco.periodo);
        int pontuacao = getPontuacao(crimesNoBairroNoPeriodo, data);
        Risco risco =  new Risco(pontuacao);
        risco.descricao();
    }

    public int getPontuacao(ArrayList<Crime> crimes, Garcon data) {
        int pontuacao = 0;
        for (Crime crime : crimes ) {
            pontuacao += data.incidenteBaseCalculo.getPontucaoIncidente(crime.getIncidente());
        }
        return pontuacao;
    }
}
