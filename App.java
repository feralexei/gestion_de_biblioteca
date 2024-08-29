package Clases_abstractas.Gestion_de_biblioteca;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);
        Persona persona = new Persona("Fernando", "Taboada");
        int opcion;

        do {
            System.out.println("\n1. Agregar libro");
            System.out.println("2. Mostrar catálogo");
            System.out.println("3. Prestar libro");
            System.out.println("4. Devolver libro");
            System.out.println("5. Salir");
            System.out.println("Ingrese una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Título del libro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Autor del libro: ");
                    String autor = scanner.nextLine();
                    System.out.print("Número de páginas: ");
                    int numeroDePaginas = scanner.nextInt();

                    Libro libro = new Libro(titulo, autor, numeroDePaginas);
                    biblioteca.agregarLibro(libro);
                    break;
                case 2:
                    biblioteca.mostrarCatalogo();
                    break;
                case 3:
                    System.out.print("Título del libro a prestar: ");
                    String tituloPrestar = scanner.nextLine();
                    biblioteca.prestarLibro(persona, tituloPrestar);
                    break;
                case 4:
                    System.out.print("Título del libro a devolver: ");
                    String tituloDevolver = scanner.nextLine();
                    biblioteca.devolverLibro(persona, tituloDevolver);
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 5);
        scanner.close();
    }
}