import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.JSeparator;
import java.awt.Component;
import javax.swing.SwingConstants;

public class VentanaBusqueda extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField ctTituloSerie;
	private JTextField ctTitulo;
	private JTextField ctAutor;
	private JTextField ctGenero;
	private JTextField ctCapsAnime;
	private JTextField ctEstudio;
	private JTextField ctEstadoAnime;
	private JTextField ctCapsManga;
	private JTextField ctEstadoManga;
	private JTextField ctEditorial;
	private JTextField ctEdad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaBusqueda frame = new VentanaBusqueda();
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
	public VentanaBusqueda() {
		setTitle("Información de una serie");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 527);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ctTituloSerie = new JTextField();  // Campo de texto para ingresar el título a buscar
		ctTituloSerie.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ctTituloSerie.setText("");
				ctTituloSerie.setForeground(Color.BLACK);
			}
		});
		ctTituloSerie.setText("Ingrese el título de una serie");
		ctTituloSerie.setToolTipText("");
		ctTituloSerie.setForeground(Color.GRAY);
		ctTituloSerie.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ctTituloSerie.setColumns(10);
		ctTituloSerie.setBounds(10, 21, 296, 23);
		contentPane.add(ctTituloSerie);
		
		
		JPanel panelInfo = new JPanel();  // Panel para mostrar la información 
		panelInfo.setVisible(false);
		panelInfo.setBounds(10, 64, 416, 395);
		contentPane.add(panelInfo);
		panelInfo.setLayout(null);
		
		JButton btMostrar = new JButton("<html>MOSTRAR<br>INFO</html>");
		btMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelInfo.setVisible(true);
				String buscartitulo = ctTituloSerie.getText();
				String query = "SELECT * FROM series WHERE titulo=buscartitulo";
				
			}
		});
		btMostrar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btMostrar.setBounds(316, 11, 108, 42);
		contentPane.add(btMostrar);
		
		
		JLabel labelTitulo = new JLabel("TÍTULO:");
		labelTitulo.setBounds(0, 0, 74, 20);
		panelInfo.add(labelTitulo);
		labelTitulo.setForeground(Color.BLACK);
		labelTitulo.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel labelAutor = new JLabel("AUTOR:");
		labelAutor.setBounds(0, 31, 74, 20);
		panelInfo.add(labelAutor);
		labelAutor.setForeground(Color.BLACK);
		labelAutor.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel labelGenero = new JLabel("GÉNERO:");
		labelGenero.setBounds(0, 62, 74, 20);
		panelInfo.add(labelGenero);
		labelGenero.setForeground(Color.BLACK);
		labelGenero.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel labelPublico = new JLabel("PÚBLICO:");
		labelPublico.setBounds(0, 93, 205, 20);
		panelInfo.add(labelPublico);
		labelPublico.setForeground(Color.BLACK);
		labelPublico.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 125, 414, 2);
		panelInfo.add(separator_1);
		
		JLabel labelManga = new JLabel("MANGA");
		labelManga.setBounds(0, 133, 57, 20);
		panelInfo.add(labelManga);
		labelManga.setForeground(Color.BLACK);
		labelManga.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel labelEditorial = new JLabel("EDITORIAL:");
		labelEditorial.setBounds(32, 164, 98, 20);
		panelInfo.add(labelEditorial);
		labelEditorial.setForeground(Color.BLACK);
		labelEditorial.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel labelCapsManga = new JLabel("CANT. CAPITULOS:");
		labelCapsManga.setBounds(32, 195, 143, 20);
		panelInfo.add(labelCapsManga);
		labelCapsManga.setForeground(Color.BLACK);
		labelCapsManga.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel labelEstadoManga = new JLabel("ESTADO:");
		labelEstadoManga.setBounds(32, 226, 74, 20);
		panelInfo.add(labelEstadoManga);
		labelEstadoManga.setForeground(Color.BLACK);
		labelEstadoManga.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel labelAnime = new JLabel("ANIME");
		labelAnime.setBounds(0, 282, 57, 20);
		panelInfo.add(labelAnime);
		labelAnime.setForeground(Color.BLACK);
		labelAnime.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel labelEstudio = new JLabel("ESTUDIO DE ANIMACIÓN:");
		labelEstudio.setBounds(32, 313, 205, 20);
		panelInfo.add(labelEstudio);
		labelEstudio.setForeground(Color.BLACK);
		labelEstudio.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel labelCapsAnime = new JLabel("CANT. CAPITULOS:");
		labelCapsAnime.setBounds(32, 344, 143, 20);
		panelInfo.add(labelCapsAnime);
		labelCapsAnime.setForeground(Color.BLACK);
		labelCapsAnime.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel labelEstadoAnime = new JLabel("ESTADO:");
		labelEstadoAnime.setBounds(32, 375, 74, 20);
		panelInfo.add(labelEstadoAnime);
		labelEstadoAnime.setForeground(Color.BLACK);
		labelEstadoAnime.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		ctTitulo = new JTextField();
		ctTitulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		ctTitulo.setBounds(71, 0, 296, 20);
		panelInfo.add(ctTitulo);
		ctTitulo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ctTitulo.setColumns(10);
		
		ctAutor = new JTextField();
		ctAutor.setBounds(72, 31, 252, 20);
		panelInfo.add(ctAutor);
		ctAutor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ctAutor.setColumns(10);
		
		ctGenero = new JTextField();
		ctGenero.setBounds(72, 64, 252, 20);
		panelInfo.add(ctGenero);
		ctGenero.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ctGenero.setColumns(10);

		ctEdad = new JTextField();
		ctEdad.setBounds(215, 95, 74, 20);
		panelInfo.add(ctEdad);
		ctEdad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ctEdad.setColumns(10);
		
		ctCapsManga = new JTextField();
		ctCapsManga.setBounds(174, 195, 74, 20);
		panelInfo.add(ctCapsManga);
		ctCapsManga.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ctCapsManga.setColumns(10);
		
		ctEstadoManga = new JTextField();
		ctEstadoManga.setBounds(104, 226, 126, 20);
		panelInfo.add(ctEstadoManga);
		ctEstadoManga.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ctEstadoManga.setColumns(10);
		
		ctEditorial = new JTextField();
		ctEditorial.setBounds(125, 166, 192, 20);
		panelInfo.add(ctEditorial);
		ctEditorial.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ctEditorial.setColumns(10);
		
		ctCapsAnime = new JTextField();
		ctCapsAnime.setBounds(174, 344, 74, 20);
		panelInfo.add(ctCapsAnime);
		ctCapsAnime.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ctCapsAnime.setColumns(10);
		
		ctEstudio = new JTextField();
		ctEstudio.setBounds(224, 315, 192, 20);
		panelInfo.add(ctEstudio);
		ctEstudio.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ctEstudio.setColumns(10);
		
		ctEstadoAnime = new JTextField();
		ctEstadoAnime.setBounds(104, 375, 126, 20);
		panelInfo.add(ctEstadoAnime);
		ctEstadoAnime.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ctEstadoAnime.setColumns(10);
		
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(0, 266, 414, 2);
		panelInfo.add(separator_2);
		
		JLabel labelNoPoseeManga = new JLabel("Esta serie no posee un MANGA");
		labelNoPoseeManga.setVisible(false);
		labelNoPoseeManga.setBackground(new Color(255, 255, 255));
		labelNoPoseeManga.setForeground(new Color(255, 0, 0));
		labelNoPoseeManga.setFont(new Font("Tahoma", Font.BOLD, 14));
		labelNoPoseeManga.setBounds(72, 136, 231, 14);
		panelInfo.add(labelNoPoseeManga);
		
		JLabel labelNoPoseeAnime = new JLabel("Esta serie no posee un ANIME");
		labelNoPoseeAnime.setVisible(false);
		labelNoPoseeAnime.setForeground(Color.RED);
		labelNoPoseeAnime.setFont(new Font("Tahoma", Font.BOLD, 14));
		labelNoPoseeAnime.setBackground(Color.WHITE);
		labelNoPoseeAnime.setBounds(71, 285, 231, 14);
		panelInfo.add(labelNoPoseeAnime);
	}
}
