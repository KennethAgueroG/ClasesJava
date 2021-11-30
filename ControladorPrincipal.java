//Briguitte Salas Chinchilla B36282

//Explicacion: Creacion del Controlador 

import java.awt.Image;
import java.awt.Color;

import java.awt.event.*;
import javax.swing.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class ControladorPrincipal extends JPanel implements ActionListener{
	
	//Variables
	
	String pruebaNombre="";
	String pruebaCedula="";
	
	//Instancias
	RegistroArray registro;
	Docente docente;

	//Botones
	private JButton btGuardar;
	private JButton btBuscar;
	private JButton btModificar;
	private JButton btEliminar;
	private JButton btLimpiar;
	
	//Cuadros de Texto
	private JTextField jtNombre;
	private JTextField jtCedula;
	
	//ComboBox
	private JComboBox jcMateria = new JComboBox();
	
	//Metodo Constructor 
	
	public ControladorPrincipal(){
		
		//Imagen Logo
		  JLabel jlLogo = new JLabel();
		   jlLogo.setSize(100,100);
		   
		   ImageIcon logoUsuario=new ImageIcon("imagenes/firma-vertical-dos-lineas-cmyk.png");
           Icon icono =new ImageIcon(logoUsuario.getImage().getScaledInstance(jlLogo.getWidth(),jlLogo.getHeight(),Image.SCALE_SMOOTH));
		   jlLogo.setIcon(icono);
		
		//Instancia
		registro= new RegistroArray();
		
		//Etiquetas
		JLabel jlNombre= new JLabel("Nombre: ");
		JLabel jlCedula= new JLabel("Cedula: ");
		JLabel jlMateria= new JLabel("Materias: ");
		//Botones
		btGuardar = new JButton("Guardar");
		btGuardar.addActionListener(this);
		
		btBuscar= new JButton("Buscar");
		btBuscar.addActionListener(this);
		
		btModificar= new JButton("Modificar");
		btModificar.addActionListener(this);
		
		btEliminar= new JButton("Eliminar");
		btEliminar.addActionListener(this);
		
		btLimpiar= new JButton("Limpiar");
		btLimpiar.addActionListener(this);
		
		//Campo de Texto
		  jtNombre = new JTextField(20);
		  jtCedula = new JTextField(20);
		  
		 //Background      
		 setBackground(Color.gray);
		 setLayout(null);
		 
		  jlNombre.setBounds(60,75,200,80);
		  jtNombre.setBounds(140,108,90,20);
		  
		  jlCedula.setBounds(60,135,70,20);
          jtCedula.setBounds(140,135,90,20);
          
          jlMateria.setBounds(60,165,70,20);
          jcMateria.setBounds(140,165,90,20);
          
           btGuardar.setBounds(80,250,130,30);
           btBuscar.setBounds(80,280,130,30);
           btModificar.setBounds(80,310,130,30);
           btEliminar.setBounds(80,340,130,30);
           btLimpiar.setBounds(80,370,130,30);
           
           jlLogo.setBounds(90,15,200,80);
          
          add(jlNombre);
          add(jlCedula);
          add(jlMateria);
          add(jtCedula);
          add(jtNombre);
		  add(jcMateria);
		  add(btGuardar);
		  add(btBuscar);
		  add(btModificar);
		  add(btEliminar);
		  add(btLimpiar);
		  
		 agregarMaterias();
		  
		  add(jlLogo);
		 
	}

	 public void actionPerformed(ActionEvent evento){
		if(evento.getActionCommand().equals("Guardar")){
			if(!jtNombre.getText().equals("")&&!jtCedula.getText().equals("")){
				if(!registro.verificarCedula(jtCedula.getText())){
					docente= new Docente(jtNombre.getText(), jtCedula.getText(),""+jcMateria.getSelectedItem());
					registro.agregarDocente(docente);
				}else{
					JOptionPane.showMessageDialog(null, "La cedula registrada ya existe");
				}
			}else{
				JOptionPane.showMessageDialog(null, "Por Favor llenar todos los espacios");
			}
		}
		
		if(evento.getActionCommand().equals("Buscar")){
			if(!jtCedula.getText().equals("")){
				jtNombre.setText(registro.buscarUsuario(jtCedula.getText()).getNombre());
				jcMateria. removeAllItems();
				jcMateria.addItem(""+registro.buscarUsuario(jtCedula.getText()).getAsignatura());
				btGuardar.setEnabled(false);
				btBuscar.setEnabled(false);
			}else{
				JOptionPane.showMessageDialog(null, "Por Favor llenar todos los espacios");
			}	
		}
		
		if(evento.getActionCommand().equals("Modificar")){
			if(!jtNombre.getText().equals("")&&!jtCedula.getText().equals("")){
				if(registro.verificarCedula(jtCedula.getText())){
					registro.modificarDocente(jtNombre.getText(), jtCedula.getText());
				}else{
					JOptionPane.showMessageDialog(null, "La cedula no esta registrada");
				}
			}else{
				JOptionPane.showMessageDialog(null, "Por Favor llenar todos los espacios");
			}
		}
		
		if(evento.getActionCommand().equals("Eliminar")){
			if(!jtCedula.getText().equals("")){
				registro.eliminarDocente(jtCedula.getText());
				jtCedula.setText("");
			}else{
				JOptionPane.showMessageDialog(null, "Por Favor llenar todos los espacios");
			}
		}
		
		if(evento.getActionCommand().equals("Limpiar")){
			jtNombre.setText("");
			jtCedula.setText("");
			agregarMaterias();
			btGuardar.setEnabled(true);
			btBuscar.setEnabled(true);
			btEliminar.setEnabled(true);
		}
		
	}
	
	public void agregarMaterias(){
		 jcMateria. removeAllItems();
		 jcMateria.addItem("Espanol");
		 jcMateria.addItem("Matematicas");
		 jcMateria.addItem("Ciencias");
		 jcMateria.addItem("Estudios Sociales");
		 jcMateria.addItem("Ingles");
		 
	}
}//Fin de la clase principal
