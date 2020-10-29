/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacion;

/**
 *
 * @author jtyhr
 */
public class independencia {
    public void independencia(){
    Integer nivel;
        int datos;
        datos = Integer.parseInt(Primera.Datos.getText());
        nivel = Integer.parseInt((String) Primera.porcentaje.getSelectedItem());
        int longi = datos-1;
        int[] Secuencia = new int[longi];
        int conta=0, si=1, an=0,aum=0, anterior=0, siguiente=1;
        while(conta!=longi){
            if(procesoabrir.valores[si]<= procesoabrir.valores[an]){
                Secuencia[conta]=0;
            }else if(procesoabrir.valores[conta+1]> procesoabrir.valores[conta]){
                Secuencia[conta]=1;
            }
            conta++;
            an++;
            si++;
        }
        int a=0;
       while(a!=longi){
           if(siguiente>=longi){
               if(Secuencia[anterior]==Secuencia[siguiente-2]){
                aum++;
               }else aum++;
            }
           else{
              if(Secuencia[anterior]==Secuencia[siguiente]){    
                siguiente++;
                anterior++;
              }else{
                siguiente++;
                anterior++;
                aum++;
              }
            }
            a++;
        }
        if(nivel == 90){
            Double valorE, varianza,estadistico;
            valorE = (((2*datos)-1)/3.0);
            varianza = ((16*datos-29)/90.0);
            estadistico = (aum-valorE)/Math.sqrt(varianza);
            if(estadistico <1.635){
            Primera.indep.setText("Los numeros del conjunto son independientes");
            }
            else{
                Primera.indep.setText("Los numeros del conjunto no son independientes");
            }
            Primera.estad.setText(String.format("%.2f",estadistico));
            Primera.valoresp.setText(String.format("%.2f",valorE));
            Primera.resvar.setText(String.format("%.2f",varianza));
        }else if(nivel == 95){
            Double valorE, varianza,estadistico;
            valorE = (((2*datos)-1)/3.0);
            varianza = ((16*datos-29)/90.0);
            estadistico = (aum-valorE)/Math.sqrt(varianza);
            if(estadistico <1.96){
                Primera.indep.setText("Los numeros del conjunto son independientes");
            }
            else{
                Primera.indep.setText("Los numeros del conjunto no son independientes");
            }
            Primera.estad.setText(String.format("%.2f",estadistico));
            Primera.valoresp.setText(String.format("%.2f",valorE));
            Primera.resvar.setText(String.format("%.2f",varianza));    
        }else {
            Double valorE, varianza,estadistico;
            valorE = (((2*datos)-1)/3.0);
            varianza = ((16*datos-29)/90.0);
            estadistico = (aum-valorE)/Math.sqrt(varianza);
            if(estadistico <2.575){
                Primera.indep.setText("Los numeros del conjunto son independientes");
            }
            else{
                Primera.indep.setText("Los numeros del conjunto no son independientes");
            }
            Primera.indep.setText(String.format("%.2f",estadistico));
            Primera.valoresp.setText(String.format("%.2f",valorE));
            Primera.resvar.setText(String.format("%.2f",varianza));
        }
    }
}
