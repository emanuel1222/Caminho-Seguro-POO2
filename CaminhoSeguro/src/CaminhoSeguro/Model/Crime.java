/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CaminhoSeguro.Model;
import java.util.Date;
import java.text.SimpleDateFormat;
/**
 *
 * @author vinic
 */
public class Crime {
    private Date data;
    private SimpleDateFormat hora;

    public Crime(Date data, SimpleDateFormat hora){
        this.setData(data);
        //this.setHora(hora);
        this.setHora(hora);
    }

    public Date getData(){
        return data;
    }

    public void setData(Date data){
        this.data = data;
    }

    public SimpleDateFormat getHora(){
        return hora;
    }

    public void setHora(SimpleDateFormat hora){
        this.hora = hora;
    }

}
