package br.com.assertsistemas.model;

public class Carro extends Automotores {

	private int id;
	private double consumo;
	private int quilometragem;
	
	public Carro() {
		System.out.println();
	}	
	public Carro(int b) {
		System.out.println(b);
	}
	public Carro(char c) {
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		Carro c = new Carro();
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getConsumo() {
		return consumo;
	}
	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}
	public int getQuilometragem() {
		return quilometragem;
	}
	public void setQuilometragem(int quilometragem) {
		this.quilometragem = quilometragem;
	}
	@Override
	public String toString() {
		return "Carro [id=" + id + ", consumo=" + consumo + ", quilometragem=" + quilometragem + ", categoria="
				+ categoria + ", modelo=" + modelo + ", combustivel=" + combustivel + ", ano=" + ano + ", renavan="
				+ renavan + ", placa=" + placa + "]";
	}
	
	
}






