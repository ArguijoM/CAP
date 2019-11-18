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
public class main {
	public static void main(String[] arg){
		ArrayList<Patron> entrenamiento = new ArrayList<>();

		entrenamiento.add(new Patron(new double[]{2.1,3.8},new double[]{1,0},new double[]{0,0}));
                entrenamiento.add(new Patron(new double[]{6.3,3.8},new double[]{1,0},new double[]{0,0}));
		//entrenamiento.add(new Patron(new int[]{1,1,0,0,1},new int[]{0,1,0},new int[]{0,0,0}));
		//entrenamiento.add(new Patron(new int[]{1,0,1,1,0},new int[]{0,0,1},new int[]{0,0,0}));
		//entrenamiento.add(new Patron(new int[]{0,1,0,1,1},new int[]{1,0,0},new int[]{0,0,0}));
                //entrenamiento.add(new Patron(new int[]{0,0,1,0,1},new int[]{0,0,1},new int[]{0,0,0}));	
                LernMatrix lm = new LernMatrix();		
		lm.aprendizaje(entrenamiento);
		//lm.clasificacion(new Patron(new double[]{2.1,3.8},new double[]{1,0},new double[]{0,0}));
		//lm.clasificacion(new Patron(new double[]{2.1,3.8},new double[]{1,0},new double[]{0,0}));
		//lm.clasificacion(new Patron(new int[]{1,0,1,1,0},new int[]{0,0,1},new int[]{0,0,0}));
		//lm.clasificacion(new Patron(new int[]{0,1,0,1,1},new int[]{1,0,0},new int[]{0,0,0}));
                //lm.clasificacion(new Patron(new int[]{0,0,1,0,1},new int[]{0,0,1},new int[]{0,0,0}));
	}
}
