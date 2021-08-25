/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PadraoConstrucao;
import java.util.Calendar;
import CaminhoSeguro.Model.*;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

        
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
    
    public BuilderCrime(Crime crime){
        this.crime = crime;
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
        newBairro.setCidade(cidade);
        newEndereco.setBairro(newBairro);
        
        this.crime.setEndereco(newEndereco);
    }
    public void setEndereco(Endereco endereco){   
        this.crime.setEndereco(endereco);
    }
    
    public void setCoordenadas(Double latitude, Double longitude) throws Exception{
        if (latitude.intValue() != -20 || longitude.intValue() != -40){
            throw new Exception("Coordenadas fora da grande Vitória, verifique os dados de entrada.");
        }
        this.crime.setLatitude(latitude);
        this.crime.setLongitude(longitude);
    }
    // DATA RANDOM DENTRO DE UMA SEMANA
    public void setPeriodo(){
        Random r = new Random();
        int dia = r.nextInt((337 - 330) + 1) + 330;
        int hora = r.nextInt((24 - 0) + 1) + 0;
        int minutos = r.nextInt((60 - 0) + 1) + 0;
        
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2021);
        calendar.set(Calendar.DAY_OF_YEAR, dia);
        calendar.set(Calendar.HOUR_OF_DAY, hora);
        calendar.set(Calendar.MINUTE, minutos);
        setPeriodo(calendar);
    }

    void setIncidente() {
        Random r = new Random();
        int i = r.nextInt(5);
        if (i == 0){
            this.crime.setIncidente(Incidente.furto);
        }
        if (i == 1){
            this.crime.setIncidente(Incidente.homicidio);
        }
        if (i == 2){
            this.crime.setIncidente(Incidente.latrocinio);
        }
        if (i == 3){
            this.crime.setIncidente(Incidente.lesao_morte);
        }
        if (i == 4){
            this.crime.setIncidente(Incidente.roubo);
        }
    }
}
