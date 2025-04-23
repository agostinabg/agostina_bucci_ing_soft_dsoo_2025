import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SerieDAO2 {

	private Connection connection;
	private Object Serie;

    public SerieDAO2() {
        try {
        	// Parámetros de conexión
            String url = "jdbc:mysql://localhost:3306/manga_y_anime";
            String user = "root";
            String password = "repeat96";
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void agregarSerie(Serie serie) {
        String query = "INSERT INTO series (titulo, autor, genero, publico, manga, editorial, capitulos_m, estado_m, anime, estud_anim, capitulos_a, estado_a) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
        	stmt.setString(1, serie.getTitulo());
        	stmt.setString(2, serie.getAutor());
        	stmt.setString(3, serie.getGenero());
        	stmt.setString(4, serie.getPublico());
        	stmt.setString(5, serie.getFormatoManga());
        	stmt.setString(6, serie.getEditorial());
        	stmt.setInt(7, serie.getCapitulosManga());
        	stmt.setString(8, serie.getEstadoManga());
        	stmt.setString(9, serie.getFormatoAnime());
        	stmt.setString(10, serie.getEstudioAnimacion());
        	stmt.setInt(11, serie.getCapitulosAnime());
        	stmt.setString(12, serie.getEstadoAnime());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Serie verInfoSerie(Serie serie) {
    	Serie serie1 = new Serie(0, null, null, null, null, null, null, 0, null, null, null, 0, null);
    	String query = "SELECT * FROM series WHERE titulo = ?";
    	try (PreparedStatement stmt = connection.prepareStatement(query)) {
    		stmt.setString(1, serie.getTitulo());
    		ResultSet rs = stmt.executeQuery(query); 
    		
    		if (rs.next()) {
    			int id = rs.getInt("id");
    			String titulo = rs.getString("titulo");
				String autor = rs.getString("autor");
				String genero = rs.getString("genero");
				String publico = rs.getString("publico");
				String manga = rs.getString("manga");
				String editorial = rs.getString("editorial");
				int capitulosManga = rs.getInt("capitulos_m");
				String estadoManga = rs.getString("estado_m");
				String anime = rs.getString("anime");
				String estudioAnimacion = rs.getString("estud_anim");
				int capitulosAnime = rs.getInt("capitulos_a");
				String estadoAnime = rs.getString("estado_a");
				serie1.setId(id);
				serie1.setTitulo(titulo);
				serie1.setAutor(autor);
				serie1.setGenero(genero);
				serie1.setPublico(publico);
				serie1.setFormatoManga(manga);
				serie1.setEditorial(editorial);
				serie1.setCapitulosManga(capitulosManga);
				serie1.setEstadoManga(estadoManga);
				serie1.setFormatoAnime(anime);
				serie1.setEstudioAnimacion(estudioAnimacion);
				serie1.setCapitulosAnime(capitulosAnime);
				serie1.setEstadoAnime(estadoAnime);
    		} 
    	} catch (SQLException e) {
			e.printStackTrace();
		}
		return serie1;
    }
       
    public List<Serie> listarSeries() {
        List<Serie> series = new ArrayList<>();
        String query = "SELECT * FROM series";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
            	Serie serie = new Serie(rs.getInt("id"), rs.getString("titulo"), rs.getString("autor"), rs.getString("genero"), rs.getString("publico"), rs.getString("manga"), rs.getString("editorial"), rs.getInt("capitulos_m"), rs.getString("estado_m"), rs.getString("anime"), rs.getString("estud_anim"), rs.getInt("capitulos_a"), rs.getString("estado_a"));
            	series.add(serie);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return series;
    }
    
    public void modificarSerie(Serie serie) {
        String query = "UPDATE series SET titulo = ?, autor = ?, editorial = ?, genero = ?, publico = ?, manga = ?, editorial = ?, capitulos_m = ? , estado_m = ?, anime = ?, estud_anim = ?, capitulos_a = ? , estado_a = ? WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
        	stmt.setString(1, serie.getTitulo());
        	stmt.setString(2, serie.getAutor());
        	stmt.setString(3, serie.getGenero());
        	stmt.setString(4, serie.getPublico());
        	stmt.setString(5, serie.getFormatoManga());
        	stmt.setString(6, serie.getEditorial());
        	stmt.setInt(7, serie.getCapitulosManga());
        	stmt.setString(8, serie.getEstadoManga());
        	stmt.setString(9, serie.getFormatoAnime());
        	stmt.setString(10, serie.getEstudioAnimacion());
        	stmt.setInt(11, serie.getCapitulosAnime());
        	stmt.setString(12, serie.getEstadoAnime());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void eliminarSerie(int id) {
        String query = "DELETE FROM series WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}
