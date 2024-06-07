package controladores;

import java.util.ArrayList;
import java.util.List;

import dtos.PropietarioDto;
import dtos.VehiculoDto;
import servicios.FicheroImplementacion;
import servicios.FicheroInterfaz;
import servicios.MenuImplementacion;
import servicios.MenuInterfaz;
import servicios.OperativaImplementacion;
import servicios.OperativaInterfaz;

public class Inicio {

	public static List<PropietarioDto> listaPropietarios = new ArrayList<PropietarioDto>();
	public static List<VehiculoDto> listaVehiculos = new ArrayList<VehiculoDto>();
		
	
	public static void main(String[] args) {
		/*1º : Comentarios
		 *2º : Tres Servicios--> Menus,Ficheros,Operativa
		 *3º : Menus ciclicos  
		 *4º : Nomenclatura 
		 *5º : GitHub obligatorio
		 *6º : Control de las ecxepciones
		 *7º : Fichero Log con opciones y mensaje de error  (Nombre dinamico)
		 *8º : Nombres especificos
		 */
		
		/*Realiza una carga inicial de datos de vehiculos desde un fichero con este nombre --> vehiculosYpropietarios.txt 
		 * esta carga alimentara dos DTOS , 1º carga Vehiculo , 2º carga Propietario , 
		 * Vehiculo = id,matricula,fechaMatriculacion,historico
		 * Proietario = id,dni,fechaCompra,matriculaVehiculo
		 * Apartir del propietario en encontrara el vehiculo correspondiente , solicitando por cpnsola la matricula
		 * 
		 * Fichero carga --> Campos --> Matricula;FechaMatriculacion;dni;FechaCompra
		 * MatriculaFormato--> 1111xxx
		 * FechasFormato-->"dd-MM-yyyy"
		 * */

		FicheroInterfaz fi= new FicheroImplementacion();
		MenuInterfaz mi = new MenuImplementacion();
		OperativaInterfaz op= new OperativaImplementacion();
		
		try {
			fi.cargaFichero();
		} catch (Exception e) {
			System.out.println("No hay datos anteriores");
		}
		
		
		
		
	}

}
