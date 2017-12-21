package br.com.assertsistemas.dao;

import java.util.List;

import br.com.assertsistemas.model.Carro;

public interface CarroDAO {
	
	public boolean insert(Carro carro);
	
	public boolean update(Carro carro);
	
	public boolean delete (int carroId);
	
	public List<Carro> findAll();
	
	public Carro findById(int carroId);
	
	List <Carro> findByModelo(String carroModelo);
	
	List <Carro> findByAno(int carroAno);

}
