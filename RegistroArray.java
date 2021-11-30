//Briguitte Salas Chinchilla B36282

//Explicacion: Creacion de la RegistroArray

import java.util.ArrayList;

public class RegistroArray{

	ArrayList<Docente> registro=new ArrayList<Docente>();

	public RegistroArray(){
	}

	////////Metodos de operaciones de Arreglos///////////////////////////////////////
	
	///Metodo para registrar el docente
	
	public void agregarDocente(Docente docente){                           //Preguntar en el menu principal por la cedula y llamar al metodo verificarCedula 
		registro.add(docente);
		System.out.println("Docente agregado correctamente al array");
	}
	
	
	///Metodo para verificar si el numero de cedula existe
	
	public boolean verificarCedula(String cedula){
		boolean existe=false;
		for(int indice=0; indice<registro.size(); indice++){
			if(registro.get(indice).getCedula().equals(cedula)){
				existe=true;
				break;
			}
		}
		return existe;
	}
	
	///Buscar Nombre del Usuario
	
		public Docente buscarUsuario(String cedula){
		Docente docenteTemporal=null;
		for(int indice=0; indice<registro.size(); indice++){
			if(registro.get(indice).getCedula().equals(cedula)){
				docenteTemporal=registro.get(indice);
				break;
			}
		}
		return docenteTemporal;
	}
	
	
	///Metodo para modificar los datos del usuario
	
	public void modificarDocente(String nombre, String cedula){            //Preguntar en el menu principal por la cedula y llamar al metodo verificarCedula 
		for(int indice=0; indice<registro.size(); indice++){
			registro.get(indice).setNombre(nombre);
			registro.get(indice).setCedula(cedula);
			System.out.println("Docente modificado correctamente");	
		}
	}
	
	///Metodo para eliminar los datos del usuario 
	
	public void eliminarDocente(String cedula){
		for(int indice=0; indice<registro.size(); indice++){
			if(registro.get(indice).getCedula().equals(cedula)){
				registro.remove(indice);
				System.out.println("El Docente se ha eliminado correctamente");
				break;
			}
		}
	}

	public void imprimirCamposTexto(String texto1, String texto2){
		System.out.println("El Docente es   "+texto1);
		System.out.println("La cedula es  "+texto2);
	}


}//Fin de la clase 
