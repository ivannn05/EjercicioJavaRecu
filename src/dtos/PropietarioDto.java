package dtos;

import java.time.LocalDate;

public class PropietarioDto {

	long id;
	String dni="aaaa";
	LocalDate fechaCompra = LocalDate.of(9999, 12,31);
	String matriculaVehiculo="aaaa";
	
	public PropietarioDto() {
		super();
	}

	public PropietarioDto(long id, String dni, LocalDate fechaCompra, String matriculaVehiculo) {
		super();
		this.id = id;
		this.dni = dni;
		this.fechaCompra = fechaCompra;
		this.matriculaVehiculo = matriculaVehiculo;
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public LocalDate getFechaCompra() {
		return fechaCompra;
	}
	public void setFechaCompra(LocalDate fechaCompra) {
		this.fechaCompra = fechaCompra;
	}
	public String getMatriculaVehiculo() {
		return matriculaVehiculo;
	}
	public void setMatriculaVehiculo(String matriculaVehiculo) {
		this.matriculaVehiculo = matriculaVehiculo;
	}

}
