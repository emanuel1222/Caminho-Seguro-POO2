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
    private String nome;
    private ArrayList<Bairro> bairros;

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
    public void addBairro(Bairro bairro) {
        this.bairros.add(bairro);
    }
    
    public Cidade(){
        this.bairros = new ArrayList<>();
    }
}
