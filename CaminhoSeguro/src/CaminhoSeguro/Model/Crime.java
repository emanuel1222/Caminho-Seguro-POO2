/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CaminhoSeguro.Model;

import java.util.Calendar;

/**
 *
 * @author vinic
 */
public class Crime {
    private int id;
    private Calendar data;
    private Periodo periodo;
    private Incidente incidente;
    private Endereco endereco;
    private Double latitude;
    private Double longitude;
   
    public int getId() {
        return this.id;
    }
    
    public Calendar getData() {
        return this.data;
    }
    public Periodo getPeriodo() {
       return this.periodo;
    }
    public Incidente getIncidente() {
        return this.incidente;
    }
    public Endereco getEndereco() {
        return this.endereco;
    }
    public void setPeriodo(Periodo periodo) {
        this.periodo = periodo;
    }
    public void setIncidente(Incidente incidente) {
        this.incidente = incidente;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public void setDate(Calendar data) {
        this.data = data;
    }
    public String descricaoCrime() {
        String descricao = "Descrição Crime:";
        
        descricao += "\nIncidente: " + this.incidente;
        descricao += "\n";
        descricao += "Ano: " + this.data.get(Calendar.YEAR) + "\tMês: " + this.data.get(Calendar.MONTH) +"\tDia: "+ this.data.get(Calendar.DAY_OF_MONTH) +"\tHorário: "+ this.data.get(Calendar.HOUR_OF_DAY) +":"+ this.data.get(Calendar.MINUTE);
        descricao += "\n";
        descricao += this.getEndereco().toString();
        descricao += "Latitude: " + this.latitude + "\tLongitude: " + this.longitude; 
        
        return descricao;
    }
    public void setLatitude(Double valor) {
        this.latitude = valor;
    }
    
    public void setLongitude(Double valor) {
        this.longitude = valor;
    }
    
    public Double getLatitude(){
        return this.latitude;
    }
    
    public Double getLongitude(){
        return this.longitude;
    }
}
