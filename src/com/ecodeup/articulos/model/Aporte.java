package com.ecodeup.articulos.model;

/**
 * Simple sistema de aportes mensuales para un aula de clases
 * @author iscodem-pc
 *
 */

public class Aporte {
	private int id;
	private String nombres;
	private String apePaterno;
	private String apeMaterno;
	private double mtoAporte;
	private double totalAporte;
	private String mesAporte;
	private String seccion;
	private double cuota1;
	private double cuota2;
	private double cuota3;
	private double cuota4;
	private double cuota5;
	private double cuota6;
	private double cuota7;
	private double cuota8;
	private double cuota9;
	private double cuota10;
	private String nroVoucher;
	private String grado;

	//getters y setters
	
	public Aporte(int id, String nombres, String apePaterno, String apeMaterno, double mtoAporte, double totalAporte, String mesAporte,
			String seccion, double cuota1, double cuota2, double cuota3, double cuota4, double cuota5, double cuota6,
			double cuota7, double cuota8, double cuota9, double cuota10, String nroVoucher, String grado) {
		super();
		this.id = id;
		this.nombres = nombres;
		this.apePaterno = apePaterno;
		this.apeMaterno = apeMaterno;
		this.mtoAporte = mtoAporte;
		this.totalAporte = totalAporte;
		this.mesAporte = mesAporte;
		this.seccion = seccion;
		this.cuota1 = cuota1;
		this.cuota2 = cuota2;
		this.cuota3 = cuota3;
		this.cuota4 = cuota4;
		this.cuota5 = cuota5;
		this.cuota6 = cuota6;
		this.cuota7 = cuota7;
		this.cuota8 = cuota8;
		this.cuota9 = cuota9;
		this.cuota10 = cuota10;
		this.nroVoucher = nroVoucher;
		this.grado = grado;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApePaterno() {
		return apePaterno;
	}
	public void setApePaterno(String apePaterno) {
		this.apePaterno = apePaterno;
	}
	public String getApeMaterno() {
		return apeMaterno;
	}
	public void setApeMaterno(String apeMaterno) {
		this.apeMaterno = apeMaterno;
	}
	public double getMtoAporte() {
		return mtoAporte;
	}
	public void setMtoAporte(double mtoAporte) {
		this.mtoAporte = mtoAporte;
	}
	public double getTotalAporte() {
		return totalAporte;
	}
	public void setTotalAporte(double totalAporte) {
		this.totalAporte = totalAporte;
	}
	public String getMesAporte() {
		return mesAporte;
	}
	public void setMesAporte(String mesAporte) {
		this.mesAporte = mesAporte;
	}
	public String getSeccion() {
		return seccion;
	}
	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}
	public double getCuota1() {
		return cuota1;
	}
	public void setCuota1(double cuota1) {
		this.cuota1 = cuota1;
	}
	public double getCuota2() {
		return cuota2;
	}
	public void setCuota2(double cuota2) {
		this.cuota2 = cuota2;
	}
	public double getCuota3() {
		return cuota3;
	}
	public void setCuota3(double cuota3) {
		this.cuota3 = cuota3;
	}
	public double getCuota4() {
		return cuota4;
	}
	public void setCuota4(double cuota4) {
		this.cuota4 = cuota4;
	}
	public double getCuota5() {
		return cuota5;
	}
	public void setCuota5(double cuota5) {
		this.cuota5 = cuota5;
	}
	public double getCuota6() {
		return cuota6;
	}
	public void setCuota6(double cuota6) {
		this.cuota6 = cuota6;
	}
	public double getCuota7() {
		return cuota7;
	}
	public void setCuota7(double cuota7) {
		this.cuota7 = cuota7;
	}
	public double getCuota8() {
		return cuota8;
	}
	public void setCuota8(double cuota8) {
		this.cuota8 = cuota8;
	}
	public double getCuota9() {
		return cuota9;
	}
	public void setCuota9(double cuota9) {
		this.cuota9 = cuota9;
	}
	public double getCuota10() {
		return cuota10;
	}
	public void setCuota10(double cuota10) {
		this.cuota10 = cuota10;
	}
	public String getNroVoucher() {
		return nroVoucher;
	}
	public void setNroVoucher(String nroVoucher) {
		this.nroVoucher = nroVoucher;
	}
	public String getGrado() {
		return grado;
	}
	public void setGrado(String grado) {
		this.grado = grado;
	}
}
