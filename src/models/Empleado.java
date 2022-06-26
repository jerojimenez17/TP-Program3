package models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import models.Aspectos.DecoratorAspecto;
import models.Aspectos.IAspectos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class Empleado extends Person implements Runnable {
	private String surname;
	private String phone;
	private String dni;
	private LocalDate bornDate;
	private TicketEmpleado ticket;
        private transient BolsaDeTrabajo bolsaDeTrabajo;


	public Empleado(String username, String password, String name, String surname, String phone, String dni,
			LocalDate bornDate,BolsaDeTrabajo bolsaDeTrabajo) {
		super(username, password, name, PERSONA_FISICA);
		this.surname = surname;
		this.phone = phone;
		this.dni = dni;
		this.bornDate = bornDate;
		this.ticket = new TicketEmpleado();
                this.bolsaDeTrabajo = bolsaDeTrabajo;
	}
	public Empleado(String username, String password, String name,double puntaje, String surname, String phone, String dni,
			LocalDate bornDate) {
		super(username, password, name, PERSONA_FISICA);
		this.surname = surname;
		this.phone = phone;
		this.dni = dni;
		this.bornDate = bornDate;
		this.ticket = new TicketEmpleado();
	}
	

	@Override
	public boolean isEmpleado() {
		return true;
	}
	public String getSurname() {
		return surname;
	}

	public String getPhone() {
		return phone;
	}

	public String getDNI() {
		return dni;
	}

	public LocalDate getBornDate() {
		return bornDate;
	}

	public TicketEmpleado getTicket() {
		return ticket;
	}

	public void setTicket(TicketEmpleado ticket) {
		this.ticket = ticket;
	}
	public void cancelarTicket() {
		if(this.getTicket().getState().toString()!="cancelado" && this.getTicket().getState().toString()!="finalizado") {
			this.getTicket().setState(new CancelarState(this.getTicket()));		
			this.modificarPuntaje(-1);
		}
	}
	public void suspenderTicket() {
		if(this.getTicket().getState().toString()!= "cancelado" && this.getTicket().getState().toString() != "finalizado") {
			this.getTicket().setState(new PausaState(this.getTicket()));
		}
	}
	public void activarTicket() {
		if(this.getTicket().getState().toString()!= "cancelado" && this.getTicket().getState().toString() != "finalizado") {
			this.getTicket().setState(new ActivoState(this.getTicket()));
		}
	}

	@Override
	public boolean isAdmin() {
		return false;
	}
	
	public void setFormulario( FormularioBusqueda fb) {
		ticket.setFormulario(fb);
	
	}
        
        
        @Override
        public void run(){
            for(int i=0;i<3;i++){
                
            }
        }

	@Override
	public String toString() {
		return super.getName() + " " + getSurname() + "\nTelefono: " + getPhone() + "\nDNI: " + getDNI()
				+ "\nFecha Nacimiento: " + getBornDate();// + "\nTicket generado: " + getTicket().toString();
	}

	//el empleado solo tiene una eleccion por eso la guardo en la posicion 0
	public void elegir(Empleador empleador) {
		int i=0;
		while(i<this.getAsignaciones().getList().size() &&!this.getAsignaciones().getList().get(i).contieneUsuario(empleador)&& !this.getAsignaciones().getList().get(i).contieneUsuario(this)) {
			i++;
		}
		if(i<this.getAsignaciones().getList().size())
			this.getElecciones().add(0, this.getAsignaciones().getList().get(i));
	}
}
