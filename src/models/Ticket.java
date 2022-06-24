package models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public abstract class Ticket {

	/**
	 * @aggregation composite
	 */
	private FormularioBusqueda formularioBusqueda;
	private String estado;
	private LocalDate fechaAlta;
        private IStateTicket state;
	public static final String ESTADO_ACTIVO = "ACTIVO";
	public static final String ESTADO_SUSPENDIDO = "SUSPENDIDO";
	public static final String ESTADO_CANCELADO = "CANCELADO";
	public static final String ESTADO_FINALIZADO = "FINALIZADO";

	public Ticket() {
		this.estado = ESTADO_ACTIVO;
		this.fechaAlta = LocalDate.now();
		
	}
        
        public IStateTicket getState(){
            return this.state;
        }

	public String getEstado() {
		return estado;
	}
        public void setState(IStateTicket state){
           this.state=state;
        }

	public void setEstadoFinalizado() {
		this.estado = ESTADO_FINALIZADO;
	}
	public void setEstadoCancelado() {
		this.estado=ESTADO_CANCELADO;
	}
	public void setEstadoSuspendido() {
		this.estado=ESTADO_SUSPENDIDO;
	}
	public void setEstadoActivo() {
			this.estado=ESTADO_ACTIVO;	
	}
	
	

	public void setFormulario(FormularioBusqueda form) {
		this.formularioBusqueda = form;
	}

	public FormularioBusqueda getFormulario() {
		return this.formularioBusqueda;
	}

	public LocalDate getFechaAlta() {
	
			return fechaAlta;
	}

	@Override
	public String toString() {
		return "Fecha: " + getFechaAlta() + "\nEstado: " + estado + "\n" + formularioBusqueda.toString();
	}
}
