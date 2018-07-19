package com.ecodeup.articulo.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ecodeup.articulos.dao.ArticuloDAO;
import com.ecodeup.articulos.model.Aporte;

/**
 * Servlet implementation class AdminArticulo
 */
@WebServlet("/adminArticulo")
public class AdminArticulo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ArticuloDAO articuloDAO;

	public void init() {
		String jdbcURL = getServletContext().getInitParameter("jdbcURL");
		String jdbcUsername = getServletContext().getInitParameter("jdbcUsername");
		String jdbcPassword = getServletContext().getInitParameter("jdbcPassword");
		try {
			
			articuloDAO = new ArticuloDAO(jdbcURL, jdbcUsername, jdbcPassword);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AdminArticulo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Hola Servlet..");
		String action = request.getParameter("action");
		action=(action==null?"mostrar":action);
		System.out.println(action);
		try {
			switch (action) {
			case "index":
				index(request, response);
				break;
			case "indexAdm":
				indexAdm(request, response);
				break;
			case "nuevo":
				nuevo(request, response);
				break;
			case "register":
				System.out.println("entro");
				registrar(request, response);
				break;
			case "mostrar":
				mostrar(request, response);
				break;
			case "showedit":
				showEditar(request, response);
				break;	
			case "editar":
				editar(request, response);
				break;
			case "eliminar":
				eliminar(request, response);
				break;
			default:
				break;
			}			
		} catch (SQLException e) {
			e.getStackTrace();
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Hola Servlet..");
		doGet(request, response);
	}
	
	private void indexAdm (HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException{
		//mostrar(request, response);
		HttpSession session = request.getSession();
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		session.setAttribute("username", username);
		RequestDispatcher dispatcher= request.getRequestDispatcher("indexAdm.jsp");
		dispatcher.forward(request, response);
	}
	
	private void index (HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException{
		//mostrar(request, response);
		HttpSession session = request.getSession();
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		session.setAttribute("username", username);
		RequestDispatcher dispatcher= request.getRequestDispatcher("index.jsp");
		dispatcher.forward(request, response);
	}

	private void registrar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		String nombres=request.getParameter("nombres");
		String apePaterno=request.getParameter("apePaterno");
		String apeMaterno=request.getParameter("apeMaterno");
		double mtoAporte = Double.parseDouble(request.getParameter("mtoAporte"));
		double totalAporte = Double.parseDouble(request.getParameter("totalAporte"));
		String mesAporte = request.getParameter("mesAporte");
		String seccion = request.getParameter("seccion");
		double cuota1 = Double.parseDouble(request.getParameter("cuota1"));
		double cuota2 = Double.parseDouble(request.getParameter("cuota2"));
		double cuota3 = Double.parseDouble(request.getParameter("cuota3"));
		double cuota4 = Double.parseDouble(request.getParameter("cuota4"));
		double cuota5 = Double.parseDouble(request.getParameter("cuota5"));
		double cuota6 = Double.parseDouble(request.getParameter("cuota6"));
		double cuota7 = Double.parseDouble(request.getParameter("cuota7"));
		double cuota8 = Double.parseDouble(request.getParameter("cuota8"));
		double cuota9 = Double.parseDouble(request.getParameter("cuota9"));
		double cuota10 = Double.parseDouble(request.getParameter("cuota10"));
		String nroVoucher = request.getParameter("nroVoucher");
		String grado = request.getParameter("grado");
		
		Aporte articulo = new Aporte(0, nombres, apePaterno, apeMaterno, mtoAporte,totalAporte, mesAporte,seccion, cuota1, cuota2, cuota3, cuota4, cuota5, cuota6,cuota7, cuota8, cuota9, cuota10, nroVoucher, grado);
		articuloDAO.insertar(articulo);
		List<Aporte> listaArticulos= articuloDAO.listarArticulos();
		request.setAttribute("lista", listaArticulos);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/vista/mostrarAdm.jsp");
		dispatcher.forward(request, response);
	}
	
	private void nuevo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/vista/register.jsp");
		dispatcher.forward(request, response);
	}
	
	
	private void mostrar(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException , ServletException{
		RequestDispatcher dispatcher = null;
		String indAdm = request.getParameter("indAdm");
		indAdm = (indAdm==null?"":indAdm);
		List<Aporte> listaArticulos= articuloDAO.listarArticulos();
		request.setAttribute("lista", listaArticulos);
		request.setAttribute("indAdm", indAdm);
		if("S".equals(indAdm)) {
			dispatcher = request.getRequestDispatcher("/vista/mostrarAdm.jsp");	
		}else {
			dispatcher = request.getRequestDispatcher("/vista/mostrar.jsp");
		}
		dispatcher.forward(request, response);
	}	
	
	private void showEditar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		Aporte articulo = articuloDAO.obtenerPorId(Integer.parseInt(request.getParameter("id")));
		request.setAttribute("articulo", articulo);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/vista/editar.jsp");
		dispatcher.forward(request, response);
	}
	
	private void editar(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException{
		int id=Integer.parseInt(request.getParameter("id"));
		String nombres=request.getParameter("nombres");
		String apePaterno=request.getParameter("apePaterno");
		String apeMaterno=request.getParameter("apeMaterno");
		double mtoAporte = Double.parseDouble(request.getParameter("mtoAporte"));
		double totalAporte = Double.parseDouble(request.getParameter("totalAporte"));
		String mesAporte = request.getParameter("mesAporte");
		String seccion = request.getParameter("seccion");
		double cuota1 = Double.parseDouble(request.getParameter("cuota1"));
		double cuota2 = Double.parseDouble(request.getParameter("cuota2"));
		double cuota3 = Double.parseDouble(request.getParameter("cuota3"));
		double cuota4 = Double.parseDouble(request.getParameter("cuota4"));
		double cuota5 = Double.parseDouble(request.getParameter("cuota5"));
		double cuota6 = Double.parseDouble(request.getParameter("cuota6"));
		double cuota7 = Double.parseDouble(request.getParameter("cuota7"));
		double cuota8 = Double.parseDouble(request.getParameter("cuota8"));
		double cuota9 = Double.parseDouble(request.getParameter("cuota9"));
		double cuota10 = Double.parseDouble(request.getParameter("cuota10"));
		String nroVoucher = request.getParameter("nroVoucher");
		String grado = request.getParameter("grado");
		
		Aporte articulo = new Aporte(id, nombres, apePaterno, apeMaterno, mtoAporte, totalAporte,mesAporte,seccion, cuota1, cuota2, cuota3, cuota4, cuota5, cuota6,cuota7, cuota8, cuota9, cuota10, nroVoucher, grado);
		
		articuloDAO.actualizar(articulo);
		List<Aporte> listaArticulos= articuloDAO.listarArticulos();
		request.setAttribute("lista", listaArticulos);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/vista/mostrarAdm.jsp");
		dispatcher.forward(request, response);
	}
	
	private void eliminar(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException{
		Aporte articulo = articuloDAO.obtenerPorId(Integer.parseInt(request.getParameter("id")));
		articuloDAO.eliminar(articulo);
		List<Aporte> listaArticulos= articuloDAO.listarArticulos();
		request.setAttribute("lista", listaArticulos);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/vista/mostrarAdm.jsp");
		dispatcher.forward(request, response);
	}
}
