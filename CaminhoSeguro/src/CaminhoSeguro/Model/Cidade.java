/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CaminhoSeguro.Model;
import java.util.ArrayList;
/**
 *
 * @author vinic
 */
public class Cidade {
    private Integer ID;
    private String nome;
    public ArrayList<Bairro> bairros;
    private Poligono poligono;

    public Integer getID() {
        return this.ID;
    }
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public ArrayList<Bairro> getBairros() {
        return this.bairros;
    }
    public void setBairros(ArrayList<Bairro> bairros) {
        this.bairros = bairros;
    }
    public Poligono getPoligono() {
        return this.poligono;
    }

    public void setPoligono(Poligono poligono) {
        this.poligono = poligono;
    }
}
