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
    private String ID;
    private ArrayList<Bairro> bairrosPercorridos;

    public String getID() {
        return this.ID;
    }
    public void LinhaOnibus(String id) {
        this.ID = id;
    }
    public ArrayList<Bairro> getBairrosPercorridos() {
        return this.bairrosPercorridos;
    }
    public void setBairrosPercorridos(ArrayList<Bairro> bairros) {
            this.bairrosPercorridos = bairros;
    }
}
