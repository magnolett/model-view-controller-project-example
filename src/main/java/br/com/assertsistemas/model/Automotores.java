package br.com.assertsistemas.model;

public abstract class Automotores {

	protected String categoria;
	protected String modelo;
	protected String combustivel;
	protected int ano;
	protected String renavan;
	protected String placa;

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getRenavan() {
		return renavan;
	}

	public void setRenavan(String renavan) {
		this.renavan = renavan;
	}
	
	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	@Override
	public String toString() {
		return "Automotores [categoria=" + categoria + ", modelo=" + modelo + ", combustivel=" + combustivel + ", ano="
				+ ano + ", renavan=" + renavan + ", placa=" + placa + "]";
	}
}
