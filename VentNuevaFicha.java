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
import javax.swing.JScrollPane;

public class VentNuevaFicha extends JFrame {

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
					VentNuevaFicha frame = new VentNuevaFicha();
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
	public VentNuevaFicha() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 462, 596);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEdad = new JLabel("Edad:");
		lblEdad.setFont(new Font("Dialog", Font.BOLD, 14));
		lblEdad.setBounds(29, 56, 48, 17);
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
		lblOcupacion.setBounds(29, 114, 92, 17);
		contentPane.add(lblOcupacion);
		
		JLabel lblApariencia = new JLabel("Apariencia:");
		lblApariencia.setFont(new Font("Dialog", Font.BOLD, 14));
		lblApariencia.setBounds(29, 143, 92, 17);
		contentPane.add(lblApariencia);
		
		JLabel lblPersonalidad = new JLabel("Personalidad:");
		lblPersonalidad.setFont(new Font("Dialog", Font.BOLD, 14));
		lblPersonalidad.setBounds(29, 234, 102, 17);
		contentPane.add(lblPersonalidad);
		
		JLabel lblHabilidades = new JLabel("Habilidades:");
		lblHabilidades.setFont(new Font("Dialog", Font.BOLD, 14));
		lblHabilidades.setBounds(29, 324, 92, 17);
		contentPane.add(lblHabilidades);
		
		JLabel lblDebilidades = new JLabel("Debilidades:");
		lblDebilidades.setFont(new Font("Dialog", Font.BOLD, 14));
		lblDebilidades.setBounds(29, 414, 92, 17);
		contentPane.add(lblDebilidades);
		
		ct_Nombre = new JTextField();
		ct_Nombre.setBounds(101, 24, 315, 21);
		contentPane.add(ct_Nombre);
		ct_Nombre.setColumns(10);
		
		ct_Edad = new JTextField();
		ct_Edad.setColumns(10);
		ct_Edad.setBounds(77, 56, 64, 21);
		contentPane.add(ct_Edad);
		
		ct_Ocupacion = new JTextField();
		ct_Ocupacion.setColumns(10);
		ct_Ocupacion.setBounds(115, 112, 301, 21);
		contentPane.add(ct_Ocupacion);
		
		JTextArea at_Apariencia = new JTextArea();
		at_Apariencia.setBounds(115, 142, 301, 79);
		contentPane.add(at_Apariencia);
		
		JTextArea at_Personalidad = new JTextArea();
		at_Personalidad.setBounds(141, 232, 275, 79);
		contentPane.add(at_Personalidad);
		
		JTextArea at_Debilidades = new JTextArea();
		at_Debilidades.setBounds(131, 412, 285, 79);
		contentPane.add(at_Debilidades);
		
		JTextArea at_Habilidades = new JTextArea();
		at_Habilidades.setBounds(135, 322, 281, 79);
		contentPane.add(at_Habilidades);
		
		JRadioButton rdbt_Hombre = new JRadioButton("Hombre");
		rdbt_Hombre.setFont(new Font("Tahoma", Font.BOLD, 12));
		rdbt_Hombre.setBounds(77, 81, 73, 25);
		contentPane.add(rdbt_Hombre);
		
		JRadioButton rdbt_Mujer = new JRadioButton("Mujer");
		rdbt_Mujer.setFont(new Font("Tahoma", Font.BOLD, 12));
		rdbt_Mujer.setBounds(164, 81, 69, 25);
		contentPane.add(rdbt_Mujer);
		
		JButton bt_Guardar = new JButton("Guardar");
		bt_Guardar.setFont(new Font("Tahoma", Font.BOLD, 12));
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
		bt_Guardar.setBounds(324, 512, 92, 27);
		contentPane.add(bt_Guardar);
		
		JScrollPane scrollPaneApariencia = new JScrollPane(at_Apariencia);
		scrollPaneApariencia.setBounds(115, 143, 301, 79);
		contentPane.add(scrollPaneApariencia);
		
		JScrollPane scrollPanePers = new JScrollPane(at_Personalidad);
		scrollPanePers.setBounds(141, 234, 275, 79);
		contentPane.add(scrollPanePers);
		
		JScrollPane scrollPaneHabil = new JScrollPane(at_Habilidades);
		scrollPaneHabil.setBounds(135, 324, 281, 79);
		contentPane.add(scrollPaneHabil);
		
		JScrollPane scrollPaneDebil = new JScrollPane(at_Debilidades);
		scrollPaneDebil.setBounds(131, 412, 285, 79);
		contentPane.add(scrollPaneDebil);
	}
}
