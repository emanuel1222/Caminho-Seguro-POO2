/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MockData;
import CaminhoSeguro.Model.*;

/**
 *
 * @author vinic
 */
public class Garcon {
    public BairroData bairroData;
    public CidadeData cidadeData;
    public EnderecoData enderecoData;
    public LinhaOnibusData linhaOnibusData;
    public CrimeData crimeData;
    public IncidenteBaseCalculoData incidenteBaseCalculo;
    
    public void Iniciar(){
        this.incidenteBaseCalculo = new IncidenteBaseCalculoData();
        this.bairroData = new BairroData();
        this.cidadeData = new CidadeData(bairroData);
        this.enderecoData = new EnderecoData(bairroData);
        this.linhaOnibusData = new LinhaOnibusData(bairroData);
        this.crimeData = new CrimeData(enderecoData);
    }
}
