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
    private String bairro;
    private String rua;
    private String cidade;

    public Endereco(String bairro, String rua, String cidade){
        this.setBairro(bairro);
        this.setRua(rua);
        this.setCidade(cidade);
    }

    public String getBairro(){
        return bairro;
    }

    public void setBairro(String bairro){
        this.bairro = bairro;
    }

    public String getCidade(){
        return cidade;
    }

    public void setCidade(String cidade){
        this.cidade = cidade;
    }

    public String getRua(){
        return rua;
    }

    public void setRua(String rua){
        this.rua = rua;
    }

}