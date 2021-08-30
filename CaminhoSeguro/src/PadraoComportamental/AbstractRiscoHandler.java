/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PadraoComportamental;

import PadraoConstrucao.Data;


/**
 *
 * @author vinic
 */
public abstract class AbstractRiscoHandler implements RiscoHandler {

    private RiscoHandler nextRiscoHandler;
    
    @Override
    public void setNextHandler(RiscoHandler riscoHandler) {
        this.nextRiscoHandler = riscoHandler;
    }

    @Override
    public void processHandler( BuscaRisco buscaRisco, Data data) {
        if(buscaRisco.tipo == getTipo()) {
            handlerRisco( buscaRisco, data);
        } 
        if(nextRiscoHandler != null) { 
            this.nextRiscoHandler.processHandler( buscaRisco, data);
        }
    }
    
    public abstract TipoBuscaRisco getTipo();
    public abstract void handlerRisco( BuscaRisco buscaRisco, Data data);
}
