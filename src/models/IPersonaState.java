package models;

import exceptions.FaltaRondaEncuentrosException;

public interface IPersonaState {
	void iniciarRondaEncuentros();
	void iniciarElecciones()throws FaltaRondaEncuentrosException;
	void iniciarContrataciones();
	
}
