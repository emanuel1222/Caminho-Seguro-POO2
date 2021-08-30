/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PadraoComportamental;

import CaminhoSeguro.Model.Crime;
import CaminhoSeguro.Model.Risco;
import PadraoConstrucao.Data;
import java.util.ArrayList;

/**
 *
 * @author vinic
 */
public class RiscoLinhaOnibus extends AbstractRiscoHandler {
    private static final TipoBuscaRisco tipo = TipoBuscaRisco.linhaOnibus;
    @Override
    public TipoBuscaRisco getTipo() {
        return tipo;
    }

    @Override
    public void handlerRisco( BuscaRisco buscaRisco, Data data) {
        ArrayList<Crime> crimesNaRegiaoDoOnibus = data.getCrimesNaRegiaoDoOnibus(buscaRisco.linha, buscaRisco.periodo);
        int pontuacao = getPontuacao(crimesNaRegiaoDoOnibus, data, buscaRisco.linha.getBairrosPercorridos().size());
        Risco risco =  new Risco("linha:" + buscaRisco.linha.getID(),buscaRisco.periodo, pontuacao);
        risco.descricao();
    }
    
    public int getPontuacao(ArrayList<Crime> crimes, Data data, Integer quantidadeBairros) {
        int pontuacao = 0;
        for (Crime crime : crimes ) {
            pontuacao += data.getPontucaoIncidente(crime.getIncidente());
        }
        return pontuacao/quantidadeBairros;
    }
    
}
