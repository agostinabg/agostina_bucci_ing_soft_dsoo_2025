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
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JScrollBar;

public class VentInicial extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;


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
		
		/* Creo una lista para guardar los nombres de loe personajes*/
		
		PersonajeDAO personajeDAO = new PersonajeDAO();
	    List<Personaje> pers = personajeDAO.listarPersonajes();
	    List<String> listaNombres = new ArrayList<>();
	    for (Personaje p : pers) {
	    	listaNombres.add(p.getNombre());
	    }
	    
	    DefaultListModel<String> listModel = new DefaultListModel<>();
	    for (String nom : listaNombres) {
	    	listModel.addElement(nom);
	    }
	   
	    JList list = new JList<>(listModel);
		list.setBounds(12, 77, 420, 184);
		contentPane.add(list);
	}
}
