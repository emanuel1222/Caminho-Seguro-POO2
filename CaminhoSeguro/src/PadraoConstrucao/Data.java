/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PadraoConstrucao;

import CaminhoSeguro.Model.*;
import java.util.ArrayList;

/**
 *
 * @author vinic
 */
public interface Data {
    public void Iniciar();
    public Bairro getBairroPorNome(String nome);   
    public ArrayList<Bairro> getBairros();   
    public Cidade getCidadePorNome(String nome);  
    public ArrayList<Crime> getCrimes();
    public ArrayList<Crime> getCrimesBairroNoPeriodo(String bairro, Periodo periodo);
    public ArrayList<Crime> getCrimesDaCidadeNoPeriodo(String cidade, Periodo periodo);
    public ArrayList<Crime> getCrimesNaRegiaoDoOnibus(LinhaOnibus linha, Periodo periodo);   
    public ArrayList<Endereco> getEnderecos();  
    public Integer getPontucaoIncidente(Incidente incidente);    
    public LinhaOnibus getLinhaPorId(String id);
}
