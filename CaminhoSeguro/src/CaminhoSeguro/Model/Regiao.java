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
public class Regiao {
    private Integer region_id;
    private String nome;

    public Regiao(String nome, Integer region_id){
        this.setNome(nome);
        this.setRegion_id(region_id);
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public Integer getRegion_id(){
        return region_id;
    }

    public void setRegion_id(Integer region_id){
        this.region_id = region_id;
    }

    public void calcularClassificacao(){
        //função a ser implementada
    }
}
