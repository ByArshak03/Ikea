package TareaIkea;

public abstract class ProductoHogar extends Producto {
    protected String tipoDeMaterial;
    public ProductoHogar(String nombre, String descripcion, double precio, String tipoDeMaterial) {
        super(nombre, descripcion, precio);
        this.tipoDeMaterial = tipoDeMaterial;
    }
    public String getTipoDeMaterial() {
        return tipoDeMaterial;
    }

    public abstract String toString();
}
