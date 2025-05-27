
public class Personaje {
	
	private int id;
	private String nombre;
	private int edad;
	private String sexo;
	private String ocupacion;
	private String apariencia;
	private String personalidad;
	private String habilidades;
	private String debilidades;
	
	public Personaje(int id, String nombre, int edad, String sexo, String ocupacion, String apariencia, String personalidad, String habilidades, String debilidades) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.ocupacion = ocupacion;
		this.apariencia = apariencia;
		this.personalidad = personalidad;
		this.habilidades = habilidades;
		this.debilidades = debilidades;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getOcupacion() {
		return ocupacion;
	}

	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}

	public String getApariencia() {
		return apariencia;
	}

	public void setApariencia(String apariencia) {
		this.apariencia = apariencia;
	}

	public String getPersonalidad() {
		return personalidad;
	}

	public void setPersonalidad(String personalidad) {
		this.personalidad = personalidad;
	}

	public String getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(String habilidades) {
		this.habilidades = habilidades;
	}

	public String getDebilidades() {
		return debilidades;
	}

	public void setDebilidades(String debilidades) {
		this.debilidades = debilidades;
	}
}
