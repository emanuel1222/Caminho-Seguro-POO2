/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PadraoConstrucao;
import CaminhoSeguro.Model.*;
import java.util.Calendar;
/**
 *
 * @author vinic
 */
public class DiretorCrime {
    
    public Crime builder(Incidente incidente, String cidade, String bairro, String rua, Double latitude, Double longitude, Calendar data ) throws Exception {
        Crime crime = new Crime();
        BuilderCrime builderCrime = new BuilderCrime(crime, incidente);
        builderCrime.setEndereco(cidade, bairro, rua);
        builderCrime.setPeriodo(data);
        builderCrime.setCoordenadas(latitude, longitude);
        return crime;
    }
}
