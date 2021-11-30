//Briguitte Salas Chinchilla B36282

//Explicacion: Creacion del Registro Docente

import javax.swing.JOptionPane;

public class RegistroDocente{

	//Creacion de un arreglo unidimencional 
	
	private Docente docentes[ ];
	
	//Metodo Constructor para el arreglo 
	
	public RegistroDocente(){
		docentes= new Docente [10];
	}

	////////Metodos de operaciones de Arreglos///////////////////////////////////////
	
	///Metodo para registrar el docente
	
	public void agregarDocente(Docente docente){                           //Preguntar en el menu principal por la cedula y llamar al metodo verificarCedula 
		for(int indice=0; indice<docentes.length; indice++){
			if(docentes[indice]==null){
				docentes[indice]=docente;
				System.out.println("Docente agregado correctamente");
				break;
			}	
		}
	}
	
	
	///Metodo para verificar si el numero de cedula existe
	
	public boolean verificarCedula(String cedula){
		boolean existe=false;
		for(int indice=0; indice<docentes.length; indice++){
			if(docentes[indice]!=null){
				if(docentes[indice].getCedula().equals(cedula)){
					existe=true;
					break;
				}
			}
		}
		return existe;
	}
	
	///Buscar Nombre del Usuario
	
		public String buscarUsuario(String cedula){
		String nombre="No existe";
		for(int indice=0; indice<docentes.length; indice++){
			if(docentes[indice]!=null){
				if(docentes[indice].getCedula().equals(cedula)){
					nombre=docentes[indice].getNombre();
					break;
				}
			}
		}
		return nombre;
	}
	
	
	///Metodo para modificar los datos del usuario
	
	public void modificarDocente(String nombre, String cedula){            //Preguntar en el menu principal por la cedula y llamar al metodo verificarCedula 
		for(int indice=0; indice<docentes.length; indice++){
			if(docentes[indice]!=null){
				docentes[indice].setNombre(nombre);
				docentes[indice].setCedula(cedula);
				System.out.println("Docente modificado correctamente");
			}
		}
	}
	
	///Metodo para eliminar los datos del usuario 
	
	public void eliminarDocente(String cedula){
		for(int indice=0; indice<docentes.length; indice++){
			if(docentes[indice]!=null){
				if(docentes[indice].getCedula().equals(cedula)){
					docentes[indice]=null;
					System.out.println("El Docente se ha eliminado correctamente");
					break;
				}
			}
		}
	}

	public void imprimirCamposTexto(String texto1, String texto2){
		System.out.println("El Docente es   "+texto1);
		System.out.println("La cedula es  "+texto2);
	}
}//Fin de la clase principal 
