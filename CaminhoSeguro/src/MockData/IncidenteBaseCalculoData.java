/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MockData;
import java.util.HashMap;
import java.util.ArrayList;
import CaminhoSeguro.Model.*;

/**
 *
 * @author vinic
 */
public class IncidenteBaseCalculoData {
    private HashMap<Incidente, IncidenteBaseCalculo> incidenteBaseCalculo;
    
    IncidenteBaseCalculoData(){
        incidenteBaseCalculo = new HashMap();
        incidenteBaseCalculo.put(Incidente.furto, new IncidenteBaseCalculo(Incidente.furto, 17));
        incidenteBaseCalculo.put(Incidente.roubo, new IncidenteBaseCalculo(Incidente.roubo, 19));
        incidenteBaseCalculo.put(Incidente.lesao_morte, new IncidenteBaseCalculo(Incidente.lesao_morte, 29));
        incidenteBaseCalculo.put(Incidente.latrocinio, new IncidenteBaseCalculo(Incidente.latrocinio, 37));
        incidenteBaseCalculo.put(Incidente.homicidio, new IncidenteBaseCalculo(Incidente.homicidio, 39));
    }
    
    public Integer getPontucaoIncidente(Incidente incidente){
        return incidenteBaseCalculo.get(incidente).getPontuacao();
    }
}
