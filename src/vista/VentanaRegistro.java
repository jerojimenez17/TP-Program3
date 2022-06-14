package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.FlowLayout;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaRegistro extends JFrame implements KeyListener, ActionListener {

	private JPanel contentPane;
	private JLabel TituloVentana;
	private JPanel panelPrincipal;
	private JPanel panelUsername;
	private JPanel panelPassword;
	private JPanel panelNombre;
	private JPanel panelTipoUsuario;
	private JPanel panelTipoPersona;
	private JPanel panelRubro;
	private JPanel panelApellido;
	private JLabel LabelUsername;
	private JTextField textUsername;
	private JLabel LabelPassword;
	private JPasswordField textPassword;
	private JLabel LabelNombre;
	private JTextField textNombre;
	private JRadioButton radioButtonEmpleado;
	private JRadioButton radioButtonEmpleador;
	private JRadioButton radioButtonPersonaFisica;
	private JLabel LabelTipoUsuario;
	private JLabel LabelTipoPersona;
	private JRadioButton radioButtonPersonaJuridica;
	private JLabel LabelRubro;
	private JRadioButton radioButtonComercioLocal;
	private JRadioButton radioButtonComercioInternacional;
	private JRadioButton radioButtonSalud;
	private JLabel LabelApellido;
	private JTextField textApellido;
	private JPanel panelTelefono;
	private JLabel LabelTelefono;
	private JTextField textTelefono;
	private JPanel panelDNI;
	private JLabel LabelDNI;
	private JTextField textDNI;
	private JPanel panelFechaNacimiento;
	private JLabel LabelFechaNacimiento;
	private JTextField textFechaNacimiento;
	private JButton BotonAceptar;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaRegistro frame = new VentanaRegistro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaRegistro() {
		setTitle("Sistema Empleo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(this.contentPane);
		this.contentPane.setLayout(new BorderLayout(0, 0));
		
		this.TituloVentana = new JLabel("VENTANA REGISTRO");
		this.TituloVentana.setHorizontalAlignment(SwingConstants.CENTER);
		this.contentPane.add(this.TituloVentana, BorderLayout.NORTH);
		
		this.panelPrincipal = new JPanel();
		this.contentPane.add(this.panelPrincipal, BorderLayout.CENTER);
		this.panelPrincipal.setLayout(new GridLayout(10, 0, 0, 0));
		
		this.panelUsername = new JPanel();
		this.panelPrincipal.add(this.panelUsername);
		this.panelUsername.setLayout(new GridLayout(0, 2, 0, 0));
		
		this.LabelUsername = new JLabel("Nombre de Usuario");
		this.LabelUsername.setHorizontalAlignment(SwingConstants.CENTER);
		this.panelUsername.add(this.LabelUsername);
		
		this.textUsername = new JTextField();
		this.textUsername.addKeyListener(this);
		this.panelUsername.add(this.textUsername);
		this.textUsername.setColumns(10);
		
		this.panelPassword = new JPanel();
		this.panelPrincipal.add(this.panelPassword);
		this.panelPassword.setLayout(new GridLayout(0, 2, 0, 0));
		
		this.LabelPassword = new JLabel("Contrase\u00F1a");
		this.LabelPassword.setHorizontalAlignment(SwingConstants.CENTER);
		this.panelPassword.add(this.LabelPassword);
		
		this.textPassword = new JPasswordField();
		this.textPassword.addKeyListener(this);
		
		this.panelPassword.add(this.textPassword);
		
		this.panelNombre = new JPanel();
		this.panelPrincipal.add(this.panelNombre);
		this.panelNombre.setLayout(new GridLayout(0, 2, 0, 0));
		
		this.LabelNombre = new JLabel("Nombre o Razon Social");
		this.LabelNombre.setHorizontalAlignment(SwingConstants.CENTER);
		this.panelNombre.add(this.LabelNombre);
		
		this.textNombre = new JTextField();
		this.textNombre.addKeyListener(this);
		
		this.panelNombre.add(this.textNombre);
		this.textNombre.setColumns(10);
		
		this.panelTipoUsuario = new JPanel();
		this.panelPrincipal.add(this.panelTipoUsuario);
		this.panelTipoUsuario.setLayout(new GridLayout(0, 3, 0, 0));
		
		this.LabelTipoUsuario = new JLabel("Usuario tipo");
		this.LabelTipoUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		this.panelTipoUsuario.add(this.LabelTipoUsuario);
		
		this.radioButtonEmpleado = new JRadioButton("Empleado");
		this.radioButtonEmpleado.addKeyListener(this);
		buttonGroup.add(this.radioButtonEmpleado);
		this.panelTipoUsuario.add(this.radioButtonEmpleado);
		
		this.radioButtonEmpleador = new JRadioButton("Empleador");
		this.radioButtonEmpleador.addKeyListener(this);
		buttonGroup.add(this.radioButtonEmpleador);
		this.panelTipoUsuario.add(this.radioButtonEmpleador);
		
		this.panelTipoPersona = new JPanel();
		this.panelPrincipal.add(this.panelTipoPersona);
		this.panelTipoPersona.setLayout(new GridLayout(0, 3, 0, 0));
		
		this.LabelTipoPersona = new JLabel("Persona tipo");
		this.LabelTipoPersona.setHorizontalAlignment(SwingConstants.CENTER);
		this.panelTipoPersona.add(this.LabelTipoPersona);
		
		this.radioButtonPersonaFisica = new JRadioButton("Fisica");
		this.radioButtonPersonaFisica.setEnabled(false);
		buttonGroup_1.add(this.radioButtonPersonaFisica);
		this.panelTipoPersona.add(this.radioButtonPersonaFisica);
		
		this.radioButtonPersonaJuridica = new JRadioButton("Juridica");
		this.radioButtonPersonaJuridica.setEnabled(false);
		buttonGroup_1.add(this.radioButtonPersonaJuridica);
		this.panelTipoPersona.add(this.radioButtonPersonaJuridica);
		
		this.panelRubro = new JPanel();
		this.panelPrincipal.add(this.panelRubro);
		this.panelRubro.setLayout(new GridLayout(0, 4, 0, 0));
		
		this.LabelRubro = new JLabel("Rubro");
		this.LabelRubro.setHorizontalAlignment(SwingConstants.CENTER);
		this.panelRubro.add(this.LabelRubro);
		
		this.radioButtonComercioLocal = new JRadioButton("Comercio Local");
		this.radioButtonComercioLocal.setEnabled(false);
		buttonGroup_2.add(this.radioButtonComercioLocal);
		this.panelRubro.add(this.radioButtonComercioLocal);
		
		this.radioButtonComercioInternacional = new JRadioButton("Comercio Internacional");
		this.radioButtonComercioInternacional.setEnabled(false);
		buttonGroup_2.add(this.radioButtonComercioInternacional);
		this.panelRubro.add(this.radioButtonComercioInternacional);
		
		this.radioButtonSalud = new JRadioButton("Salud");
		this.radioButtonSalud.setEnabled(false);
		buttonGroup_2.add(this.radioButtonSalud);
		this.panelRubro.add(this.radioButtonSalud);
		
		this.panelApellido = new JPanel();
		this.panelPrincipal.add(this.panelApellido);
		this.panelApellido.setLayout(new GridLayout(0, 2, 0, 0));
		
		this.LabelApellido = new JLabel("Apellido");
		this.LabelApellido.setHorizontalAlignment(SwingConstants.CENTER);
		this.panelApellido.add(this.LabelApellido);
		
		this.textApellido = new JTextField();
		this.textApellido.setEnabled(false);
		this.textApellido.setColumns(10);
		this.panelApellido.add(this.textApellido);
		
		this.panelTelefono = new JPanel();
		this.panelPrincipal.add(this.panelTelefono);
		this.panelTelefono.setLayout(new GridLayout(0, 2, 0, 0));
		
		this.LabelTelefono = new JLabel("Telefono");
		this.LabelTelefono.setHorizontalAlignment(SwingConstants.CENTER);
		this.panelTelefono.add(this.LabelTelefono);
		
		this.textTelefono = new JTextField();
		this.textTelefono.setEnabled(false);
		this.textTelefono.setColumns(10);
		this.panelTelefono.add(this.textTelefono);
		
		this.panelDNI = new JPanel();
		this.panelPrincipal.add(this.panelDNI);
		this.panelDNI.setLayout(new GridLayout(0, 2, 0, 0));
		
		this.LabelDNI = new JLabel("DNI");
		this.LabelDNI.setHorizontalAlignment(SwingConstants.CENTER);
		this.panelDNI.add(this.LabelDNI);
		
		this.textDNI = new JTextField();
		this.textDNI.setEnabled(false);
		this.textDNI.setColumns(10);
		this.panelDNI.add(this.textDNI);
		
		this.panelFechaNacimiento = new JPanel();
		this.panelPrincipal.add(this.panelFechaNacimiento);
		this.panelFechaNacimiento.setLayout(new GridLayout(0, 2, 0, 0));
		
		this.LabelFechaNacimiento = new JLabel("Fech Nacimiento");
		this.LabelFechaNacimiento.setHorizontalAlignment(SwingConstants.CENTER);
		this.panelFechaNacimiento.add(this.LabelFechaNacimiento);
		
		this.textFechaNacimiento = new JTextField();
		this.textFechaNacimiento.setEnabled(false);
		this.panelFechaNacimiento.add(this.textFechaNacimiento);
		this.textFechaNacimiento.setColumns(10);
		
		this.BotonAceptar = new JButton("Registrarse");
		this.BotonAceptar.addActionListener(this);
		this.BotonAceptar.setEnabled(false);
		this.contentPane.add(this.BotonAceptar, BorderLayout.SOUTH);
	}

	public void keyPressed(KeyEvent e) {
		
	}
	public void keyReleased(KeyEvent e) {
		boolean condicion1=false; //condicion ue hay username, password y nombre
		boolean condicion2=false; //condicion ue se selecciono empleado o empleador
		boolean condicion3=false; //se completan os campos faltantes

		
		if(this.textUsername.getText().length()>0 && this.textPassword.getText().length()>0 && this.textNombre.getText().length()>0)
			condicion1=true;
		else
			condicion1=false;
		if(this.radioButtonEmpleado.isSelected()||this.radioButtonEmpleador.isSelected())
			condicion2=true;
		
		if(this.radioButtonEmpleado.isSelected()) {
			this.textApellido.setEnabled(true);
			this.textTelefono.setEnabled(true);
			this.textDNI.setEnabled(true);
			this.textFechaNacimiento.setEnabled(true);
			this.radioButtonComercioInternacional.setEnabled(false);
			this.radioButtonComercioLocal.setEnabled(false);
			this.radioButtonSalud.setEnabled(false);
			this.radioButtonPersonaFisica.setEnabled(false);
			this.radioButtonPersonaJuridica.setEnabled(false);	
			
			if(this.textApellido.getText().length()>0 && this.textTelefono.getText().length()>0 && this.textDNI.getText().length()>0 && this.textFechaNacimiento.getText().length()>0)
				condicion3=true;
			else
				condicion3=false;
		}
		else if(this.radioButtonEmpleador.isSelected()) {
			this.textApellido.setEnabled(false);
			this.textTelefono.setEnabled(false);
			this.textDNI.setEnabled(false);
			this.textFechaNacimiento.setEnabled(false);
			this.radioButtonComercioInternacional.setEnabled(true);
			this.radioButtonComercioLocal.setEnabled(true);
			this.radioButtonSalud.setEnabled(true);
			this.radioButtonPersonaFisica.setEnabled(true);
			this.radioButtonPersonaJuridica.setEnabled(true);
			
			if((this.radioButtonComercioInternacional.isSelected()||this.radioButtonComercioLocal.isSelected()||
					this.radioButtonSalud.isSelected())&&(this.radioButtonPersonaFisica.isSelected()||this.radioButtonPersonaJuridica.isSelected()))
				condicion3=true;
		}
		this.BotonAceptar.setEnabled(condicion1&&condicion2&&condicion3);	
	}
	public void keyTyped(KeyEvent e) {
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand()=="Registrarse")
			this.registrarse();
	}

	private void registrarse() {
		//llamado al controlador para ue registre un nuevo usuario
	
	}
}
