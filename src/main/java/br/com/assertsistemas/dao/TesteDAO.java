package br.com.assertsistemas.dao;

import javax.swing.JOptionPane;

import br.com.assertsistemas.model.Carreta;
import br.com.assertsistemas.model.Carro;

public class TesteDAO {
	
	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog("1 para CARRO \n \n 2 para CARRETA");
		int i = Integer.valueOf(a);
		
		if (i == 1) {
			Carro carro = new Carro();
			carro.setId(3);
			carro.setCategoria("Sedan");
			carro.setModelo("Chevrolet Celta");
			carro.setCombustivel("Gasolina");
			carro.setAno(1999);
			carro.setRenavan("22412398710");
			carro.setPlaca("NJE9873");
			carro.setConsumo(14.3);
			carro.setQuilometragem(98392);
			CarroDAO dao = new CarroDAOImpl();
			//dao.insert(carro);
			//dao.update(carro);
			//dao.delete(1);
			//dao.findAll();
			//dao.findById(2);
			//dao.findByAno(1999);
			//dao.findByModelo("Sedan");
			
			System.out.println(carro);
		} else if (i == 2) {
			Carreta carreta = new Carreta();
			carreta.setId(1);
			carreta.setCategoria("14 Metros");
			carreta.setModelo("Volvo Centurion");
			carreta.setCombustivel("Diesel");
			carreta.setAno(1982);
			carreta.setRenavan("22412398710");
			carreta.setPlaca("WTF6666");
			carreta.setCapacidadeCarga(6000);
			carreta.setNumeroEixos(3);
			CarretaDAO dao = new CarretaDAOImpl();
			//dao.insert(carreta);
			//dao.update(carreta);
			//dao.delete(1);
			//dao.findAll();
			//dao.findById(2);
			//dao.findByAno(1982);
			//dao.findByModelo("Mini");
			
			System.out.println(carreta);
		}
	}

}
