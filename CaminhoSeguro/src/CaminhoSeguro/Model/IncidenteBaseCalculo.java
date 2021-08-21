/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CaminhoSeguro.Model;

/**
 *
 * @author vinic
 */
public class IncidenteBaseCalculo {
    private Incidente incidente;
    private Integer pontuacao;
    
    public Incidente getIncidente() {
        return this.incidente;
    }
    public Integer getPontuacao() {
        return this.pontuacao;
    }
    public void setIncidente(Incidente incidente) {
        this.incidente = incidente;
    }
    public void setPontuacao(Integer valor) {
        this.pontuacao = valor;
    }
}
