package Clases_abstractas.Gestion_de_biblioteca;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> catalogo;

    public Biblioteca() {
        catalogo = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        catalogo.add(libro);
        System.out.println("Libro agregado al catálogo: " + libro.getTitulo());
    }

    public void prestarLibro(Persona persona, String titulo) {
        for (Libro libro : catalogo) {
            if (libro.getTitulo().equalsIgnoreCase(titulo) && !libro.isPrestado()) {
                libro.setPrestado(true);
                persona.agregarLibroPrestado(libro);
                System.out.println("El libro '" + titulo + "' ha sido prestado a " + persona.getNombre() + " " + persona.getApellido());
                return;
            }
        }
        System.out.println("El libro '" + titulo + "' no está disponible para préstamo.");
    }

    public void devolverLibro(Persona persona, String titulo) {
        for (Libro libro : persona.getLibrosPrestados()) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                libro.setPrestado(false);
                persona.devolverLibro(libro);
                System.out.println("El libro '" + titulo + "' ha sido devuelto por " + persona.getNombre() + " " + persona.getApellido());
                return;
            }
        }
        System.out.println("El libro '" + titulo + "' no estaba prestado a " + persona.getNombre() + " " + persona.getApellido());
    }

    public void mostrarCatalogo() {
        if (catalogo.isEmpty()) {
            System.out.println("El catálogo está vacío.");
        } else {
            for (Libro libro : catalogo) {
                libro.mostrarInformacion();
            }
        }
    }
}
