import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class VentInicial extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JList lista;
	private DefaultListModel modelo;
	private JScrollPane scrollLista;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentInicial frame = new VentInicial();
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
	public VentInicial() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCrear = new JButton("Crear");
		btnCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentFichaPersonaje fichaPers = new VentFichaPersonaje();
				fichaPers.setVisible(true);
			}
		});
		btnCrear.setBounds(137, 12, 66, 27);
		contentPane.add(btnCrear);
		
		JLabel lblFichasCreadas = new JLabel("Fichas creadas");
		lblFichasCreadas.setBounds(12, 51, 111, 17);
		contentPane.add(lblFichasCreadas);
		
		JLabel lblCrearNuevaFicha = new JLabel("Crear nueva ficha");
		lblCrearNuevaFicha.setBounds(12, 17, 111, 17);
		contentPane.add(lblCrearNuevaFicha);
		
		
		JList lista = new JList();
		lista.setBounds(12, 80, 420, 181);
		DefaultListModel modelo = new DefaultListModel();
		PersonajeDAO personajeDAO = new PersonajeDAO();
		List<Personaje> personajes = personajeDAO.listarPersonajes();
		for (Personaje p : personajes) {
			modelo.addElement(p);
        }
		lista.setModel(modelo);
		contentPane.add(lista);
		
	}
}
