package models;

import exceptions.FaltaRondaEncuentrosException;

public class EsperandoEleccionState implements IPersonaState{
	private Person person;
	
	public EsperandoEleccionState(Person person){
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
		return "EsperandoEleccionState";
	}

}
