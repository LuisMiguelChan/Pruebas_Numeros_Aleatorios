/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;
import static simulacion.Primera.Datos;
import static simulacion.Primera.sumatoria;

/**
 *
 * @author jtyhr
 */
public class Media {
    public void media(){
        Double media;
        media = Double.parseDouble(Primera.sumatoria.getText())/Integer.parseInt(Primera.Datos.getText());
        String mediapo = Double.toString(media);
        Primera.Media.setText(mediapo);
    }
    public Double varianza(File archivo){
        String documento="";
        Double sumar,resultado = 0.0, sumatorias = 0.0;
        int suma=0;
        try{
            Primera.entrada=new FileInputStream(archivo);
            String ascci;
            BufferedReader br = new BufferedReader(new InputStreamReader(Primera.entrada));
            while((ascci=br.readLine())!=null){
                String caracter=(String)ascci;
                documento=caracter;
                sumar = Double.parseDouble(documento);
                
                Double[] datos=new Double[suma+1];
                datos[suma]=sumar;
                
                Double totalsuma;
                int datose;
        
                datose = Integer.parseInt(Datos.getText());
                totalsuma = Double.parseDouble(sumatoria.getText());
                Double media;
                media = totalsuma/datose;
                
                sumatorias = Math.pow(datos[suma]-media,2);
                
                resultado = resultado + sumatorias;
                
                suma++;
            }
            
            resultado = resultado / (suma-1);
            
            br.close();
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Aun no se han ingresado datos");
        }
        return resultado;
    }
}
