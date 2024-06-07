package dtos;

import java.time.LocalDate;

public class VehiculoDto {

	long id;
	String matriculaString = "aaaa";
	LocalDate fechaMatriculacion = LocalDate.of(9999, 12, 31);
	boolean historico;

	
	public VehiculoDto(long id, String matriculaString, LocalDate fechaMatriculacion, boolean historico) {
		super();
		this.id = id;
		this.matriculaString = matriculaString;
		this.fechaMatriculacion = fechaMatriculacion;
		this.historico = historico;
	}

	public VehiculoDto() {
		super();
	}
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMatriculaString() {
		return matriculaString;
	}

	public void setMatriculaString(String matriculaString) {
		this.matriculaString = matriculaString;
	}

	public LocalDate getFechaMatriculacion() {
		return fechaMatriculacion;
	}

	public void setFechaMatriculacion(LocalDate fechaMatriculacion) {
		this.fechaMatriculacion = fechaMatriculacion;
	}

	public boolean isHistorico() {
		return historico;
	}

	public void setHistorico(boolean historico) {
		this.historico = historico;
	}

}

