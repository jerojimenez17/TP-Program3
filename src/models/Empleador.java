package models;

import java.util.ArrayList;
import java.util.List;

import models.Aspectos.DecoratorAspecto;
import models.Aspectos.DecoratorAspectoPeso;
import models.Aspectos.IAspectos;
import models.Aspectos.CargaHoraria.CargaHoraria;
import models.Aspectos.Estudios.Estudios;
import models.Aspectos.Experiencia.Experiencia;
import models.Aspectos.Locacion.Locacion;
import models.Aspectos.RangoEtario.RangoEtario;
import models.Aspectos.Remuneracion.Remuneracion;
import models.Aspectos.TipoPuesto.TipoPuesto;

public class Empleador extends Person {
	private String rubro;
	private ArrayList<TicketEmpleador> ticketsEmitidos = new ArrayList<TicketEmpleador>();

	public Empleador(String nombreUsuario, String contrasena, String nombreRazonSocial, String tipoPersona,
			String rubro) {
		super(nombreUsuario, contrasena, nombreRazonSocial, tipoPersona);
		this.rubro = rubro;
	}

	public String getRubro() {
		return rubro;
	}

	public ArrayList<TicketEmpleador> getTicketsEmitidos() {
		return ticketsEmitidos;
	}

	public void setTicketsEmitidos(ArrayList<TicketEmpleador> ticketsEmitidos) {
		this.ticketsEmitidos = ticketsEmitidos;
	}

	public void setRubro(String rubro) {
		this.rubro = rubro;
	}

	@Override
	public boolean isEmpleado() {
		return false;
	}
	
	public List<TicketEmpleador> getTickets() {
		List<TicketEmpleador> listaTicket = new ArrayList<>();
		listaTicket.addAll(ticketsEmitidos);
		return listaTicket;
	}

	// GENERA FORMULARIO DE BUSQUEDA Y AGREGA EL TICKET A LA LISTA DE TICKETS
	public void setFormulario(int empleadosSolicitados, int empleadosObtenidos, IAspectos decoratorLocacion,
			IAspectos decoratorTipoPuesto, IAspectos decoratorEleccionEdad,
			IAspectos decoratorExperiencia,
			IAspectos decoratorEstudios, IAspectos decoratorRemuneracion, IAspectos decoratorCargaHoraria) {
		FormularioBusqueda form = new FormularioBusqueda(decoratorLocacion, decoratorTipoPuesto, decoratorEleccionEdad,
				decoratorExperiencia,
				decoratorEstudios, decoratorRemuneracion, decoratorCargaHoraria);
		TicketEmpleador ticket = new TicketEmpleador(empleadosSolicitados, empleadosObtenidos);
		ticket.setFormulario(form);
		
		this.ticketsEmitidos.add(ticket);
	
	}

	@Override
	public String toString() {
		return super.getName() + "\nRubro: " + getRubro();
	}

}
