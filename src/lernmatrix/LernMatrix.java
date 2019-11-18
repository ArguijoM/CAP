/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lernmatrix;

import java.util.ArrayList;

/**
 *
 * @author yohovani
 */
public class LernMatrix {
	static final int e=1;
	private float[][] mat;
        private Patron tras;//patron medio
	
	public void aprendizaje(ArrayList<Patron> instancias){
            
	int caracteristicas = instancias.get(0).getCaracteristicas().length;
	int clases = instancias.get(0).getClase().length;
	this.mat = new float[clases][caracteristicas];//generar el clasificador
        
       //calcular el patron medio
        this.tras = new Patron(caracteristicas);
        for (Patron aux: instancias){
            for(int x=0;x<aux.getCaracteristicas().length;x++){
                tras.getCaracteristicas()[x]+=aux.getCaracteristicas()[x];
            }
        }
        for(int x=0;x<tras.getCaracteristicas().length;x++){
               tras.getCaracteristicas()[x]/=instancias.size();
           }
        //restar el patron medio a los patrones de prueba
        for(int i=0;i<instancias.size();i++){
            for(int j=0;j<caracteristicas;j++){
                    instancias.get(i).getCaracteristicas()[j]-= tras.getCaracteristicas()[j];
                    //formar el clasificador
                    this.mat[i][j]+=instancias.get(i).getCaracteristicas()[j];      
            }
        }
       //Transponer el clasificador
       float aux;
        for (int x=0; x <clases; x++) {
            for (int y=0; y <clases; y++) {
                aux=mat[x][y];
                mat[x][y]=mat[y][x];
                mat[y][x]=aux;
                //System.out.println(""+mat[y][x]);
            }
        }
        //recuperacion
        for (int a=0; a <instancias.size(); a++) {
            for (int b=0; b <instancias.get(a).getClaseResultado().length; b++) {
                for (int c=0; c <instancias.get(a).getClaseResultado().length; c++) {
                    instancias.get(a).getClaseResultado()[b]+=(instancias.get(a).getCaracteristicas()[c]*mat[b][c]);
                }
                
            }
        }
        //Mostrar la matriz resultante
        for(int i=0;i<instancias.size();i++){
            System.out.println("Matriz "+i);
            System.out.println("{");
            for(int j=0;j<caracteristicas;j++){
                    System.out.println(instancias.get(i).getClaseResultado()[j]);    
            }
            System.out.println("}");
        }
  
    }
//    public void clasificacion(Patron x){
//        for(int i=0;i<x.getClase().length;i++){
//            for(int j=0;j<x.getCaracteristicas().length;j++){
//		x.getCaracteristicas()[i]*=mat[i][j];
//                         
//		}
//            }
//    }
	
	
}
