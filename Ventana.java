//Briguitte Salas Chinchilla B36282

//Explicacion: Creacion de la Ventana Principal

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Container;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JTextField;



public class Ventana extends JFrame{
	
	//Instancia de la clase Controlador
	
	ControladorPrincipal controlador;
	 
	 //Metodo Constrcutor 
	 
	public Ventana(){
		super("Registro de Docentes");
		 Container contenedor =  getContentPane();
		 
		 controlador= new ControladorPrincipal();
		 
		 contenedor.add(controlador);
		 
		  setSize(300,500);
		  setVisible(true);	
	}

	//Metodo Main 
	
	public static void main (String arg[ ]){
		Ventana ventana = new Ventana();
	}

}//Fin de la clase principal 
