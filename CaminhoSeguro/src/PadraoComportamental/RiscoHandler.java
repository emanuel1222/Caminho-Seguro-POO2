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
public interface RiscoHandler {
    public void setNextHandler(RiscoHandler riscoHandler);
    public void processHandler(BuscaRisco buscaRisco, Data data);
}
