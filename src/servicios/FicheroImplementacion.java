package servicios;

import java.io.BufferedReader;

import java.io.FileReader;
import java.time.LocalDate;

import controladores.Inicio;
import dtos.PropietarioDto;
import dtos.VehiculoDto;

import utilidades.*;
public class FicheroImplementacion implements FicheroInterfaz {

	@Override
	public void cargaFichero() {
		String ruta="C:\\Users\\csi23-iloposa\\Desktop\\vehiculosYpropietarios.txt";
		try {
			BufferedReader lector = new BufferedReader(new FileReader(ruta));
			String linea;
			while ((linea= lector.readLine()) != null ) {
				String[] arrayLineas=linea.split(";");
				PropietarioDto propietario = new PropietarioDto();
				VehiculoDto vehiculo = new VehiculoDto();
				vehiculo.setMatriculaString(arrayLineas[0]);
				
			LocalDate fechaMatri = LocalDate.parse(arrayLineas[1]);
				vehiculo.setFechaMatriculacion(fechaMatri);
				propietario.setDni(arrayLineas[2]);
				
			LocalDate fechaCompra = LocalDate.parse(arrayLineas[3]);
				propietario.setFechaCompra(fechaCompra);
				Inicio.listaPropietarios.add(propietario);
				Inicio.listaVehiculos.add(vehiculo);
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

	@Override
	public void FicheroLog(String mensaje) {
		String ruta="C:\\Users\\csi23-iloposa\\Desktop\\Log-".concat(utilidades.Util.crecionNombreFichero().concat(".txt"));
		
	}

}
