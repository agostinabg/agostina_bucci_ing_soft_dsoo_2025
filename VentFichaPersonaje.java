import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;

public class VentFichaPersonaje extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField ct_Nombre;
	private JTextField ct_Ocupacion;
	private JTextField ct_Edad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentFichaPersonaje frame = new VentFichaPersonaje();
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
	public VentFichaPersonaje() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 453, 604);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEdad = new JLabel("Edad:");
		lblEdad.setFont(new Font("Dialog", Font.BOLD, 14));
		lblEdad.setBounds(29, 55, 64, 17);
		contentPane.add(lblEdad);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNombre.setBounds(29, 26, 64, 17);
		contentPane.add(lblNombre);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setFont(new Font("Dialog", Font.BOLD, 14));
		lblSexo.setBounds(29, 84, 64, 17);
		contentPane.add(lblSexo);
		
		JLabel lblOcupacion = new JLabel("Ocupación:");
		lblOcupacion.setFont(new Font("Dialog", Font.BOLD, 14));
		lblOcupacion.setBounds(29, 113, 92, 17);
		contentPane.add(lblOcupacion);
		
		JLabel lblApariencia = new JLabel("Apariencia:");
		lblApariencia.setFont(new Font("Dialog", Font.BOLD, 14));
		lblApariencia.setBounds(29, 142, 92, 17);
		contentPane.add(lblApariencia);
		
		JLabel lblPersonalidad = new JLabel("Personalidad:");
		lblPersonalidad.setFont(new Font("Dialog", Font.BOLD, 14));
		lblPersonalidad.setBounds(29, 232, 102, 17);
		contentPane.add(lblPersonalidad);
		
		JLabel lblHabilidades = new JLabel("Habilidades:");
		lblHabilidades.setFont(new Font("Dialog", Font.BOLD, 14));
		lblHabilidades.setBounds(29, 334, 92, 17);
		contentPane.add(lblHabilidades);
		
		JLabel lblDebilidades = new JLabel("Debilidades:");
		lblDebilidades.setFont(new Font("Dialog", Font.BOLD, 14));
		lblDebilidades.setBounds(29, 430, 92, 17);
		contentPane.add(lblDebilidades);
		
		ct_Nombre = new JTextField();
		ct_Nombre.setBounds(101, 24, 315, 21);
		contentPane.add(ct_Nombre);
		ct_Nombre.setColumns(10);
		
		ct_Edad = new JTextField();
		ct_Edad.setColumns(10);
		ct_Edad.setBounds(74, 53, 56, 21);
		contentPane.add(ct_Edad);
		
		ct_Ocupacion = new JTextField();
		ct_Ocupacion.setColumns(10);
		ct_Ocupacion.setBounds(115, 111, 301, 21);
		contentPane.add(ct_Ocupacion);
		
		JTextArea at_Apariencia = new JTextArea();
		at_Apariencia.setBounds(29, 159, 387, 61);
		contentPane.add(at_Apariencia);
		
		JTextArea at_Personalidad = new JTextArea();
		at_Personalidad.setBounds(29, 254, 387, 68);
		contentPane.add(at_Personalidad);
		
		JTextArea at_Debilidades = new JTextArea();
		at_Debilidades.setBounds(29, 449, 387, 68);
		contentPane.add(at_Debilidades);
		
		JTextArea at_Habilidades = new JTextArea();
		at_Habilidades.setBounds(29, 357, 387, 61);
		contentPane.add(at_Habilidades);
		
		JRadioButton rdbt_Hombre = new JRadioButton("Hombre");
		rdbt_Hombre.setBounds(72, 80, 83, 25);
		contentPane.add(rdbt_Hombre);
		
		JRadioButton rdbt_Mujer = new JRadioButton("Mujer");
		rdbt_Mujer.setBounds(159, 80, 69, 25);
		contentPane.add(rdbt_Mujer);
		
		JButton bt_Guardar = new JButton("Guardar");
		bt_Guardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombre = ct_Nombre.getText();
				String varEdad = ct_Edad.getText();
				int edad = Integer.parseInt(varEdad);
				
				String sexo = "";
				if (rdbt_Hombre.isSelected()){
		            sexo = "Hombre";
		        } else {
		        	sexo = "Mujer";
		        }
				
				String ocupacion = ct_Ocupacion.getText();
				String apariencia = at_Apariencia.getText();
				String personalidad = at_Personalidad.getText();
				String habilidades = at_Habilidades.getText();
				String debilidades = at_Debilidades.getText();
				
				Personaje nuevoPersonaje = new Personaje(0, nombre, edad, sexo, ocupacion, apariencia, personalidad, habilidades, debilidades);
				PersonajeDAO personajeDAO = new PersonajeDAO();
				personajeDAO.agregarPersonaje(nuevoPersonaje);
			}
		});
		bt_Guardar.setBounds(333, 538, 83, 27);
		contentPane.add(bt_Guardar);
		
		JButton bt_Eliminar = new JButton("Eliminar");
		bt_Eliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		bt_Eliminar.setBounds(133, 538, 95, 27);
		contentPane.add(bt_Eliminar);
		
		JButton bt_Modificar = new JButton("Modificar");
		bt_Modificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id = 0;
				String nombre = ct_Nombre.getText();
				String varEdad = ct_Edad.getText();
				int edad = Integer.parseInt(varEdad);
				
				String sexo = "";
				if (rdbt_Hombre.isSelected()){
		            sexo = "Hombre";
		        } else {
		        	sexo = "Mujer";
		        }
				
				String ocupacion = ct_Ocupacion.getText();
				String apariencia = at_Apariencia.getText();
				String personalidad = at_Personalidad.getText();
				String habilidades = at_Habilidades.getText();
				String debilidades = at_Debilidades.getText();
				
				Personaje personajeModificado = new Personaje(id, nombre, edad, sexo, ocupacion, apariencia, personalidad, habilidades, debilidades);
				PersonajeDAO personajeDAO = new PersonajeDAO();
				personajeDAO.modificarPersonaje(personajeModificado);
			}
		});
		bt_Modificar.setBounds(29, 538, 92, 27);
		contentPane.add(bt_Modificar);
		
		
	}
}
