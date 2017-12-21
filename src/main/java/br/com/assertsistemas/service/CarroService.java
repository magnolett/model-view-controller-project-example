package br.com.assertsistemas.service;


import java.util.List;

import br.com.assertsistemas.model.Carro;

public interface CarroService {
	
	public boolean cadastro (Carro carro);
	
	public void editar (Carro carro);
	
	public void deletar (int carro);
	
	public List <Carro> listarTodos ();
	
	public Carro ListaPorID (int carroId);
	
	public List <Carro> ListaPorModelo(String carroModelo);

	public List <Carro> ListaPorAno (int carroAno);
}
