package br.com.assertsistemas.dao;

import java.util.List;

import br.com.assertsistemas.model.Carreta;

public interface CarretaDAO {
	
	public boolean insert(Carreta carreta);
	
	public boolean update(Carreta carreta);
	
	public boolean delete (int carretaId);
	
	public List<Carreta> findAll();
	
	public Carreta findById(int carretaId);
	
	List <Carreta> findByModelo(String carretaModelo);
	
	List <Carreta> findByAno(int carretaAno);

}