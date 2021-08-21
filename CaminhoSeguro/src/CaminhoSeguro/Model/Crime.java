/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CaminhoSeguro.Model;

import java.util.Date;

/**
 *
 * @author vinic
 */
public class Crime {
    private Periodo periodo;
    private Incidente incidente;
    private Endereco endereco;
    
    public Periodo getPeriodo(Periodo periodo) {
       return this.periodo;
    }
    public Incidente getIncidente(Incidente incidente) {
        return this.incidente;
    }
    public Endereco getEndereco() {
        return this.endereco;
    }
    public void setPeriodo(Periodo periodo) {
        this.periodo = periodo;
    }
    public void setIncidente(Incidente incidente) {
        this.incidente = incidente;
    }
    public void setEndereço(Endereco endereco) {
        this.endereco = endereco;
    }
    
}
