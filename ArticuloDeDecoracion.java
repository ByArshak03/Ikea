package TareaIkea;

public class ArticuloDeDecoracion extends ProductoHogar {
    public ArticuloDeDecoracion(String nombre, String descripcion, double precio, String tipoDeMaterial) {
        super(nombre, descripcion, precio, tipoDeMaterial);
    }
    public String toString() {
        return "Articulo de decoracion: " + nombre + ",  " + descripcion + ", precio: " + precio + ", tipo de material: " + tipoDeMaterial;
    }
}
