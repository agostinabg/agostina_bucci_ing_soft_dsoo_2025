import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[]args) {qweqweqwe
		qweqweqweqwe
		
		SerieDAO serieDAO = new SerieDAO();
        Scanner scanner = new Scanner(System.in);
        int opcion;

					       qweqweqweqweqweqw

        do {
            System.out.println("1. Agregar Serie");
            System.out.println("2. Listar Series");
            System.out.println("3. Modificar Serie");
            System.out.println("4. Eliminar Seriqweqweqweqweqwewe
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.print("Titulo: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Autor: ");
                    String autor = scanner.nextLine();
                    System.out.print("Género: ");
                    String genero = scanner.nextLine();
                    System.out.print("Público: ");
                    String publico = scanner.nextLine();
                    scanner.nextLine();
                    System.out.print("Usa formato manga: ");
                    String manga = scanner.nextLine();
                    System.out.print("Editorial del manga: ");
                    String editorial = scanner.nextLine();
                    System.out.print("Cantidad de capitulos del manga: ");
                    int capitulosManga = scanner.nextInt(); 
                    scanner.nextLine();
                    System.out.print("Estado actual del manga: ");
                    String estadoManga = scanner.nextLine();
                    System.out.print("Usa formato anime: ");
                    String anime = scanner.nextLine();
                    System.out.print("Estudio de animación: ");
                    String estudioAnimacion = scanner.nextLine();
                    System.out.print("Cantidad de capítulos del anime: ");
                    int capitulosAnime = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Estado actual del anime: ");
                    String estadoAnime = scanner.nextLine();
                    Serie nuevaSerie = new Serie(0, titulo, autor, genero, publico, manga, editorial, capitulosManga, estadoManga, anime, estudioAnimacion, capitulosAnime, estadoAnime);
                    serieDAO.agregarSerie(nuevaSerie);
                    break;

                case 2:
                    List<Serie> series = serieDAO.listarSeries();
                    for (Serie s : series) {
                        System.out.println("ID: " + s.getId() + ", Título: " + s.getTitulo() + ", Autor: " + s.getAutor());
                    }
                    break;

                case 3:
                    System.out.print("ID de la serie a modificar: ");
                    int idMod = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer
                    System.out.print("Titulo: ");
                    String nuevoTitulo = scanner.nextLine();
                    System.out.print("Autor: ");
                    String nuevoAutor = scanner.nextLine();
                    System.out.print("Género: ");
                    String nuevoGenero = scanner.nextLine();
                    System.out.print("Público: ");
                    String nuevoPublico = scanner.nextLine();
                    System.out.print("Usa formato manga: ");
                    String nuevoManga = scanner.nextLine();
                    System.out.print("Editorial del manga: ");
                    String nuevaEditorial = scanner.nextLine();
                    System.out.print("Cantidad de capitulos del manga: ");
                    int nuevoCapitulosManga = scanner.nextInt();
                    System.out.print("Estado actual del manga: ");
                    String nuevoEstadoManga = scanner.nextLine();
                    System.out.print("Usa formato anime: ");
                    String nuevoAnime = scanner.nextLine();
                    System.out.print("Estudio de animación: ");
                    String nuevoEstudioAnimacion = scanner.nextLine();
                    System.out.print("Cantidad de capítulos del anime: ");
                    int nuevoCapitulosAnime = scanner.nextInt();
                    System.out.print("Estado actual del anime: ");
                    String nuevoEstadoAnime = scanner.nextLine();
                    
                    Serie serieMod = new Serie(idMod, nuevoTitulo, nuevoAutor, nuevoGenero, nuevoPublico, nuevoManga, nuevaEditorial, nuevoCapitulosManga, nuevoEstadoManga, nuevoAnime, nuevoEstudioAnimacion, nuevoCapitulosAnime, nuevoEstadoAnime);
                    serieDAO.modificarSerie(serieMod);
                    break;

                case 4:
                    System.out.print("ID de la serie a eliminar: ");
                    int idElim = scanner.nextInt();
                    serieDAO.eliminarSerie(idElim);
                    break;

                case 5:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida. Intenta nuevamente.");
            }
        } while (opcion != 5);

        scanner.close();
    }
	
}
