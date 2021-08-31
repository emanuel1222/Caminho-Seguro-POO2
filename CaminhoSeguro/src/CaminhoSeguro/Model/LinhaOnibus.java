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
public class LinhaOnibus {
    private int ID;
    private ArrayList<Bairro> bairrosPercorridos;

    public int getID() {
        return this.ID;
    }
    public LinhaOnibus(int id) {
        this.ID = id;
    }
    public ArrayList<Bairro> getBairrosPercorridos() {
        return this.bairrosPercorridos;
    }
    public void setBairrosPercorridos(ArrayList<Bairro> bairros) {
            this.bairrosPercorridos = bairros;
    }
    
    public LinhaOnibus(int id, ArrayList<Bairro> bairros) {
        this.ID = id;
        this.bairrosPercorridos = bairros;
    }
}
