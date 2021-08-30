/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PadraoConstrucao;

import MockData.MockData;

/**
 *
 * @author vinic
 */
public class FabricaData {
    public Data geraData(String tipo) {
        if (tipo.equalsIgnoreCase("MOCKDATA")){
            MockData data = new  MockData();
            data.Iniciar();
            return data;
        }
        return null;
    }
}
