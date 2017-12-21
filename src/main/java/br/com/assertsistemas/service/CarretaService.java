package br.com.assertsistemas.service;

import java.util.List;

import br.com.assertsistemas.model.Carreta;

public interface CarretaService {


	public void cadastro (Carreta carreta);
	
	public void editar (Carreta carreta);
	
	public void deletar (int carreta);
	
	public List <Carreta> listarTodos ();

	public Carreta listaPorID (int carretaId);
	
	public List <Carreta> listaPorModelo(String carretaModelo);
	
	public List <Carreta> listaPorAno(int carretaAno);

	
}
