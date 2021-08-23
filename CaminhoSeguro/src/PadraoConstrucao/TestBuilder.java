/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PadraoConstrucao;
import java.util.Calendar;
import CaminhoSeguro.Model.*;

import CaminhoSeguro.Model.Incidente;

/**
 *
 * @author vinic
 */
public class TestBuilder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DiretorCrime diretorCrime = new DiretorCrime();
        Calendar data = Calendar.getInstance();
        data.set(Calendar.YEAR, 2021);
        data.set(Calendar.MONTH, 7);
        data.set(Calendar.DAY_OF_MONTH, 20);
        data.set(Calendar.HOUR_OF_DAY, 14);
       try{
            Crime newCrime = diretorCrime.builder(Incidente.homicidio, "Vitória", "Jardin da Penha", "Da lama", -20.2791809, -40.3008986, data);
            String descricao = newCrime.descricaoCrime();
            System.out.println(descricao);
       }
       catch(Exception e) {
           System.out.println(e.toString());
       }

    }
    
}
