package TareaIkea;

public class Electrodomestico extends ProductoHogar{
    private String eficienciaEnergetica;
    public Electrodomestico(String nombre, String descripcion, double precio, String eficienciaEnergetica) {
        super(nombre, descripcion, precio);
        this.eficienciaEnergetica = eficienciaEnergetica;
    }

    public String getEficienciaEnergetica() {
        return eficienciaEnergetica;
    }

    public String toString() {
        return "Electrodomestico: " + nombre + ", " + descripcion + ", precio: " + precio + ", eficiencia energetica: " + eficienciaEnergetica;
    }
}
