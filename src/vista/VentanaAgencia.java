package vista;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaAgencia extends JFrame implements IVistaAgencia {

	private JPanel contentPane;
	private JLabel LabelTituloVentana;
	private JPanel panelPrincipal;
	private JPanel panelEmpleados;
	private JPanel panelOpciones;
	private JPanel panelEmpleadores;
	private JLabel LabelEmpleados;
	private JLabel LabelEmpleadores;
	private JScrollPane scrollPane;
	private JScrollPane scrollPane_1;
	private JList listEmpleados;
	private JList listEmpleadores;
	private JButton BotonEncuentrosLaborales;
	private JButton BotonContrataciones;
	private JButton BotonComision;
	private JButton BotonSolicitudes;
	private JScrollPane scrollPane_2;
	private JTextField textSalida;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;

	

	/**
	 * Create the frame.
	 */
	public VentanaAgencia() {
		setTitle("Sistema Empleo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 550, 400);
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(this.contentPane);
		this.contentPane.setLayout(new BorderLayout(0, 0));
		
		this.LabelTituloVentana = new JLabel("VISTA AGENCIA, USUARIO:  ");
		//AGREGAR USERNAME DEL USUARIO LOGEADO EN TITULO
		this.LabelTituloVentana.setHorizontalAlignment(SwingConstants.CENTER);
		this.contentPane.add(this.LabelTituloVentana, BorderLayout.NORTH);
		
		this.panelPrincipal = new JPanel();
		this.contentPane.add(this.panelPrincipal, BorderLayout.CENTER);
		this.panelPrincipal.setLayout(new GridLayout(0, 3, 0, 0));
		
		this.panelEmpleados = new JPanel();
		this.panelPrincipal.add(this.panelEmpleados);
		this.panelEmpleados.setLayout(new BorderLayout(0, 0));
		
		this.LabelEmpleados = new JLabel("Empleados");
		this.LabelEmpleados.setHorizontalAlignment(SwingConstants.CENTER);
		this.panelEmpleados.add(this.LabelEmpleados, BorderLayout.NORTH);
		
		this.scrollPane = new JScrollPane();
		this.panelEmpleados.add(this.scrollPane, BorderLayout.CENTER);
		
		this.listEmpleados = new JList();
		this.listEmpleados.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		this.scrollPane.setViewportView(this.listEmpleados);
		
		this.panelOpciones = new JPanel();
		this.panelPrincipal.add(this.panelOpciones);
		this.panelOpciones.setLayout(new GridLayout(4, 0, 0, 0));
		
		this.panel = new JPanel();
		this.panel.setBorder(new EmptyBorder(15, 15, 0, 15));
		this.panelOpciones.add(this.panel);
		
		this.BotonEncuentrosLaborales = new JButton("Ronda Encuentros Laborales");
		//this.BotonEncuentrosLaborales.addActionListener(this);
		this.panel.add(this.BotonEncuentrosLaborales);
		
		this.panel_1 = new JPanel();
		this.panelOpciones.add(this.panel_1);
		
		this.BotonContrataciones = new JButton("Ronda Contrataciones");
		//this.BotonContrataciones.addActionListener(this);
		this.panel_1.add(this.BotonContrataciones);
		
		this.panel_2 = new JPanel();
		this.panelOpciones.add(this.panel_2);
		
		this.BotonComision = new JButton("Comision");
		//this.BotonComision.addActionListener(this);
		this.panel_2.add(this.BotonComision);
		
		this.panel_3 = new JPanel();
		this.panelOpciones.add(this.panel_3);
		
		this.BotonSolicitudes = new JButton("Solicitudes");
		//this.BotonSolicitudes.addActionListener(this);
		this.panel_3.add(this.BotonSolicitudes);
		
		this.panelEmpleadores = new JPanel();
		this.panelPrincipal.add(this.panelEmpleadores);
		this.panelEmpleadores.setLayout(new BorderLayout(0, 0));
		
		this.LabelEmpleadores = new JLabel("Empleadores");
		this.LabelEmpleadores.setHorizontalAlignment(SwingConstants.CENTER);
		this.panelEmpleadores.add(this.LabelEmpleadores, BorderLayout.NORTH);
		
		this.scrollPane_1 = new JScrollPane();
		this.panelEmpleadores.add(this.scrollPane_1, BorderLayout.CENTER);
		
		this.listEmpleadores = new JList();
		this.listEmpleadores.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		this.scrollPane_1.setViewportView(this.listEmpleadores);
		
		this.scrollPane_2 = new JScrollPane();
		this.contentPane.add(this.scrollPane_2, BorderLayout.SOUTH);
		
		this.textSalida = new JTextField();
		this.scrollPane_2.setViewportView(this.textSalida);
		this.textSalida.setColumns(10);
		this.textSalida.setPreferredSize(new Dimension(50,50));
	}


	@Override
	public void addActionListener(ActionListener listener) {
		this.BotonComision.addActionListener(listener);
		this.BotonContrataciones.addActionListener(listener);
		this.BotonEncuentrosLaborales.addActionListener(listener); //para comision y solicitudes 
		this.BotonSolicitudes.addActionListener(listener); //blouear boton si no se selecciono usuario de lista	
	}
	
	public void completarTitulo(String nombre) {
		String titulo=this.LabelTituloVentana.getText();
		titulo+=nombre;
		this.LabelTituloVentana.setText(titulo);
	}
}
