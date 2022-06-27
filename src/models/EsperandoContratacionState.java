package models;

import exceptions.FaltaRondaEncuentrosException;

public class EsperandoContratacionState implements IPersonaState{
	private Person person;
	
	public EsperandoContratacionState(Person person){
		this.person=person;
	}
	@Override
	public void iniciarRondaEncuentros() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void iniciarElecciones() throws FaltaRondaEncuentrosException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void iniciarContrataciones() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String toString() {
		return "EsperandoContratacionState";
	}
	
	
}
