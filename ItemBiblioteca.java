package Clases_abstractas.Gestion_de_biblioteca;

public abstract class ItemBiblioteca {
    public abstract void prestar();
    public abstract void devolver();
    public abstract double calcularMultas(int diasRetraso);
}