package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import modelo.Empleador;
import java.awt.FlowLayout;
import javax.swing.JRadioButton;

public class VentanaEmpleado extends JFrame {

	private JPanel contentPane;
	private JLabel LabelTituloVentana;
	private JPanel panelPrincipal;
	private JPanel panelIz;
	private JScrollPane scrollPaneListaEmpleadores;
	private JList<Empleador> listEmpleadores;
	private JLabel LabelListaEmpleadores;
	private JPanel panel;
	private JScrollPane scrollPane;
	private JTextPane textTicket;
	private JLabel LabelTicket;
	private JPanel panelBotonesTicket;
	private JPanel panelBotonesResto;
	private DefaultListModel<Empleador> modeloLista;
	private JButton btnCrearTicket;
	private JPanel panel_3;
	private JRadioButton rdbtnActivar;
	private JRadioButton rdbtnSuspender;
	private JRadioButton rdbtnCancelar;
	private JPanel panel_4;
	private JButton btnModificarTicket;
	private JPanel panel_5;
	private JButton btnElegir;
	private JPanel panel_1;
	private JPanel panel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaEmpleado frame = new VentanaEmpleado();
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
	public VentanaEmpleado() {
		setTitle("Sistema Empleo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 562, 347);
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(this.contentPane);
		this.contentPane.setLayout(new BorderLayout(0, 0));
		
		this.LabelTituloVentana = new JLabel("Vista Empleado, Usuario: ");
		this.LabelTituloVentana.setHorizontalAlignment(SwingConstants.CENTER);
		this.contentPane.add(this.LabelTituloVentana, BorderLayout.NORTH);
		
		this.panelPrincipal = new JPanel();
		this.contentPane.add(this.panelPrincipal, BorderLayout.CENTER);
		this.panelPrincipal.setLayout(new GridLayout(0, 2, 0, 0));
		
		this.panelIz = new JPanel();
		this.panelPrincipal.add(this.panelIz);
		this.panelIz.setLayout(new GridLayout(3, 1, 0, 0));
		
		this.panel = new JPanel();
		this.panelIz.add(this.panel);
		this.panel.setLayout(new BorderLayout(0, 0));
		
		this.scrollPane = new JScrollPane();
		this.panel.add(this.scrollPane, BorderLayout.CENTER);
		
		this.textTicket = new JTextPane();
		this.textTicket.setEditable(false);
		this.scrollPane.setViewportView(this.textTicket);
		
		this.LabelTicket = new JLabel("Ticket Empleado");
		this.LabelTicket.setHorizontalAlignment(SwingConstants.CENTER);
		this.scrollPane.setColumnHeaderView(this.LabelTicket);
		
		this.panelBotonesTicket = new JPanel();
		this.panelIz.add(this.panelBotonesTicket);
		this.panelBotonesTicket.setLayout(new GridLayout(3, 0, 0, 0));
		
		this.panel_4 = new JPanel();
		this.panelBotonesTicket.add(this.panel_4);
		
		this.btnCrearTicket = new JButton("Nuevo Ticket");
		this.panel_4.add(this.btnCrearTicket);
		
		this.panel_3 = new JPanel();
		this.panelBotonesTicket.add(this.panel_3);
		
		this.rdbtnActivar = new JRadioButton("Activar");
		this.panel_3.add(this.rdbtnActivar);
		
		this.rdbtnSuspender = new JRadioButton("Suspender");
		this.panel_3.add(this.rdbtnSuspender);
		
		this.rdbtnCancelar = new JRadioButton("Cancelar");
		this.panel_3.add(this.rdbtnCancelar);
		
		this.panel_5 = new JPanel();
		this.panelBotonesTicket.add(this.panel_5);
		
		this.btnModificarTicket = new JButton("Modificar");
		this.panel_5.add(this.btnModificarTicket);
		
		this.panelBotonesResto = new JPanel();
		this.panelIz.add(this.panelBotonesResto);
		this.panelBotonesResto.setLayout(new GridLayout(0, 1, 0, 0));
		
		this.panel_1 = new JPanel();
		this.panelBotonesResto.add(this.panel_1);
		
		this.panel_2 = new JPanel();
		this.panelBotonesResto.add(this.panel_2);
		
		this.btnElegir = new JButton("Elegir");
		this.panel_2.add(this.btnElegir);
		
		this.scrollPaneListaEmpleadores = new JScrollPane();
		this.panelPrincipal.add(this.scrollPaneListaEmpleadores);
		
		this.listEmpleadores = new JList<Empleador>();
		this.listEmpleadores.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		this.scrollPaneListaEmpleadores.setViewportView(this.listEmpleadores);
		
		this.modeloLista=new DefaultListModel<Empleador>();
		this.listEmpleadores.setModel(modeloLista);
		
		this.LabelListaEmpleadores = new JLabel("Lista Empleadores");
		this.LabelListaEmpleadores.setHorizontalAlignment(SwingConstants.CENTER);
		this.scrollPaneListaEmpleadores.setColumnHeaderView(this.LabelListaEmpleadores);
	}

}
