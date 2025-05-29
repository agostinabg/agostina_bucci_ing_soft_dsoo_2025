import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonajeDAO {

	private Connection connection;

    public PersonajeDAO() {
        try {
        	// Parámetros de conexión
            String url = "jdbc:mysql://localhost:3306/fichas";
            String user = "root";
            String password = "******";
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void agregarPersonaje(Personaje personaje) {
        String query = "INSERT INTO personajes (nombre, edad, sexo, ocupacion, apariencia, personalidad, habilidades, debilidades) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, personaje.getNombre());
            stmt.setInt(2, personaje.getEdad());
            stmt.setString(3, personaje.getSexo());
            stmt.setString(4, personaje.getOcupacion());
            stmt.setString(5, personaje.getApariencia());
            stmt.setString(6, personaje.getPersonalidad());
            stmt.setString(7, personaje.getHabilidades());
            stmt.setString(8, personaje.getDebilidades());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public List<Personaje> listarPersonajes() {
        List<Personaje> personajes = new ArrayList<>();
        String query = "SELECT * FROM personajes";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
            	Personaje personaje = new Personaje(rs.getInt("id"),rs.getString("nombre"), rs.getInt("edad"), rs.getString("sexo"), rs.getString("ocupacion"), rs.getString("apariencia"), rs.getString("personalidad"), rs.getString("habilidades"), rs.getString("debilidades"));
            	personajes.add(personaje);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return personajes;
    }
    
    public void modificarPersonaje(Personaje personaje) {
        String query = "UPDATE personajes SET nombre = ?, edad = ?, sexo = ?, ocupacion = ?, apariencia = ?, personalidad = ?, habilidades = ?, debilidades = ? WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
        	stmt.setString(1, personaje.getNombre());
            stmt.setInt(2, personaje.getEdad());
            stmt.setString(3, personaje.getSexo());
            stmt.setString(4, personaje.getOcupacion());
            stmt.setString(5, personaje.getApariencia());
            stmt.setString(6, personaje.getPersonalidad());
            stmt.setString(7, personaje.getHabilidades());
            stmt.setString(8, personaje.getDebilidades());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void eliminarPersonaje(int id) {
        String query = "DELETE FROM personajes WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
