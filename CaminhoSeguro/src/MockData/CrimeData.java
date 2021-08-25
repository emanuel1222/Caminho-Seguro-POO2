/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MockData;
import java.util.HashMap;
import java.util.ArrayList;
import CaminhoSeguro.Model.*;
import PadraoConstrucao.*;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vinic
 */
public class CrimeData {
    private final HashMap<String, Crime> crimes;
    
    public CrimeData(EnderecoData endereco) {
        crimes = new HashMap<>();
        ArrayList<Endereco> enderecos = endereco.getEnderecos();
        DiretorCrime diretor = new DiretorCrime();
        
        for (Integer i = 0; i < enderecos.size(); i++) {
            try {
                crimes.put(i.toString(), diretor.mockBuilder(enderecos.get(i), -20.085156, -40.05054165));
            } catch (Exception ex) {
                Logger.getLogger(CrimeData.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public ArrayList<Crime> getCrimes() {
        return new ArrayList<>(crimes.values());
    }

    public ArrayList<Crime> getCrimesBairroNoPeriodo(String bairro, Periodo periodo) {
	Set<String> chaves = crimes.keySet();
        ArrayList<Crime> crimesNoBairroNoPeriodo = new ArrayList();
	for (String chave : chaves) {
            Crime crime = crimes.get(chave);
            if (crime.getEndereco().getBairro().getNome().equalsIgnoreCase(bairro) && (crime.getPeriodo() == periodo)) {
                crimesNoBairroNoPeriodo.add(crime);
            }
	}
        return crimesNoBairroNoPeriodo;
    }

    public ArrayList<Crime> getCrimesDaCidadeNoPeriodo(String cidade, Periodo periodo) {
        Set<String> chaves = crimes.keySet();
        ArrayList<Crime> CrimesDaCidadeNoPeriodo = new ArrayList();
	for (String chave : chaves) {
            Crime crime = crimes.get(chave);
            if (crime.getEndereco().getBairro().getCidade().equalsIgnoreCase(cidade) && (crime.getPeriodo() == periodo)) {
                CrimesDaCidadeNoPeriodo.add(crime);
            }
	}
        return CrimesDaCidadeNoPeriodo;
    }

    public ArrayList<Crime> getCrimesNaRegiaoDoOnibus(LinhaOnibus linha, Periodo periodo) {
        Set<String> chaves = crimes.keySet();
        ArrayList<Crime> CrimesNaRegiaoDoOnibus = new ArrayList();
	for (String chave : chaves) {
            Crime crime = crimes.get(chave);
            if (linha.getBairrosPercorridos().contains(crime.getEndereco().getBairro()) && (crime.getPeriodo() == periodo)) {
                CrimesNaRegiaoDoOnibus.add(crime);
            }
	}
        return CrimesNaRegiaoDoOnibus;
    }
    
}
