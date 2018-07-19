package com.ecodeup.articulos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ecodeup.articulos.model.Aporte;
import com.ecodeup.articulos.model.Conexion;

/*
 * @autor: Elivar Largo
 * @web: www.ecodeup.com
 */

public class ArticuloDAO {
	private Conexion con;
	private Connection connection;

	public ArticuloDAO(String jdbcURL, String jdbcUsername, String jdbcPassword) throws SQLException {
		System.out.println(jdbcURL);
		con = new Conexion(jdbcURL, jdbcUsername, jdbcPassword);
	}

	// insertar artículo
	public boolean insertar(Aporte aporte) throws SQLException {
		String sql = "INSERT INTO aporte (id,nombres, ape_paterno, ape_materno, mto_aporte, total_aporte, mes_aporte, seccion, cuota1, cuota2, cuota3, cuota4, cuota5, cuota6, cuota7, cuota8, cuota9, cuota10, grado, nro_voucher) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		//System.out.println(articulo.getDescripcion());
		con.conectar();
		connection = con.getJdbcConnection();
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, null);
		statement.setString(2, aporte.getNombres());
		statement.setString(3, aporte.getApePaterno());
		statement.setString(4, aporte.getApeMaterno());
		statement.setDouble(5, aporte.getMtoAporte());
		statement.setDouble(6, aporte.getTotalAporte());
		statement.setString(7, aporte.getMesAporte());
		statement.setString(8, aporte.getSeccion());
		statement.setDouble(9, aporte.getCuota1());
		statement.setDouble(10, aporte.getCuota2());
		statement.setDouble(11, aporte.getCuota3());
		statement.setDouble(12, aporte.getCuota4());
		statement.setDouble(13, aporte.getCuota5());
		statement.setDouble(14, aporte.getCuota6());
		statement.setDouble(15, aporte.getCuota7());
		statement.setDouble(16, aporte.getCuota8());
		statement.setDouble(17, aporte.getCuota9());
		statement.setDouble(18, aporte.getCuota10());
		statement.setString(19, aporte.getNroVoucher());
		statement.setString(20, aporte.getGrado());
		
		//Aporte(0, nombres, apePaterno, apeMaterno, mtoAporte, mesAporte,seccion, cuota1, cuota2, cuota3, cuota4, cuota5, cuota6,cuota7, cuota8, cuota9, cuota10, nroVoucher, grado);
		
		boolean rowInserted = statement.executeUpdate() > 0;
		statement.close();
		con.desconectar();
		return rowInserted;
	}

	// listar todos los productos
	public List<Aporte> listarArticulos() throws SQLException {

		List<Aporte> listaArticulos = new ArrayList<Aporte>();
		String sql = "SELECT * FROM aporte";
		con.conectar();
		connection = con.getJdbcConnection();
		Statement statement = connection.createStatement();
		ResultSet resulSet = statement.executeQuery(sql);

		while (resulSet.next()) {
			int id = resulSet.getInt("id");
			String nombres=resulSet.getString("nombres");
			String apePaterno=resulSet.getString("ape_paterno");
			String apeMaterno=resulSet.getString("ape_materno");
			double mtoAporte = resulSet.getDouble("mto_aporte");
			double totalAporte = resulSet.getDouble("total_aporte");
			String mesAporte = resulSet.getString("mes_aporte");
			String seccion = resulSet.getString("seccion");
			double cuota1 = resulSet.getDouble("cuota1");
			double cuota2 = resulSet.getDouble("cuota2");
			double cuota3 = resulSet.getDouble("cuota3");
			double cuota4 = resulSet.getDouble("cuota4");
			double cuota5 = resulSet.getDouble("cuota5");
			double cuota6 = resulSet.getDouble("cuota6");
			double cuota7 = resulSet.getDouble("cuota7");
			double cuota8 = resulSet.getDouble("cuota8");
			double cuota9 = resulSet.getDouble("cuota9");
			double cuota10 = resulSet.getDouble("cuota10");
			String nroVoucher = resulSet.getString("nro_voucher");
			String grado = resulSet.getString("grado");
			
			
			Aporte aporte = new Aporte(id, nombres, apePaterno, apeMaterno, mtoAporte, totalAporte, mesAporte,seccion, cuota1, cuota2, cuota3, cuota4, cuota5, cuota6,cuota7, cuota8, cuota9, cuota10, nroVoucher, grado);
			listaArticulos.add(aporte);
		}
		con.desconectar();
		return listaArticulos;
	}

	// obtener por id
	public Aporte obtenerPorId(int id) throws SQLException {
		Aporte aporte = null;

		String sql = "SELECT * FROM aporte WHERE id= ? ";
		con.conectar();
		connection = con.getJdbcConnection();
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setInt(1, id);

		ResultSet res = statement.executeQuery();
		if (res.next()) {
			aporte = new Aporte(res.getInt("id"), res.getString("nombres"), res.getString("ape_paterno"),res.getString("ape_materno"), res.getDouble("mto_aporte"), res.getDouble("total_aporte"), res.getString("mes_aporte"), 
					res.getString("seccion"), res.getDouble("cuota1"), res.getDouble("cuota2"), res.getDouble("cuota3"), res.getDouble("cuota4"), res.getDouble("cuota5"), 
					res.getDouble("cuota6"), res.getDouble("cuota7"), res.getDouble("cuota8"), res.getDouble("cuota9"), res.getDouble("cuota10"),
					res.getString("nro_voucher"), res.getString("grado"));
		}
		res.close();
		con.desconectar();

		return aporte;
	}

	// actualizar
	public boolean actualizar(Aporte aporte) throws SQLException {
		boolean rowActualizar = false;
		String sql = "UPDATE aporte SET nombres=?,ape_paterno=?,ape_materno=?,mto_aporte=?, total_aporte=?, mes_aporte=?, seccion=?, cuota1=?, cuota2=?, cuota3=?, cuota4=?, cuota5=?, cuota6=?, cuota7=?, cuota8=?, cuota9=?, cuota10=?, nro_voucher=?, grado=? WHERE id=?";
		con.conectar();
		connection = con.getJdbcConnection();
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, aporte.getNombres());
		statement.setString(2, aporte.getApePaterno());
		statement.setString(3, aporte.getApeMaterno());
		statement.setDouble(4, aporte.getMtoAporte());
		statement.setDouble(5, aporte.getTotalAporte());
		statement.setString(6, aporte.getMesAporte());
		statement.setString(7, aporte.getSeccion());
		statement.setDouble(8, aporte.getCuota1());
		statement.setDouble(9, aporte.getCuota2());
		statement.setDouble(10, aporte.getCuota3());
		statement.setDouble(11, aporte.getCuota4());
		statement.setDouble(12, aporte.getCuota5());
		statement.setDouble(13, aporte.getCuota6());
		statement.setDouble(14, aporte.getCuota7());
		statement.setDouble(15, aporte.getCuota8());
		statement.setDouble(16, aporte.getCuota9());
		statement.setDouble(17, aporte.getCuota10());
		statement.setString(18, aporte.getNroVoucher());
		statement.setString(19, aporte.getGrado());
		statement.setInt(20, aporte.getId());

		rowActualizar = statement.executeUpdate() > 0;
		statement.close();
		con.desconectar();
		return rowActualizar;
	}
	
	//eliminar
	public boolean eliminar(Aporte aporte) throws SQLException {
		boolean rowEliminar = false;
		String sql = "DELETE FROM aporte WHERE ID=?";
		con.conectar();
		connection = con.getJdbcConnection();
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setInt(1, aporte.getId());

		rowEliminar = statement.executeUpdate() > 0;
		statement.close();
		con.desconectar();

		return rowEliminar;
	}

}
