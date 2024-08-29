package Clases_abstractas.Gestion_de_biblioteca;

public class Pelicula extends ItemBiblioteca implements Catalogable {
    private String titulo;
    private String director;
    private int duracion;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, int duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public void prestar() {
        System.out.println("Película prestada: " + titulo);
    }

    @Override
    public void devolver() {
        System.out.println("Película devuelta: " + titulo);
    }

    @Override
    public double calcularMultas(int diasRetraso) {
        return diasRetraso * 1.0;
    }

    @Override
    public String obtenerInformacion() {
        return "Película: " + titulo + ", Director: " + director + 
               ", Duración: " + duracion + " minutos";
    }
}
