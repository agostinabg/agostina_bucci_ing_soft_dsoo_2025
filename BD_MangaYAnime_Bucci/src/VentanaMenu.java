import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

//Librerías agregadas
import java.util.List;
import java.util.Scanner;
import java.awt.Panel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Component;
import javax.swing.JLayeredPane; 



public class VentanaMenu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaMenu frame = new VentanaMenu();
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
	public VentanaMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 510, 513);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setForeground(new Color(0, 0, 0));
		menuBar.setBackground(new Color(255, 255, 255));
		menuBar.setBounds(0, 0, 494, 22);
		contentPane.add(menuBar);
		
		JMenu menuInfo = new JMenu("Buscar info");
		menuInfo.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		menuInfo.setForeground(new Color(0, 0, 0));
		menuInfo.setBackground(new Color(255, 255, 255));
		menuBar.add(menuInfo);
		
		JMenuItem itMenuSerie = new JMenuItem("Buscar info de una serie");
		itMenuSerie.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		itMenuSerie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaBusqueda vbusq = new VentanaBusqueda();
				vbusq.setVisible(true);
			}
		});
		menuInfo.add(itMenuSerie);
		
		JMenuItem itMenuListaGenero = new JMenuItem("Listar series según su género");
		itMenuListaGenero.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		menuInfo.add(itMenuListaGenero);
		
		JMenuItem itMenuListaTodo = new JMenuItem("Listar todas las series con sus datos");
		itMenuListaTodo.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		menuInfo.add(itMenuListaTodo);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		menuBar.add(separator);
		
		JMenu menuModifBD = new JMenu("Modificar la Base de Datos");
		menuModifBD.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		menuModifBD.setForeground(new Color(0, 0, 0));
		menuBar.add(menuModifBD);
		
		JMenuItem itMenuAgregar = new JMenuItem("Agregar un registro");
		itMenuAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaIngresoDatosSolapas vingreso = new VentanaIngresoDatosSolapas();
				vingreso.setVisible(true);
			}
		});
		itMenuAgregar.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		menuModifBD.add(itMenuAgregar);
		
		JMenuItem itMenuModificar = new JMenuItem("Modificar un registro");
		itMenuModificar.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		menuModifBD.add(itMenuModificar);
		
		JMenuItem itMenuEliminar = new JMenuItem("Eliminar un registro");
		itMenuEliminar.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		menuModifBD.add(itMenuEliminar);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		menuBar.add(separator_1);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(10, 36, 474, 263);
		contentPane.add(layeredPane);
	}
}
