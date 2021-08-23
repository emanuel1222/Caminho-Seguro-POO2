/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PadraoConstrucao;
import java.util.Calendar;
import CaminhoSeguro.Model.*;

        
/**
 *
 * @author vinic
 */
public class BuilderCrime {
    private Crime crime;
    private Incidente incidente;
    private Periodo periodo;
    
    public BuilderCrime(Crime crime, Incidente incidente){
        this.crime = crime;
        this.crime.setIncidente(incidente);
    }
    
    public void setPeriodo(Calendar data) {
        int horario =  data.get(Calendar.HOUR_OF_DAY);
        this.crime.setDate(data);
        if (horario >= 4 && horario <= 12) {
            this.crime.setPeriodo(periodo.manha);
        }
        if (horario >= 13 && horario <= 18) {
            this.crime.setPeriodo(periodo.tarde);
        }
        else this.crime.setPeriodo(periodo.noite);
    }
    
    public void setEndereco(String cidade, String bairro, String rua){   
        Cidade newCidade = new Cidade();
        Bairro newBairro = new Bairro();
        Endereco newEndereco = new Endereco();
        newCidade.setNome(cidade);
        newBairro.setNome(bairro);
        newEndereco.setRua(rua);
        newCidade.addBairro(newBairro);
        newBairro.setCidade(newCidade);
        newEndereco.setBairro(newBairro);
        
        this.crime.setEndereço(newEndereco);
    }
    
    public void setCoordenadas(Double latitude, Double longitude) throws Exception{
        if (latitude.intValue() != -20 || longitude.intValue() != -40){
            throw new Exception("Coordenadas fora da grande Vitória, verifique os dados de entrada.");
        }
        this.crime.setLatitude(latitude);
        this.crime.setLongitude(longitude);
    }
    
}
