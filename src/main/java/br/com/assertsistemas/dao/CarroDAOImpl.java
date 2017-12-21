package br.com.assertsistemas.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.PreparedStatement;

import br.com.assertsistemas.model.Carro;

public class CarroDAOImpl implements CarroDAO {
	
	@SuppressWarnings("unused")
	@Override
	public boolean insert(Carro carro) {
		
		try {
			Connection connectionJDBC = new ConnectJDBC().getConnectionJDBC();
			String sql = "Insert into carro (categoria, modelo, combustivel, ano, renavan, placa, consumo, quilometragem) values (?,?,?,?,?,?,?,?)";
			PreparedStatement statement = (PreparedStatement) connectionJDBC.prepareStatement(sql);
			statement.setString(1, carro.getCategoria());
			statement.setString(2, carro.getModelo());
			statement.setString(3, carro.getCombustivel());
			statement.setInt(4, carro.getAno());
			statement.setString(5, carro.getRenavan());
			statement.setString(6, carro.getPlaca());
			statement.setDouble(7, carro.getConsumo());
			statement.setInt(8, carro.getQuilometragem());
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
	public boolean update(Carro carro) {
		Connection connectionJDBC = new ConnectJDBC().getConnectionJDBC();
		String sql = "Update carro SET categoria=?, modelo=?, combustivel=?, ano=?, renavan=?, placa=?, consumo=?, quilometragem=? where idcarro=? ";
		try {
			PreparedStatement statement = (PreparedStatement) connectionJDBC.prepareStatement(sql);
			statement.setInt(1, carro.getId());
			statement.setString(2, carro.getCategoria());
			statement.setString(3, carro.getModelo());
			statement.setString(4, carro.getCombustivel());
			statement.setInt(5, carro.getAno());
			statement.setString(6, carro.getRenavan());
			statement.setString(7, carro.getPlaca());
			statement.setDouble(8, carro.getConsumo());
			statement.setInt(9, carro.getQuilometragem());
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delete(int carroId) {
		Connection connectionJDBC = new ConnectJDBC().getConnectionJDBC();
		String sql = "delete from carro where idcarro = ?";
		try {
			PreparedStatement statement = (PreparedStatement) connectionJDBC.prepareStatement(sql);
			statement.setInt(1, carroId);
		
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
	public List<Carro> findAll() {
		Connection connectionJDBC = new ConnectJDBC().getConnectionJDBC();
		String sql = "SELECT * FROM CARRO";
		try {
			PreparedStatement statement = (PreparedStatement) connectionJDBC.prepareStatement(sql);
			
			List<Carro> carros = new ArrayList<>();
			ResultSet resultaQuery = statement.executeQuery();
			
		while (resultaQuery.next()) {
			Carro carro = new Carro();
			carro.setId(resultaQuery.getInt("idcarro"));
			carro.setCategoria(resultaQuery.getString("categoria"));
			carro.setModelo(resultaQuery.getString("modelo"));
			carro.setCombustivel(resultaQuery.getString("combustivel"));
			carro.setAno(resultaQuery.getInt("ano"));
			carro.setRenavan(resultaQuery.getString("renavan"));
			carro.setPlaca(resultaQuery.getString("placa"));
			carro.setConsumo(resultaQuery.getDouble("consumo"));
			carro.setQuilometragem(resultaQuery.getInt("quilometragem"));
		
			carros.add(carro);
		}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Carro findById(int carroId) {
		Connection connectionJDBC = new ConnectJDBC().getConnectionJDBC();
		String sql = "SELECT * FROM CARRO WHERE idcarro = ?";
		try {
			PreparedStatement statement = (PreparedStatement) connectionJDBC.prepareStatement(sql);
			statement.setInt(1, carroId);
			
			ResultSet resultaQuery = statement.executeQuery();
			
		while (resultaQuery.next()) {
			Carro carro = new Carro();
			carro.setId(resultaQuery.getInt("idcarro"));
			carro.setCategoria(resultaQuery.getString("categoria"));
			carro.setModelo(resultaQuery.getString("modelo"));
			carro.setCombustivel(resultaQuery.getString("combustivel"));
			carro.setAno(resultaQuery.getInt("ano"));
			carro.setRenavan(resultaQuery.getString("renavan"));
			carro.setPlaca(resultaQuery.getString("placa"));
			carro.setConsumo(resultaQuery.getDouble("consumo"));
			carro.setQuilometragem(resultaQuery.getInt("quilometragem"));
		
			return carro;
		}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Carro> findByModelo(String carroModelo) {
		Connection connectionJDBC = new ConnectJDBC().getConnectionJDBC();
		String sql = "SELECT * FROM CARRO WHERE MODELO=?";
		try {
			PreparedStatement statement = (PreparedStatement) connectionJDBC.prepareStatement(sql);
			statement.setString(1, carroModelo);
			ResultSet resultaQuery = statement.executeQuery();
			List<Carro> carros = new ArrayList<>();
		while (resultaQuery.next()) {
			Carro carro = new Carro();
			carro.setId(resultaQuery.getInt("idcarro"));
			carro.setCategoria(resultaQuery.getString("categoria"));
			carro.setModelo(resultaQuery.getString("modelo"));
			carro.setCombustivel(resultaQuery.getString("combustivel"));
			carro.setAno(resultaQuery.getInt("ano"));
			carro.setRenavan(resultaQuery.getString("renavan"));
			carro.setPlaca(resultaQuery.getString("placa"));
			carro.setConsumo(resultaQuery.getDouble("consumo"));
			carro.setQuilometragem(resultaQuery.getInt("quilometragem"));
		
			carros.add(carro);
		}
			return carros;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public List<Carro> findByAno(int carroAno) {
		Connection connectionJDBC = new ConnectJDBC().getConnectionJDBC();
		String sql = "SELECT * FROM CARRO WHERE ANO=?";
		try {
			PreparedStatement statement = (PreparedStatement) connectionJDBC.prepareStatement(sql);
			statement.setInt(1, carroAno);
			ResultSet resultaQuery = statement.executeQuery();
			List<Carro> carros = new ArrayList<>();
		while (resultaQuery.next()) {
			Carro carro = new Carro();
			carro.setId(resultaQuery.getInt("idcarro"));
			carro.setCategoria(resultaQuery.getString("categoria"));
			carro.setModelo(resultaQuery.getString("modelo"));
			carro.setCombustivel(resultaQuery.getString("combustivel"));
			carro.setAno(resultaQuery.getInt("ano"));
			carro.setRenavan(resultaQuery.getString("renavan"));
			carro.setPlaca(resultaQuery.getString("placa"));
			carro.setConsumo(resultaQuery.getDouble("consumo"));
			carro.setQuilometragem(resultaQuery.getInt("quilometragem"));
		
			carros.add(carro);
		}
			return carros;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}