/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacion;

import javax.swing.JOptionPane;

/**
 *
 * @author jtyhr
 */
public class calcMedia {
    String datos,porcent,sumator;
    public void media(){
        datos = Primera.Datos.getText();
        porcent = (String) Primera.porcentaje.getSelectedItem();
        sumator = Primera.sumatoria.getText();
        try{
        Integer porciento;
        Double totalsuma;
        int datose;
        datose = Integer.parseInt(datos);
        porciento = Integer.parseInt(porcent);
        totalsuma = Double.parseDouble(sumator);
        Double media;
        media = totalsuma/datose;
        JOptionPane.showMessageDialog(null,"El calculo de la media es: "+media);
        String mediapo = Double.toString(media);
        Primera.Media.setText(mediapo);
        if(porciento == 90){
            Double Li,Ls;
            Li = 0.5-(1.635*(1/Math.sqrt(12*datose)));
            Ls = 0.5+(1.635*(1/Math.sqrt(12*datose)));
            
            String liminfe = Double.toString(Li);
            Primera.LimiteI.setText(liminfe);
            String limsup = Double.toString(Ls);
            Primera.LimiteS.setText(limsup);
        }else if(porciento == 95){
            Double Li,Ls;
            Li = 0.5-(1.96*(1/Math.sqrt(12*datose)));
            Ls = 0.5+(1.96*(1/Math.sqrt(12*datose)));
            
            String liminfe = Double.toString(Li);
            Primera.LimiteI.setText(liminfe);
            String limsup = Double.toString(Ls);
            Primera.LimiteS.setText(limsup);
        }else {
            Double Li,Ls;
            Li = 0.5-(2.575*(1/Math.sqrt(12*datose)));
            Ls = 0.5+(2.575*(1/Math.sqrt(12*datose)));
            
            String liminfe = Double.toString(Li);
            Primera.LimiteI.setText(liminfe);
            String limsup = Double.toString(Ls);
            Primera.LimiteS.setText(limsup);
        }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"No se han ingresado datos");
        }
    }
}
