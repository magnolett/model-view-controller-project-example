package br.com.assertsistemas.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.PreparedStatement;

import br.com.assertsistemas.model.Carreta;

public class CarretaDAOImpl implements CarretaDAO {
	
	@SuppressWarnings("unused")
	@Override
	public boolean insert(Carreta carreta) {
		
		try {
			Connection connectionJDBC = new ConnectJDBC().getConnectionJDBC();
			String sql = "Insert into carreta (categoria, modelo, combustivel, ano, renavan, placa, capacidadeCarga, numeroEixos) values (?,?,?,?,?,?,?,?)";
			PreparedStatement statement = (PreparedStatement) connectionJDBC.prepareStatement(sql);
			statement.setString(1, carreta.getCategoria());
			statement.setString(2, carreta.getModelo());
			statement.setString(3, carreta.getCombustivel());
			statement.setInt(4, carreta.getAno());
			statement.setString(5, carreta.getRenavan());
			statement.setString(6, carreta.getPlaca());
			statement.setInt(7, carreta.getCapacidadeCarga());
			statement.setInt(8, carreta.getNumeroEixos());
			boolean insertSucess = false;
			int rowsInserted = statement.executeUpdate();
			if (rowsInserted > 0) {
				System.out.println("O insert foi inserido com sucesso!");
				insertSucess = true;
			}
			connectionJDBC.close();
			return insertSucess = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean update(Carreta carreta) {
		Connection connectionJDBC = new ConnectJDBC().getConnectionJDBC();
		String sql = "Update carreta SET categoria=?, modelo=?, combustivel=?, ano=?, renavan=?, placa=?, capacidadeCarga=?, numeroEixos=? where idcarreta=? ";
		try {
			PreparedStatement statement = (PreparedStatement) connectionJDBC.prepareStatement(sql);
			statement.setInt(1, carreta.getId());
			statement.setString(2, carreta.getCategoria());
			statement.setString(3, carreta.getModelo());
			statement.setString(4, carreta.getCombustivel());
			statement.setInt(5, carreta.getAno());
			statement.setString(6, carreta.getRenavan());
			statement.setString(7, carreta.getPlaca());
			statement.setInt(8, carreta.getCapacidadeCarga());
			statement.setInt(9, carreta.getNumeroEixos());
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delete(int carretaId) {
		Connection connectionJDBC = new ConnectJDBC().getConnectionJDBC();
		String sql = "delete from carreta where idcarreta = ?";
		try {
			PreparedStatement statement = (PreparedStatement) connectionJDBC.prepareStatement(sql);
			statement.setInt(1, carretaId);
		
		int rowsDeleted = statement.executeUpdate();
		if (rowsDeleted > 0) {
			System.out.println("Deletado com sucesso!");
			return true;
		}
		
		return false;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<Carreta> findAll() {
		Connection connectionJDBC = new ConnectJDBC().getConnectionJDBC();
		String sql = "SELECT * FROM CARRETA";
		try {
			PreparedStatement statement = (PreparedStatement) connectionJDBC.prepareStatement(sql);
			
			List<Carreta> carretas = new ArrayList<>();
			ResultSet resultaQuery = statement.executeQuery();
			
		while (resultaQuery.next()) {
			Carreta carreta = new Carreta();
			carreta.setId(resultaQuery.getInt("idcarreta"));
			carreta.setCategoria(resultaQuery.getString("categoria"));
			carreta.setModelo(resultaQuery.getString("modelo"));
			carreta.setCombustivel(resultaQuery.getString("combustivel"));
			carreta.setAno(resultaQuery.getInt("ano"));
			carreta.setRenavan(resultaQuery.getString("renavan"));
			carreta.setPlaca(resultaQuery.getString("placa"));
			carreta.setCapacidadeCarga(resultaQuery.getInt("capacidadeCarga"));
			carreta.setNumeroEixos(resultaQuery.getInt("numeroEixos"));
		
			carretas.add(carreta);
		}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Carreta findById(int carretaId) {
		Connection connectionJDBC = new ConnectJDBC().getConnectionJDBC();
		String sql = "SELECT * FROM CARRETA WHERE idcarreta = ?";
		try {
			PreparedStatement statement = (PreparedStatement) connectionJDBC.prepareStatement(sql);
			statement.setInt(1, carretaId);
			
			ResultSet resultaQuery = statement.executeQuery();
			
		while (resultaQuery.next()) {
			Carreta carreta = new Carreta();
			carreta.setId(resultaQuery.getInt("idcarro"));
			carreta.setCategoria(resultaQuery.getString("categoria"));
			carreta.setModelo(resultaQuery.getString("modelo"));
			carreta.setCombustivel(resultaQuery.getString("combustivel"));
			carreta.setAno(resultaQuery.getInt("ano"));
			carreta.setRenavan(resultaQuery.getString("renavan"));
			carreta.setPlaca(resultaQuery.getString("placa"));
			carreta.setCapacidadeCarga(resultaQuery.getInt("capacidadeCarga"));
			carreta.setNumeroEixos(resultaQuery.getInt("numeroEixos"));
		
			return carreta;
		}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Carreta> findByModelo(String carretaModelo) {
		Connection connectionJDBC = new ConnectJDBC().getConnectionJDBC();
		String sql = "SELECT * FROM CARRETA WHERE MODELO=?";
		try {
			PreparedStatement statement = (PreparedStatement) connectionJDBC.prepareStatement(sql);
			statement.setString(1, carretaModelo);
			ResultSet resultaQuery = statement.executeQuery();
			List<Carreta> carretas = new ArrayList<>();
		while (resultaQuery.next()) {
			Carreta carreta = new Carreta();
			carreta.setId(resultaQuery.getInt("idcarro"));
			carreta.setCategoria(resultaQuery.getString("categoria"));
			carreta.setModelo(resultaQuery.getString("modelo"));
			carreta.setCombustivel(resultaQuery.getString("combustivel"));
			carreta.setAno(resultaQuery.getInt("ano"));
			carreta.setRenavan(resultaQuery.getString("renavan"));
			carreta.setPlaca(resultaQuery.getString("placa"));
			carreta.setCapacidadeCarga(resultaQuery.getInt("capacidadeCarga"));
			carreta.setNumeroEixos(resultaQuery.getInt("numeroEixos"));
		
			carretas.add(carreta);
		}
			return carretas;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public List<Carreta> findByAno(int carretaAno) {
		Connection connectionJDBC = new ConnectJDBC().getConnectionJDBC();
		String sql = "SELECT * FROM CARRETA WHERE ANO=?";
		try {
			PreparedStatement statement = (PreparedStatement) connectionJDBC.prepareStatement(sql);
			statement.setInt(1, carretaAno);
			ResultSet resultaQuery = statement.executeQuery();
			List<Carreta> carretas = new ArrayList<>();
		while (resultaQuery.next()) {
			Carreta carreta = new Carreta();
			carreta.setId(resultaQuery.getInt("idcarreta"));
			carreta.setCategoria(resultaQuery.getString("categoria"));
			carreta.setModelo(resultaQuery.getString("modelo"));
			carreta.setCombustivel(resultaQuery.getString("combustivel"));
			carreta.setAno(resultaQuery.getInt("ano"));
			carreta.setRenavan(resultaQuery.getString("renavan"));
			carreta.setPlaca(resultaQuery.getString("placa"));
			carreta.setCapacidadeCarga(resultaQuery.getInt("capacidadeCarga"));
			carreta.setNumeroEixos(resultaQuery.getInt("numeroEixos"));
			
		
			carretas.add(carreta);
		}
			return carretas;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
