package br.com.assertsistemas.service;

import java.util.List;

import br.com.assertsistemas.dao.CarretaDAO;
import br.com.assertsistemas.dao.CarretaDAOImpl;
import br.com.assertsistemas.model.Carreta;

public class CarretaServiceImpl implements CarretaService {

	private CarretaDAO dao;

	
	public CarretaServiceImpl() {
		dao = new CarretaDAOImpl();
	}


	@Override
	public List<Carreta> listarTodos() {
		return dao.findAll();
	}


	@Override
	public List<Carreta> listaPorModelo(String carretaModelo) {
		return dao.findByModelo(carretaModelo);
	}



	@Override
	public List<Carreta> listaPorAno(int carretaAno) {
		return dao.findByAno(carretaAno);
	}

	@Override
	public Carreta listaPorID(int carretaId) {
		return dao.findById(carretaId);
		
	}


	@Override
	public void cadastro(Carreta carreta) {
		dao.insert(carreta);
		
	}


	@Override
	public void editar(Carreta carreta) {
		dao.update(carreta);
		
	}


	@Override
	public void deletar(int carreta) {
		dao.delete(carreta);
		
	}
	
	
}
