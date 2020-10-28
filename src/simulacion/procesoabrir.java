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
import static simulacion.Primera.Datos;
import static simulacion.Primera.entrada;
import static simulacion.Primera.model_tabla;
import static simulacion.Primera.sumatoria;

/**
 *
 * @author jtyhr
 */
public class procesoabrir {
    public String abrirArchivo(File archivo){
        String documento="";
        String document="";
        Double sumar,sumand = 0.0;
        int suma=0;
        try{
            entrada=new FileInputStream(archivo);
            String ascci;
            BufferedReader br = new BufferedReader(new InputStreamReader(entrada));
            while((ascci=br.readLine())!=null){
                String caracter=(String)ascci;
                documento=caracter;
                sumar = Double.parseDouble(documento);
                sumand += sumar;
                String[]info=new String[1];
                info[0]=documento;
                model_tabla.addRow(info);
                suma++;
            }
            br.close();
        } catch (Exception e) {
        }
        try{
            entrada=new FileInputStream(archivo);
            int ascci;
            while((ascci=entrada.read())!=-1){
                char caracter=(char)ascci;
                document+=caracter;
            }
        } catch (Exception e) {
        }
        String sumando = Double.toString(sumand);
        sumatoria.setText(sumando);
        String sumado = Integer.toString(suma);
        Datos.setText(sumado);
        return document;
    }
}
