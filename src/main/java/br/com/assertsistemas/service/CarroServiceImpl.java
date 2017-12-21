package br.com.assertsistemas.service;

import java.util.List;

import br.com.assertsistemas.dao.CarroDAO;
import br.com.assertsistemas.dao.CarroDAOImpl;
import br.com.assertsistemas.model.Carro;

public class CarroServiceImpl implements CarroService {

	private CarroDAO dao;

	public CarroServiceImpl() {
		dao = new CarroDAOImpl();
	}

	@Override
	public boolean cadastro(Carro carro) {
			return false;
		}


	@Override
	public void editar(Carro carro) {
		dao.update(carro);

	}

	@Override
	public void deletar(int carroId) {
		dao.delete(carroId);

	}

	@Override
	public List<Carro> listarTodos() {
		return dao.findAll();
	}

	@Override
	public Carro ListaPorID(int carroId) {
		return dao.findById(carroId);
	}

	@Override
	public List<Carro> ListaPorModelo(String carroModelo) {
		return dao.findByModelo(carroModelo);
	}

	@Override
	public List<Carro> ListaPorAno(int carroAno) {
		return dao.findByAno(carroAno);
	}
}
