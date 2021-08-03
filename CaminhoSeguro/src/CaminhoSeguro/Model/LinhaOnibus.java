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
public class LinhaOnibus {
    private String identificador;

    public LinhaOnibus(String identificador){
        this.setIdentificador(identificador);
    }

    public String getIdentificador(){
        return identificador;
    }

    public void setIdentificador(String identificador){
        this.identificador = identificador;
    }
}
