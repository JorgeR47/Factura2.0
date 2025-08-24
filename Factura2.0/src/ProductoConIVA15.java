public class ProductoConIVA15 extends Producto {
    public static final double PORCENTAJE_IVA = .15;
    private final double iva;

    public ProductoConIVA15(String nombre, double precio, int inventario) {
        super(nombre, precio, inventario);
        iva = calcularIVADeProducto();
    }

    private double calcularIVADeProducto() {
        return super.obtenerPrecioUnitario()* PORCENTAJE_IVA;
    }

    public double obtenerIVA() {
        return iva;
    }
}
