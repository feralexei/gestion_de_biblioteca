package Clases_abstractas.Gestion_de_biblioteca;

public class Revista extends ItemBiblioteca implements Catalogable {

    private int nroEdicion;
    private int cantidadEjemplares;
    private String nombreRevista;

    public Revista() {
    }

    public Revista(String nombreRevista, int nroEdicion, int cantidadEjemplares) {
        this.nroEdicion = nroEdicion;
        this.cantidadEjemplares = cantidadEjemplares;
        this.nombreRevista = nombreRevista;
    }

    public int getNroEdicion() {
        return nroEdicion;
    }

    public void setNroEdicion(int nroEdicion) {
        this.nroEdicion = nroEdicion;
    }

    public int getCantidadEjemplares() {
        return cantidadEjemplares;
    }

    public void setCantidadEjemplares(int cantidadEjemplares) {
        this.cantidadEjemplares = cantidadEjemplares;
    }

    public String getNombreRevista() {
        return nombreRevista;
    }

    public void setNombreRevista(String nombreRevista) {
        this.nombreRevista = nombreRevista;
    }

    @Override
    public void prestar() {
        if (cantidadEjemplares > 0) {
            cantidadEjemplares--;
            System.out.println("Revista prestada. Ejemplares restantes: " + cantidadEjemplares);
        } else {
            System.out.println("No hay ejemplares disponibles");
        }
    }

    @Override
    public void devolver() {
        cantidadEjemplares++;
        System.out.println("Revista devuelta. Ejemplares actuales: " + cantidadEjemplares);
    }

    @Override
    public double calcularMultas(int diasRetraso) {
        return diasRetraso * 0.5;
    }

    @Override
    public String obtenerInformacion() {
        return "Revista: " + nombreRevista + "\n" +
                "Nro Edicion: " + nroEdicion + "\n" +
                "Cantidad Ejemplares: " + cantidadEjemplares + "\n";
    }
}
