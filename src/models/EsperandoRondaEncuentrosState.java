package models;

import exceptions.FaltaRondaEncuentrosException;

public class EsperandoRondaEncuentrosState implements IPersonaState {
	private Person person;
	
	public EsperandoRondaEncuentrosState(Person person){
		this.person=person;
	}
	
	@Override
	public void iniciarRondaEncuentros() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void iniciarElecciones() {
		
		
	}

	@Override
	public void iniciarContrataciones() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "EsperandoRondaEncuentrosState";
	}
	

}
