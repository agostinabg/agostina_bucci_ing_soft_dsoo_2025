
public class Serie {

	private int id;
	private String titulo;
	private String autor;
	private String genero;
	private String publico;
	
	private String formatoManga;
	private String editorial;
	private int capitulosManga;
	private String estadoManga;
	
	private String formatoAnime;
	private String estudioAnimacion;
	private int capitulosAnime;
	private String estadoAnime;
	
	
	// Constructor
	
	public Serie(int id, String titulo, String autor, String genero, String publico, String formatoManga,
			String editorial, int capitulosManga, String estadoManga, String formatoAnime, String estudioAnimacion,
			int capitulosAnime, String estadoAnime) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.genero = genero;
		this.publico = publico;
		this.formatoManga = formatoManga;
		this.editorial = editorial;
		this.capitulosManga = capitulosManga;
		this.estadoManga = estadoManga;
		this.formatoAnime = formatoAnime;
		this.estudioAnimacion = estudioAnimacion;
		this.capitulosAnime = capitulosAnime;
		this.estadoAnime = estadoAnime;
	}
	
	// Métodos
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getPublico() {
		return publico;
	}
	public void setPublico(String publico) {
		this.publico = publico;
	}
	public String getFormatoManga() {
		return formatoManga;
	}
	public void setFormatoManga(String formatoManga) {
		this.formatoManga = formatoManga;
	}
	public String getFormatoAnime() {
		return formatoAnime;
	}
	public void setFormatoAnime(String formatoAnime) {
		this.formatoAnime = formatoAnime;
	}
	
	
	//Métodos formato MANGA
	
	
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public int getCapitulosManga() {
		return capitulosManga;
	}
	public void setCapitulosManga(int capitulosManga) {
		this.capitulosManga = capitulosManga;
	}
	public String getEstadoManga() {
		return estadoManga;
	}
	public void setEstadoManga(String estadoManga) {
		this.estadoManga = estadoManga;
	}
	
	
	//Métodos formato ANIME
	
	public String getEstudioAnimacion() {
		return estudioAnimacion;
	}
	public void setEstudioAnimacion(String estudioAnimacion) {
		this.estudioAnimacion = estudioAnimacion;
	}
	public int getCapitulosAnime() {
		return capitulosAnime;
	}
	public void setCapitulosAnime(int capitulosAnime) {
		this.capitulosAnime = capitulosAnime;
	}
	public String getEstadoAnime() {
		return estadoAnime;
	}
	public void setEstadoAnime(String estadoAnime) {
		this.estadoAnime = estadoAnime;
	}
	
}
