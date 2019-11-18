/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lernmatrix;

/**
 *
 * @author yohovani
 */
public class Patron {
	private double[] caracteristicas;
	private double[] clase;
	private double[] claseResultado;

	public Patron(double[] caracteristicas, double[] clase, double[] claseResultado) {
		this.caracteristicas = caracteristicas;
		this.clase = clase;
		this.claseResultado = claseResultado;
	}
        public Patron(int caracter) {
		this.caracteristicas = new double[caracter];

	}

	public double[] getCaracteristicas() {
		return caracteristicas;
	}

	public double[] getClase() {
		return clase;
	}
	
	public double[] getClaseResultado() {
		return claseResultado;
	}

	public void setCaracteristicas(double[] caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	public void setClase(double[] clase) {
		this.clase = clase;
	}

	public void setClaseResultado(double[] claseResultado) {
		this.claseResultado = claseResultado;
	}
	
}
