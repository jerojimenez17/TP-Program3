package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Agencia;
import modelo.Usuario;
import vista.IVistaLogin;
import vista.VentanaAgencia;
import vista.VentanaInicial;

public class ControladorVentanaLogin implements ActionListener{
	private IVistaLogin vista=null;
	private Agencia agencia=null;
	
	public ControladorVentanaLogin(IVistaLogin vista,Agencia agencia) {
		this.vista=vista;
		this.vista.addActionListener(this);
		this.agencia=agencia;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Usuario usuario=null;
		if(e.getActionCommand().equals("Login")) {
			usuario=this.agencia.login(this.vista.getUsername(), this.vista.getPassword());
			//se ue usuario no es null porue tiene ue tirar exception
			if(usuario.getClass()==Agencia.class) {		
				VentanaAgencia ventanaAgencia=new VentanaAgencia();
				ventanaAgencia.completarTitulo(usuario.getUsername());
				ControladorVentanaAgencia controladorVentanaAgencia=new ControladorVentanaAgencia(ventanaAgencia,this.agencia);
				VentanaInicial v=(VentanaInicial)this.vista;
				v.setVisible(false);
				ventanaAgencia.setVisible(true);
			}
		}
		else if(e.getActionCommand().equals("Registrarse"))
			;
		
	}
}
