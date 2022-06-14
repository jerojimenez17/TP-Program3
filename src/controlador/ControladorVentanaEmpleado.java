package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Agencia;
import modelo.Empleado;
import vista.IVistaEmpleado;

public class ControladorVentanaEmpleado implements ActionListener{
	private IVistaEmpleado vista=null;
	private Agencia agencia=null;
	private Empleado empleado=null;

	public ControladorVentanaEmpleado(IVistaEmpleado vista,Agencia agencia,Empleado empleado) {
		this.agencia=agencia;
		this.vista=vista;
		this.empleado=empleado;
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
