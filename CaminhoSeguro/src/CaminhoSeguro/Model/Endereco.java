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
public class Endereco {
    private String rua;
    private Bairro bairro;
    
    public void setRua(String rua) {
        this.rua = rua;
    }
    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }
    public Bairro getBairro() {
        return this.bairro;
    }
    public String getRua() {
        return this.rua;
    }
}
