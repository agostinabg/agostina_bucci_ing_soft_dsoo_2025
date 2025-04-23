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
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JScrollBar;
import javax.swing.JInternalFrame;
import javax.swing.JRadioButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTabbedPane;

public class VentanaIngresoDatosSolapas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField ctTituloSerie;
	private Object Serie;
	private JTextField ctTitulo;
	private JTextField ctAutor;
	private JTextField ctEditorial;
	private JTextField ctCapsManga;
	private JTextField ctEstudio;
	private JTextField ctCapsAnime;
	private JTextField ctAnioManga;
	private JTextField ctAnioAnime;
	//private SerieDAO serieDAO;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
	
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaIngresoDatosSolapas frame = new VentanaIngresoDatosSolapas();
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
	public VentanaIngresoDatosSolapas() {
		setTitle("Información de una serie");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 474, 515);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 29, 436, 266);
		contentPane.add(tabbedPane);
		
		JPanel panelGeneral = new JPanel();
		tabbedPane.addTab("Info general", null, panelGeneral, null);
		panelGeneral.setLayout(null);
		
		JLabel lblTitulo = new JLabel("TÍTULO:");
		lblTitulo.setBounds(10, 11, 74, 20);
		panelGeneral.add(lblTitulo);
		lblTitulo.setForeground(Color.BLACK);
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblAutor = new JLabel("AUTOR:");
		lblAutor.setBounds(10, 42, 74, 20);
		panelGeneral.add(lblAutor);
		lblAutor.setForeground(Color.BLACK);
		lblAutor.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblGenero = new JLabel("GÉNERO:");
		lblGenero.setBounds(10, 73, 74, 20);
		panelGeneral.add(lblGenero);
		lblGenero.setForeground(Color.BLACK);
		lblGenero.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblPublico = new JLabel("PÚBLICO:");
		lblPublico.setBounds(10, 104, 79, 20);
		panelGeneral.add(lblPublico);
		lblPublico.setForeground(Color.BLACK);
		lblPublico.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblPoseeManga = new JLabel("¿POSEE MANGA?");
		lblPoseeManga.setBounds(10, 135, 133, 20);
		panelGeneral.add(lblPoseeManga);
		lblPoseeManga.setForeground(Color.BLACK);
		lblPoseeManga.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblPoseeAnime = new JLabel("¿POSEE ANIME?");
		lblPoseeAnime.setBounds(10, 166, 133, 20);
		panelGeneral.add(lblPoseeAnime);
		lblPoseeAnime.setForeground(Color.BLACK);
		lblPoseeAnime.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JRadioButton radiobtMangaSi = new JRadioButton("Si");
		radiobtMangaSi.setFont(new Font("Tahoma", Font.BOLD, 14));
		radiobtMangaSi.setBounds(137, 135, 44, 23);
		panelGeneral.add(radiobtMangaSi);
		
		JRadioButton radiobtMangaNo = new JRadioButton("No");
		radiobtMangaNo.setFont(new Font("Tahoma", Font.BOLD, 14));
		radiobtMangaNo.setBounds(183, 135, 52, 23);
		panelGeneral.add(radiobtMangaNo);
		
		JRadioButton radiobtAnimeSi = new JRadioButton("Si");
		radiobtAnimeSi.setFont(new Font("Tahoma", Font.BOLD, 14));
		radiobtAnimeSi.setBounds(137, 163, 44, 23);
		panelGeneral.add(radiobtAnimeSi);
		
		JRadioButton radiobtAnimeNo = new JRadioButton("No");
		radiobtAnimeNo.setFont(new Font("Tahoma", Font.BOLD, 14));
		radiobtAnimeNo.setBounds(183, 163, 52, 23);
		panelGeneral.add(radiobtAnimeNo);
		
		JComboBox comboBoxPublico = new JComboBox();
		comboBoxPublico.setModel(new DefaultComboBoxModel(new String[] {"Todas las edades", "Mayores de 13 años", "Mayores de 16 años"}));
		comboBoxPublico.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBoxPublico.setBounds(94, 103, 163, 22);
		panelGeneral.add(comboBoxPublico);
		
		JComboBox comboBoxGenero = new JComboBox();
		comboBoxGenero.setModel(new DefaultComboBoxModel(new String[] {"Acción / Aventura", "Deportes", "Fantasía", "Horror", "Romance"}));
		comboBoxGenero.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBoxGenero.setBounds(94, 72, 153, 22);
		panelGeneral.add(comboBoxGenero);
		
		ctTitulo = new JTextField();
		ctTitulo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ctTitulo.setColumns(10);
		ctTitulo.setBounds(79, 13, 296, 20);
		panelGeneral.add(ctTitulo);
		
		ctAutor = new JTextField();
		ctAutor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ctAutor.setColumns(10);
		ctAutor.setBounds(79, 44, 252, 20);
		panelGeneral.add(ctAutor);
		
		JPanel panelManga = new JPanel();
		tabbedPane.addTab("Info del Manga", null, panelManga, null);
		panelManga.setLayout(null);
		
		JLabel lblManga = new JLabel("INFO DEL MANGA");
		lblManga.setForeground(Color.BLACK);
		lblManga.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblManga.setBounds(10, 11, 181, 20);
		panelManga.add(lblManga);
		
		JLabel lblEditorial = new JLabel("EDITORIAL:");
		lblEditorial.setForeground(Color.BLACK);
		lblEditorial.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEditorial.setBounds(20, 52, 98, 20);
		panelManga.add(lblEditorial);
		
		JLabel lblCapsManga = new JLabel("CANT. CAPITULOS:");
		lblCapsManga.setForeground(Color.BLACK);
		lblCapsManga.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCapsManga.setBounds(20, 83, 136, 20);
		panelManga.add(lblCapsManga);
		
		JLabel lblEstadoManga = new JLabel("ESTADO:");
		lblEstadoManga.setForeground(Color.BLACK);
		lblEstadoManga.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEstadoManga.setBounds(20, 145, 74, 20);
		panelManga.add(lblEstadoManga);
		
		JComboBox comboBoxEstadoManga = new JComboBox();
		comboBoxEstadoManga.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBoxEstadoManga.setModel(new DefaultComboBoxModel(new String[] {"Publicándose", "Pausado", "Finalizado"}));
		comboBoxEstadoManga.setBounds(98, 144, 121, 22);
		panelManga.add(comboBoxEstadoManga);
		
		ctEditorial = new JTextField();
		ctEditorial.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ctEditorial.setColumns(10);
		ctEditorial.setBounds(117, 54, 192, 20);
		panelManga.add(ctEditorial);
		
		ctCapsManga = new JTextField();
		ctCapsManga.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ctCapsManga.setColumns(10);
		ctCapsManga.setBounds(166, 85, 74, 20);
		panelManga.add(ctCapsManga);
		
		JLabel lblAnoEstreno = new JLabel("AÑO DE ESTRENO:");
		lblAnoEstreno.setForeground(Color.BLACK);
		lblAnoEstreno.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAnoEstreno.setBounds(20, 114, 136, 20);
		panelManga.add(lblAnoEstreno);
		
		ctAnioManga = new JTextField();
		ctAnioManga.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ctAnioManga.setColumns(10);
		ctAnioManga.setBounds(166, 113, 74, 20);
		panelManga.add(ctAnioManga);
		
		JPanel panelAnime = new JPanel();
		tabbedPane.addTab("Info del Anime", null, panelAnime, null);
		panelAnime.setLayout(null);
		
		JLabel lblAnime = new JLabel("INFO DEL ANIME");
		lblAnime.setForeground(Color.BLACK);
		lblAnime.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAnime.setBounds(10, 11, 181, 20);
		panelAnime.add(lblAnime);
		
		JLabel lblEstudio = new JLabel("ESTUDIO ANIM:");
		lblEstudio.setForeground(Color.BLACK);
		lblEstudio.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEstudio.setBounds(20, 52, 124, 20);
		panelAnime.add(lblEstudio);
		
		JLabel lblCapsAnime = new JLabel("CANT. CAPITULOS:");
		lblCapsAnime.setForeground(Color.BLACK);
		lblCapsAnime.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCapsAnime.setBounds(20, 83, 136, 20);
		panelAnime.add(lblCapsAnime);
		
		JLabel lblEstadoAnime = new JLabel("ESTADO:");
		lblEstadoAnime.setForeground(Color.BLACK);
		lblEstadoAnime.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEstadoAnime.setBounds(21, 148, 74, 20);
		panelAnime.add(lblEstadoAnime);
		
		JComboBox comboBoxEstadoAnime = new JComboBox();
		comboBoxEstadoAnime.setModel(new DefaultComboBoxModel(new String[] {"En emisión", "Pausado", "Finalizado"}));
		comboBoxEstadoAnime.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBoxEstadoAnime.setBounds(96, 148, 121, 22);
		panelAnime.add(comboBoxEstadoAnime);
		
		ctEstudio = new JTextField();
		ctEstudio.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ctEstudio.setColumns(10);
		ctEstudio.setBounds(142, 54, 213, 20);
		panelAnime.add(ctEstudio);
		
		ctCapsAnime = new JTextField();
		ctCapsAnime.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ctCapsAnime.setColumns(10);
		ctCapsAnime.setBounds(166, 85, 74, 20);
		panelAnime.add(ctCapsAnime);
		
		JLabel lblAnioAnime = new JLabel("AÑO DE LANZAMIENTO:");
		lblAnioAnime.setForeground(Color.BLACK);
		lblAnioAnime.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAnioAnime.setBounds(21, 114, 181, 20);
		panelAnime.add(lblAnioAnime);
		
		ctAnioAnime = new JTextField();
		ctAnioAnime.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ctAnioAnime.setColumns(10);
		ctAnioAnime.setBounds(206, 116, 74, 20);
		panelAnime.add(ctAnioAnime);
		
		JButton btGuardar = new JButton("GUARDAR");
		btGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String titulo = ctTitulo.getText();
				String autor = ctAutor.getText();
				String genero = comboBoxGenero.getSelectedItem().toString();
				String publico = comboBoxPublico.getSelectedItem().toString();
				
				String manga = ""; // Dato tomado de un radiobutton
				if (radiobtMangaSi.isSelected()){
					manga = "si";}
		        if (radiobtMangaNo.isSelected()){
		        	manga = "no";} //
				
				String editorial = ctEditorial.getText();
				
				String capsManga = ctCapsManga.getText(); // Variable extra para convertir de String a int
				int capitulosManga = Integer.parseInt(capsManga); // Variable convertida a int
				
				String estadoManga = comboBoxEstadoManga.getSelectedItem().toString();
				
				String anime = "";
				if (radiobtAnimeSi.isSelected()){
					anime = "si";}
		        if (radiobtAnimeNo.isSelected()){
		        	anime = "no";}
				
				String estudioAnimacion = ctEstudio.getText();
				
				String capsAnime = ctCapsAnime.getText(); // Variable extra para convertir de String a int
				int capitulosAnime = Integer.parseInt(capsAnime); // Variable convertida a int;
				
				String estadoAnime = comboBoxEstadoAnime.getSelectedItem().toString();;
				Serie nuevaSerie = new Serie(0, titulo, autor, genero, publico, manga, editorial, capitulosManga, estadoManga, anime, estudioAnimacion, capitulosAnime, estadoAnime);
				SerieDAO serieDAO = new SerieDAO();
				serieDAO.agregarSerie(nuevaSerie);
			}
		});
		btGuardar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btGuardar.setBounds(20, 321, 111, 33);
		contentPane.add(btGuardar);
		
		JButton btNuevo = new JButton("<html>INGRESAR UN <br>NUEVO REGISTRO</html>");
		btNuevo.setFont(new Font("Tahoma", Font.BOLD, 14));
		btNuevo.setBounds(148, 314, 163, 57);
		contentPane.add(btNuevo);
		
		JButton btVolver = new JButton("VOLVER");
		btVolver.setFont(new Font("Tahoma", Font.BOLD, 14));
		btVolver.setBounds(335, 321, 101, 33);
		contentPane.add(btVolver);
		
		
	}
}
