package Clases_abstractas.Gestion_de_biblioteca;

public class Libro extends ItemBiblioteca implements Catalogable {
    private String titulo;
    private String autor;
    private int numeroDePaginas;
    private boolean prestado;

    public Libro() {
    }

    public Libro(String titulo, String autor, int numeroDePaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
        this.prestado = false;
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

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }    

    @Override
    public void prestar() {
    }

    @Override
    public void devolver() {
    }

    @Override
    public double calcularMultas(int diasRetraso) {
        return diasRetraso * 0.75;
    }

    @Override
    public String obtenerInformacion() {
        return "Libro: " + titulo + ", Autor: " + autor + ", Páginas: " + numeroDePaginas;
    }

    public void mostrarInformacion() {
        System.out.println(obtenerInformacion());
    }
}