package vista;

import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;

import modelo.Empleado;
import modelo.Empleador;

public interface IVistaAgencia {
	
	void addActionListener(ActionListener listener);
	Empleado getEmpleado();
	Empleador getEmpleador();
	void actualizarListas();
	DefaultListModel<Empleado> getModeloListaEmpleado();
	DefaultListModel<Empleador> getModeloListaEmpleador();
	
}
