package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JRadioButton;

import models.Agencia;
import models.Empleado;
import models.Entrevista;
import vista.IVistaEmpleado;

public class ControladorVentanaEmpleado implements ActionListener{
	private IVistaEmpleado vista=null;
	private Agencia agencia=null;
	private Empleado empleado=null;

	public ControladorVentanaEmpleado(IVistaEmpleado vista,Agencia agencia,Empleado empleado) {
		this.agencia=agencia;
		this.vista=vista;
		this.empleado=empleado;
		this.actualizarLista();
		if(this.empleado.getTicket().getFormulario()!=null) 
			this.vista.completarTicket(empleado.getTicket().toString());		
		//if(empleado.getTicket()!=null)this.vista.completarTicket(empleado.getTicket().toString());	
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		this.actualizarLista();
		
		if(e.getActionCommand().equals("NuevoTicket")) {
			//hacer funcion en agencia para verificar si se puede crear un nuevo ticket y crearlo 
			//abriendo ventana para crear formulario
		}
		else if(e.getActionCommand().equals("Modificar")) {
			JRadioButton rb=this.vista.getRButtonEstado();
			if(rb.getText().equals("Suspender"))
				this.empleado.getTicket().setEstadoSuspendido();
			else if(rb.getText().equals("Cancelar"))
				this.empleado.getTicket().setEstadoCancelado();
			else if(rb.getText().equals("Activar"))
				this.empleado.getTicket().setEstadoActivo();
		}
		else if(e.getActionCommand().equals("Elegir")) {
			this.empleado.elegir(this.vista.getSelectedValue());
		}
	}
	
	public void actualizarLista() {
		Iterator<Entrevista> it=this.empleado.getAsignaciones().getList().iterator();
		this.vista.getModeloLista().clear();
		while(it.hasNext()) {
			this.vista.getModeloLista().addElement(it.next().getEmpleador());
		}
		
	}
}
