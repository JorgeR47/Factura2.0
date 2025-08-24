public class ProductoConIVA12 extends Producto {
    public static final double PORCENTAJE_IVA = .12;
    private final double iva;

    public ProductoConIVA12(String nombre, double precio, int inventario) {
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
