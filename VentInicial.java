import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
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
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
		
		JButton btnNuevaFicha = new JButton("Nueva Ficha");
		btnNuevaFicha.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNuevaFicha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentNuevaFicha nuevaFicha = new VentNuevaFicha();
				nuevaFicha.setVisible(true);
			}
		});
		btnNuevaFicha.setBounds(151, 21, 111, 27);
		contentPane.add(btnNuevaFicha);
		
		JLabel lblFichasCreadas = new JLabel("Fichas creadas");
		lblFichasCreadas.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFichasCreadas.setBounds(12, 51, 111, 17);
		contentPane.add(lblFichasCreadas);
		
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
		
		JList<String> listaPersonajes = new JList<>(listModel);
		listaPersonajes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					String nombre = listaPersonajes.getSelectedValue();
                    if (nombre != null) {
        				VentVerModif fichaVista = new VentVerModif(nombre);
        				fichaVista.setVisible(true);
                    }
				}
			}
		});
		listaPersonajes.setBounds(146, 1, 265, 204);
		contentPane.add(listaPersonajes);
		listaPersonajes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		JScrollPane scrollPane = new JScrollPane(listaPersonajes);
		scrollPane.setBounds(12, 77, 412, 173);
		contentPane.add(scrollPane);
    
	}
}

