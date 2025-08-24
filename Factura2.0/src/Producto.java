public abstract class Producto {
    private String nombre;
    private final double precio;
    private int inventario;

    public Producto(String nombre, double precio, int inventario) {
        this.nombre = nombre;
        this.precio = precio;
        this.inventario = inventario;

    }

    public int descontarInventario(int cantidadADescontar) {
        if (cantidadADescontar >= inventario) {

            cantidadADescontar = inventario;
            inventario = 0;

        } else {

            inventario -= cantidadADescontar;

        }
        return cantidadADescontar;
    }

    public double obtenerPrecioUnitario() {
        return precio;
    }

    public abstract double obtenerIVA();

    @Override
    public String toString() {
        return nombre;
    }
}
