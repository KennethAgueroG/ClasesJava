//Briguitte Salas Chinchilla B36282

//Explicacion: Creacion de un Objeto Docente 


public class Docente{

	//Variables
	
	String nombre="";
	String cedula="";
	String asignatura="";
	//Metodo Constructor
	
	public Docente(String nombre, String cedula, String asignatura){
		setNombre(nombre);
		setCedula(cedula);
		setAsignatura(asignatura);
	}

	//Metodos set y get para el manejo de los atributos 
	
	//Metodos set y get para el Nombre
	
	public void setNombre(String nombre){
		this.nombre=nombre;	
	}
	
	public String getNombre(){
		return nombre;
	}
	
	//Metodos set y get para la Cedula 
	
	public void setCedula(String cedula){
		this.cedula=cedula;
	}
	
	public String getCedula(){
		return cedula;
	}
	//
	public void setAsignatura(String asignatura){
		this.asignatura=asignatura;
	}
	
	public String getAsignatura(){
		return asignatura;
	}
}//Fin de la clase principal 
