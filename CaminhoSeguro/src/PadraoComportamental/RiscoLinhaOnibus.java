/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PadraoComportamental;

import CaminhoSeguro.Model.Crime;
import CaminhoSeguro.Model.Risco;
import MockData.Garcon;
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
    public void handlerRisco( BuscaRisco buscaRisco, Garcon data) {
        ArrayList<Crime> crimesNaRegiaoDoOnibus = data.crimeData.getCrimesNaRegiaoDoOnibus(buscaRisco.linha, buscaRisco.periodo);
        int pontuacao = getPontuacao(crimesNaRegiaoDoOnibus, data, buscaRisco.linha.getBairrosPercorridos().size());
        Risco risco =  new Risco(pontuacao);
        risco.descricao();
    }
    
    public int getPontuacao(ArrayList<Crime> crimes, Garcon data, Integer quantidadeBairros) {
        int pontuacao = 0;
        for (Crime crime : crimes ) {
            pontuacao += data.incidenteBaseCalculo.getPontucaoIncidente(crime.getIncidente());
        }
        return pontuacao/quantidadeBairros;
    }
    
}
