package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Agencia;
import vista.IVistaAgencia;


public class ControladorVentanaAgencia implements ActionListener{
	private IVistaAgencia vista=null;
	private Agencia agencia=null;
	
	public ControladorVentanaAgencia(IVistaAgencia vista,Agencia agencia) {
		this.vista=vista;
		this.vista.addActionListener(this);
		this.agencia=agencia;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}

}
