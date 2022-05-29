package models.Aspectos;

import models.Aspectos.IAspectos;

public abstract class DecoratorAspecto implements IAspectos  {

	protected IAspectos encapsulado;

	public DecoratorAspecto(IAspectos encapsulado) {
		super();
		this.encapsulado = encapsulado;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.encapsulado.toString();
	}

}
