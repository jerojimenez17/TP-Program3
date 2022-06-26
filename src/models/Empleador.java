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

public class Empleador extends Person implements Runnable{
	private String rubro;
        private transient BolsaDeTrabajo bolsaTrabajo;
        private transient List<TicketSimplificado> myTicketsSimpl= new ArrayList<>();
	private ArrayList<TicketEmpleador> ticketsEmitidos = new ArrayList<TicketEmpleador>();

	public Empleador(String nombreUsuario, String contrasena, String nombreRazonSocial, String tipoPersona,
			String rubro,BolsaDeTrabajo listBolsaTrabajo) {
		super(nombreUsuario, contrasena, nombreRazonSocial, tipoPersona);
		this.rubro = rubro;
                this.bolsaTrabajo=listBolsaTrabajo;
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
        //METODO GENERA TICKET SIMPLIFICADO
        public void generarTicketSimplificado(int eleccionTipoTrabajo,int eleccionLocacion,Empleado empleado){
            if(myTicketsSimpl.size() <3){
                this.myTicketsSimpl.add(new TicketSimplificado(eleccionTipoTrabajo,eleccionLocacion,this));
                
            }
        }
        @Override
        public void run(){
            myTicketsSimpl.forEach(ts -> {
                bolsaTrabajo.addTicket(ts);
            });
        }
	@Override
	public String toString() {
		return super.getName() + "\nRubro: " + getRubro();
	}

	
	public void elegir(Empleado empleado,TicketEmpleador ticket) {
		int i=0;
		while(i<this.getAsignaciones().getList().size() &&!this.getAsignaciones().getList().get(i).contieneUsuario(empleado)&& !this.getAsignaciones().getList().get(i).contieneUsuario(this)
				&& !this.getTicketsEmitidos().contains(ticket)) {
			i++;
		}
		if(i<this.getAsignaciones().getList().size())
			if(ticket.getCantidadSolicitados()-ticket.getCantidadObtenidos()<this.getElecciones().size())
				this.getElecciones().add(this.getElecciones().size()+1, this.getAsignaciones().getList().get(i));
			else {
				this.getElecciones().clear();
				this.getElecciones().add(0, this.getAsignaciones().getList().get(i));
			}
	}
	
	

}
