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
public class Risco {
    private char classificacao;
    private String cor;
    
    public Risco(char classificacao, String cor){
        this.cor = cor;
        this.classificacao = classificacao;
    }
    public Risco() {
        
    }
    public Risco(int pontuacao) {
        if (pontuacao <= 25) {
            this.classificacao = 'A';
            this.cor = "VERDE";
        }
        if (pontuacao > 25 && pontuacao <=50) {
            this.classificacao = 'B';
            this.cor = "AZUL";
        }
        if (pontuacao > 50 && pontuacao <=75) {
            this.classificacao = 'C';
            this.cor = "LARANJA";
        }
        if (pontuacao > 75 ) {
            this.classificacao = 'D';
            this.cor = "VERMELHO";
        }
    }
    public void descricao() {
        System.out.println(cor + " " +  classificacao);
    }
}
