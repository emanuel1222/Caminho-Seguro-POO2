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
public class Bairro {
    private String nome;
    private Poligono poligono;
    private Cidade cidade;

    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }

    public Poligono getPoligono() {
        return this.poligono;
    }
    
    public void setPoligono(Poligono poligono) {
        this.poligono = poligono;
    }

    public Cidade getCidade() {
        return this.cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
}