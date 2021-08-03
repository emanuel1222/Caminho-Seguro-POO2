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
public class Poligono {
    private ArrayList<Ponto> pontos;
    
    public ArrayList<Ponto> getPontos() {
        return this.pontos;
    }
    
    public void setPontos(ArrayList<Ponto> pontos) {
        this.pontos = pontos;
    }
}
