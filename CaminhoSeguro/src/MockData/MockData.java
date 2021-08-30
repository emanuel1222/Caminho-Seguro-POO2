/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MockData;
import CaminhoSeguro.Model.*;
import PadraoConstrucao.*;
import java.util.ArrayList;

/**
 *
 * @author vinic
 */
public class MockData implements Data{
    public BairroData bairroData;
    public CidadeData cidadeData;
    public EnderecoData enderecoData;
    public LinhaOnibusData linhaOnibusData;
    public CrimeData crimeData;
    public IncidenteBaseCalculoData incidenteBaseCalculo;
    
    @Override
    public void Iniciar(){
        this.incidenteBaseCalculo = new IncidenteBaseCalculoData();
        this.bairroData = new BairroData();
        this.cidadeData = new CidadeData(bairroData);
        this.enderecoData = new EnderecoData(bairroData);
        this.linhaOnibusData = new LinhaOnibusData(bairroData);
        this.crimeData = new CrimeData(enderecoData);
    }
    
    @Override
    public Bairro getBairroPorNome(String nome){
        return bairroData.getBairroPorNome(nome);
    }
    
    @Override
    public ArrayList<Bairro> getBairros(){
        return bairroData.getBairros();
    }
    
    @Override
    public Cidade getCidadePorNome(String nome) {
        return cidadeData.getCidadePorNome(nome);
    }
    @Override
    public ArrayList<Crime> getCrimes() {
        return crimeData.getCrimes();
    }

    @Override
    public ArrayList<Crime> getCrimesBairroNoPeriodo(String bairro, Periodo periodo) {
	return crimeData.getCrimesBairroNoPeriodo(bairro, periodo);
    }

    @Override
    public ArrayList<Crime> getCrimesDaCidadeNoPeriodo(String cidade, Periodo periodo) {
        return crimeData.getCrimesDaCidadeNoPeriodo(cidade, periodo);
    }

    @Override
    public ArrayList<Crime> getCrimesNaRegiaoDoOnibus(LinhaOnibus linha, Periodo periodo) {
        return crimeData.getCrimesNaRegiaoDoOnibus(linha, periodo);
    }
    
    @Override
    public ArrayList<Endereco> getEnderecos(){
        return enderecoData.getEnderecos();
    }
    
    @Override
    public Integer getPontucaoIncidente(Incidente incidente){
        return incidenteBaseCalculo.getPontucaoIncidente(incidente);
    }
    
    @Override
    public LinhaOnibus getLinhaPorId(String id) {
        return linhaOnibusData.getLinhaPorId(id);
    }
}
