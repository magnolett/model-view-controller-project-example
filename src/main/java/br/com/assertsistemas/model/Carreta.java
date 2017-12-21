package br.com.assertsistemas.model;

public class Carreta extends Automotores {
	
	private int id;
	private int capacidadeCarga;
	private int numeroEixos;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCapacidadeCarga() {
		return capacidadeCarga;
	}
	public void setCapacidadeCarga(int capacidadeCarga) {
		this.capacidadeCarga = capacidadeCarga;
	}
	public int getNumeroEixos() {
		return numeroEixos;
	}
	public void setNumeroEixos(int numeroEixos) {
		this.numeroEixos = numeroEixos;
	}
	@Override
	public String toString() {
		return "Carreta [id=" + id + ", capacidadeCarga=" + capacidadeCarga + ", numeroEixos=" + numeroEixos
				+ ", categoria=" + categoria + ", modelo=" + modelo + ", combustivel=" + combustivel + ", ano=" + ano
				+ ", renavan=" + renavan + ", placa=" + placa + "]";
	}
	
	

}
