package TareaIkea;

public class Mueble extends ProductoHogar {
    private String tipoDeMueble;
    public Mueble(String nombre, String descripcion, double precio, String tipoDeMaterial, String tipoDeMueble) {
        super(nombre, descripcion, precio, tipoDeMaterial);
        this.tipoDeMueble = tipoDeMueble;
    }
    public String getTipoDeMueble() {
        return tipoDeMueble;
    }

    public String toString() {
        return "Mueble: " + nombre + ", " + descripcion + ", precio: " + precio + ", material: " + tipoDeMaterial + ", tipo de mueble: " + tipoDeMueble;
    }
}
